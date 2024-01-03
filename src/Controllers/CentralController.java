package Controllers;

import Views.AllianceMain;
import Views.Login;
import Views.Error;
import Views.SignUp;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private Login loginView;
    private SignUp signUpView;
    private Error errorView;
    private AllianceMain allianceMainView;
    //private Register registerView;
    private LoginController loginController;
    private SignUpController signUpController;
    private AllianceMainController allianceMainController;

    private CentralController() {
        this.loginView = new Login();
        this.errorView = new Error();
        this.signUpView = new SignUp();
        this.allianceMainView= new AllianceMain();
        this.loginController = new LoginController(this);
        this.signUpController = new SignUpController(this);
        this.allianceMainController =new AllianceMainController(this);
    }



    public void initControllers() {
        loginController.initLoginController();
        signUpController.initSignUpController();
        allianceMainController.initAllianceMainController();
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

    public SignUp getSignUpView() {
        return signUpView;
    }

    public AllianceMain getAllianceMainView() {
        return allianceMainView;
    }
}


