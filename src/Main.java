import Controllers.LoginController;

import javax.swing.*;

import Controllers.CentralController;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CentralController.getInstance().showLoginView();
            LoginController loginController = new LoginController();
            loginController.initController();
        });
    }
}
