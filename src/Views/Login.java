package Views;

import javax.swing.*;

public class Login extends JFrame {

    JButton loginButton;
    JButton registerButton;
    JTextField userText;
    JPasswordField passwordText;


    public Login() {
        // 設置窗口標題和大小
        setTitle("測試");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 創建面板並添加元件
        JPanel panel = new JPanel();
        this.add(panel);
        placeComponents(panel);

    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // 創建標籤和輸入框
        JLabel userLabel = new JLabel("名字:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("密碼:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // 創建按鈕
        loginButton = new JButton("確認");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        registerButton = new JButton("註冊帳號");
        registerButton.setBounds(100, 80, 160, 25);
        panel.add(registerButton);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

}
