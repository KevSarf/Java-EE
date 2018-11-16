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
        this.nazwa = nazwa;
        this.od_kiedy = od_kiedy;
        this.do_kiedy= do_kiedy;
        this.czestotliwosc = czestotliwosc;
        this.pole = pole;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOd_kiedy() {
        return od_kiedy;
    }

    public void setOd_kiedy(String od_kiedy) {
        this.od_kiedy = od_kiedy;
    }
    
    public String getDo_kiedy() {
        return do_kiedy;
    }

    public void setDo_kiedy(String do_kiedy) {
        this.do_kiedy = do_kiedy;
    }
    
    public String getCzestotliwosc() {
        return czestotliwosc;
    }

    public void setCzestotliwosc(String czestotliwosc) {
        this.czestotliwosc = czestotliwosc;
    }
    
    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }

}
