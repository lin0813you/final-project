package Controllers;

import Views.AdministratorView;

public class AdministratorController {
    private final CentralController centralController;
    private final AdministratorView administratorView;
    public AdministratorController(CentralController centralController) {
        this.centralController=centralController;
        this.administratorView=centralController.getAdministratorView();
    }
    public void initAdministratorController() {
        administratorView.getBackButton().addActionListener(e -> backButtonClick());
    }

    private void backButtonClick() {
        administratorView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }



    private void setUserStageButtonClick() {

    }

    private void setAllianceStageButtonClick(){

    }

    private void changeSettingButtonClick() {

    }

}
