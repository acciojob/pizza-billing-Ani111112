package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.totalPrice += 300;
            this.bill = "Base Price Of The Pizza: 300" + "\n";
            this.isCheeseAdded = false;
            this.isToppingAdded = false;
        }else{
            this.price = 400;
            this.totalPrice += 400;
            this.bill = "Base Price Of The Pizza: 400" + "\n";
            this.isCheeseAdded = false;
            this.isToppingAdded = false;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isCheeseAdded == false){
            this.bill += "Extra Cheese Added: 80" + "\n";
            this.totalPrice += 80;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isToppingAdded == false){

            if(this.isCheeseAdded == false){
                addExtraCheese();
            }
            if(this.isVeg) {
                this.bill += "Extra Toppings Added: 70" + "\n";
                this.totalPrice += 70;
                this.isToppingAdded = true;
            }else{
                this.bill += "Extra Toppings Added: 120" + "\n";
                this.totalPrice += 120;
                this.isToppingAdded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.bill += "Paperbag Added: 20" + "\n";
        this.totalPrice += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.totalPrice;
        return this.bill;
    }
}
