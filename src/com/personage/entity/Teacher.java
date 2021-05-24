package com.personage.entity;

public class Teacher {
    private int tid;
    private String tname;
    private int tage;
    private String tsex;

    public Teacher() {
    }

    public Teacher(int tid, String tname, int tage, String tsex) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
        this.tsex = tsex;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }
}
