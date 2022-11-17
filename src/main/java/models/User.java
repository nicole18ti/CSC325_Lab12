package models;

public class User {

    private String fName;
    private String lName;
    private String userID;

    public User(String fName, String lName, String userID) {
        this.fName = fName;
        this.lName = lName;
        this.userID = userID;
    }
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "User{" + "fName=" + fName + ", lName=" + lName + ", userID=" + userID + '}';
    }

}
