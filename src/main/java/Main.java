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
    Стоимость корзины без скидки = 5*100 + 10*50 + 8*60 = 1480
    Стоимость корзины с скидкой = 5*100 + 10*(50*0.6) + 8*60 = 1280
    Стоимость корзины вегетерианской = 10*(50*0.6) + 8*60 = 780
     */
    public static void main(String[] args) {
        //System.out.println(Colour.greenColour);
        Food meat = new Meat(5, 100.00);
        Food redApple = new Apple(10, 50.00, Colour.redColour);
        Food greenApple = new Apple(8, 60.00, Colour.greenColour);
        Food[] meal = {meat, redApple, greenApple};
        //System.out.println(redApple.getDiscount());
        ShoppingCart shoppingCart = new ShoppingCart(meal);
        //Стоимость корзины без скидки = 5*100 + 10*50 + 8*60 = 1480
        System.out.println(shoppingCart.getTotalAmountWithoutDiscount(shoppingCart));
        //Стоимость корзины с скидкой = 5*100 + 10*(50*0.6) + 8*60 = 1180
        System.out.println(shoppingCart.getTotalAmountWithDiscount(shoppingCart));
        //Стоимость корзины вегетерианской = 10*50 + 8*60 = 980
        System.out.println(shoppingCart.getVegetarianTotalAmountWithoutDiscount(shoppingCart));

    }
}
