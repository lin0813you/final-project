package Controllers;

import Models.User;
import Models.UserManager;
import Views.SignUp;


public class SignUpController {
    private CentralController centralController;
    private SignUp signUpView;
    private UserManager userManager=UserManager.getUserManager();


    public SignUpController(CentralController centralController) {
        this.centralController = centralController;
        this.signUpView = centralController.getSignInView();
    }

    public void initSignUpController(){
        signUpView.getSignUpButton().addActionListener(e -> signUpButtonClick(signUpView.getNameTextField(),signUpView.getAccountTextField(),signUpView.getPasswordTextField()));
        signUpView.getBackButton().addActionListener(e -> backButtonClick());
    }



    private void signUpButtonClick(String name, String account, String password) {
        User.UserType type=userManager.getUserTypeIfUserExists(account);

        if (type == User.UserType.REGULAR_USER) {
            centralController.getErrorView().setErrorLabel("帳號已存在");
            centralController.getErrorView().setVisible(true);
        }
        else if (type == User.UserType.None){
            userManager.addUser(new User(name,account,password, User.UserType.REGULAR_USER));
            System.out.println("成功建立");
        }
        else {
            centralController.getErrorView().setErrorLabel("特殊身分");
            centralController.getErrorView().setVisible(true);
        }

    }
    private void backButtonClick() {
        signUpView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }


}
