package Models;

import java.util.ArrayList;

public class AllianceManager {
    private static final AllianceManager allianceManager = new AllianceManager();
    private ArrayList<Alliance> alliances;

    private AllianceManager() {
        alliances = new ArrayList<>();

        UserManager userManager = UserManager.getUserManager();

        // 創建新的聯盟
        alliances.add(new Alliance("haha", userManager.generateRandomUsers(10), "no", userManager.generateRandomUsers(10), "no"));
    }

    public static AllianceManager getAllianceManager() {
        return allianceManager;
    }


}


