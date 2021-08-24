/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author havnd
 */
public class GirisContext {
    
    private GirisStrategy strategy;
    
    public void setGirisMethod(GirisStrategy strategy) {
        this.strategy = strategy;
    }
    
    public GirisStrategy getStrategy() {
        return strategy;
    }
    
    public String logIn(Giris g){
        return getStrategy().login(g);
    }
    
}
