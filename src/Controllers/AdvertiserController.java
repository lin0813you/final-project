package Controllers;

import Views.AdvertiserView;

import java.awt.*;

public class AdvertiserController {
    private final CentralController centralController;
    private final AdvertiserView advertiserView;

    public AdvertiserController(CentralController centralController) {
        this.centralController = centralController;
        this.advertiserView = centralController.getAdvertiserView();
    }

    public void initAdvertiserController() {
        advertiserView.getPrevButton().addActionListener(e -> prevButtonClick());
        advertiserView.getCalculateAmountButton().addActionListener(e -> calculateAmountButtonClick());
    }

    private void prevButtonClick() {
        advertiserView.setVisible(false);
        centralController.getLoginView().setVisible(true);
    }

    private void calculateAmountButtonClick() {
        int days=Integer.parseInt(advertiserView.getDaysTextField());
        centralController.getHintView().setHintLabel("刊登成功，聯絡管理員繳費，金額:"+days*1000, Color.GREEN);
    }

    private void setAdvertiserButtonClick() {

    }

    public void countMoney() {

    }


}
