package Controllers;

import Models.User;
import Models.UserManager;
import Views.SignUpView;

import java.awt.*;


public class SignUpController {
    private final CentralController centralController;
    private final SignUpView signUpView;
    private final UserManager userManager=UserManager.getUserManager();


    public SignUpController(CentralController centralController) {
        this.centralController = centralController;
        this.signUpView = centralController.getSignUpView();
    }

    public void initSignUpController(){
        signUpView.getSignUpButton().addActionListener(e -> signUpButtonClick(signUpView.getNameTextField(),signUpView.getAccountTextField(),signUpView.getPasswordTextField()));
        signUpView.getBackButton().addActionListener(e -> backButtonClick());
    }



    private void signUpButtonClick(String name, String account, String password) {
        User.UserType type=userManager.getUserTypeIfUserExists(account);

        if (type == User.UserType.REGULAR_USER) {
            centralController.getHintView().setHintLabel("帳號已存在，不須註冊",Color.RED);
        }
        else if (type == User.UserType.None){
            userManager.addUser(new User(name,account,password, User.UserType.REGULAR_USER));
            centralController.getHintView().setHintLabel("註冊成功",Color.GREEN);
        }
        else {
            centralController.getHintView().setHintLabel("特殊身分不須註冊",Color.RED);
        }

    }
    private void backButtonClick() {
        signUpView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }


}
