package com.doublezofficial;

public class NutritionFacts {
    //Required parameters
    private final int servingSize;
    private final int servings;

    //Optional parameters
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    public static class Builder{
        private int servingSize;
        private int servings;

        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize,int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val){
            calories = val;
            return  this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder carbohydrates(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servings = builder.servings;
        servingSize = builder.servingSize;
        carbohydrate = builder.carbohydrate;
        calories = builder.calories;
        fat = builder.fat;
    }
}
