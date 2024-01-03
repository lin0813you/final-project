package Controllers;

import Views.*;
import Views.Error;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private Login loginView;
    private SignUp signUpView;
    private Error errorView;
    private AllianceMain allianceMainView;
    private PlayerMain playerMainView;
    private LoginController loginController;
    private SignUpController signUpController;
    private AllianceMainController allianceMainController;
    private PlayerMainController playerMainController;

    private CentralController() {
        this.loginView = new Login();
        this.errorView = new Error();
        this.signUpView = new SignUp();
        this.playerMainView =new PlayerMain();
        this.allianceMainView= new AllianceMain();
        this.loginController = new LoginController(this);
        this.signUpController = new SignUpController(this);
        this.playerMainController =new PlayerMainController(this);
        this.allianceMainController =new AllianceMainController(this);
    }



    public void initControllers() {
        loginController.initLoginController();
        signUpController.initSignUpController();
        allianceMainController.initAllianceMainController();
        playerMainController.initPlayerMainController();
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

    public PlayerMain getPlayerMainView() {
        return playerMainView;
    }

    public AllianceMain getAllianceMainView() {
        return allianceMainView;
    }
}


