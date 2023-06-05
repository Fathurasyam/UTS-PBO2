package main;
import java.util.Scanner;
import static main.Bussiness.harga;


public class Suite {
    public static float harga;
    public void Show() {
        System.out.println("This is Suite Class Menu");
    }
    int[] biayaProduksi = new int[] {800000,1000000,1100000};
    public void Menu(){
        Scanner input = new Scanner(System.in); 

        System.out.println(
                "Pilih Tipe Kamar:" +
                        "\n1. Kamar Tipe-A " + 1.25*biayaProduksi[0] +
                        "\n2. Kamar Tipe-B " + 1.25*biayaProduksi[1] +
                        "\n3. Kamar Tipe-C" + 1.25*biayaProduksi[2] +
                        "\n4.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Berapa Jumlah Kamar yang Dipesan: ");
                int jml = input.nextInt();
                if (jml < 4) {
                    harga+=1.25*biayaProduksi[0]*jml;
                    Menu();
                } else {
                    System.out.println("Maaf, Jumlah Melampaui Batas");
                    Menu();
                }
                break;
            case 2:
                System.out.print("Berapa Jumlah Kamar yang Dipesan: ");
                int jum = input.nextInt();
                if (jum < 4) {
                    harga+=1.25*biayaProduksi[1]*jum;
                    Menu();
                } else {
                    System.out.println("Maaf, Jumlah Melampaui Batas");
                    Menu();
                }
                break;
            case 3:
                System.out.print("Berapa Jumlah Kamar yang Dipesan: ");
                int jmlh = input.nextInt();
                if (jmlh < 4) {
                    harga+=1.25*biayaProduksi[2]*jmlh;
                    Menu();
                } else {
                    System.out.println("Maaf, Jumlah Melampaui Batas");
                    Menu();
                }
                break;
            case 4:
                new Reservation();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}