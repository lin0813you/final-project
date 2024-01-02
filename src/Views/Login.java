package Views;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JButton loginButton;
    JButton registerButton;
    JButton audienceButton;
    JTextField userText;
    JPasswordField passwordText;

    public Login() {
        // 設置窗口標題和大小
        setTitle("Log in");
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

        // 創建標籤和輸入框
        JLabel userLabel = new JLabel("帳號：");
        userLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(userLabel, gbc);

        userText = new JTextField(15);
        userText.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(userText, gbc);

        JLabel passwordLabel = new JLabel("密碼：");
        passwordLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);

        passwordText = new JPasswordField(15);
        passwordText.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(passwordText, gbc);

        // 創建按鈕
        loginButton = new JButton("登入");
        loginButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(loginButton, gbc);

        registerButton = new JButton("註冊帳號");
        registerButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(registerButton, gbc);

        audienceButton=new JButton("我是觀眾");
        audienceButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        audienceButton.setBorder(null);
        panel.add(audienceButton,gbc);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JButton getAudienceButton() {
        return audienceButton;
    }

    public String getUserText() {
        return userText.getText();
    }

    public String getPasswordText() {
        return passwordText.getText();
    }
}

