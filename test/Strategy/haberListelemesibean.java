/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Facad.haberListelemesi;
import entity.haber;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author havnd
 */
@Named
@SessionScoped
public class haberListelemesibean implements Serializable{
    
    private haberListelemesi hl;

    
    List<String> haberOptions;
     
    public haberListelemesibean (){
        haberOptions = new ArrayList<>();
        
        haberOptions.add("Spor");
        haberOptions.add("Oyun");
        haberOptions.add("Genel");
        haberOptions.add("Hava Durumu");
    }
     
    public List<String> getHaberOptions() {
        return haberOptions;
    }
    
    
    
    public List<haber> getReadSpor(){
        return this.getHl().haberTuruSpor();
    }
    
    public List<haber> getReadGenel(){
        return this.getHl().haberTuruGenel();
    }
    
    public List<haber> getReadOyun(){
        return this.getHl().haberTuruOyun();
    }
    
    public List<haber> getReadHava_durumu(){
        return this.getHl().haberTuruHava_durumu();
    }
    
    public haberListelemesi getHl() {
        if(this.hl == null)
            this.hl = new haberListelemesi();
        return hl;
    }

    public void setHl(haberListelemesi hl) {
        this.hl = hl;
    }
    
}
