/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.haber;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author havnd
 */
public class Onaylamadao extends DBConnection{
    
        public List<haber> getList(){
        List<haber> cList = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM haber WHERE onaylama_durumu = 0");
            
            while (rs.next()){
                haber tmp = new haber(rs.getInt("haber_id"),rs.getString("haber_turu"),rs.getString("haber_ismi"),
                        rs.getString("haber"),rs.getInt("onaylama_durumu"),rs.getInt("personal_id"),rs.getDate("lastUpdate"));
                cList.add(tmp);
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cList;
    }
    
    public void delete(int h){
        
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("DELETE FROM haber WHERE haber_id='"+h+"'");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
    
    public void update(haber h){
        
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("UPDATE haber SET onaylama_durumu= 1 WHERE haber_id='"+h.getHaber_id()+"'");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    
}
}
