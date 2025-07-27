package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount; // 1 кг
    protected double price; // кол-во рублей за 1 кг
    protected boolean isVegetarian; // вегетерианская еда или нет


    // геттеры для доступа к полям объекта
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
    @Override
    public double getDiscount(){
        return Discount.DEFAULT_DISCOUNT;
    }
}
