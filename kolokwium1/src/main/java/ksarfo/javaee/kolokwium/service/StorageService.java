package ksarfo.javaee.kolokwium.service;

import java.util.ArrayList;
import java.util.List;

import ksarfo.javaee.kolokwium.domain.Watch;

public class StorageService {

    private List<Watch> db = new ArrayList<Watch>();


    public void add(Watch watch) {
    	Watch newWatch = new Watch(watch.getNazwa(), watch.getOd_kiedy(), watch.getDo_kiedy(), watch.getCzestotliwosc(), watch.getPole());
        db.add(newWatch);
    }


    public List<Watch> getAllWatches() {
        return db;
    }

    public void rmChoosen(Watch newsletter) {
        db.remove(newsletter);
    }
}
