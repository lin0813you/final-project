package Controllers;

import Views.AdvertiserView;

public class AdvertiserController {
    private final CentralController centralController;
    private final AdvertiserView advertiserView;

    public AdvertiserController(CentralController centralController) {
        this.centralController = centralController;
        this.advertiserView = centralController.getAdvertiserView();
    }

    public void initAdvertiserController() {
        advertiserView.getPrevButton().addActionListener(e -> prevButtonClick());
    }

    private void prevButtonClick() {
        advertiserView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }
}
