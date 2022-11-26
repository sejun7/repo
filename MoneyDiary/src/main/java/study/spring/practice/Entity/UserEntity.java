package study.spring.practice.Entity;

import org.springframework.lang.Nullable;
import study.spring.practice.domain.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user1")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userIdx;

    private String email;

    private String password;

    private String name;

    private int grade;

    private Date registerTime;

    @Nullable
    private Date lastLoginTime;

    private boolean withdrawed;

    @Nullable
    private Date withrawTime;

    public static UserEntity build(User user) {
        UserEntity entity = new UserEntity();

        entity.setUserIdx(user.getUserIdx());
        entity.setPassword(user.getPassword());
        entity.setEmail(user.getEmail());
        entity.setName(user.getName());
        entity.setGrade(user.getGrade());
        entity.setRegisterTime(user.getRegisterTime());
        entity.setLastLoginTime(user.getLastLoginTime());
        entity.setWithdrawed(user.isWithdrawed());
        entity.setWithrawTime(user.getWithrawTime());

        return entity;
    }

    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Nullable
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(@Nullable Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public boolean isWithdrawed() {
        return withdrawed;
    }

    public void setWithdrawed(boolean withdrawed) {
        this.withdrawed = withdrawed;
    }

    @Nullable
    public Date getWithrawTime() {
        return withrawTime;
    }

    public void setWithrawTime(@Nullable Date withrawTime) {
        this.withrawTime = withrawTime;
    }
}
