/*
============== Java Programming II ==============
Part 9
Section 2 - Interface
Ex 10 - Online shop


Implement an interactive program that simulates the functionality of an e-commerce shop.
=======
*/

public class Item {
    
    // Private fields
    private String product;
    private int qty;
    private int unitPrice;
    
    // Constructor
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.unitPrice*this.qty;
    }
    
    public void increaseQuantity() {
        this.qty+=1;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}