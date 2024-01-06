package Views;

import javax.swing.*;
import java.awt.*;

public class CreateAllianceView extends JFrame {
    JTextField allianceNameTextField;
    JTextField allianceInfoTextField;
    JTextField recruitInfoTextField;
    JButton confirmButton;
    JButton backButton;

    public CreateAllianceView() {
        // 設置窗口標題和大小
        setTitle("創立聯盟");
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

        // 創建並設置聯盟名稱標籤和輸入框
        JLabel allianceNameLabel = new JLabel("聯盟名稱：");
        allianceNameLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(allianceNameLabel, gbc);

        allianceNameTextField = new JTextField(15);
        allianceNameTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(allianceNameTextField, gbc);

        // 創建並設置聯盟資訊標籤和輸入框
        JLabel allianceInfoLabel = new JLabel("聯盟資訊：");
        allianceInfoLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(allianceInfoLabel, gbc);

        allianceInfoTextField = new JTextField(15);
        allianceInfoTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(allianceInfoTextField, gbc);

        // 創建並設置招募資訊標籤和輸入框
        JLabel recruitInfoLabel = new JLabel("招募資訊：");
        recruitInfoLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(recruitInfoLabel, gbc);

        recruitInfoTextField = new JTextField(15);
        recruitInfoTextField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(recruitInfoTextField, gbc);

        // 創建並設置確認按鈕
        confirmButton = new JButton("確認");
        confirmButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(confirmButton, gbc);

        // 創建並設置返回按鈕
        backButton = new JButton("返回");
        backButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        gbc.gridx = 1;
        gbc.gridy = 4; // 把返回按鈕放在第四行
        gbc.insets = new Insets(10, 10, 0, 10); // 可以根據需要調整間隔
        panel.add(backButton, gbc);
    }

    // 公共方法以供外部訪問組件
    public String getAllianceName() {
        return allianceNameTextField.getText();
    }

    public String getAllianceInfo() {
        return allianceInfoTextField.getText();
    }

    public String getRecruitInfo() {
        return recruitInfoTextField.getText();
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public JButton getBackButton() {
        return backButton;
    }
}

