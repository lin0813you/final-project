package Controllers;

import Models.Alliance;
import Models.AllianceManager;
import Models.UserManager;
import Views.PlayerMainView;

import java.awt.*;

public class PlayerMainController {
    private CentralController centralController;
    private PlayerMainView playerMainView;
    private String playerAccount;
    private Alliance playerAlliance;

    private UserManager userManager = UserManager.getUserManager();
    private AllianceManager allianceManager=AllianceManager.getAllianceManager();


    public PlayerMainController(CentralController centralController) {
        this.centralController = centralController;
        this.playerMainView = centralController.getPlayerMainView();
    }

    public void initPlayerMainController() {
        playerMainView.setMenuItemListener("查看當前聯盟", e -> viewCurrentAlliance(playerAlliance));
        playerMainView.setMenuItemListener("申請加入聯盟", e -> applyForAlliance());
        playerMainView.setMenuItemListener("創立聯盟", e -> createAlliance());
        playerMainView.setMenuItemListener("退出聯盟", e -> quitAlliance());
        playerMainView.setMenuItemListener("查看當前賽事", e -> viewCurrentCompetition());
        playerMainView.setMenuItemListener("競賽紀錄", e -> competitionRecord());
        playerMainView.setMenuItemListener("更改使用者名稱", e -> changeUsername());
        playerMainView.setMenuItemListener("更改密碼", e -> changePassword());
        playerMainView.setMenuItemListener("登出", e -> logout());
    }

    public void setUserIdentity(String account) {
        this.playerAccount =account;
        this.playerAlliance= allianceManager.getPlayerAllianceIfExists(account);
    }

    // 分別為每個菜單項目定義一個方法
    private void viewCurrentAlliance(Alliance playerAlliance) {
        if (playerAlliance == null) {
            centralController.getErrorView().setHintLabel("您尚未加入聯盟", Color.RED);
        }
        else {
            //centralController.getAllianceMainController();
            playerMainView.setVisible(false);
            centralController.getAllianceMainView().setVisible(true);
        }
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

