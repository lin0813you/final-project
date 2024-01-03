package Models;

import java.util.ArrayList;

public class Alliance {

    private String name;
    private ArrayList<User> member;
    private String recruitInfo;
    private ArrayList<User> applyPlayer;
    private String announcement;


    public Alliance(String name, ArrayList<User> member, String recruitInfo, ArrayList<User> applyPlayer, String announcement) {
        this.name = name;
        this.member = member;
        this.recruitInfo = recruitInfo;
        this.applyPlayer = applyPlayer;
        this.announcement = announcement;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getMember() {
        return member;
    }

    public String getRecruitInfo() {
        return recruitInfo;
    }

    public ArrayList<User> getApplyPlayer() {
        return applyPlayer;
    }

    public String getAnnouncement() {
        return announcement;
    }

}
