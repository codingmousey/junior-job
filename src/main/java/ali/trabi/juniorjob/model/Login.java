package ali.trabi.juniorjob.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private LocalDateTime last_login_date;

    public Login(Integer id) {
        this.id = id;
    }

    public Login(Integer id, String username, String password, LocalDateTime last_login_date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.last_login_date = last_login_date;
    }

    public Login(String username, String password, LocalDateTime last_login_date) {
        this.username = username;
        this.password = password;
        this.last_login_date = last_login_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(LocalDateTime last_login_date) {
        this.last_login_date = last_login_date;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", last_login_date=" + last_login_date +
                '}';
    }
}
