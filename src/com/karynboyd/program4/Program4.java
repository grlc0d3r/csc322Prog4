package com.karynboyd.program4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which type of bag are you creating today?");
        System.out.println("\t 1) Unsorted");
        System.out.println("\t 2) Sorted");
        int bagType = input.nextInt();
        
        switch(bagType) 
        {
            case 1:
                ArrayList<Item> unsortedBag = new ArrayList<Item>();
                System.out.println("How many items are you placing in your bag today?");
                int numberOfItems = input.nextInt();
                String clearLine = input.nextLine();    
                
                while ( numberOfItems != 0)
                {
                    System.out.println("Enter an item: ");
                    String name = input.nextLine();
                    unsortedBag.add(new Item(name));
                    numberOfItems--;
                }
                for (Item item : unsortedBag) 
                {
                    System.out.println(item.toString());
                }
                break;
            case 2:
                System.out.println("Coming soon!");
        }
    }
    public void add(Item i) 
    {
        
    }
}
