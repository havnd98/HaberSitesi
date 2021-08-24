/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import entity.Kullanici;
import entity.personal;
import java.sql.ResultSet;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author havnd
 */
public class Kullanicidao extends DBConnection {
    
    
        public personal getById(int id){
        personal p = null;
        
        try{
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personal WHERE personal_id="+id);
            rs.next();
            
            p = new personal(rs.getInt("personal_id"), rs.getString("isim"), rs.getString("mail"));
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return p;
    }
    
    
    public void insertPersonal(personal p){
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("INSERT INTO personal (isim, passwd, mail) "
                    + "VALUES ('"+p.getIsim()+"','"+p.getPasswd()+"','"+p.getMail()+"')");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
    
     public void insertMusteri(Kullanici m){
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("INSERT INTO musteri (isim, passwd, mail) "
                    + "VALUES ('"+m.getIsim()+"','"+m.getPasswd()+"','"+m.getMail()+"')");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
    
    public void delete(Kullanici m){
        
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("DELETE FROM musteri WHERE mail='"+m.getMail()+"'"
                    + " AND isim='"+m.getIsim()+"' AND passwd='"+m.getPasswd()+"'");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
}
