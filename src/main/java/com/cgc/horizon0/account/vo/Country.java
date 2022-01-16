package com.cgc.horizon0.account.vo;

import java.util.List;


public class Country {

    public String name;
    public String alpha2Code;
    public String capital;
    public List<Currency> currencies;

    public Country(){
    }
    public static Country of(String name, String code, String captial){
        Country c = new Country();
        c.name=name;
        c.alpha2Code=code;
        c.capital=captial;
        return c;
    }

    public static class Currency {
        public String code;
        public String name;
        public String symbol;
        @Override
        public String toString() {
            return "Currency [code=" + code + ", name=" + name + ", symbol=" + symbol + "]";
        }
        
    }

    @Override
    public String toString() {
        return "Country [alpha2Code=" + alpha2Code + ", capital=" + capital + ", currencies=" + currencies + ", name="
                + name + "]";
    }

}
