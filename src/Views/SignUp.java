package Views;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {
    JTextField nameTextField;
    JTextField accountTextField;
    JPasswordField passwordTextField;
    JButton signUpButton;
    JButton backButton;

    public SignUp() {
        // 設置窗口標題和大小
        setTitle("Sign Up");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 500);
        setLocation(600, 300);
        setLayout(new GridBagLayout());

        // 創建面板並添加元件
        JPanel panel = new JPanel(new GridBagLayout());
        this.add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();

        // 創建並設置名稱標籤和輸入框
        JLabel nameLabel = new JLabel("使用者名稱：");
        nameLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(nameLabel, gbc);

        nameTextField = new JTextField(15);
        nameTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameTextField, gbc);

        // 創建並設置帳號標籤和輸入框
        JLabel accountLabel = new JLabel("帳號(電話號碼)：");
        accountLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(accountLabel, gbc);

        accountTextField = new JTextField(15);
        accountTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(accountTextField, gbc);

        // 創建並設置密碼標籤和輸入框
        JLabel passwordLabel = new JLabel("密碼：");
        passwordLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        passwordTextField = new JPasswordField(15);
        passwordTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(passwordTextField, gbc);

        // 創建並設置註冊按鈕
        signUpButton = new JButton("註冊");
        signUpButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(signUpButton, gbc);

        // 創建並設置返回按鈕
        backButton = new JButton("返回");
        backButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 4; // 把返回按鈕放在第四行
        gbc.insets = new Insets(10, 10, 0, 10); // 可以根據需要調整間隔
        panel.add(backButton, gbc);
    }

    // 公共方法以供外部訪問組件
    public String getNameTextField() {
        return nameTextField.getText();
    }

    public String getAccountTextField() {
        return accountTextField.getText();
    }

    public String getPasswordTextField() {
        return passwordTextField.getText();
    }

    public JButton getSignUpButton() {
        return signUpButton;
    }

    public JButton getBackButton() {
        return backButton;
    }
}

