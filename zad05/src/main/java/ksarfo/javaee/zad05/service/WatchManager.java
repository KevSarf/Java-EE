package ksarfo.javaee.zad05.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import ksarfo.javaee.zad05.domain.Watch;

@Singleton
public class WatchManager {
    private List<Watch> db = Collections.synchronizedList(new ArrayList<>());

    public void addNewWatch(Watch watch) {
        db.add(watch);
    }
    
    public void deleteWatch(long id) {
        for(Watch watch : db) {
            if(watch.getId() == id) {
                db.remove(watch);
            }
        }
    }
    
/*
    public void deleteAllWatches(){
    	for(Watch watch : db) {
    		db.remove(watch);
    	}
    }*/
    
        
    public void deleteAllWatches(){
    	db.clear();
    }
    

    public Watch getWatch(long id) {			//by id
        for(Watch watch : db) {
            if(watch.getId() == id) {
            	return watch;
            }
        }
        return null;
    }

    public List<Watch> getWatchesByProducer(String producer) {			//by producer
        List<Watch> watchesList = new ArrayList<>();

        for(Watch watch : db) {
            if(watch.getProducer().equals(producer)) {
            	watchesList.add(watch);
            }
        }
        return watchesList;
    }
    
    public List<Watch> getWatchesLTPrice(double price){		//by price low - lower than price
    	List<Watch> watchesList = new ArrayList<>();
    	
    	for(Watch watch : db) {
    		if(watch.getPrice() <= price) {
    			watchesList.add(watch);
    		}
    	}
    	return watchesList;
    }
    
    public List<Watch> getWatchesGTPrice(double price){		//by price  - greater than price 
    	List<Watch> watchesList = new ArrayList<>();
    	
    	for(Watch watch : db) {
    		if(watch.getPrice() >= price) {
    			watchesList.add(watch);
    		}
    	}
    	return watchesList;
    }
    

    public List<Watch> getAllWatches() {
        return db;
    }

    public Watch updateWatch(Watch upWatch) {
    	int id = 0;
        for(int i = 0; i < db.size(); i++) {
            if(db.get(i).getId() == upWatch.getId()) {
            	id = i; 
            	//Watch newData = new Watch(upWatch);
            }         
        }
        db.set(id, upWatch);	
        return upWatch;
    }


}
