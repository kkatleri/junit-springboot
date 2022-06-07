package com.autobots;

public class Sum implements Expression {
    final Expression augend;
    final Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency){
        int amount = (this.augend.reduce(bank, toCurrency)).getAmount()
                + (this.addend.reduce(bank, toCurrency)).getAmount();
        return new Money(amount,toCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }

    public Expression times(int multiplier) {
        return new Sum(this.augend.times(multiplier), this.addend.times(multiplier));
    }

}
