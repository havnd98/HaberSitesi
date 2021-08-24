/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author havnd
 */
@Named
@SessionScoped
public class Girisbean implements Serializable {

    private Giris entity;
    private GirisContext dao;

    public String login() {
        this.getDao().setGirisMethod(new kullaniciGiris());
        if (this.getDao().logIn(getEntity()).equals("kullanici")) {
            
            return "/kullaniciSayfasi/kullanici";
        }

        else{

            this.getDao().setGirisMethod(new personalGiris());

            if (this.getDao().logIn(getEntity()).equals("personal")) {
                return "/create/personal_page";
            } else {
                this.getDao().setGirisMethod(new yoneticiGiris());
                if (this.getDao().logIn(getEntity()).equals("yonetici")) {
                    return "/yonetici/yonetici";
                }else{
                    return "/index";
                }
            }
        
        }
    }


    public String logout() {
        this.entity = null;
        return "/index";
    }

    public Giris getEntity() {
        if (this.entity == null) {
            this.entity = new Giris();
        }
        return entity;
    }

    public void setEntity(Giris entity) {
        this.entity = entity;
    }

    public GirisContext getDao() {
        if (this.dao == null) {
            this.dao = new GirisContext();
        }
        return dao;
    }

    public void setDao(GirisContext dao) {
        this.dao = dao;
    }

}
