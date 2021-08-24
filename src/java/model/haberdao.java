/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.DBConnection;
import entity.haber;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author havnd
 */
public class haberdao extends DBConnection{
    
    public void insert(haber c){
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("INSERT INTO haber (haber_turu, haber_ismi, haber, personal_id)"
                    + " VALUES ('"+c.getHaber_turu()+"','"+c.getHaber_ismi()+"','"+c.getHaber()+"',"+c.getPersonal_id()+")");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
    public List<haber> getList(){
        List<haber> cList = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM haber ");
            
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
    
    public void delete(haber h){
        
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("DELETE FROM haber WHERE haber_id='"+h.getHaber_id()+"'");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }
    
    public void update(haber h){
        
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("UPDATE haber SET haber='"+h.getHaber()+"' WHERE haber_id='"+h.getHaber_id()+"'");
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
               
    }

    
    
}
