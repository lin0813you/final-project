package Views;

import javax.swing.*;
import java.awt.*;

public class AllianceMainView extends JFrame {
    private JButton membersButton;
    private JButton assignmentButton;
    private JButton resourceButton;
    private JButton informationButton;
    private JButton backButton;
    private JButton applyButton;
    private JButton settingButton;
    private JList<String> displayList; // 將 JTextArea 替換為 JList

    public AllianceMainView() {
        // 設置視窗標題和大小
        setTitle("聯盟");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocation(350, 150);
        setLayout(null);
        initializeComponents();
    }

    private void initializeComponents() {
        JLabel lblNewLabel = new JLabel("聯盟"); // 聯盟標籤
        lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 25));
        lblNewLabel.setBounds(10, 10, 128, 35);
        add(lblNewLabel);

        displayList = new JList<>(); // 創建 JList
        displayList.setBackground(Color.WHITE);
        displayList.setFont(new Font("Monospaced", Font.PLAIN, 15));
        displayList.setBounds(291, 40, 747, 615);
        JScrollPane scrollPane = new JScrollPane(displayList); // 為 JList 添加滾動條
        scrollPane.setBounds(291, 40, 747, 615);
        add(scrollPane);

        membersButton = createButton("聯盟成員", 10, 137, 128, 47);
        assignmentButton = createButton("聯盟任務", 10, 197, 128, 47);
        resourceButton = createButton("聯盟資源", 10, 437, 128, 47);
        informationButton = createButton("聯盟公告", 10, 377, 128, 47);
        backButton = createButton("返回首頁", 10, 257, 128, 47);
        applyButton = createButton("申請名單", 10, 317, 128, 47);
        settingButton = createButton("聯盟設定", 10, 497, 128, 47);
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setFont(new Font("新細明體", Font.PLAIN, 20));
        button.setBounds(x, y, width, height);
        add(button);
        return button;
    }

    // 公共方法以供外部訪問組件
    public JButton getMembersButton() {
        return membersButton;
    }

    public JButton getAssignmentButton() {
        return assignmentButton;
    }

    public JButton getResourceButton() {
        return resourceButton;
    }

    public JButton getInformationButton() {
        return informationButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getApplyButton() {
        return applyButton;
    }

    public JButton getSettingButton() {
        return settingButton;
    }

    public JList<String> getDisplayList() {
        return displayList;
    }

    public void setDisplayListData(String[] data) {
        displayList.setListData(data);
    }
}




