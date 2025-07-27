import ru.yandex.practicum.model.Apple;
import ru.yandex.practicum.model.Food;
import ru.yandex.practicum.model.Meat;
import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.model.service.ShoppingCart;

public class Main {
    /*
    Инициализируй данные. Для этого создай объекты:
    - Мясо в количестве 5 кг по цене 100 рублей за кг;
    - Яблоки красные в количестве 10 кг по цене 50 рублей;
    - Яблоки зелёные в количестве 8 кг по цене 60 рублей.
     */
    public static void main(String[] args) {

        Food meat = new Meat(5, 100.00);
        Food redApple = new Apple(10, 50.00, Colour.RED_COLOUR);
        Food greenApple = new Apple(8, 60.00, Colour.GREEN_COLOUR);
        Food[] meal = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(meal);
        //Стоимость корзины без скидки = 5*100 + 10*50 + 8*60 = 1480
        System.out.println(shoppingCart.getTotalAmountWithoutDiscount(shoppingCart));
        //Стоимость корзины с скидкой = 5*100 + 10*(50*0.6) + 8*60 = 1180
        System.out.println(shoppingCart.getTotalAmountWithDiscount(shoppingCart));
        //Стоимость корзины вегетерианской = 10*50 + 8*60 = 980
        System.out.println(shoppingCart.getVegetarianTotalAmountWithoutDiscount(shoppingCart));

    }
}
