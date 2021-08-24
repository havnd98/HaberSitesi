/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.haber;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Onaylamadao;

/**
 *
 * @author havnd
 */
@Named
@SessionScoped
public class yoneticibean implements Serializable{
    
    private haber entity;
    private Onaylamadao dao;

    
    public List<haber> getRead(){
        return this.getDao().getList();
    }
    

    
    public String delete(int h){
        this.getDao().delete(h); 
        return "/yonetici/yonetici";
    }
    
    public String onaylama(){
        this.getDao().update(entity);
        this.entity = new haber();
        return "/yonetici/yonetici";
    }
    
    public String onaylamaForm(haber u){
        this.entity=u;
        return "/yonetici/yoneticiOnaylamasi";
    }
    
    
    public haber getEntity() {
        if(this.entity==null)
            this.entity = new haber();
        return entity;
    }

    public void setEntity(haber entity) {
        this.entity = entity;
    }

    public Onaylamadao getDao() {
        if(this.dao == null)
            this.dao = new Onaylamadao();
        return dao;
    }

    public void setDao(Onaylamadao dao) {
        this.dao = dao;
    }

    
}
