/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Sold {
    //Appetizer
    static int Kuantitascheese_potatoes_fries   = 0;
    static int Kuantitasgado_gado               = 0;
    static int KuantitasDimsum                  = 0;
    static int Kuantitasorange_salad            = 0;
    static int Kuantitasroasted_oyster_mushroom = 0;
    //Main Course
    static int Kuantitastagliatelle_pasta = 0;
    static int KuantitasSamyang_Carbonara = 0;
    static int Kuantitaschicken_maryland  = 0;
    static int KuantitasGalbi_Jjim        = 0;
    static int KuantitasLasagna_Panggang  = 0;
    //Dessert
    static int KuantitasBaklava      = 0;
    static int KuantitasTanghulu     = 0;
    static int KuantitasPie_Apel     = 0;
    static int KuantitasCreme_Brulee = 0;
    static int KuantitasPavlova      = 0;
    //Drinks
    static int KuantitasSangria  = 0;
    static int KuantitasEggnog   = 0;
    static int KuantitasPastis   = 0;
    static int KuantitasSake     = 0;
    static int KuantitasThai_Tea = 0;
    
public Sold(){
    System.out.println("\n-----Jumlah Makanan dan Minuman yang terjual-----");
    //Appetizer
    System.out.println("\n~~~~~~~ Appetizer ~~~~~~~");
    System.out.println("Cheese Potatoes Fries   : "+Kuantitascheese_potatoes_fries);
    System.out.println("Gado Gado               : "+Kuantitasgado_gado);
    System.out.println("Dimsum                  : "+KuantitasDimsum);
    System.out.println("Orange Salad            : "+Kuantitasorange_salad);
    System.out.println("Roasted Oyster mushroom : "+Kuantitasroasted_oyster_mushroom);
    //Main Course
    System.out.println("\n~~~~~~ Main Course ~~~~~~");
    System.out.println("Tagliatelle pasta       : "+Kuantitastagliatelle_pasta);
    System.out.println("Samyang Carbonara       : "+KuantitasSamyang_Carbonara);
    System.out.println("Chicken Maryland        : "+Kuantitaschicken_maryland);
    System.out.println("Galbi Jjim              : "+KuantitasGalbi_Jjim);
    System.out.println("Lasagna Panggang        : "+KuantitasLasagna_Panggang);
    //Dessert
    System.out.println("\n~~~~~~~~ Dessert ~~~~~~~~");
    System.out.println("Baklava                 : "+KuantitasBaklava);
    System.out.println("Tanghulu                : "+KuantitasTanghulu);
    System.out.println("Pie Apel                : "+KuantitasPie_Apel);
    System.out.println("Creme Brulee            : "+KuantitasCreme_Brulee);
    System.out.println("Pavlova                 : "+KuantitasPavlova);
    //Drinks
    System.out.println("\n~~~~~~~~~ Drinks ~~~~~~~~");
    System.out.println("Sangria                 : "+KuantitasSangria);
    System.out.println("Eggnog                  : "+KuantitasEggnog);
    System.out.println("Pastis                  : "+KuantitasPastis);
    System.out.println("Sake                    : "+KuantitasSake);
    System.out.println("Thai Tea                : "+KuantitasThai_Tea);
    
    Main.Menu();
}
}