/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan41.massajenis;

/**
 *
 * @author Rifian
 */
public class Kubus {
    private int sisi;
    private int massa;

	public int getSisi() {
            return this.sisi;
	}
	public void setSisi(int sisi) {
            this.sisi = sisi;
	}
	public int getMassa() {
            return this.massa;
	}
	public void setMassa(int massa) {
            this.massa = massa;
	}
	public int hitungVolume(int parSisi) {
            return (int) Math.pow(parSisi, 3);
	}
	public int hitungMassaJenis(int parMassa, int volume) {
            return parMassa / volume;
    
    }
}
