package Views;

import javax.swing.*;
import java.awt.*;

public class Error extends JFrame {

    private JButton confirmButton;
    private JLabel errorLabel;

    public Error() {
        // 設置窗口標題和大小
        setTitle("Login Error");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        setLocation(820, 450);
        setLayout(new GridBagLayout()); // 直接設置布局

        GridBagConstraints gbc = new GridBagConstraints();

        // 設置標籤
        errorLabel = new JLabel("錯誤!");
        errorLabel.setForeground(new Color(255, 0, 0));
        errorLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(errorLabel, gbc); // 直接添加到JFrame

        // 設置按鈕
        confirmButton = new JButton("確定");
        confirmButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(confirmButton, gbc); // 直接添加到JFrame

        // 設置圖標
        ImageIcon icon = new ImageIcon("jetbrains://idea/navigate/reference?project=final&path=resources/error.png"); // 更改為實際的圖標路徑
        setIconImage(icon.getImage());

    }

    // 提供一個方法來訪問確定按鈕
    public JButton getConfirmButton() {
        return confirmButton;
    }

    public void setErrorLabel(String errorLabel) {
        this.errorLabel.setText(errorLabel);
    }



}

