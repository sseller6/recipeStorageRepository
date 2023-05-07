import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // This is where we introduce the program to the user.
        System.out.println();
        System.out.println("This program creates and displays a list of recipes.");
        System.out.println();

        // This is where we tell the user what the stored recipes are.
        System.out.println("Below is a list of the recipes in the program.");
        ArrayList<String> recipes = new ArrayList<String>();
        recipes.add("Chicken Parmesan Pasta");
        recipes.add("Taco Soup");
        recipes.add("Chicken & Egg-drop Ramen");
        recipes.add("Filipino Fried Rice");
        recipes.add("Creamy Buffalo Chicken");
        recipes.add("Peanut Butter & Jelly Sandwich");
        recipes.add("Italian Sandwich");
        recipes.add("Cheese Burger");
        recipes.add("Cream Cheese Bagel");
        recipes.add("Philly Cheese Steak");
        recipes.add("Mango Float");
        recipes.add("Spaghetti & Meat Balls");
        recipes.add("Cheese Stuffed Jalapenos");
        recipes.add("Empanada");
        recipes.add("Pizza");
        recipes.add("Ants on a Log");
        recipes.add("Chicken Waffle");
        recipes.add("Rueben Sandwich");
        recipes.add("Chicken Noodle Soup");
        recipes.add("Pork & beans");
        recipes.add("House Salad");

        for (int i = 0; i < recipes.size(); i++) {
            System.out.println((i + 1) + " " + recipes.get(i));
        }
            // This is where we use the recipe class to create three instances of recipes.
            recipe firstRecipe = new recipe("Chicken Parmesan Pasta");
            recipe secondRecipe = new recipe("Taco Soup");
            recipe thirdRecipe = new recipe("Chicken & Egg-drop Ramen");
            recipe fourthRecipe = new recipe("Filipino Fried Rice");
            recipe fifthRecipe = new recipe("Creamy Buffalo Chicken");
            recipe sixthRecipe = new recipe("Peanut Butter & Jelly Sandwich");
            recipe seventhRecipe = new recipe("Italian Sandwich");
            recipe eigthRecipe = new recipe("Cheese Burger");
            recipe ninthRecipe = new recipe("Cream Cheese Bagel");
            recipe tenthRecipe = new recipe("Philly Cheese Steak");
            recipe eleventhRecipe = new recipe("Mango Float");
            recipe twelthRecipe = new recipe("Spaghetti & Meat Balls");
            recipe thirteenthRecipe = new recipe("Cheese Stuffed Jalapenos");
            recipe fourteenthRecipe = new recipe("Empanada");
            recipe fifthteenthRecipe = new recipe("Pizza");
            recipe sixteenthRecipe = new recipe("Ants on a Log");
            recipe seventeenthRecipe = new recipe("Chicken Waffle");
            recipe eighteenthRecipe = new recipe("Rueben Sandwich");
            recipe nineteenthhRecipe = new recipe("Chicken Noodle Soup");
            recipe twentyithRecipe = new recipe("Pork & beans");
            recipe twentyfirstRecipe = new recipe("House Salad");

            // We will use a hashmap to enter in ingredients.
            HashMap<String, String> ingredients = new HashMap<String, String>();
            ingredients.put("Chicken Parmesan Pasta", "Chicken,BWW Parmesan Sauce, Cream Cheese, Heavy Whipping Cream.");
            ingredients.put("Taco Soup", "Canned Corn, Kidney Beans, Pinto beans, Canned Tomatoes, Canned Green Chilies, Chopped Onion, Minced Garlic.");
            ingredients.put("Chicken & Egg-drop Ramen", "Ramen, half of included seasoning packet, egg, mixed vegetables, chicken breast.");
            ingredients.put("Filipino Fried Rice", "Cooked white rice, egg, mixed vegetables, spam, soy sauce, vinegar,");
            ingredients.put("Creamy Buffalo Chicken", "Chicken breast, buffalo sauce, parsley, Cottage cheese.");
            ingredients.put("Peanut Butter & Jelly Sandwich", "Peanut Butter, Jelly, Whole Wheat Bread.");
            ingredients.put("Italian Sandwich", "");
            ingredients.put("Cheese Burger", "");
            ingredients.put("Cream Cheese Bagel", "Cream cheese, bagel");
            ingredients.put("Philly Cheese Steak", "Steak, Cheese, Bread");
            ingredients.put("Mango Float", "Mangos, sweetened condensed milk, graham crackers");
            ingredients.put("Spaghetti & Meat Balls", "Tomato Sauce, Spaghetti, Meat balls");
            ingredients.put("Cheese Stuffed Jalapenos", "Cheese, Jalapenos, Bacon bits.");
            ingredients.put("Empanada", "Dough, ground beef, potato");
            ingredients.put("Pizza", "Dough, pizza sauce, pepperoni, cheese.");
            ingredients.put("Ants on a Log", "Peanut butter, raisins, celery");
            ingredients.put("Chicken Waffle", "Waffle, butter, syrup, chicken breast.");
            ingredients.put("Rueben Sandwich", "Bread, Cheese, Meat");
            ingredients.put("Chicken Noodle Soup", "Chicken breast, noodles, vegetables, chicken broth.");
            ingredients.put("Pork & beans", "Pork, beans, bacon");
            ingredients.put("House Salad", "Lettuce, tomato, cheese, carrots, iceburg lettuce.");

            System.out.println();
            // This is where we ask the user which recipe they want to get the ingredients for.
            // First, we create a new scanner object.
            Scanner myObj = new Scanner(System.in);
            System.out.println("Which recipe would you like to know the ingredients for? ");
            String input = myObj.nextLine();
            String list_to_work_on = ingredients.get(input);
            System.out.println("Here are your ingredients: ");
            System.out.println(list_to_work_on);

        }
    }
