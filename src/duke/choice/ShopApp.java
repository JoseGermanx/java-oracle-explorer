/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author jgerm
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;

        Customer c1 = new Customer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        
        Clothing[] items = {item1, item2, item3, item4};
        
        c1.setName("Pinky");
        c1.setSize("M");

        item1.setDecription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDecription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        
        item3.setDecription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("L");
        
        item4.setDecription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");
        
        int measurement = 8;
        
        c1.addItems(items);
        c1.setSize(measurement);
       
        System.out.println("The name of the client is: " + c1.getName() + ", they size is " +c1.getSize());
        System.out.println("The total of the orden is: " + c1.getTotalClothingCost());
        for (int i =0; i < c1.getItems().length; i++) {
            //if (items[i].getSize() == c1.getSize()) {
               System.out.println("Buy item " + i + " detail: " + items[i].getDecription() + ". Talla: " + items[i].getSize() + ", Price: " + items[i].getPrice());
            //} 
        }

    }

}
