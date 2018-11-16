package ksarfo.javaee.kolokwium.domain;

import java.util.Date;

public class Watch {
    private String nazwa;
    private String od_kiedy;
    private String do_kiedy;
    private String czestotliwosc;
    private String pole;
    


    public Watch() {
        super();
    }

    public Watch(String nazwa, String od_kiedy, String do_kiedy , String czestotliwosc, String pole ) {
        this.id = id;
        this.producer = producer;
        this.name= name;
        this.dateOfProduction = dateOfProduction;
        this.waterproof = waterproof;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void nextId() {
        id++;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date productionDate) {
        this.dateOfProduction = productionDate;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

}
