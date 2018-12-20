package ksarfo.javaee.zad04.domain;

import java.util.Date;

public class Watch {
    private long id;
    private String producer;
    private String name;
    private Date dateOfProduction;
    private boolean waterproof;
    private double price;  


    public Watch() {
        super();
    }

    public Watch(long id, String producer, String name, Date dateOfProduction, boolean waterproof, double price) {
        this.id = id;
        this.producer = producer;
        this.name= name;
        this.dateOfProduction = dateOfProduction;
        this.waterproof = waterproof;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
