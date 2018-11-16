package ksarfo.javaee.zad03.service;

import java.util.ArrayList;
import java.util.List;

import ksarfo.javaee.zad03.domain.Watch;

public class StorageService {

    private int id = 0;
    private List<Watch> db = new ArrayList<Watch>();
    private List<Watch> cart = new ArrayList<Watch>();

    public void add(Watch watch) {
    	Watch newWatch = new Watch(watch.getId(), watch.getProducer(), watch.getName(), watch.getDateOfProduction(), watch.isWaterproof(), watch.getPrice());
        db.add(newWatch);
    }

    public int getId() {
        id++;

        return this.id;
    }

    public List<Watch> getAllWatches() {
        return db;
    }

    public void addToCart(Watch watch) {
        cart.add(watch);
    }

    public List<Watch> getCart() {
        return cart;
    }

}
