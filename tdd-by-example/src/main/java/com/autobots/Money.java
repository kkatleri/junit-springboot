package com.autobots;

public class Money implements Expression{

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public Expression times(int multiplier) {
        return new Money(this.amount*multiplier, this.currency);
    }

    public boolean equals(Object o){
        Money money  = (Money)o;
        return this.amount == money.amount
                && this.currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }

    @Override
    public Money reduce(Bank bank, String toCurrency){
        int rate = bank.rate(this.currency,toCurrency);
        return new Money(this.amount/rate, toCurrency);
    }
}
