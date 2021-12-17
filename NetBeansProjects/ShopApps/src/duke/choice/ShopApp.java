/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author muhamedahmed
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = .2;
        double total = 0.0;
        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky", 14);
        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green Scart", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        int neasurement = 2;
        c1.addItems(items);
        //c1.setSize(neasurement);
        Arrays.sort(c1.getItems());
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + "," + c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
            // System.out.println("Items " + item.getDescription() + ", " + item.getSize() + "," + item.getPrice());
            System.out.println("Item Output " + item);
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            count++;
            average += item.getPrice();

        }
        try {
            average = (count == 0) ? 0 : average / count;
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);

        } catch (Exception e) {
            System.out.println("Don't divide by 0");
        }
    }
}
