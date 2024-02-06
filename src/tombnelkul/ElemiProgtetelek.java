/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombnelkul;

import java.util.Scanner;
import java.math.MathContext;

public class ElemiProgtetelek {

    
    static Scanner sc = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        //sc.close();
        
        /*ÖSSZEGZÉS*/
        
//        int n = 4;
//        while (n < 0){
//            
//        }
//        int ossz = 0;
//        for(int i=0; i<n+1; i++){
//            ossz += 1;
//        }
//        
//        System.out.printf("Az első %d szám összege: %d\n", n, ossz);
//        
        int n = -1;
        //int s = sc.nextInt();
        //String s = sc.nextLine();
        //System.out.println("beírt érték: " + s*3);
        while (n<0){
            System.out.print("N= ");
            n = sc.nextInt(); //ez az adatbekérés, eltárolva egy változóba
        }
        
        int ossz = 0;
        for(int i=0; i<n+1; i++){
            ossz += 1;
        }
        



        /*MEGSZÁMLÁLÁS*/
        
        int db = 0;
        for(int i = 10; i<100; i++){
             if(i%2==0){
                db++;
            }
        }
        System.out.printf("2 jegyű páros számok száma: %d ", db);
        
        /*MAXIMUM KIVÁLASZTÁS*/
        
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; //2147483647
        int szam;
        System.out.print("0-ra kilép: ");
        while ((szam = sc.nextInt()) != VEGE){
            if (szam<min){
                min=szam;
            }
            db++;//db += 1;
        }
        System.out.printf("%d számból a legkisebb: %d", db,min);
        
        
        /*ELDÖNTÉS*/
        System.out.print("\nszám: ");
        n = sc.nextInt();
        boolean prim;
        
        if (n < 2){
            prim = false;
        }else{
            int i = 2;
            while (i <= Math.sqrt(n) && (n%i != 0)){
                    i++;
                    
            }
            prim = i > Math.sqrt(n);
        }
        if (prim == true){
            System.out.println("Prím");
        
        }else{
            System.out.println("Nem prím"); 
        }
        
        
        
        
        
        
        // main vége
    }
    
} //class vége
