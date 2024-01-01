package Views;


import javax.swing.*;

public class Register extends JFrame {
    private JTextField userText;
    private JPasswordField passwordText;
    private JPasswordField confirmPasswordText;
    private JButton registerButton;

    public Register() {
        // 設置窗口標題和大小
        setTitle("註冊");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 創建面板並添加元件
        JPanel panel = new JPanel();
        this.add(panel);
        placeComponents(panel);

    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // 創建標籤和輸入框 - 名字
        JLabel userLabel = new JLabel("名字:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // 創建標籤和輸入框 - 密碼
        JLabel passwordLabel = new JLabel("密碼:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // 創建標籤和輸入框 - 確認密碼
        JLabel confirmPasswordLabel = new JLabel("確認密碼:");
        confirmPasswordLabel.setBounds(10, 80, 80, 25);
        panel.add(confirmPasswordLabel);

        confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(100, 80, 165, 25);
        panel.add(confirmPasswordText);

        // 創建按鈕
        registerButton = new JButton("註冊");
        registerButton.setBounds(10, 110, 80, 25);
        panel.add(registerButton);
    }

    // Getter 方法
    public JButton getRegisterButton() {
        return registerButton;
    }

    public String getUsername() {
        return userText.getText();
    }

    public String getPassword() {
        return new String(passwordText.getPassword());
    }

    public String getConfirmPassword() {
        return new String(confirmPasswordText.getPassword());
    }

}
