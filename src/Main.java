import Controllers.CentralController;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CentralController.getInstance().initControllers();
            CentralController.getInstance().getLoginView().setVisible(true);
        });
    }
    //TODO　使用者一次只能加一個聯盟
    //TODO  有重複創建聯盟的bug
}
