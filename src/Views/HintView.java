package Views;

import javax.swing.*;
import java.awt.*;

public class HintView extends JFrame {

    private JButton confirmButton;
    private JLabel hintLabel;

    public HintView() {
        // 設置窗口標題和大小
        setTitle("提示");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        setLocation(820, 450);
        setLayout(new GridBagLayout()); // 直接設置布局

        GridBagConstraints gbc = new GridBagConstraints();

        // 設置標籤
        hintLabel = new JLabel("錯誤!");
        hintLabel.setForeground(new Color(255, 0, 0));
        hintLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(hintLabel, gbc); // 直接添加到JFrame

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

    public void setHintLabel(String text, Color color) {
        hintLabel.setText(text);
        hintLabel.setForeground(color);
        setVisible(true);
    }
}

