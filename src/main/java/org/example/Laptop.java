package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity

public class Laptop {

    @Id
    private  int lid;
    private  String brand;
    private  String model;
    private int ram;
    @ManyToOne
    private List<Alien> alien;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", alien=" + alien +
                '}';
    }


    public void setAlien(List<Alien> alien) {
        this.alien = alien;
    }





    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }



    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



}
