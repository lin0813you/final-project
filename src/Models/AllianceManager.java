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

    public Alliance getPlayerAllianceIfExists(String account) {
        // 遍歷所有聯盟
        for (Alliance alliance : alliances) {
            // 檢查每個聯盟的成員
            for (User user : alliance.getMember()) {
                // 如果找到匹配的玩家
                if (user.getAccount().equals(account)) {
                    // 返回這個聯盟
                    return alliance;
                }
            }
        }
        // 如果沒有找到匹配的聯盟，返回 null
        return null;
    }

}


