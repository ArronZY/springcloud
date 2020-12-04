package com.wtkj.springCloud.po;

import java.io.Serializable;
import java.util.Date;

public class XtUser implements Serializable{
    private static final long serialVersionUID = 6737091447517852446L;

    private String id;

    private String username;

    private String password;

    private String loginname;

    private String email;

    private String officephone;

    private String mobilephone;

    private String organizationid;

    private String position;

    private Integer sex;

    private String lawno;

    private Integer status;

    private String chargeperson;

    private String businesslicensenum;

    private String address;

    private String orgname;

    private String idcard;

    private String officeid;

    private String createby;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remarks;

    private String delflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getLawno() {
        return lawno;
    }

    public void setLawno(String lawno) {
        this.lawno = lawno == null ? null : lawno.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChargeperson() {
        return chargeperson;
    }

    public void setChargeperson(String chargeperson) {
        this.chargeperson = chargeperson == null ? null : chargeperson.trim();
    }

    public String getBusinesslicensenum() {
        return businesslicensenum;
    }

    public void setBusinesslicensenum(String businesslicensenum) {
        this.businesslicensenum = businesslicensenum == null ? null : businesslicensenum.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getOfficeid() {
        return officeid;
    }

    public void setOfficeid(String officeid) {
        this.officeid = officeid == null ? null : officeid.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }

    @Override
    public String toString() {
        return "XtUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginname='" + loginname + '\'' +
                ", email='" + email + '\'' +
                ", officephone='" + officephone + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", organizationid='" + organizationid + '\'' +
                ", position='" + position + '\'' +
                ", sex=" + sex +
                ", lawno='" + lawno + '\'' +
                ", status=" + status +
                ", chargeperson='" + chargeperson + '\'' +
                ", businesslicensenum='" + businesslicensenum + '\'' +
                ", address='" + address + '\'' +
                ", orgname='" + orgname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", officeid='" + officeid + '\'' +
                ", createby='" + createby + '\'' +
                ", createdate=" + createdate +
                ", updateby='" + updateby + '\'' +
                ", updatedate=" + updatedate +
                ", remarks='" + remarks + '\'' +
                ", delflag='" + delflag + '\'' +
                '}';
    }
}