package Controllers;

public class LoginController {

    public LoginController() {
    }

    public void initController() {
        CentralController.getInstance().getLoginView().getLoginButton().addActionListener(e -> loginButtonClick());
        CentralController.getInstance().getLoginView().getRegisterButton().addActionListener(e -> signupButtonClick());
    }

    public void loginButtonClick(){
        CentralController.getInstance().closeLoginView();
    }
    public void signupButtonClick(){
        CentralController.getInstance().closeLoginView();
        CentralController.getInstance().showRegisterView();
    }
}
