package Controllers;

import Views.*;
import Views.HintView;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private final LoginView loginView;
    private final SignUpView signUpView;
    private final HintView hintView;
    private final AllianceMainView allianceMainView;
    private final PlayerMainView playerMainView;
    private final AdvertiserView advertiserView;
    private final ApplyAllianceView applyAllianceView;
    private final CreateAllianceView createAllianceView;
    private final LoginController loginController;
    private final SignUpController signUpController;
    private final AllianceMainController allianceMainController;
    private final PlayerMainController playerMainController;
    private final AdvertiserController advertiserController;
    private final ApplyAllianceController applyAllianceController;
    private final CreateAllianceController createAllianceController;
    private CentralController() {
        this.loginView = new LoginView();
        this.hintView = new HintView();
        this.signUpView = new SignUpView();
        this.playerMainView =new PlayerMainView();
        this.allianceMainView= new AllianceMainView();
        this.applyAllianceView =new ApplyAllianceView();
        this.advertiserView =new AdvertiserView();
        this.createAllianceView = new CreateAllianceView();
        this.loginController = new LoginController(this);
        this.signUpController = new SignUpController(this);
        this.playerMainController =new PlayerMainController(this);
        this.allianceMainController =new AllianceMainController(this);
        this.applyAllianceController =new ApplyAllianceController(this);
        this.advertiserController =new AdvertiserController(this);
        this.createAllianceController = new CreateAllianceController(this);
    }


    public void initControllers() {
        loginController.initLoginController();
        signUpController.initSignUpController();
        allianceMainController.initAllianceMainController();
        playerMainController.initPlayerMainController();
        applyAllianceController.initApplyAllianceController();
        advertiserController.initAdvertiserController();
        createAllianceController.initCreateAllianceController();
    }

    public static CentralController getInstance() {
        return instance;
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public HintView getHintView() {
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

    public ApplyAllianceView getApplyAllianceView() {
        return applyAllianceView;
    }
    public AdvertiserView getAdvertiserView() {
        return advertiserView;
    }
    public CreateAllianceView getCreateAllianceView() {
        return createAllianceView;
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

    public AdvertiserController getAdvertiserController() {
        return advertiserController;
    }

    public ApplyAllianceController getApplyAllianceController() {
        return applyAllianceController;
    }
    public CreateAllianceController getCreateAllianceController() {
        return createAllianceController;
    }


}


