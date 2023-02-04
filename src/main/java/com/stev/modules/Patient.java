package com.stev.modules;

public class Patient {
    private int SIP;
    private String name;
    private String sex;
    private int age;


    public Patient(int SIP, String name, String sex, int age) {
        this.SIP = SIP;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Patient() {

    }

    public int getSIP() {
        return SIP;
    }

    public void setSIP(int SIP) {
        this.SIP = SIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "SIP=" + SIP +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}