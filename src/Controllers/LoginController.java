package Controllers;

import Models.User;
import Models.UserManager;
import Views.LoginView;

import java.awt.*;

public class LoginController {
    private final CentralController centralController;
    private final LoginView loginView;
    private final UserManager userManager = UserManager.getUserManager();

    public LoginController(CentralController centralController) {
        this.centralController = centralController;
        this.loginView = centralController.getLoginView();
    }

    public void initLoginController() {
        loginView.getLoginButton().addActionListener(e -> loginButtonClick(loginView.getUserText(), loginView.getPasswordText()));
        loginView.getRegisterButton().addActionListener(e -> signupButtonClick());
    }


    private void loginButtonClick(String account, String password) {

        User user =userManager.getUserIfExists(account);
        User.UserType userType;
        if(user == null) {
            userType = User.UserType.None;
        }
        else userType=user.getUserType();

        if (userType == User.UserType.None) {
            centralController.getHintView().setHintLabel("查無帳號，請先註冊", Color.RED);
        }
        else {
            boolean verifyResult = userManager.verifyAccount(account, password);
            if (verifyResult) {
                if (userType == User.UserType.REGULAR_USER) {
                    centralController.getPlayerMainController().setUserIdentity(user);
                    loginView.setVisible(false);
                    centralController.getPlayerMainView().setVisible(true);
                }
                else if (userType == User.UserType.ADMINISTRATOR) {
                    loginView.setVisible(false);
                    centralController.getAdministratorView().setVisible(true);
                }
                else if (userType == User.UserType.ADVERTISER) {
                    loginView.setVisible(false);
                    centralController.getAdvertiserView().setVisible(true);
                }
            }
            else {
                centralController.getHintView().setHintLabel("密碼錯誤",Color.RED);
            }
        }

    }

    private void signupButtonClick() {
        loginView.setVisible(false);
        centralController.getSignUpView().setVisible(true);
    }


}

