package study.spring.practice.domain;


import study.spring.practice.Entity.UserEntity;

import java.util.Date;

public class User {
    private Long userIdx;

    private String email;

    private String password;

    private String name;

    private int grade;

    private Date registerTime;

    private Date lastLoginTime;

    private boolean withdrawed;

    private Date withrawTime;

    public User() {

    }

    public User(String email, String password, String name, int grade) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.grade = grade;
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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public boolean isWithdrawed() {
        return withdrawed;
    }

    public void setWithdrawed(boolean withdrawed) {
        this.withdrawed = withdrawed;
    }

    public Date getWithrawTime() {
        return withrawTime;
    }

    public void setWithrawTime(Date withrawTime) {
        this.withrawTime = withrawTime;
    }

    public static User build(UserEntity entity) {
        User user = new User();

        user.setUserIdx(entity.getUserIdx());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setName(entity.getName());
        user.setGrade(entity.getGrade());
        user.setRegisterTime(entity.getRegisterTime());
        user.setLastLoginTime(entity.getLastLoginTime());
        user.setWithdrawed(entity.isWithdrawed());
        user.setWithrawTime(entity.getWithrawTime());

        return user;
    }

}
