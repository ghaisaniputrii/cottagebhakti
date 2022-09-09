/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugascottage;

import java.util.Scanner;

/**
 *
 * @author Ghaisani
 */
public class Tugascottage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di Bhakti Alam Cottage");
        System.out.println("Duku,Jeruk,Alpukat,Jambu air,Durian,Melon,Belimbing,Mangga,Kedondong");
        System.out.print("pilih cottage:");
        String cottage = sc.nextLine();
        System.out.print("day:");
        String day = sc.nextLine();
         int room = 0;
         int harga = 0;
        
        if (cottage.equalsIgnoreCase("Duku")) {
            room = 2;
        } if (day.equalsIgnoreCase("Weekday")) {
                harga = 915000; }
            else if (day.equalsIgnoreCase("Weekend")) {
                harga = 1025000; }
            else if (day.equalsIgnoreCase("Holiday")) {
                harga = 1225000; }
            
            else if (cottage.equalsIgnoreCase("Jeruk")) {
                room = 2;
            } if (day.equalsIgnoreCase("Weekday")) {
                    harga = 915000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 1025000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 1225000; }
                
            else if (cottage.equalsIgnoreCase("Alpukat")) {
                room = 1;
            } if (day.equalsIgnoreCase("Weekday")) {
                    harga = 575000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 695000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 895000; }
                
            else if (cottage.equalsIgnoreCase("Jambu air")) {
                room = 1;
            } if (day.equalsIgnoreCase("Weekday")) {
                    harga = 575000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 695000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 895000; }
                
             else if (cottage.equalsIgnoreCase("Durian")) {
                room = 2;
             } if (day.equalsIgnoreCase("Weekday")) {
                    harga = 595000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 715000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 915000; }
                
             else if (cottage.equalsIgnoreCase("Melon")) {
                room = 2;
             } if (day.equalsIgnoreCase("Weekday")) {
                    harga = 595000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 715000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 915000; }
                
              else if (cottage.equalsIgnoreCase("Belimbing")) {
                room = 2;
              }if (day.equalsIgnoreCase("Weekday")) {
                    harga = 495000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 575000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 755000; }
                
            else if (cottage.equalsIgnoreCase("Mangga")) {
                room = 2;
            }if (day.equalsIgnoreCase("Weekday")) {
                    harga = 495000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 575000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 755000; }
                
             else if (cottage.equalsIgnoreCase("Kedondong")) {
                room = 2;
                if (day.equalsIgnoreCase("Weekday")) {
                    harga = 495000; }
                else if (day.equalsIgnoreCase("Weekend")) {
                harga = 575000; }
                else if (day.equalsIgnoreCase("Holiday")) {
                harga = 755000; }
               
             }
                
        
        System.out.println("cottage:"+cottage+"\nroom:"+room+"\nday:"+day+"\nharga"+harga); 
    }
    
}
