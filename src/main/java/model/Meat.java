package model;

import static model.constants.Discount.noDiscount;

public class Meat extends Food {
    public Meat(int amount, double price) {
        setAmount(amount);
        setPrice(price);
        setVegetarian(false);
    }

    @Override
    public double getDiscount() {
        return noDiscount;
    }
}



