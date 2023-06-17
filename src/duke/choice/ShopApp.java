/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

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
        double total;

        Customer c1 = new Customer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        c1.name = "Pinky";
        c1.size = "S";

        item1.decription = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.decription = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("The name of the client is: " + c1.name + "");
        System.out.println("Item 1: " + item1.decription + ", Size: " + item1.size + ", Price: " + item1.price + "");
        System.out.println("Item 2: " + item2.decription + ", Size: " + item2.size + ", Price: " + item2.price + "");

        total = item2.price * 2 + item1.price;

        total = total * tax + total;
        System.out.println("Total a pagar: " + total + "");

        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }

    }

}
