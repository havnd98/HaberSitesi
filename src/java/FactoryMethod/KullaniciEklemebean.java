/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import entity.Kullanici;
import entity.personal;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author havnd
 */
@Named
@SessionScoped
public class KullaniciEklemebean implements Serializable{
    
    private personal entity1;
    private Kullanici entity2;
    private Kullanicidao dao;

    
    public KullaniciEklemebean(){
        
    }
    
    public String createPersonal(){
        this.getDao().insertPersonal(entity1);
        return "/yonetici/yonetici";
    }
    
    public String cerateKullanici(){
        this.getDao().insertMusteri(entity2);
        return "/index";
    }
    
    public personal getById(int id){
        return this.getDao().getById(id);
    }
    
    public String delete(Kullanici m){
        this.getDao().delete(m);
        return "/index";
    }
    
    
    public personal getEntity1() {
        if(this.entity1==null)
            this.entity1 = new personal();
        return entity1;
    }

    public void setEntity1(personal entity1) {
        this.entity1 = entity1;
    }

    public Kullanici getEntity2() {
        if(this.entity2==null)
            this.entity2 = new Kullanici();
        return entity2;
    }

    public void setEntity2(Kullanici entity2) {
        this.entity2 = entity2;
    }

    public Kullanicidao getDao() {
        if(this.dao==null)
            this.dao = new Kullanicidao();
        return dao;
    }

    public void setDao(Kullanicidao dao) {
        this.dao = dao;
    }
    
}
