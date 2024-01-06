package Controllers;


import Models.AllianceManager;
import Models.User;
import Views.ApplyAllianceView;

import java.awt.*;


public class ApplyAllianceController {
    private final CentralController centralController;
    private final ApplyAllianceView applyAllianceView;
    private final AllianceManager allianceManager=AllianceManager.getAllianceManager();
    private User applyPlayer;

    public ApplyAllianceController(CentralController centralController) {
        this.centralController=centralController;
        this.applyAllianceView=centralController.getApplyAllianceView();
    }
    public void initApplyAllianceController() {
        applyAllianceView.getApplyButton().addActionListener(e -> applyButtonClick(applyAllianceView.getSelectedAlliance()));
        applyAllianceView.getBackButton().addActionListener(e -> backButtonClick());
    }

    public void setApplyAllianceView(User applyPlayer) {
        this.applyPlayer=applyPlayer;
        applyAllianceView.setAllianceList(allianceManager.getAllianceNamesAndOwners());
    }

    private void applyButtonClick(String applyAlliance) {
        allianceManager.getPlayerApplyAlliance(applyAlliance,applyPlayer);
        centralController.getHintView().setHintLabel("成功申請" , Color.GREEN);
    }
    private void backButtonClick() {
        applyAllianceView.setVisible(false);
        centralController.getPlayerMainView().setVisible(true);
    }



}
