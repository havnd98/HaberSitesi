/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import FactoryMethod.KullaniciFactory;

/**
 *
 * @author havnd
 */
public class Kullanici extends KullaniciFactory{
    
    private int personal_id;
    private String isim;
    private String passwd;
    private String mail;

    public Kullanici() {
    }

    public Kullanici(int personal_id, String isim, String passwd, String mail) {
        this.personal_id = personal_id;
        this.isim = isim;
        this.passwd = passwd;
        this.mail = mail;
    }

    @Override
    public int getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(int personal_id) {
        this.personal_id = personal_id;
    }

    @Override
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
    
}
