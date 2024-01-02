package Controllers;

import Views.Login;

public class LoginController {
    private CentralController centralController;
    private Login loginView;

    public LoginController(CentralController centralController) {
        this.centralController = centralController;
        this.loginView = centralController.getLoginView();
    }

    private void loginButtonClick() {
        loginView.setVisible(false);
    }

    private void signupButtonClick() {
        // 註冊邏輯
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> loginButtonClick());
        loginView.getRegisterButton().addActionListener(e -> signupButtonClick());
    }
}

