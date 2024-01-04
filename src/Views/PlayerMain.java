package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayerMain extends JFrame {

    // 定義菜單項目
    JMenuItem viewCurrentAllianceItem;
    JMenuItem applyForAllianceItem;
    JMenuItem createAllianceItem;
    JMenuItem quitAllianceItem;
    JMenuItem viewCurrentCompetitionItem;
    JMenuItem competitionRecordItem;
    JMenuItem changeUsernameItem;
    JMenuItem changePasswordItem;
    JMenuItem logoutItem;

    public PlayerMain() {
        setTitle("LBN 大巨巢");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 設置菜單欄
        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(1080, 40));
        setJMenuBar(menuBar);

        Font menuFont = new Font("Microsoft YaHei", Font.BOLD, 20);

        // 添加聯盟菜單和菜單項目
        JMenu menuA = new JMenu("聯盟");
        menuA.setFont(menuFont);
        menuBar.add(menuA);

        viewCurrentAllianceItem = new JMenuItem("查看當前聯盟");
        applyForAllianceItem = new JMenuItem("申請加入聯盟");
        createAllianceItem = new JMenuItem("創立聯盟");
        quitAllianceItem = new JMenuItem("退出聯盟");
        addMenuItems(menuA, new JMenuItem[]{viewCurrentAllianceItem, applyForAllianceItem, createAllianceItem, quitAllianceItem}, menuFont);

        // 添加玩家菜單和菜單項目
        JMenu menuB = new JMenu("玩家");
        menuB.setFont(menuFont);
        menuBar.add(menuB);

        viewCurrentCompetitionItem = new JMenuItem("查看當前賽事");
        competitionRecordItem = new JMenuItem("競賽紀錄");
        addMenuItems(menuB, new JMenuItem[]{viewCurrentCompetitionItem, competitionRecordItem}, menuFont);

        // 添加帳戶菜單和菜單項目
        JMenu menuC = new JMenu("帳戶");
        menuC.setFont(menuFont);
        menuBar.add(menuC);

        changeUsernameItem = new JMenuItem("更改使用者名稱");
        changePasswordItem = new JMenuItem("更改密碼");
        logoutItem = new JMenuItem("登出");
        addMenuItems(menuC, new JMenuItem[]{changeUsernameItem, changePasswordItem, logoutItem}, menuFont);

        // GIF標籤的設置
        ImageIcon gifIcon = new ImageIcon("D:\\code\\Intellijcode\\untitled\\untitled1\\src\\preview.gif");
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


public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlayerMain().setVisible(true));
    }

}