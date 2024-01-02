package Controllers;

import Views.Login;
import Views.Error;
import Views.SignUp;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private Login loginView;
    private SignUp signUpView;
    private Error errorView;
    //private Register registerView;
    private LoginController loginController;
    private SignUpController signUpController;

    private CentralController() {
        this.loginView = new Login();
        this.errorView = new Error();
        this.signUpView = new SignUp();
        this.loginController = new LoginController(this);
        this.signUpController = new SignUpController(this);
    }



    public void initControllers() {
        loginController.initLoginController();
        signUpController.initSignUpController();
    }
    public static CentralController getInstance() {
        return instance;
    }

    public Login getLoginView() {
        return loginView;
    }

    public Error getErrorView() {
        return errorView;
    }

    public SignUp getSignInView() {
        return signUpView;
    }


}


