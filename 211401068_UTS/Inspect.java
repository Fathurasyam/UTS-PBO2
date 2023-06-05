package main;

public class Inspect {
    static float totalOmset = Economy.harga + Bussiness.harga + Suite.harga;
    static float airlistrik = 350000;
    static float totalBiayaProduksi = 0.25f * totalOmset + airlistrik;
    static float gajiKaryawan = 0.5f * totalBiayaProduksi;
    static float pajak = 0.1f * totalOmset;
    static float totalKeuntungan = totalOmset - totalBiayaProduksi - gajiKaryawan - pajak;
    public Inspect(){
        System.out.println("Total Omset Penjualan: " + totalOmset);
        System.out.println("Total Biaya Listrik dan Air: " + airlistrik);
        System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
        System.out.println("Biaya Produksi: " + totalBiayaProduksi);
        System.out.println("Biaya Pajak: " + pajak);
        System.out.println("Hasil Laba/Keuntungan Bersih : totalOmset - BiayaProduksi - gajiKaryawan -  Pajak = " + totalKeuntungan);
        Main.Menu();
    }
}