/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Drinks{
    public static float harga;
    public void Show(){
        System.out.println("~~~~This is Drinks Menu~~~~");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("How many u wanna buy? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0 -> Sold.KuantitasSangria  = Sold.KuantitasSangria+kuantitas;
           case 1 -> Sold.KuantitasEggnog   = Sold.KuantitasEggnog+kuantitas;
           case 2 -> Sold.KuantitasPastis   = Sold.KuantitasPastis+kuantitas;
           case 3 -> Sold.KuantitasSake     = Sold.KuantitasSake+kuantitas;
           case 4 -> Sold.KuantitasThai_Tea = Sold.KuantitasThai_Tea+kuantitas;
       }
    }
    
    //Harga Modal
    int Sangria  = 25000;
    int Eggnog   = 30000;
    int Pastis   = 32000;
    int Sake     = 40000;
    int Thai_Tea = 45000;
            
    int[] biayaProduksi = new int[] {Sangria,Eggnog,Pastis,Sake,Thai_Tea};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "\nSelect Drinks:" +
                "\n1.Sangria    Rp " + 1.25*biayaProduksi[0] +
                "\n2.Eggnog     Rp " + 1.25*biayaProduksi[1] +
                "\n3.Pastis     Rp " + 1.25*biayaProduksi[2] +
                "\n4.Sake       Rp " + 1.25*biayaProduksi[3] +
                "\n5.Thai Tea   Rp " + 1.25*biayaProduksi[4] +
                "\n6.Back");
        System.out.print("\nSelect Number:");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                Kuantitas(0);
                Menu();
                break;
            case 2:
                Kuantitas(1);
                Menu();
                break;
            case 3:
                Kuantitas(2);
                Menu();
                break;
            case 4:
                Kuantitas(3);
                Menu();
                break;
            case 5:
                Kuantitas(4);
                Menu();
                break;
            case 6:
                new Order();
                break;
            default:
                System.out.print("WRONG CHOICE DUDE!!!!\n");
                Menu();
                break;
        }
    }
}