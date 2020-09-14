import java.util.Scanner;

/**
 * Calculates the subtotal, total tax and total price for a given number of products
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a Scanner used for input
    Scanner input = new Scanner(System.in);

    // Ask the user how many Chromebook chargers they want
    System.out.println("How many chromebook chargers?");

    // Declare a variable and get input from user
    int charger = input.nextInt();

    // Ask the user how many motherboards they want
    System.out.println("How many motherboards?");

    // Declare a variable and get input from user
    int motherboard = input.nextInt();
    
    // Ask the user how many mice they want
    System.out.println("How many mice?");

    // Declare a variable and get input from user
    int mice = input.nextInt();

    // Calculate subtotal
    double subtotal = charger*34.99 + motherboard*127.50 + mice*18;

    // Tell user subtotal
    System.out.println("Subtotal= $" + subtotal);

    // Calculate tax
    double tax = subtotal*0.13;

    // Tell user tax
    System.out.println("Taxes= $" + tax);

    // Calculate total price 
    double total = tax + subtotal;

    // Tell user total price
    System.out.println("Total= $" + total);

  }
}
