package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by tish on 07.06.2014.
 */
public class DBConnection {
    private String driver;
    private String url;
    private String username;
    private String password;

    public DBConnection() {
    }

    public Connection getConnection(){
        Connection result = null;
        try {
            Class.forName(driver);
            result = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  result;
    }

    public String getDriver() {

        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
