package Controllers;

import Models.Alliance;
import Models.AllianceManager;
import Models.User;
import Models.UserManager;
import Views.ApplyAllianceView;
import Views.PlayerMainView;

import java.awt.*;
import java.net.URI;
import java.util.ArrayList;

public class PlayerMainController {
    private final CentralController centralController;
    private final PlayerMainView playerMainView;
    private User currentPlayer;
    private Alliance playerAlliance;

    private final UserManager userManager = UserManager.getUserManager();
    private final AllianceManager allianceManager=AllianceManager.getAllianceManager();


    public PlayerMainController(CentralController centralController) {
        this.centralController = centralController;
        this.playerMainView = centralController.getPlayerMainView();
    }

    public void initPlayerMainController() {
        playerMainView.setMenuItemListener("查看當前聯盟", e -> viewCurrentAlliance(playerAlliance));
        playerMainView.setMenuItemListener("申請加入聯盟", e -> applyForAlliance(playerAlliance,currentPlayer));
        playerMainView.setMenuItemListener("創立聯盟", e -> createAlliance());
        playerMainView.setMenuItemListener("退出聯盟", e -> quitAlliance(playerAlliance));
        playerMainView.setMenuItemListener("查看當前賽事", e -> viewCurrentCompetition());
        playerMainView.setMenuItemListener("競賽紀錄", e -> competitionRecord());
        playerMainView.setMenuItemListener("更改使用者名稱", e -> changeUsername());
        playerMainView.setMenuItemListener("更改密碼", e -> changePassword());
        playerMainView.setMenuItemListener("登出", e -> logout());
    }

    public void setUserIdentity(User user) {
        this.currentPlayer =user;
        this.playerAlliance= allianceManager.getPlayerAllianceIfExists(user);
    }

    // 分別為每個菜單項目定義一個方法
    private void viewCurrentAlliance(Alliance playerAlliance) {
        if (playerAlliance == null) {
            centralController.getHintView().setHintLabel("您尚未加入聯盟", Color.RED);
        }
        else {
            //centralController.getAllianceMainController();
            playerMainView.setVisible(false);
            centralController.getAllianceMainView().setVisible(true);
        }
    }

    private void applyForAlliance(Alliance playerAlliance,User currentPlayer) {
        // 申請加入聯盟的操作
        if (playerAlliance !=null) {
            centralController.getHintView().setHintLabel("您已經擁有聯盟",Color.RED);
        }
        else {
            centralController.getApplyAllianceController().setApplyAllianceView(currentPlayer);
            playerMainView.setVisible(false);
            centralController.getApplyAllianceView().setVisible(true);
        }
    }

    private void createAlliance() {
         if (playerAlliance != null) {
             centralController.getHintView().setHintLabel("您已經擁有聯盟",Color.RED);
         }
         else {
             centralController.getCreateAllianceController().setUserIdentity(currentPlayer);
             playerMainView.setVisible(false);
             centralController.getCreateAllianceView().setVisible(true);
         }
    }

    private void quitAlliance(Alliance playerAlliance) {
        if (playerAlliance != null) {
            allianceManager.removePlayerAlliance(playerAlliance, currentPlayer);
            centralController.getHintView().setHintLabel("您已退出聯盟", Color.GREEN);
            this.playerAlliance = null; // 更新當前用戶的聯盟狀態
        } else {
            centralController.getHintView().setHintLabel("您目前不屬於任何聯盟", Color.RED);
        }
    }

    private void viewCurrentCompetition() {
        // 查看當前賽事的操作
        openWebpage("https://www.twitch.tv/");
    }

    private void competitionRecord() {
        // 競賽紀錄的操作
        openWebpage("https://liquipedia.net/valorant/Main_Page");
    }

    private void changeUsername() {
        // 更改使用者名稱的操作
    }

    private void changePassword() {
        // 更改密碼的操作
    }

    private void logout() {
        playerMainView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }

    private void openWebpage(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
                // 在這裡可以顯示錯誤消息
            }
        } else {
            // 桌面不支持的情況下的處理
        }
    }
}

