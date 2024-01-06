package Models;

import java.util.ArrayList;

public class Alliance {

    private final String name;
    private final ArrayList<User> member;
    private final String recruitInfo;
    private final ArrayList<User> applyPlayer;
    private final String announcement;
    private final User owner;


    public Alliance(String name, ArrayList<User> member, String recruitInfo, ArrayList<User> applyPlayer, String announcement,User owner) {
        this.name = name;
        this.member = member;
        this.recruitInfo = recruitInfo;
        this.applyPlayer = applyPlayer;
        this.announcement = announcement;
        this.owner=owner;
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


    public User getOwner() {
        return owner;
    }
}
