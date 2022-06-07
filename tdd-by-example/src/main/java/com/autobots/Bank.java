package com.autobots;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private final Map<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String toCurrency){
       return source.reduce(this, toCurrency);
    }

    public int rate(String fromCurrency, String toCurrency){
        if(fromCurrency.equals(toCurrency))
            return 1;
        return rates.get(new Pair(fromCurrency, toCurrency));
    }

    public void addRate(String fromCurrency, String toCurrency, int rate){
        rates.put(new Pair(fromCurrency, toCurrency), rate);
    }

    private static class Pair{
        final String fromCurrency;
        final String toCurrency;

        public Pair(String fromCurrency, String toCurrency) {
            this.fromCurrency = fromCurrency;
            this.toCurrency = toCurrency;
        }

        @Override
        public boolean equals(Object o) {
            Pair pair = (Pair) o;

            return fromCurrency.equals(pair.fromCurrency)&&toCurrency.equals(pair.toCurrency);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
