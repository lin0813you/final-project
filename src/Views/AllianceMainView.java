package Views;

import javax.swing.*;
import java.awt.*;

public class AllianceMainView extends JFrame {
    private JButton membersButton;
    private JButton assignmentButton;
    private JButton resourceButton;
    private JButton informationButton;
    private JButton rankingButton;
    private JButton applyButton;
    private JButton settingButton;
    private JTextArea textArea;

    public AllianceMainView() {
        // 设置窗口标题和大小
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

        textArea = new JTextArea();
        textArea.setBackground(Color.WHITE);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
        textArea.setBounds(291, 40, 747, 615);
        add(textArea);

        membersButton = createButton("聯盟成員", 10, 137, 128, 47);
        assignmentButton = createButton("聯盟任務", 10, 197, 128, 47);
        resourceButton = createButton("聯盟資源", 10, 437, 128, 47);
        informationButton = createButton("聯盟通知與訊息", 10, 377, 128, 47);
        rankingButton = createButton("公會排名與統計", 10, 257, 128, 47);
        applyButton = createButton("招募與申請", 10, 317, 128, 47);
        settingButton = createButton("聯盟設定", 10, 497, 128, 47);
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setFont(new Font("新細明體", Font.PLAIN, 20));
        button.setBounds(x, y, width, height);
        add(button);
        return button;
    }

    // 公共方法以供外部访问组件
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

    public JButton getRankingButton() {
        return rankingButton;
    }

    public JButton getApplyButton() {
        return applyButton;
    }

    public JButton getSettingButton() {
        return settingButton;
    }



    public void setTextArea(String output) {
        this.textArea.setText(output);
    }
}



