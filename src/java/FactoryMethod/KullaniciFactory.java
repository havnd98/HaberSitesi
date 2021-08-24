/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;



public abstract class KullaniciFactory {
    
    public abstract int getPersonal_id();
    public abstract String getIsim();
    public abstract String getPasswd();
    public abstract String getMail();


    @Override
    public int hashCode() {
        return this.getPersonal_id();
    }

    @Override
    public String toString() {
        return this.getIsim()+this.getMail()+this.getPasswd();
    }
    
    
    
}
