package com.zhuheng.daomain;

import java.util.Date;

public class Emp {
    private int id;
    private String workno;
    private String name;
    private String gender;
    private int age;
    private String idcard;
    private String workaddress;
    private Date entrydate;

    public Emp(int id, String workno, String name, String gender, int age, String idcard, String workaddress, Date entrydate) {
        this.id = id;
        this.workno = workno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idcard = idcard;
        this.workaddress = workaddress;
        this.entrydate = entrydate;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", workno='" + workno + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", idcard='" + idcard + '\'' +
                ", workaddress='" + workaddress + '\'' +
                ", entrydate=" + entrydate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkno() {
        return workno;
    }

    public void setWorkno(String workno) {
        this.workno = workno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }
}
