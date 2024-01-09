package Views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class AdvertiserView extends JFrame {
    private final JPanel previewPanel; //SB
    private JTextField daysTextField;
    private JTextField amountTextField;
    private JButton confirmButton;
    private JLabel previewImageLabel;
    private JButton cancelAdButton;
    private JButton chooseFileButton;
    private JComboBox<String> adSchemeComboBox;
    private JButton prevButton;
    private JButton calculateAmountButton;

    public AdvertiserView() {
        setTitle("Advertiser");
        setSize(1280, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        JPanel leftBottomPanel = createLeftBottomPanel();
        previewPanel = createPreviewPanel();
        JPanel rightBottomPanel = createRightBottomPanel();

        mainPanel.add(leftBottomPanel, BorderLayout.WEST);
        mainPanel.add(previewPanel, BorderLayout.CENTER);
        mainPanel.add(rightBottomPanel, BorderLayout.SOUTH);

        JPanel leftBottomInputPanel = new JPanel();
        leftBottomInputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel amountPanel = new JPanel();
        amountPanel.setBackground(Color.WHITE);

        mainPanel.add(leftBottomInputPanel, BorderLayout.NORTH);
        mainPanel.add(amountPanel, BorderLayout.EAST);

        getContentPane().add(mainPanel);

    }

    private JPanel createLeftBottomPanel() {
        GridBagLayout gbl_leftBottomPanel = new GridBagLayout();
        gbl_leftBottomPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0};
        JPanel leftBottomPanel = new JPanel(gbl_leftBottomPanel);
        leftBottomPanel.setBackground(Color.LIGHT_GRAY);

        chooseFileButton = new JButton("選擇檔案");
        GridBagConstraints gbcChooseFile = new GridBagConstraints();
        gbcChooseFile.anchor = GridBagConstraints.NORTH;
        gbcChooseFile.gridx = 0;
        gbcChooseFile.gridy = 0;
        gbcChooseFile.insets = new Insets(0, 0, 20, 10);
        leftBottomPanel.add(chooseFileButton, gbcChooseFile);

        chooseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectFile();
            }
        });

        adSchemeComboBox = new JComboBox<>(new DefaultComboBoxModel<>(new String[]{"競賽贊助商", "聯盟贊助商"}));
        GridBagConstraints gbcComboBox = new GridBagConstraints();
        gbcComboBox.anchor = GridBagConstraints.NORTH;
        gbcComboBox.gridx = 1;
        gbcComboBox.gridy = 0;
        gbcComboBox.insets = new Insets(0, 0, 20, 10);
        leftBottomPanel.add(adSchemeComboBox, gbcComboBox);

        prevButton = new JButton("返回");
        GridBagConstraints gbcPrevButton = new GridBagConstraints();
        gbcPrevButton.anchor = GridBagConstraints.NORTH;
        gbcPrevButton.insets = new Insets(0, 0, 5, 0);
        gbcPrevButton.gridx = 2;
        gbcPrevButton.gridy = 0;
        leftBottomPanel.add(prevButton, gbcPrevButton);

        String additionalText = "<html><div style='text-align: center;'><font color='red'><b>限時特價，<br>絕對是您<br>省錢的<br>最佳時機！<br>只要刊登<br>超過<span style='font-family: forte; font-size: 40px;'>30</span>天<br>就多送<span style='font-family: forte; font-size: 40px;'>5</span>天！</b></font></div></html>";
        JLabel additionalTextLabel = new JLabel(additionalText);
        additionalTextLabel.setFont(new Font("幼圆", Font.ITALIC, 34));
        GridBagConstraints gbcAdditionalText = new GridBagConstraints();
        gbcAdditionalText.anchor = GridBagConstraints.NORTH;
        gbcAdditionalText.gridx = 0;
        gbcAdditionalText.gridy = 4;
        gbcAdditionalText.gridwidth = 3;
        gbcAdditionalText.insets = new Insets(10, 0, 20, 0);
        leftBottomPanel.add(additionalTextLabel, gbcAdditionalText);

        return leftBottomPanel;
    }

    private JPanel createPreviewPanel() {
        JPanel previewPanel = new JPanel();
        previewPanel.setBackground(Color.WHITE);

        previewImageLabel = new JLabel();
        previewImageLabel.setBackground(Color.WHITE);
        previewPanel.add(previewImageLabel);

        return previewPanel;
    }

    private JPanel createRightBottomPanel() {
        JPanel rightBottomPanel = new JPanel();
        rightBottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel daysLabel = new JLabel("刊登天數:");
        rightBottomPanel.add(daysLabel);
        daysTextField = new JTextField(5);
        rightBottomPanel.add(daysTextField);

        calculateAmountButton = new JButton("計算應付金額");
        rightBottomPanel.add(calculateAmountButton);

        JLabel amountLabel = new JLabel("應付金額:");
        rightBottomPanel.add(amountLabel);

        amountTextField = new JTextField(10);
        rightBottomPanel.add(amountTextField);

        confirmButton = new JButton("確認廣告");
        rightBottomPanel.add(confirmButton);

        cancelAdButton = new JButton("取消廣告");
        rightBottomPanel.add(cancelAdButton);

        return rightBottomPanel;
    }

    private void selectFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            displaySelectedImage(selectedFile);
        }
    }

    private void displaySelectedImage(File selectedFile) {
        try {
            Image img = ImageIO.read(selectedFile);
            int panelWidth = previewPanel.getWidth();
            int panelHeight = previewPanel.getHeight();
            Image scaledImg = img.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
            previewImageLabel.setIcon(new ImageIcon(scaledImg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JButton getPrevButton() {
        return prevButton;
    }
}
