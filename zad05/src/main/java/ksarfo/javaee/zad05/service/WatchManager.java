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

    public Watch getWatch(long id) {
        for(Watch watch : db) {
            if(watch.getId() == id) return watch;
        }
        return null;
    }

    public List<Watch> getWatches(String producer) {			//by producer
        List<Watch> watchesList = new ArrayList<>();

        for(Watch watch : db) {
            if(watch.getProducer().equals(producer)) {
            	watchesList.add(watch);
            }
        }
        return watchesList;
    }

    public List<Watch> getAllWatches() {
        return db;
    }

    public Watch updateWatch(Watch upWatch) {
        for(int i = 0; i < db.size(); i++) {
            if(db.get(i).getId() == upWatch.getId())
                db.set(i, upWatch);
        }
        return upWatch;
    }



}
