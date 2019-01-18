package com.lifecount.o_po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userNick;

    private String userEmail;

    private String userPwd;

    private Date userBirthday;

    private Date userRegistDate;

    private String userRegistIp;

    private Boolean userGender;

    private String userPhone;

    private String userHeadImg;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getUserRegistDate() {
        return userRegistDate;
    }

    public void setUserRegistDate(Date userRegistDate) {
        this.userRegistDate = userRegistDate;
    }

    public String getUserRegistIp() {
        return userRegistIp;
    }

    public void setUserRegistIp(String userRegistIp) {
        this.userRegistIp = userRegistIp == null ? null : userRegistIp.trim();
    }

    public Boolean getUserGender() {
        return userGender;
    }

    public void setUserGender(Boolean userGender) {
        this.userGender = userGender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserNick() == null ? other.getUserNick() == null : this.getUserNick().equals(other.getUserNick()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserRegistDate() == null ? other.getUserRegistDate() == null : this.getUserRegistDate().equals(other.getUserRegistDate()))
            && (this.getUserRegistIp() == null ? other.getUserRegistIp() == null : this.getUserRegistIp().equals(other.getUserRegistIp()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserHeadImg() == null ? other.getUserHeadImg() == null : this.getUserHeadImg().equals(other.getUserHeadImg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserNick() == null) ? 0 : getUserNick().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserRegistDate() == null) ? 0 : getUserRegistDate().hashCode());
        result = prime * result + ((getUserRegistIp() == null) ? 0 : getUserRegistIp().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserHeadImg() == null) ? 0 : getUserHeadImg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userNick=").append(userNick);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userRegistDate=").append(userRegistDate);
        sb.append(", userRegistIp=").append(userRegistIp);
        sb.append(", userGender=").append(userGender);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userHeadImg=").append(userHeadImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}