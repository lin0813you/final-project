package Views;

import javax.swing.*;
import java.awt.*;

public class PlayerMain extends JFrame {

    public PlayerMain() {
        // Set the title of the window
        setTitle("Full-Screen GIF Display with Larger JMenu");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar with a larger font
        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(1080, 40)); // Set a larger preferred size for the menu bar

        // Create a font object for menu items
        Font menuFont = new Font("Microsoft YaHei", Font.BOLD, 20); // Set the font size as needed

        // Create the "聯盟" menu
        JMenu menuA = new JMenu("聯盟");
        menuA.setFont(menuFont);
        menuBar.add(menuA);
        addMenuItems(menuA, new String[]{"查看當前聯盟", "申請加入聯盟", "創立聯盟", "退出聯盟"}, menuFont);

        // Create the "玩家" menu
        JMenu menuB = new JMenu("玩家");
        menuB.setFont(menuFont);
        menuBar.add(menuB);
        addMenuItems(menuB, new String[]{"查看當前賽事", "競賽紀錄"}, menuFont);

        // Create the "帳戶" menu
        JMenu menuC = new JMenu("帳戶");
        menuC.setFont(menuFont);
        menuBar.add(menuC);
        addMenuItems(menuC, new String[]{"更改使用者名稱", "更改密碼","登出"}, menuFont);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);

        // Create a label that will display the gif
        ImageIcon gifIcon = new ImageIcon("D:\\code\\Intellijcode\\untitled\\untitled1\\src\\preview.gif"); // Replace with your gif path
        JLabel gifLabel = new JLabel(gifIcon) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();

                // Maintain the aspect ratio of the gif
                double ratio = Math.min((double) getWidth() / gifIcon.getIconWidth(),
                        (double) getHeight() / gifIcon.getIconHeight());
                int width = (int) (gifIcon.getIconWidth() * ratio);
                int height = (int) (gifIcon.getIconHeight() * ratio);

                // Draw the gif centered in the panel
                g2d.drawImage(gifIcon.getImage(), (getWidth() - width) / 2, (getHeight() - height) / 2, width, height, null);
                g2d.dispose();
            }
        };

        // Set the label size to match the frame size
        gifLabel.setPreferredSize(new Dimension(1980, 1080));

        // Add the label to the frame
        add(gifLabel);

        // Set the frame to not be resizable
        setResizable(false);

        // Set the size of the frame
        setSize(1080,1080);

        // Pack the components within the frame
        pack();

        // Set the window to be visible
        setVisible(true);
    }

    private void addMenuItems(JMenu menu, String[] itemNames, Font font) {
        for (String itemName : itemNames) {
            JMenuItem menuItem = new JMenuItem(itemName);
            menuItem.setFont(font);
            menu.add(menuItem);
        }
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new PlayerMain());
    }
}
