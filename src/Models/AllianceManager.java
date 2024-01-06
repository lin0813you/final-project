package Models;

import java.util.ArrayList;

public class AllianceManager {
    private static final AllianceManager allianceManager = new AllianceManager();
    private final ArrayList<Alliance> alliances;

    private AllianceManager() {
        alliances = new ArrayList<>();
        UserManager userManager = UserManager.getUserManager();

        // 創建新的聯盟
        alliances.add(new Alliance("尊督假督", userManager.generateRandomUsers(20), "哈哈", userManager.generateRandomUsers(10), "no",userManager.getUserIfExists("user")));
        alliances.add(new Alliance("軟體系二次元大聯盟",userManager.generateRandomUsers(17),"就是肥宅",userManager.generateRandomUsers(7),"都是肥宅",userManager.getUserIfExists("bin")));
    }

    public static AllianceManager getAllianceManager() {
        return allianceManager;
    }
    public ArrayList<Alliance> getAlliances() {
        return alliances;
    }

    public Alliance getPlayerAllianceIfExists(User targetUser) {
        // 遍歷所有聯盟
        for (Alliance alliance : alliances) {
            // 先確認是否是該聯盟擁有人
            if (alliance.getOwner() == targetUser) {
                return alliance;
            }
            // 檢查每個聯盟的成員
            for (User member : alliance.getMember()) {
                // 如果找到匹配的玩家
                if (member.equals(targetUser)) {
                    // 返回這個聯盟
                    return alliance;
                }
            }
        }
        // 如果沒有找到匹配的聯盟，返回 null
        return null;
    }
    //這個方法用來實現要顯示在View的資料
    public String[] getAllianceNamesAndOwners() {
        String[] namesAndOwners = new String[alliances.size()];
        for (int i = 0; i < alliances.size(); i++) {
            Alliance alliance = alliances.get(i);
            namesAndOwners[i] = alliance.getName() + " 擁有者:" + alliance.getOwner().getName();
        }
        return namesAndOwners;
    }

    //這個方法用來實現判斷用戶所選擇的聯盟是哪個，並且在該聯盟的applyPlayer加上這筆用戶資料
    public void getPlayerApplyAlliance(String target, User applyPlayer) {
        for (Alliance alliance : alliances) {
            String allianceInfo = alliance.getName() + " 擁有者:" + alliance.getOwner().getName();
            if (allianceInfo.equals(target)) {
                // 找到對應的聯盟後，將用戶加入到該聯盟的申請者列表中
                ArrayList<User> applyPlayers = alliance.getApplyPlayer();
                if (!applyPlayers.contains(applyPlayer)) {
                    applyPlayers.add(applyPlayer);
                }
                break;
            }
        }
    }
    public void removePlayerAlliance(Alliance alliance, User user) {
        if (alliance != null && user != null) {
            // 從聯盟的成員列表中移除用戶
            alliance.getMember().remove(user);
            // 如有需要，也可從申請者列表中移除
            alliance.getApplyPlayer().remove(user);
        }
    }
    public String addNewAlliance(String name, String info, String recruitInfo, User owner) {
        // 檢查名稱是否為空或聯盟是否已經存在
        if (name == null || name.isEmpty() || owner == null) {
            return "名稱不可為空";
        }
        else if (allianceNameExists(name)) {
            return "此聯盟已存在";
        }

        // 創建新的聯盟並加入到聯盟列表中
        Alliance newAlliance = new Alliance(name, new ArrayList<>(), info, new ArrayList<>(), recruitInfo, owner);
        alliances.add(newAlliance);
        return "創立完成，點擊返回回到主頁面";
    }

    private boolean allianceNameExists(String name) {
        for (Alliance alliance : alliances) {
            if (alliance.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}


