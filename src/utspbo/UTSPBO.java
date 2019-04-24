/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author micin
 */
public class UTSPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Intel Intel1 = new Intel(2);
        Amd Amd1 = new Amd(3);
        Komputer Komputer1 = new Komputer(Intel1);
        
        Komputer1.cetakInfo();        
        Komputer1.mencabut(Amd1);
        Komputer1.memasang(Intel1);
        Komputer1.cetakInfo(); 
        // TODO code application logic here
    }
    
}
