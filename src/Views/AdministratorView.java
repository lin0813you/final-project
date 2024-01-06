package Views;

import javax.swing.*;
import java.awt.*;

public class AdministratorView extends JFrame {

    private JList<String> functionList;
    private JList<String> userList;
    private JList<String> allianceList;
    private JLabel selectLabel;
    private JLabel userListLabel;
    private JLabel allianceListLabel;

    public AdministratorView() {
        // 設置視窗標題和大小
        setTitle("管理者");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 150, 1280, 720);
        getContentPane().setLayout(null);
        initializeComponents();
    }

    private void initializeComponents() {
        // 管理者可使用的功能清單
        functionList = new JList<>();
        functionList.setBackground(Color.WHITE);
        functionList.setFont(new Font("新細明體", Font.BOLD, 25));
        functionList.setBounds(10, 148, 199, 397);
        add(functionList);

        // 選擇標籤
        selectLabel = new JLabel("選擇：");
        selectLabel.setFont(new Font("新細明體", Font.BOLD, 25));
        selectLabel.setBounds(10, 101, 186, 37);
        add(selectLabel);

        // 用戶列表
        userList = new JList<>();
        userList.setBounds(252, 113, 481, 535);
        add(userList);

        // 聯盟列表
        allianceList = new JList<>();
        allianceList.setBounds(758, 113, 481, 535);
        add(allianceList);

        // 用戶清單標籤
        userListLabel = new JLabel("用戶清單：");
        userListLabel.setFont(new Font("新細明體", Font.BOLD, 25));
        userListLabel.setBounds(262, 72, 176, 42);
        add(userListLabel);

        // 現有聯盟清單標籤
        allianceListLabel = new JLabel("現有聯盟清單：");
        allianceListLabel.setFont(new Font("新細明體", Font.BOLD, 25));
        allianceListLabel.setBounds(771, 72, 199, 42);
        add(allianceListLabel);
    }

    // Getter 和 Setter 方法
    public JList<String> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(String[] functions) {
        functionList.setListData(functions);
    }

    public JList<String> getUserList() {
        return userList;
    }

    public void setUserList(String[] users) {
        userList.setListData(users);
    }

    public JList<String> getAllianceList() {
        return allianceList;
    }

    public void setAllianceList(String[] alliances) {
        allianceList.setListData(alliances);
    }
}
