package Controllers;

import Views.Login;
import Views.Register;

public class CentralController {
    private static final CentralController instance = new CentralController();
    private Login loginView;
    private Register registerView;
    private LoginController loginController;

    private CentralController() {
        this.loginView = new Login();
        this.registerView = new Register();
        this.loginController = new LoginController(this);
    }

    // ... 其他方法 ...

    public Login getLoginView() {
        return loginView;
    }

    public static CentralController getInstance() {
        return instance;
    }

    public void initControllers() {
        loginController.initController();
    }
}


