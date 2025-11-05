package model;

import java.util.Objects;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.discountForAll;
import static model.constants.Discount.discountForRedApple;

public class Apple extends Food {
    private String colour;

    public Apple(Integer amount, Double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    @Override
    public Double getDiscount() {
        return Objects.equals(colour, COLOUR_RED) ?
                discountForRedApple : discountForAll;
    }
}
