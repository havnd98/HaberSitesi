/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Strategy.Giris;
import entity.haber;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.haberdao;

/**
 *
 * @author havnd
 */
@Named
@SessionScoped
public class haberbean implements Serializable{
    
    private haber entity;
    private haberdao dao;
    
    List<String> haberOptions;
    
    public haberbean(){
        haberOptions = new ArrayList<>();
        
        haberOptions.add("Spor");
        haberOptions.add("Oyun");
        haberOptions.add("Genel");
        haberOptions.add("Hava Durumu");
    }

    public List<String> getHaberOptions() {
        return haberOptions;
    }
    
    
    public String creat(){
        this.entity = new haber();
        return "/create/personal_page";
    }

    public List<haber> getRead(){
        return this.getDao().getList();
    }
    
    public void delete(haber h){
        this.getDao().delete(h);  
    }
    
    public String update(){
        this.getDao().update(entity);
        this.entity = new haber();
        return "/create/personal_page";
    }
    
    public String updateForm(haber u){
        this.entity=u;
        return "/create/update";
    }
    
    public haber getEntity() {
        if(this.entity==null)
            this.entity = new haber();
        return entity;
    }

    public void setEntity(haber entity) {
        this.entity = entity;
    }

    public haberdao getDao() {
        if(this.dao==null)
            this.dao=new haberdao();
        return dao;
    }

    public void setDao(haberdao dao) {
        this.dao = dao;
    }


    

    
    
}
