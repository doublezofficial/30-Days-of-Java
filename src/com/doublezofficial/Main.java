package com.doublezofficial;

public class Main {

    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(210,8).fat(0).calories(27).carbohydrates(29).build();
        System.out.println(cocaCola);
    }
}
