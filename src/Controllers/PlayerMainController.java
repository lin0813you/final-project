package Controllers;

import Models.AllianceManager;
import Models.User;
import Models.UserManager;
import Views.PlayerMain;

public class PlayerMainController {
    private CentralController centralController;
    private PlayerMain playerMain;
    private String userAccount;

    private UserManager userManager = UserManager.getUserManager();
    private AllianceManager allianceManager=AllianceManager.getAllianceManager();


    public PlayerMainController(CentralController centralController) {
        this.centralController = centralController;
        this.playerMain = centralController.getPlayerMainView();
    }

    public void initPlayerMainController() {
        playerMain.setMenuItemListener("查看當前聯盟", e -> viewCurrentAlliance(userAccount));
        playerMain.setMenuItemListener("申請加入聯盟", e -> applyForAlliance());
        playerMain.setMenuItemListener("創立聯盟", e -> createAlliance());
        playerMain.setMenuItemListener("退出聯盟", e -> quitAlliance());
        playerMain.setMenuItemListener("查看當前賽事", e -> viewCurrentCompetition());
        playerMain.setMenuItemListener("競賽紀錄", e -> competitionRecord());
        playerMain.setMenuItemListener("更改使用者名稱", e -> changeUsername());
        playerMain.setMenuItemListener("更改密碼", e -> changePassword());
        playerMain.setMenuItemListener("登出", e -> logout());
    }

    public void setUserIdentity(String account) {
        this.userAccount=account;
    }

    // 分別為每個菜單項目定義一個方法
    private void viewCurrentAlliance(String userIdentity) {

    }

    private void applyForAlliance() {
        // 申請加入聯盟的操作
    }

    private void createAlliance() {
        // 創立聯盟的操作
    }

    private void quitAlliance() {
        // 退出聯盟的操作
    }

    private void viewCurrentCompetition() {
        // 查看當前賽事的操作
    }

    private void competitionRecord() {
        // 競賽紀錄的操作
    }

    private void changeUsername() {
        // 更改使用者名稱的操作
    }

    private void changePassword() {
        // 更改密碼的操作
    }

    private void logout() {
        // 登出的操作
    }
}

