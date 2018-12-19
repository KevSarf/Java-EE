package ksarfo.javaee.zad04.service;

import java.util.ArrayList;
import java.util.List;

import ksarfo.javaee.zad04.domain.Watch;

public class StorageService {

    private long id = 0;
    private List<Watch> db = new ArrayList<Watch>();
    private List<Watch> cart = new ArrayList<Watch>();

    public void add(Watch watch) {
    	Watch newWatch = new Watch(watch.getId(), watch.getProducer(), watch.getName(), watch.getDateOfProduction(), watch.isWaterproof(), watch.getPrice());
        db.add(newWatch);
    }

    public long getId() {
        id++;

        return this.id;
    }

    public Watch getWatch(long id) {    	
    	for(Watch watch : db) {
    		if(watch.getId()== id) {
    			return watch;
    		}
    	}
    	return null;
    }
    
    public List<Watch> getAllWatches() {
        return db;
    }

    public List<Watch> cartClear() {
   
    	cart.clear();    	
    	return cart;
    }
    
    
}
