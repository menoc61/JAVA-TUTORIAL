package importantJava;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");  //the .add() method is used to add elt to the array list
        food.add("Humburger");
        food.add("Hotdogs");
        ArrayList<String> Drinks = new ArrayList<String>();
        Drinks.add("soda");
        Drinks.add("Jack daniel");
        Drinks.add("Sano");
        Drinks.add("Top orange");
        ArrayList<String> Games = new ArrayList<String>();
        Games.add("Fornite");
        Games.add("God of war 3");
        Games.add("Blur");
        ArrayList<ArrayList<String>> ListOfThinks = new ArrayList<ArrayList<String>>();
        ListOfThinks.add(food);
        ListOfThinks.add(Drinks);
        ListOfThinks.add(Games);

        for (int i = 0; i < ListOfThinks.size(); i++) {
            /*ListOfThinks can be used to get the content of all the array list that has been added to it
            *ListOfThonks can be used to get the first list by .get(0);
            *ListOfThonks can be used to get the element of the first list by .get(0).get(0);
            */
            System.out.println(ListOfThinks.get(0));
        }
     /* 
        food.remove(2); //the remove method will remove the index 0 in our array list
        //food.clear(); // delete completely the array list.
        food.set(0,"Cake"); //the set() method will replace the value of with the index 0 in the list
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
     */  

        }
    }

