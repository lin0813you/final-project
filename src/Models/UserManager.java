package Models;

import java.util.ArrayList;

public class UserManager {
    // 使用私有的靜態最終實例
    private static final UserManager userManager = new UserManager();
    private ArrayList<User> users;

    // 私有構造函數
    private UserManager() {
        users = new ArrayList<>();
        users.add(new User("046", "0908336866", "password", User.UserType.ADMINISTRATOR));
        users.add(new User("advertiser", "advertiser", "password", User.UserType.ADVERTISER));
        users.add(new User("user0123", "user", "password", User.UserType.REGULAR_USER));

    }

    // 公共靜態方法，用於獲取 UserManager 的唯一實例
    public static UserManager getUserManager() {
        return userManager;
    }

    // 管理用戶的方法，例如添加用戶
    public void addUser(User user) {
        users.add(user);
    }

    // 獲取用戶列表
    public ArrayList<User> getUsers() {
        return users;
    }

    public User.UserType getUserTypeIfUserExists(String account) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(account)) {
                return user.getUserType();
            }
        }
        return User.UserType.None; // 或者拋出一個異常，取決於你的需求
    }
    public boolean verifyAccount(String account,String password) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(account) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false; // 或者拋出一個異常，取決於你的需求
    }



    // 其他管理用戶的方法...
}

