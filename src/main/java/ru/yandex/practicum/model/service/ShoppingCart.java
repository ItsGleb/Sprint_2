package ru.yandex.practicum.model.service;

import ru.yandex.practicum.model.Food;

/*
В классе ShoppingCart реализуй методы для работы с корзиной:
- получить общую сумму товаров в корзине без скидки,
- получить общую сумму товаров в корзине со скидкой,
- получить общую сумму всех вегетарианских продуктов в корзине без скидки.
 */
public class ShoppingCart {
    static Food[] meal = new Food[3];

    public ShoppingCart(Food[] meal) {
        this.meal = meal;
    }

    // Получить общую сумму товаров в корзине без скидки
    public static int getTotalAmountWithoutDiscount() {
        int total = 0;
        for (int i = 0; i < meal.length; i++) {
            total += (int) ((meal[i].getAmount() * meal[i].getPrice()));
        }
        return total;
    }

    // Получить общую сумму товаров в корзине со скидкой
    public int getTotalAmountWithDiscount() {
        int total = 0;
        int priceWithDiscount;
        for (int i = 0; i < meal.length; i++) {
            priceWithDiscount = (int) (meal[i].getPrice() - (meal[i].getPrice() * meal[i].getDiscount()));
            total += ((meal[i].getAmount() * priceWithDiscount));
        }
        return total;
    }

    // Получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public int getVegetarianTotalAmountWithoutDiscount() {
        int total = 0;
        for (int i = 0; i < meal.length; i++) {
            if (meal[i].isVegetarian()) {
                total += (int) ((meal[i].getAmount() * meal[i].getPrice()));
            }
        }
        return total;
    }
}
