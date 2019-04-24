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
public class Cpu {
    protected String nama;
    protected int kecepatan;
    
    public Cpu(String a, int b){
        this.nama = a;
        this.kecepatan = b;
    }
    public String getCpuData() {
        return(nama+" "+kecepatan+" GHz");
    }
}
