/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.sql.ResultSet;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author havnd
 */
public class yoneticiGiris implements GirisStrategy {

    private DBConnection db;
    private String dogrulama;

    @Override
    public String login(Giris g) {

        try {

            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM yonetici WHERE mail='" + g.getMail() + "' AND passwd='" + g.getPasswd() + "'");

            if (rs.next()) {
                setDogrulama("yonetici");
            } else {
                setDogrulama("");
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return getDogrulama();
    }

    public String getDogrulama() {
        return dogrulama;
    }

    public void setDogrulama(String dogrulama) {
        this.dogrulama = dogrulama;
    }

    public DBConnection getDb() {
        if (this.db == null) {
            this.db = new DBConnection() {
            };
        }
        return db;
    }

    public void setDb(DBConnection db) {
        this.db = db;
    }


}
