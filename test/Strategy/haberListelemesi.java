/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Facad.haberListesi;
import entity.haber;
import haberler.genel;
import haberler.hava_durumu;
import haberler.oyun;
import haberler.spor;
import java.util.List;

/**
 *
 * @author havnd
 */
public class haberListelemesi {
    
    private final haberListesi Spor;
    private final haberListesi Genel;
    private final haberListesi Oyun;
    private final haberListesi hava_durumu;

    public haberListelemesi() {
        Spor = new spor();
        Genel = new genel();
        Oyun = new oyun();
        hava_durumu = new hava_durumu();
    }


    
    public List<haber> haberTuruSpor(){
        return Spor.getList();
    }
    
    public List<haber> haberTuruGenel(){
        return Genel.getList();
    }
    
    public List<haber> haberTuruOyun(){
        return Oyun.getList();
    }
    
    public List<haber> haberTuruHava_durumu(){
        return hava_durumu.getList();
    }
    
}
