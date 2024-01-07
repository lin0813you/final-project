package Controllers;

import Models.Alliance;
import Models.AllianceManager;
import Models.User;
import Views.AllianceMainView;

public class AllianceMainController {
    private final CentralController centralController;
    private final AllianceMainView allianceMainView;
    private final AllianceManager allianceManager= AllianceManager.getAllianceManager();
    private User currentPlayer;
    private Alliance playerAlliance;
    public AllianceMainController(CentralController centralController) {
        this.centralController=centralController;
        this.allianceMainView =centralController.getAllianceMainView();
    }


    public void initAllianceMainController() {
        allianceMainView.getMembersButton().addActionListener(e -> membersButtonClick());
        allianceMainView.getApplyButton().addActionListener(e -> applyButtonClick());
        allianceMainView.getInformationButton().addActionListener(e -> informationButtonClick());
        allianceMainView.getSettingButton().addActionListener(e -> settingButtonClick());
    }
    public void setUserIdentity(User user,Alliance playerAlliance) {
        this.currentPlayer =user;
        this.playerAlliance=playerAlliance;
    }


    private void membersButtonClick() {
        //TODO 調用AllianceManager的方法獲取要顯示的資料，顯示當前聯盟成員清單，不須顯示Owner
    }
    private void applyButtonClick() {

    }
    private void informationButtonClick() {
    }
    private void settingButtonClick() {
    }
}
