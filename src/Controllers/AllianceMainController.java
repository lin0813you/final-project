package Controllers;

import Models.AllianceManager;
import Views.AllianceMainView;

public class AllianceMainController {
    private CentralController centralController;
    private AllianceMainView allianceMainView;
    private AllianceManager allianceManager= AllianceManager.getAllianceManager();
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



    private void membersButtonClick() {

    }
    private void applyButtonClick() {
    }
    private void informationButtonClick() {
    }
    private void settingButtonClick() {
    }
}
