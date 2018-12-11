package ksarfo.javaee.zad05.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlRootElement
public class Watch {
    private long id;
    private String producer;
    private String name;
    private Date dateOfProduction;
    private String waterproof;
    private double price;
    private String description;

    public Watch() {}

    public Watch(long id, String name, String producer, Date dateOfProduction, String waterproof, double price, String description) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.dateOfProduction = dateOfProduction;
        this.waterproof = waterproof;
        this.price = price;
        this.description = description;
    }
    
    public Watch(Watch watch) {
    	this.id = watch.getId();
        this.name = watch.getName();
        this.producer = watch.getProducer();
        this.dateOfProduction = watch.getDateOfProduction();
        this.waterproof = watch.getWaterproof();
        this.price = watch.getPrice();
        this.description = watch.getDescription();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
    
    public String getWaterproof() {
        return waterproof;
    }

    public void setWaterproof(String waterproof) {
        this.waterproof = waterproof;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
///////-----------------------------------------------------????????????????????????
    @Override
    public String toString() {
        return  "id=" + id +
        		", name=" + name +
        		", producer='" + producer + 
                ", dateOfProduction=" + dateOfProduction +
                ", waterproof=" + waterproof +
                ", price=" + price +
                ", description='" + description;

    }
}
