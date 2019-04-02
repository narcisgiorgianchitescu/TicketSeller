package users;

public abstract class User {
    private String name;
    private String CNP;

    public User(String nm, String cnp) {
        name = nm;
        CNP = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}
