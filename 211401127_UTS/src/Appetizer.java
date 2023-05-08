/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Appetizer{
    public static float harga;
    public void Show(){
        System.out.println("~~~~This is Appetizer Menu~~~~");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("How much u wanna buy? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0 -> Sold.Kuantitascheese_potatoes_fries = Sold.Kuantitascheese_potatoes_fries+kuantitas;
           case 1 -> Sold.Kuantitasgado_gado = Sold.Kuantitasgado_gado+kuantitas;
           case 2 -> Sold.Kuantitasorange_salad = Sold.Kuantitasorange_salad+kuantitas;
           case 3 -> Sold.Kuantitasroasted_oyster_mushroom = Sold.Kuantitasroasted_oyster_mushroom+kuantitas;
           case 4 -> Sold.KuantitasDimsum = Sold.KuantitasDimsum+kuantitas;
       }
    }
    
    //Harga Modal
    int cheese_potatoes_fries   = 30000;
    int gado_gado               = 35000;
    int dimsum                  = 35000;
    int orange_salad            = 38000;
    int roasted_oyster_mushroom = 40000;
            
    int[] biayaProduksi = new int[] {cheese_potatoes_fries,gado_gado,orange_salad,roasted_oyster_mushroom,dimsum};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "\nSelect Appetizer Menu:" +
                "\n1.Cheese Potato Fries        Rp " + 1.25*biayaProduksi[0] +
                "\n2.Gado Gado                  Rp " + 1.25*biayaProduksi[1] +
                "\n3.Dimsum                     Rp " + 1.25*biayaProduksi[2] +
                "\n4.Roasted Oyster Mushroom    Rp " + 1.25*biayaProduksi[3] +
                "\n5.Orange                     Rp " + 1.25*biayaProduksi[4] +
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