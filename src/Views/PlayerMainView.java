package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayerMainView extends JFrame {

    JMenuItem viewCurrentAllianceItem;
    JMenuItem applyForAllianceItem;
    JMenuItem createAllianceItem;
    JMenuItem quitAllianceItem;
    JMenuItem viewCurrentCompetitionItem;
    JMenuItem competitionRecordItem;
    JMenuItem changeUsernameItem;
    JMenuItem changePasswordItem;
    JMenuItem logoutItem;
    JTextArea bottomTextArea;
    JTextArea bottomTextArea2;
    JButton watchButton;
    JButton watchButton2;

    // 設定右側圖片的變數
    private String upperRightImagePath = "resources/Live2.png";
    private String lowerRightImagePath = "resources/Live2.png";

    public PlayerMainView() {
        setTitle("LBN 大巨巢");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(1080, 40));
        setJMenuBar(menuBar);

        Font menuFont = new Font("Microsoft YaHei", Font.BOLD, 20);

        JMenu menuA = new JMenu("聯盟");
        menuA.setFont(menuFont);
        menuBar.add(menuA);

        viewCurrentAllianceItem = new JMenuItem("查看當前聯盟");
        applyForAllianceItem = new JMenuItem("申請加入聯盟");
        createAllianceItem = new JMenuItem("創立聯盟");
        quitAllianceItem = new JMenuItem("退出聯盟");
        addMenuItems(menuA, new JMenuItem[]{viewCurrentAllianceItem, applyForAllianceItem, createAllianceItem, quitAllianceItem}, menuFont);

        JMenu menuB = new JMenu("玩家");
        menuB.setFont(menuFont);
        menuBar.add(menuB);

        viewCurrentCompetitionItem = new JMenuItem("查看當前賽事");
        competitionRecordItem = new JMenuItem("競賽紀錄");
        addMenuItems(menuB, new JMenuItem[]{viewCurrentCompetitionItem, competitionRecordItem}, menuFont);

        JMenu menuC = new JMenu("帳戶");
        menuC.setFont(menuFont);
        menuBar.add(menuC);

        changeUsernameItem = new JMenuItem("更改使用者名稱");
        changePasswordItem = new JMenuItem("更改密碼");
        logoutItem = new JMenuItem("登出");
        addMenuItems(menuC, new JMenuItem[]{changeUsernameItem, changePasswordItem, logoutItem}, menuFont);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JPanel upperLeftPanel = new JPanel(new GridBagLayout());
        upperLeftPanel.setBackground(new Color(255,218,185));
        GridBagConstraints gbcUpperLeft = new GridBagConstraints();
        gbcUpperLeft.gridx = 0;
        gbcUpperLeft.gridy = 0;
        gbcUpperLeft.anchor = GridBagConstraints.WEST;
        gbcUpperLeft.insets = new Insets(0, 0, 0, 0);

        ImageIcon smallImageIcon = new ImageIcon("resources/Pngtreelive_streaming_icons_red_symbols_5954160.png");
        Image smallImage = smallImageIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon smallResizedIcon = new ImageIcon(smallImage);
        JLabel smallImageLabel = new JLabel(smallResizedIcon);
        upperLeftPanel.add(smallImageLabel, gbcUpperLeft);

        gbcUpperLeft.gridx = 1;
        JLabel vsLabel = new JLabel("影之盟 vs. 鬼殺隊");
        vsLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 32));
        upperLeftPanel.add(vsLabel, gbcUpperLeft);

        gbcUpperLeft.gridx = 0;
        gbcUpperLeft.gridy = 1;
        gbcUpperLeft.gridwidth = 0;
        gbcUpperLeft.insets = new Insets(10, 50, 0, 0);

        ImageIcon lowerImageIcon = new ImageIcon("resources/Live1.png");
        Image lowerImage = lowerImageIcon.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH);
        ImageIcon lowerResizedIcon = new ImageIcon(lowerImage);
        JLabel lowerImageLabel = new JLabel(lowerResizedIcon);
        upperLeftPanel.add(lowerImageLabel, gbcUpperLeft);

        gbcUpperLeft.gridx = 0;
        gbcUpperLeft.gridy = 2;
        gbcUpperLeft.gridwidth = 2;
        gbcUpperLeft.insets = new Insets(10, 25, 0, 0);
        bottomTextArea = new JTextArea("火爆開戰!點擊右方按鈕進行觀看");
        bottomTextArea.setEditable(false);
        bottomTextArea.setOpaque(false);
        bottomTextArea.setFont(new Font("Microsoft YaHei", Font.PLAIN, 24));
        upperLeftPanel.add(bottomTextArea, gbcUpperLeft);

        gbcUpperLeft.gridx = 2;
        watchButton = new JButton("前往觀看");
        watchButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
        upperLeftPanel.add(watchButton, gbcUpperLeft);

        leftPanel.add(upperLeftPanel);

        JPanel lowerLeftPanel = new JPanel(new GridBagLayout());
        lowerLeftPanel.setBackground(new Color(255,218,185));
        GridBagConstraints gbcLowerLeft = new GridBagConstraints();
        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 0;
        gbcLowerLeft.anchor = GridBagConstraints.WEST;
        gbcLowerLeft.insets = new Insets(0, 0, 0, 0);

        ImageIcon smallImageIcon2 = new ImageIcon("resources/Pngtreelive_streaming_icons_red_symbols_5954160.png");
        Image smallImage2 = smallImageIcon2.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon smallResizedIcon2 = new ImageIcon(smallImage2);
        JLabel smallImageLabel2 = new JLabel(smallResizedIcon2);
        lowerLeftPanel.add(smallImageLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 1;
        JLabel vsLabel2 = new JLabel("天幻聯盟 vs.  星辰之盟");
        vsLabel2.setFont(new Font("Microsoft YaHei", Font.BOLD, 28));
        lowerLeftPanel.add(vsLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 1;
        gbcLowerLeft.gridwidth = 0;
        gbcLowerLeft.insets = new Insets(10, 50, 0, 0);

        ImageIcon lowerImageIcon2 = new ImageIcon("resources/Live2.png");
        Image lowerImage2 = lowerImageIcon2.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH);
        ImageIcon lowerResizedIcon2 = new ImageIcon(lowerImage2);
        JLabel lowerImageLabel2 = new JLabel(lowerResizedIcon2);
        lowerLeftPanel.add(lowerImageLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 2;
        gbcLowerLeft.gridwidth = 2;
        gbcLowerLeft.insets = new Insets(10, 25, 0, 0);
        bottomTextArea2 = new JTextArea("巔峰對決!點擊右方按鈕馬上觀看");
        bottomTextArea2.setEditable(false);
        bottomTextArea2.setOpaque(false);
        bottomTextArea2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 24));
        lowerLeftPanel.add(bottomTextArea2, gbcLowerLeft);

        gbcLowerLeft.gridx = 2;
        watchButton2 = new JButton("前往觀看");
        watchButton2.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
        lowerLeftPanel.add(watchButton2, gbcLowerLeft);


        leftPanel.add(lowerLeftPanel);

        add(leftPanel, BorderLayout.WEST);

        add(Box.createHorizontalStrut(50), BorderLayout.CENTER);

        Box rightPanel = Box.createVerticalBox();

        JPanel upperRightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 100));
        upperRightPanel.setBackground(new Color(255,218,185));
        JLabel upperRightLabel = new JLabel();
        loadAndSetImage(upperRightLabel, upperRightImagePath);
        upperRightPanel.add(upperRightLabel);
        rightPanel.add(upperRightPanel);

        JPanel lowerRightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        lowerRightPanel.setBackground(new Color(255,218,185));
        JLabel lowerRightLabel = new JLabel();
        loadAndSetImage(lowerRightLabel, lowerRightImagePath);
        lowerRightPanel.add(lowerRightLabel);
        rightPanel.add(lowerRightPanel);

        add(rightPanel, BorderLayout.EAST);

        ImageIcon gifIcon = new ImageIcon("resources/preview.gif");
        JLabel gifLabel = new JLabel(gifIcon) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();

                double ratio = Math.min((double) getWidth() / gifIcon.getIconWidth(),
                        (double) getHeight() / gifIcon.getIconHeight());
                int width = (int) (gifIcon.getIconWidth() * ratio);
                int height = (int) (gifIcon.getIconHeight() * ratio);

                g2d.drawImage(gifIcon.getImage(), (getWidth() - width) / 2, (getHeight() - height) / 2, width, height, null);
                g2d.setColor(new Color(100,100,100));  // 文字顏色
                g2d.setFont(new Font("幼圆", Font.BOLD, 75));  // 文字字型和大小
                String text = "歡迎來到LBN大巨巢";
                int textX = getWidth() / 2 - g2d.getFontMetrics().stringWidth(text) / 2;
                int textY = getHeight() - 750;
                g2d.drawString(text, textX, textY);

                g2d.dispose();
            }
        };

        this.getContentPane().setBackground(new Color(255, 218, 185));  // 使用淡橙色的RGB值

        add(gifLabel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        //setVisible(true);
    }

    private void addMenuItems(JMenu menu, JMenuItem[] menuItems, Font font) {
        for (JMenuItem menuItem : menuItems) {
            menuItem.setFont(font);
            menu.add(menuItem);
        }
    }

    public void setMenuItemListener(String itemName, ActionListener listener) {
        JMenuItem[] menuItems = {
                viewCurrentAllianceItem, applyForAllianceItem, createAllianceItem, quitAllianceItem,
                viewCurrentCompetitionItem, competitionRecordItem,
                changeUsernameItem, changePasswordItem, logoutItem
        };

        for (JMenuItem menuItem : menuItems) {
            if (menuItem != null && menuItem.getText().equals(itemName)) {
                menuItem.addActionListener(listener);
            }
        }
    }

    private void loadAndSetImage(JLabel label, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(480, 360, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(image);
        label.setIcon(resizedIcon);
    }


}