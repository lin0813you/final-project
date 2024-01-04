package Controllers;

import Views.*;
import Views.HintView;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private LoginView loginView;
    private SignUpView signUpView;
    private HintView hintView;
    private AllianceMainView allianceMainView;
    private PlayerMainView playerMainView;
    private LoginController loginController;
    private SignUpController signUpController;
    private AllianceMainController allianceMainController;
    private PlayerMainController playerMainController;

    private CentralController() {
        this.loginView = new LoginView();
        this.hintView = new HintView();
        this.signUpView = new SignUpView();
        this.playerMainView =new PlayerMainView();
        this.allianceMainView= new AllianceMainView();
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

    public LoginView getLoginView() {
        return loginView;
    }

    public HintView getErrorView() {
        return hintView;
    }

    public SignUpView getSignUpView() {
        return signUpView;
    }

    public PlayerMainView getPlayerMainView() {
        return playerMainView;
    }

    public AllianceMainView getAllianceMainView() {
        return allianceMainView;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public SignUpController getSignUpController() {
        return signUpController;
    }

    public AllianceMainController getAllianceMainController() {
        return allianceMainController;
    }

    public PlayerMainController getPlayerMainController() {
        return playerMainController;
    }
}


