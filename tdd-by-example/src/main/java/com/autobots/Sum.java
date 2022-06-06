package com.autobots;

public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String currency){
        int amount = this.augend.getAmount() + this.addend.getAmount();
        return new Money(amount,currency);
    }
}
