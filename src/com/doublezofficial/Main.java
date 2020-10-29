package com.doublezofficial;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            NutritionFacts cocaCola = new NutritionFacts.Builder(210, 8).fat(0).calories(27).carbohydrates(29).build();
            NyPizza mediumHamPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(null).build();
            NyPizza largeSausagePizza = new NyPizza.Builder(NyPizza.Size.LARGE).addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.MUSHROOM).addTopping(Pizza.Topping.SAUSAGE).build();
        }
        catch (NullPointerException e){
            System.out.println("Topping cannot be passed empty");
        }
        catch (Exception e){
            System.out.println("Any Other exception");
        }
    }
}
