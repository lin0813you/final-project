package Controllers;

import Views.PlayerMain;

public class PlayerMainController {
    private  CentralController centralController;
    private PlayerMain playerMain;
    public PlayerMainController(CentralController centralController) {
        this.centralController=centralController;
        this.playerMain=centralController.getPlayerMainView();
    }

    public void initPlayerMainController() {

    }
}
