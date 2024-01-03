package Models;

public class User {
    // 定義私有屬性
    private String name; // 使用者名稱
    private String phoneNumber; // 手機號碼
    private String password; // 密碼
    private UserType userType; // 使用者類別

    // 使用者類別的枚舉
    public enum UserType {
        ADVERTISER, // 廣告商
        REGULAR_USER, // 一般使用者
        ADMINISTRATOR, // 管理者
        None, //不存在
    }



    // 建構子
    public User(String name, String phoneNumber, String password, UserType userType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userType = userType;
    }

    // getter 和 setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
