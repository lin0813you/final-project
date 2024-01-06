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

    public PlayerMainView() {
        setTitle("LBN 大巨巢");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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
        addMenuItems(menuC, new JMenuItem[]{changeUsernameItem,changePasswordItem, logoutItem}, menuFont);

        // 左側主面板
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JPanel upperLeftPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcUpperLeft = new GridBagConstraints();
        gbcUpperLeft.gridx = 0;
        gbcUpperLeft.gridy = 0;
        gbcUpperLeft.anchor = GridBagConstraints.WEST;
        gbcUpperLeft.insets = new Insets(0, 0, 0, 0);

        // 左上部分
        ImageIcon liveOneIcon = new ImageIcon("D:\\code\\Intellijcode\\final\\resources\\Pngtreelive_streaming_icons_red_symbols_5954160.png");
        Image smallImage = liveOneIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
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

        // 左上中部分
        ImageIcon matchOneIcon = new ImageIcon("D:\\code\\Intellijcode\\final\\resources\\Live1.png");
        Image lowerImage = matchOneIcon.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH);
        ImageIcon lowerResizedIcon = new ImageIcon(lowerImage);
        JLabel lowerImageLabel = new JLabel(lowerResizedIcon);
        upperLeftPanel.add(lowerImageLabel, gbcUpperLeft);

        gbcUpperLeft.gridx = 0;
        gbcUpperLeft.gridy = 2;
        gbcUpperLeft.gridwidth = 2;
        gbcUpperLeft.insets = new Insets(10, 50, 0, 0);
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
        GridBagConstraints gbcLowerLeft = new GridBagConstraints();
        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 0;
        gbcLowerLeft.anchor = GridBagConstraints.WEST;
        gbcLowerLeft.insets = new Insets(0, 0, 0, 0);

        // 左下部分
        ImageIcon liveTwoIcon = new ImageIcon("D:\\code\\Intellijcode\\final\\resources\\Pngtreelive_streaming_icons_red_symbols_5954160.png");
        Image smallImage2 = liveTwoIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon smallResizedIcon2 = new ImageIcon(smallImage2);
        JLabel smallImageLabel2 = new JLabel(smallResizedIcon2);
        lowerLeftPanel.add(smallImageLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 1;
        JLabel vsLabel2 = new JLabel("天幻聯盟 vs.  星辰之盟");
        vsLabel2.setFont(new Font("Microsoft YaHei", Font.BOLD, 32));
        lowerLeftPanel.add(vsLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 1;
        gbcLowerLeft.gridwidth = 0;
        gbcLowerLeft.insets = new Insets(10, 50, 0, 0);

        // 左下中部分
        ImageIcon matchTwoIcon = new ImageIcon("D:\\code\\Intellijcode\\final\\resources\\Live2.png");
        Image lowerImage2 = matchTwoIcon.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH);
        ImageIcon lowerResizedIcon2 = new ImageIcon(lowerImage2);
        JLabel lowerImageLabel2 = new JLabel(lowerResizedIcon2);
        lowerLeftPanel.add(lowerImageLabel2, gbcLowerLeft);

        gbcLowerLeft.gridx = 0;
        gbcLowerLeft.gridy = 2;
        gbcLowerLeft.gridwidth = 2;
        gbcLowerLeft.insets = new Insets(10, 50, 0, 0);
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

        // 右上部分
        JPanel upperRightPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcUpperRight = new GridBagConstraints();
        gbcUpperRight.gridx = 0;
        gbcUpperRight.gridy = 0;
        gbcUpperRight.anchor = GridBagConstraints.WEST;
        gbcUpperRight.insets = new Insets(0, 0, 0, 100);

        // 只顯示圖片，去除文字
        JLabel adOneIcon = new JLabel("<html><div align='left'><img src='path/to/upperImage.jpg' width='100' height='100'></div></html>");
        upperRightPanel.add(adOneIcon, gbcUpperRight);

        // 右下部分
        JPanel lowerRightPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcLowerRight = new GridBagConstraints();
        gbcLowerRight.gridx = 0;
        gbcLowerRight.gridy = 0;
        gbcLowerRight.anchor = GridBagConstraints.WEST;
        gbcLowerRight.insets = new Insets(20, 0, 0, 100);

        // 只顯示圖片，去除文字
        JLabel adTwoIcon = new JLabel("<html><div align='left'><img src='path/to/lowerImage.jpg' width='100' height='100'></div></html>");
        lowerRightPanel.add(adTwoIcon, gbcLowerRight);

        // 使用 BoxLayout 將兩個部分垂直並排
        Box rightPanel = Box.createVerticalBox();
        rightPanel.add(upperRightPanel);
        rightPanel.add(lowerRightPanel);

        add(rightPanel, BorderLayout.EAST);


        // 中央主面板
        ImageIcon gifIcon = new ImageIcon("D:\\code\\Intellijcode\\final\\resources\\preview.gif");
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
                g2d.dispose();
            }
        };

        gifLabel.setPreferredSize(new Dimension(1980, 1080));
        add(gifLabel, BorderLayout.CENTER);

        setResizable(false);
        setSize(1080, 1080);
        pack();
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
}