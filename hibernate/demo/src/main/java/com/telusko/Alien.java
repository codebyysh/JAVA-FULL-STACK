package com.telusko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid ; 
    private String aname ; 
    private String tech ;


    public int getAid() {
        return aid;
    }
    public String getAname() {
        return aname;
    }
    public String getTech() {
        return tech;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
    } 

    
    
}
