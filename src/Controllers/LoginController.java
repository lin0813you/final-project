package Controllers;

import Models.User;
import Models.UserManager;
import Views.LoginView;

import java.awt.*;

public class LoginController {
    private CentralController centralController;
    private LoginView loginView;
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
            centralController.getErrorView().setHintLabel("查無帳號，請先註冊", Color.RED);
        }
        else {
            boolean VerifyResult = userManager.verifyAccount(account, password);
            if (VerifyResult) {
                if (type == User.UserType.REGULAR_USER) {
                    centralController.getPlayerMainController().setUserIdentity(account);
                    loginView.setVisible(false);
                    centralController.getPlayerMainView().setVisible(true);
                }
                else if (type == User.UserType.ADMINISTRATOR) {
                    System.out.println("進入廣告商頁面");
                }
                else if (type == User.UserType.ADVERTISER) {
                    System.out.println("進入管理者介面");
                }
            }
            else {
                centralController.getErrorView().setHintLabel("密碼錯誤",Color.RED);
            }
        }

    }

    private void signupButtonClick() {
        loginView.setVisible(false);
        centralController.getSignUpView().setVisible(true);
    }


}

