package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="alien_table")
public class Alien {

@Id
    private int aid;
@Column(name="alien_name")

    private String aName;
@Transient
    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }



    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aName='" + aName + '\'' +
                ", tech=" + tech +
                '}';
    }


}
