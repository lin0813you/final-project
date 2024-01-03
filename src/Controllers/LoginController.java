package Controllers;

import Models.User;
import Models.UserManager;
import Views.Login;

public class LoginController {
    private CentralController centralController;
    private Login loginView;
    private UserManager userManager = UserManager.getUserManager();

    public LoginController(CentralController centralController) {
        this.centralController = centralController;
        this.loginView = centralController.getLoginView();
    }

    public void initLoginController() {
        loginView.getLoginButton().addActionListener(e -> loginButtonClick(loginView.getUserText(), loginView.getPasswordText()));
        loginView.getRegisterButton().addActionListener(e -> signupButtonClick());
    }


    private void loginButtonClick(String account, String password) {
        User.UserType type = userManager.getUserTypeIfUserExists(account);
        if (type == User.UserType.None) {
            centralController.getErrorView().setErrorLabel("帳號不存在，請先註冊");
            centralController.getErrorView().setVisible(true);
        }
        else {
            boolean VerifyResult = userManager.verifyAccount(account, password);
            if (VerifyResult) {
                if (type == User.UserType.REGULAR_USER) {
                    loginView.setVisible(false);
                    centralController.getAllianceMainView().setVisible(true);
                    System.out.println("進入玩家主頁面");
                }
                else if (type == User.UserType.ADMINISTRATOR) {
                    System.out.println("進入廣告商頁面");
                }
                else if (type == User.UserType.ADVERTISER) {
                    System.out.println("進入管理者介面");
                }
            }
            else {
                centralController.getErrorView().setErrorLabel("密碼錯誤");
                centralController.getErrorView().setVisible(true);
            }
        }

    }

    private void signupButtonClick() {
        loginView.setVisible(false);
        centralController.getSignUpView().setVisible(true);
    }


}

