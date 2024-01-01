package Controllers;

import Views.*;


public class CentralController {
    private static final CentralController instance = new CentralController();
    private Login loginView;
    private Register registerView;



    public static CentralController getInstance() {
        return instance;
    }
    public Login getLoginView() {
        return loginView;
    }

    public Register getRegisterView() {
        return registerView;
    }


    public void showLoginView() {
        if (loginView == null) {
            loginView = new Login();
        }
        loginView.setVisible(true);
    }
    public void closeLoginView() {
        loginView.setVisible(false);
    }

    public void showRegisterView() {
        if (registerView == null) {
            registerView = new Register();
        }
        registerView.setVisible(true);
    }
    public void closeRegisterView() {
        registerView.setVisible(false);
    }


    // 其他方法...
}

