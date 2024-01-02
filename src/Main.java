import Controllers.CentralController;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CentralController.getInstance().initControllers();
            CentralController.getInstance().getLoginView().setVisible(true);
        });
    }
}
