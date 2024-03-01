package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Ingredients> margherita = List.of(Ingredients.MOZARELLA, Ingredients.POMIDOR);
        List<Ingredients> soprano = List.of(Ingredients.POMIDOR, Ingredients.CEBULA, Ingredients.PIECZARKI, Ingredients.SALAMI);
        List<Ingredients> mexicana = List.of(Ingredients.PAPRYKA, Ingredients.POMIDOR, Ingredients.SALAMI);
        List<Ingredients> vegetariana = List.of(Ingredients.PAPRYKA, Ingredients.POMIDOR, Ingredients.MOZARELLA, Ingredients.PIECZARKI, Ingredients.CEBULA);
        List<Ingredients> neapolitana = List.of(Ingredients.POMIDOR, Ingredients.PIECZARKI, Ingredients.SALAMI, Ingredients.SELER);
        List<Ingredients> quattroFormaggi = List.of(Ingredients.PAPRYKA, Ingredients.MOZARELLA, Ingredients.PIECZARKI);
        List<Ingredients> siciliana = List.of(Ingredients.PIECZARKI, Ingredients.CEBULA, Ingredients.SALAMI, Ingredients.SELER);
        List<Ingredients> caprese = List.of(Ingredients.MOZARELLA, Ingredients.PAPRYKA, Ingredients.POMIDOR);
        List<Ingredients> roma = List.of(Ingredients.SALAMI, Ingredients.CEBULA, Ingredients.PAPRYKA, Ingredients.SELER);
        List<Ingredients> bianca = List.of(Ingredients.MOZARELLA, Ingredients.CEBULA, Ingredients.POMIDOR);


        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(new Pizza(true, margherita, 450, PizzaName.MARGHERITA));
        pizzaList.add(new Pizza(false, soprano, 750, PizzaName.SOPRANO));
        pizzaList.add(new Pizza(false, mexicana, 700, PizzaName.MEXICANA));
        pizzaList.add(new Pizza(true, vegetariana, 600, PizzaName.VEGATARIANA));
        pizzaList.add(new Pizza(false, neapolitana, 550, PizzaName.NEAPOLITANA));

        pizzaList.add(new Pizza(true, quattroFormaggi, 600, PizzaName.QUATTRO_FORMAGGI));
        pizzaList.add(new Pizza(false, siciliana, 650, PizzaName.SICILIANA));
        pizzaList.add(new Pizza(true, caprese, 550, PizzaName.CAPRESE));
        pizzaList.add(new Pizza(false, roma, 700, PizzaName.ROMA));
        pizzaList.add(new Pizza(true, bianca, 500, PizzaName.BIANCA));

        List<Pizza> vegPizza = pizzaList.stream()
                .filter((val)-> val.isVegetarian()).toList();
        vegPizza.forEach((type)-> {System.out.println("Pizza: " +  type.getName() + " is vegetarian");
        });

        System.out.println("==========================================");
        List<Pizza> withAllergens = pizzaList.stream()
                .filter((val)->val.getIngredients().contains(Ingredients.SELER)).toList();
        withAllergens.forEach((name)-> {System.out.println("Pizza: " + name.getName() + " contain allergen");
        });

        System.out.println("==========================================");
        List<Pizza> withTomatoAndPaprika = pizzaList.stream()
                .filter((ingr)-> ingr.isVegetarian() && ingr.getIngredients().contains(Ingredients.PAPRYKA)
                        && ingr.getIngredients().contains(Ingredients.POMIDOR)).toList();
        withTomatoAndPaprika.forEach((type)-> System.out.println("Pizza " + type.getName() + ": " + type.getIngredients()));

        System.out.println("==========================================");
        boolean areAllWithMozarella = pizzaList.stream()
                .allMatch((contain)-> contain.getIngredients().contains(Ingredients.MOZARELLA));
        System.out.println(areAllWithMozarella);

        System.out.println("==========================================");
        PizzaName mostCaloric = pizzaList.stream()
                .max(Comparator.comparingInt(Pizza::getCalories))
                .get().getName();
        System.out.println(mostCaloric);

        System.out.println("==========================================");
        PizzaName leastCaloric = pizzaList.stream()
                .min(Comparator.comparingInt(Pizza::getCalories))
                .get().getName();
        System.out.println(leastCaloric);
    }
}