/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haberler;

import Facad.haberListesi;
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

public class genel implements haberListesi{
    
    private DBConnection db;
        
        @Override
        public List<haber> getList(){
        List<haber> cList = new ArrayList<>();
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM haber WHERE haber_turu='genel'");
            
            while (rs.next()){
                haber tmp = new haber(rs.getString("haber_turu"),rs.getString("haber_ismi"), rs.getString("haber"),rs.getInt("personal_id"),rs.getDate("lastUpdate"));
                cList.add(tmp);
            }
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cList;
    }

    public DBConnection getDb() {
        if(this.db == null)
            this.db = new DBConnection() {};
        return db;
    }

    public void setDb(DBConnection db) {
        this.db = db;
    }




    
}
