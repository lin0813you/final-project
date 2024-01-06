package Views;

import Models.Alliance;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ApplyAllianceView extends JFrame {

    private JList<String> allianceList;
    private JButton applyButton;
    private JButton backButton;

    public ApplyAllianceView() {
        // 設置窗口標題和大小
        setTitle("聯盟列表");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(300, 200);
        setLayout(new BorderLayout());

        // 創建面板並添加元件
        JPanel panel = new JPanel(new BorderLayout());
        this.add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        // 初始化聯盟列表
        allianceList = new JList<>();
        allianceList.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        panel.add(new JScrollPane(allianceList), BorderLayout.CENTER);

        // 創建按鈕面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        applyButton = new JButton("申請加入");
        applyButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        backButton = new JButton("返回");
        backButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));

        // 添加按鈕到按鈕面板
        buttonPanel.add(applyButton);
        buttonPanel.add(backButton);

        // 添加按鈕面板到主面板
        panel.add(buttonPanel, BorderLayout.SOUTH);
    }

    // 從外部設置聯盟列表
    public void setAllianceList(String[] alliances) {
        allianceList.setListData(alliances);
    }

    // 獲取用戶選擇的聯盟
    public String getSelectedAlliance() {
        return allianceList.getSelectedValue();
    }

    // Getter 方法
    public JButton getApplyButton() {
        return applyButton;
    }

    public JButton getBackButton() {
        return backButton;
    }
}

