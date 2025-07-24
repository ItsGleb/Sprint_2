package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;

public class Apple extends Food implements Discountable{
    protected String color;

    public Apple(int amount, double price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        this.isVegetarian = true;
    }
    @Override
    public double getDiscount(){
        if(color.equals("red")){
            return 0.6;
        } else return 0.0;
    }
}
