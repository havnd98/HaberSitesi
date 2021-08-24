/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author havnd
 */
public class haber {
    
    private int haber_id;
    private String haber_turu;
    private String haber_ismi;
    private String haber;
    private int onaylama_durumu;
    private int personal_id;
    private Date lastUpdate;
    
    
    public haber() {
    }
    
    public haber(String haber_turu,String haber_ismi , String haber ,int personal_id, Date lastUpdate) {
        this.haber_turu = haber_turu;
        this.haber_ismi = haber_ismi;
        this.haber = haber;
        this.lastUpdate = lastUpdate;
    }



    public haber(int haber_id, String haber_turu,String haber_ismi , String haber, int onaylama_durumu, int personal_id, Date lastUpdate) {
        this.haber_id = haber_id;
        this.haber_turu = haber_turu;
        this.haber_ismi = haber_ismi;
        this.haber = haber;
        this.onaylama_durumu = onaylama_durumu;
        this.personal_id = personal_id;
        this.lastUpdate = lastUpdate;
    }


    public int getHaber_id() {
        return haber_id;
    }

    public void setHaber_id(int haber_id) {
        this.haber_id = haber_id;
    }

    public String getHaber_turu() {
        return haber_turu;
    }

    public void setHaber_turu(String haber_turu) {
        this.haber_turu = haber_turu;
    }

    public String getHaber() {
        return haber;
    }

    public void setHaber(String haber) {
        this.haber = haber;
    }

    public int getOnaylama_durumu() {
        return onaylama_durumu;
    }

    public void setOnaylama_durumu(int onaylama_durumu) {
        this.onaylama_durumu = onaylama_durumu;
    }

    public int getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(int personal_id) {
        this.personal_id = personal_id;
    }

    public String getHaber_ismi() {
        return haber_ismi;
    }

    public void setHaber_ismi(String haber_ismi) {
        this.haber_ismi = haber_ismi;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
    
    
}
