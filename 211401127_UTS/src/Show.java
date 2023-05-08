/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Show {
    public Show(){
        float JumlahPengunjungDiharapkan = Checkout.totalOmset / Checkout.totalKeuntungan;
        System.out.println("\nJumlah Pengunjung Diharapkan: " + Math.round(JumlahPengunjungDiharapkan));
        System.out.println("Jumlah Pengunjung: " + Main.jumlahPengunjung);
        System.out.println("Total Keuntungan: " + Checkout.totalKeuntungan);
        Main.Menu();
    }
}