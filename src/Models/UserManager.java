package Models;

import java.util.ArrayList;
import java.util.Random;

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
    //生成一個隨機User
    public User generateRandomUser() {
        Random random = new Random();
        // 擴展的隨機英文名稱列表
        String[] names = {
                "Andy", "John", "Emily", "Grace", "Michael",
                "Sarah", "Chris", "Laura", "David", "Sophia",
                "Daniel", "Emma", "James", "Olivia", "Robert",
                "Linda", "William", "Jessica", "Joseph", "Karen",
                "Lisa", "Kevin", "Mary", "George", "Barbara",
                "Jennifer", "Jason", "Susan", "Paul", "Elizabeth",
                "Richard", "Helen", "Thomas", "Sandra", "Steven",
                "Ashley", "Mark", "Kimberly", "Brian", "Donna",
                "Edward", "Michelle", "Ronald", "Carol", "Anthony",
                "Amanda", "Kenneth", "Melissa", "Charles", "Deborah"
        };
        String name = names[random.nextInt(names.length)];

        // 生成隨機手機號碼
        String phoneNumber = "09" + (100000000 + random.nextInt(900000000));

        // 生成隨機密碼
        String password = generateRandomPassword(8, 10,random);

        // 返回新建的 User 物件
        User newUser = new User(name, phoneNumber, password, User.UserType.REGULAR_USER);
        addUser(newUser);
        return newUser;
    }
    public ArrayList<User> generateRandomUsers(int count) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            users.add(generateRandomUser());
        }
        return users;
    }

    // 生成隨機密碼的輔助方法
    private static String generateRandomPassword(int minLen, int maxLen,Random random) {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int len = minLen + random.nextInt(maxLen - minLen + 1);
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < len; i++) {
            password.append(charSet.charAt(random.nextInt(charSet.length())));
        }
        return password.toString();
    }



}

