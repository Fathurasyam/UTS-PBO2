/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Dessert{
    public static float harga;
    public void Show(){
        System.out.println("~~~~This is Dessert Menu~~~~");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("How many u wanna buy? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0 -> Sold.KuantitasBaklava = Sold.KuantitasBaklava+kuantitas;
           case 1 -> Sold.KuantitasTanghulu = Sold.KuantitasTanghulu+kuantitas;
           case 2 -> Sold.KuantitasPie_Apel = Sold.KuantitasPie_Apel+kuantitas;
           case 3 -> Sold.KuantitasCreme_Brulee = Sold.KuantitasCreme_Brulee+kuantitas;
           case 4 -> Sold.KuantitasPavlova = Sold.KuantitasPavlova+kuantitas;
       }
    }
    
    //Harga Modal
    int KuantitasBaklava      = 40000;
    int KuantitasTanghulu     = 50000;
    int KuantitasPie_Apel     = 55000;
    int KuantitasCreme_Brulee = 60000;
    int KuantitasPavlova      = 65000;
            
    int[] biayaProduksi = new int[] {KuantitasBaklava,KuantitasTanghulu,KuantitasPie_Apel,KuantitasCreme_Brulee,KuantitasPavlova};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "\nSelect Dessert Menu:" +
                "\n1.Baklava        Rp " + 1.25*biayaProduksi[0] +
                "\n2.Tanghulu       Rp " + 1.25*biayaProduksi[1] +
                "\n3.Pie Apel       Rp " + 1.25*biayaProduksi[2] +
                "\n4.Creme Brulee   Rp " + 1.25*biayaProduksi[3] +
                "\n5.Pavlova        Rp " + 1.25*biayaProduksi[4] +
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