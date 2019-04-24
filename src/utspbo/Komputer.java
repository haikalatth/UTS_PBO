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
public class Komputer {
    public Cpu cpu;
    public Komputer(Cpu a){
        this.cpu = a;
    }
    public void memasang(Cpu a) {
        this.cpu = a;
        System.out.println("CPU : "+this.cpu.getCpuData()+" dipasang");
    }
    public void mencabut(Cpu a) {
        this.cpu = a;
        System.out.println("CPU : "+this.cpu.getCpuData()+" dicabut");
    }
    public void cetakInfo() {
        System.out.println("Spesifikasi : CPU : "+this.cpu.getCpuData());
    }
}
