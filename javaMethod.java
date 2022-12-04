/* Write a method that prompts the user for a number
 * Print all the perfect squares starting from  1 to this number
 * with their real square roots
 */

import java.util.Scanner;

public class javaMethod {
    public static void main(String[] args) {
        //Today we will create our own methods in Java
        
        Scanner scanner = new Scanner(System.in);
        String name= scanner.next();
        greetPeople(name); //Simple greeting before taking the input 
        perfectSquare(); //Calling the perfectSquare() method
        scanner.close();
  
    }

    public static String greetPeople(String name){
        System.out.println("Hello " + name+ "!");
        return name;
    }

    public static void perfectSquare(){

        /* Taking the limit number from the user */
        System.out.println("Enter the limit number (We will start from 1): ");
        Scanner scanner1= new Scanner(System.in);
        int limitNumber= scanner1.nextInt();
        scanner1.close();

        //Looping and retrieving the perfect squares
        System.out.println("Below are the perfect squares with their roots");
        for (int i=1; i<=limitNumber; i++){
            if ((int)Math.sqrt(i)*Math.sqrt(i)==i){
                System.out.println(i+ ": Square root is " + Math.sqrt(i));

            }
        }       
    }
}