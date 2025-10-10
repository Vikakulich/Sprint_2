package model;

import static model.constants.Colour.redColour;
import static model.constants.Discount.noDiscount;
import static model.constants.Discount.redAppleDiscount;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        this.colour = colour;
        setVegetarian(true);
    }

    @Override
    public double getDiscount() {
        if (colour == redColour) {
            return redAppleDiscount;
        } else {
            return noDiscount;
        }
    }
}
