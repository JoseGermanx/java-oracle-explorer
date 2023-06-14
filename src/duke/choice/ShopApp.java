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
    c1.name = "Pinky";
    Clothing item1 = new Clothing();
    Clothing item2 = new Clothing();
    item1.decription = "Blue Jacket";
    item1.price = 20.9;
    item1.size = "M";
    
    item2.decription = "Orange T-sHIRT";
    item2.price = 10.5;
    item2.size = "S";
    
    System.out.println("El nombre del cliente es: " +c1.name+"");
    System.out.println("Articulo 1: " +item1.decription+", Talla: "+item1.size+", Precio: "+item1.price+"");
    System.out.println("Articulo 2: " +item2.decription+", Talla: "+item2.size+", Precio: "+item2.price+"");
    
    total = item2.price*2 + item1.price;
    
    total = total*tax + total;
    System.out.println("Total a pagar: "+total+"");
    
    }
    
}
