package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;
import ru.yandex.practicum.model.constants.Discount;

public class Apple extends Food {
    protected String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (color.equals(Colour.RED_COLOUR)) {
            return Discount.RED_APPLE_DISCOUNT;
        } else return Discount.DEFAULT_DISCOUNT;
    }
}
