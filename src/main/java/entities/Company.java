package entities;

/**
 * Created by tish on 07.06.2014.
 */
public class Company {
    private String name;
    private User user;

    public Company() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
