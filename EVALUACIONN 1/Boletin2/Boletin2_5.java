package boletin2_5;

import java.util.Scanner;


public class boletin2_5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float millas = 0 , metros = 0;
            
            System.out.println("Dime la distancia en millas marinas que quieras pasar a metros");
            millas = sc.nextFloat();
            
            metros = millas*1852;
            System.out.println("La distancia en metros es igual a " + metros);
            
        }
}
