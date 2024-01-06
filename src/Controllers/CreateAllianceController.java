package Controllers;

import Views.CreateAllianceView;
import Models.AllianceManager;
import Models.User;

import java.awt.*;

public class CreateAllianceController {
    private final CentralController centralController;
    private final CreateAllianceView createAllianceView;
    private final AllianceManager allianceManager=AllianceManager.getAllianceManager();

    private User currentPlayer;

    public CreateAllianceController(CentralController centralController) {
        this.centralController = centralController;
        this.createAllianceView = centralController.getCreateAllianceView();
    }

    public void initCreateAllianceController() {
        // 為創立聯盟介面的按鈕設置事件監聽器
        createAllianceView.getConfirmButton().addActionListener(e -> createAllianceButtonClick(currentPlayer));
        createAllianceView.getBackButton().addActionListener(e -> goBackButtonClick());
    }
    public void setUserIdentity(User user) {
        this.currentPlayer =user;
    }

    private void createAllianceButtonClick(User currentPlayer) {
        String allianceName = createAllianceView.getAllianceName();
        String allianceInfo = createAllianceView.getAllianceInfo();
        String recruitInfo = createAllianceView.getRecruitInfo();

        String stage=allianceManager.addNewAlliance(allianceName, allianceInfo, recruitInfo, currentPlayer);
        switch (stage) {
            case ("名稱不可為空"), ("此聯盟已存在"):
                centralController.getHintView().setHintLabel(stage, Color.RED);
                break;
            case ("創立完成，點擊返回回到主頁面"):
                centralController.getHintView().setHintLabel(stage,Color.GREEN);
                break;

        }
    }
    private void goBackButtonClick() {
        centralController.getPlayerMainController().setUserIdentity(currentPlayer);
        createAllianceView.setVisible(false);
        this.centralController.getPlayerMainView().setVisible(true);
    }
}
