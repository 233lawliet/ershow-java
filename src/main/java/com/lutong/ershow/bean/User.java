package com.lutong.ershow.bean;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class User {
    private Integer userid;

    private Long studentid;

    private String psword;

    private Long phone;

    private String email;

    private String photo;

    private String nickname;

    private String autograph;

    private String username;

    private Integer gender;

    private Integer age;

    private String address1;

    private String address2;

    private String university;

    private String school;

    private String major;

    private String classname;

    private String stage;

    private String dorm;

    private Integer authentication;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getPsword() {
        return psword;
    }

    public void setPsword(String psword) {
        this.psword = psword == null ? null : psword.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph == null ? null : autograph.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university == null ? null : university.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm == null ? null : dorm.trim();
    }

    public Integer getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", studentid=" + studentid +
                ", psword='" + psword + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", photo='" + photo + '\'' +
                ", nickname='" + nickname + '\'' +
                ", autograph='" + autograph + '\'' +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", university='" + university + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", classname='" + classname + '\'' +
                ", stage='" + stage + '\'' +
                ", dorm='" + dorm + '\'' +
                ", authentication=" + authentication +
                '}';
    }
}