import java.util.ArrayList;
import java.util.Iterator;

public class arrayPractice{
    public static void main(String[] args) {
        //int[] anArray= {54, 43, 23, 33, 13, 19, 33};
        ArrayList <String> firstName= new ArrayList<String> ();

        firstName.add("Ander-g");
        firstName.add("Jeff-G");
        firstName.add("Blatter");
        firstName.add("Wado");
        firstName.add("Adidas");
        firstName.add("Roger");

        ArrayList <String> names= new ArrayList<>(); //Creating an Arraylist

        names.addAll(firstName); // adding a collection to an array

        System.out.println(names.remove(1)); // Removing element from an array

        // To remove all elements from an array arrayName.clear();
        names.remove(new String("Wado")); // removing a specific element instead of the index

        names.replaceAll(upperCase -> upperCase.toUpperCase()); //Using a lambda expression to transform an array  
        
        names.set(0, "Anderson"); // Updating a value at a specific index

        System.out.println(names);

        if (names.containsAll(names)){
            System.out.println("All the names are on the list.");
            if (names.contains("Anderson")){
                System.out.println("Anderson is also on the list.");
            }

        for (String a: names){
            System.out.println(a); //Using a normal for loop
        }
        System.out.println();

        for(Iterator iterator= names.iterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println(name); // For loop with Iterator
        }
        System.out.println();
        
        Iterator iterator= names.iterator();
        while(iterator.hasNext()){
            String name= (String)iterator.next();
            System.out.println(name); //While loop with iterator

        }

        }

        /* Ｌearning how to iterate through an Array List
         * 1-Using normal for loop
         * 2- Using enhanced for loop
         * 3-Using Iterator with for loop
         4-Using Iterator with while loop 
         */


        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(4);
        numbers.add(43);
        numbers.add(9);
        numbers.add(-5);
        numbers.add(32);

        for (int i=0; i<numbers.size(); i++){ //Normal for loop
            System.out.println(numbers.get(i));
        }

        System.out.println();

        for (Integer i: numbers){
            System.out.println(i); //Enhanced for loop 
        }
        System.out.println();

        for(Iterator iterator= numbers.iterator(); iterator.hasNext();){
            int number= (int)iterator.next();
            System.out.println(number); //For loop with Iterator
        }

        System.out.println();

        Iterator iterator=numbers.iterator();
        while (iterator.hasNext()){
            int newNum= (int)iterator.next();
            System.out.println(newNum);
        }

        }
        
        }

        
  
