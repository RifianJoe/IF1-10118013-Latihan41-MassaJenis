/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan41.massajenis;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus mJenis = new Kubus();
        Scanner input = new Scanner(System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        mJenis.setSisi(input.nextInt()) ;  
        System.out.print("Massa : ");
        mJenis.setMassa(input.nextInt());
        
        System.out.println("");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + mJenis.hitungVolume(mJenis.getSisi()));
        System.out.println("Massa Jenis : " +
                mJenis.hitungMassaJenis(mJenis.getMassa(), mJenis.hitungVolume(mJenis.getSisi())));
        
    }
    
}
