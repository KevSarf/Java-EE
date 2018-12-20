package ksarfo.javaee.zad04.service;

import java.util.ArrayList;
import java.util.List;

import ksarfo.javaee.zad04.domain.Phone;

public class StorageService {

    private long id = 0;
    private List<Phone> db = new ArrayList<Phone>();
    private List<Phone> cart = new ArrayList<Phone>();

    public void add(Phone phone) {
    	Phone newPhone = new Phone(phone.getId(), phone.getName(), phone.getDataProd(), phone.getOpinia(), phone.getExtra(), phone.getPrice());
        db.add(newPhone);
    }

    public long getId() {
        id++;

        return this.id;
    }

    public Phone getWatch(long id) {    	
    	for(Phone watch : db) {
    		if(watch.getId()== id) {
    			return watch;
    		}
    	}
    	return null;
    }
    
    public List<Phone> getAllPhones() {
        return db;
    }

    public List<Phone> cartClear() {
   
    	cart.clear();    	
    	return cart;
    }
    
    
}
