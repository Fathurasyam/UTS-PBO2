/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("\n~*~*~*~*~ WELCOME TO WAKANDA RESTAURANT ~*~*~*~*~\n");
        System.out.print("Choose Menu:\n1. Order Food\n2. Income Today\n3. Profit\n4. Product Sold\n5. Exit\nSelect Number: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Order();
                break;
            case 2: new Checkout();
                break;
            case 3: new Show();
                break;
            case 4: new Sold();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Menu();
    }
}