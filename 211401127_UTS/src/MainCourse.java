/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MainCourse{
    public static float harga;
    public void Show(){
         System.out.println("~~~~This is Main Course Menu~~~~");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("How many u wanna buy? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0 -> Sold.Kuantitaschicken_maryland = Sold.Kuantitaschicken_maryland+kuantitas;
           case 1 -> Sold.Kuantitastagliatelle_pasta = Sold.Kuantitastagliatelle_pasta+kuantitas;
           case 2 -> Sold.KuantitasGalbi_Jjim = Sold.KuantitasGalbi_Jjim+kuantitas;
           case 3 -> Sold.KuantitasSamyang_Carbonara = Sold.KuantitasSamyang_Carbonara+kuantitas;
           case 4 -> Sold.KuantitasLasagna_Panggang = Sold.KuantitasLasagna_Panggang+kuantitas;
       }
    }
    
    //Harga Modal
    int tagliatelle_pasta = 80000;
    int Samyang_Carbonara = 90000;
    int chicken_maryland  = 120000;
    int Galbi_Jjim        = 140000;
    int Lasagna_Panggang  = 150000;
            
    int[] biayaProduksi = new int[] {chicken_maryland,tagliatelle_pasta,Galbi_Jjim,Samyang_Carbonara,Lasagna_Panggang};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "\nSlecet Main Course Menu:" +
                "\n1.Tagliatelle Pasta    Rp " + 1.25*biayaProduksi[0] +
                "\n2.Samyang Carbonara    Rp " + 1.25*biayaProduksi[1] +
                "\n3.Chicken Maryland     Rp " + 1.25*biayaProduksi[2] +
                "\n4.Galbi Jjim           Rp " + 1.25*biayaProduksi[3] +
                "\n5.Lasagna Panggang     Rp " + 1.25*biayaProduksi[4] +
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
                System.out.print("WRONG CHOICE DUDE!!!\n");
                Menu();
                break;
        }
    }
}
