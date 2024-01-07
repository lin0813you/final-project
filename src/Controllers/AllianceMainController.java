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
        allianceMainView.getBackButton().addActionListener(e -> backButtonClick());
    }
    public void setUserIdentity(User user,Alliance playerAlliance) {
        this.currentPlayer =user;
        this.playerAlliance=playerAlliance;
    }


    private void membersButtonClick() {
        String[] members = allianceManager.getAllianceMember(playerAlliance);
        allianceMainView.setDisplayListData(members);
    }
    private void applyButtonClick() {

    }
    private void informationButtonClick() {
    }
    private void settingButtonClick() {
    }
    private void backButtonClick() {
        allianceMainView.setVisible(false);
        centralController.getPlayerMainView().setVisible(true);
    }
}
