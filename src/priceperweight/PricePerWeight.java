/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priceperweight;
import java.util.Scanner;
/**
 *
 * @author dan2203524
 * This program prints the price per weight of any common
 * grocery item.
 */
public class PricePerWeight 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Read price of item
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the price of the item");
        float itemPrice = in.nextFloat();
        
        // Read volume of item
        
        System.out.println("Please enter the volume of the item: ");
        float itemVolume = in.nextFloat();
        
        // Compute and print price per ounce
        
        float pricePerUnit = itemPrice / itemVolume;
        System.out.printf("Price per unit: %8.2f", pricePerUnit);
        System.out.println();
        
        
    }
    
}
