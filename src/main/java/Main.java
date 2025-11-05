import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApple = new Apple(10, 50.0, COLOUR_RED);
        Food greenApple = new Apple(8, 60.0, COLOUR_GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        print(String.format("Сумма товаров без скидки: %s", shoppingCart.getTotalWithoutDiscount()));
        print(String.format("Сумма товаров со скидкой: %s", shoppingCart.getTotalWithDiscount()));
        print(String.format("Сумма вегетарианских товаров без скидки: %s",
                shoppingCart.getTotalVegetariansWithoutDiscount()));
    }

    private static void print(String string) {
        System.out.println(string);
    }
}