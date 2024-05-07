package hw1;

import java.util.Date;

public class Yard {
    String productName;
    double productPrice = 5.0;
    int qty = 20;
    double total = productPrice * qty;

    public void yardSaleWholeSale(String productName, double productPrice,  int qty){
        double total = productPrice * qty;
        System.out.println("Name\tQty\t\tPrice\tTotal");
        System.out.println("----\t---\t\t-----\t-------");
        System.out.println(String.format(productName + "\t" + qty + "\t\t" + "$%,.2f",productPrice) + "\t" +
                String.format("$%,.1f", total));
        System.out.println();
        System.out.println("\tThank you come again!!!");
        System.out.println();
        Date today = new Date();
        System.out.println(String.format("Purchased on: "+ "%tA, %tB %td, %tY",today, today, today, today));

    }
}
