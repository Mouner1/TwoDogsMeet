/*
 * Mouner Dabjan 
 * 12/03/2020
 * This program takes the user's input about dogs and prints it out to them 
 */
package twodogsmeet;

import javax.swing.*;

/**
 *
 * @author modab5310
 */
public class Dog {
// variables needed 

    private String firstName, firstBreed;
    private int age, aggression, hunger;
    // Agression >5 is bad 
    // Hunger >5 is bad 

    public Dog() {
        // asking the user for their input
        String name1 = JOptionPane.showInputDialog("Please enter the name of your  dog");
        String breed1 = JOptionPane.showInputDialog("Please enter the breed of the  dog");
        // setting the user's input into the names to display 
        firstName = name1;
        firstBreed = breed1;
        // randomizing the integer properties
        int old = (int) (Math.random() * 10 + 1);
        age = old;
        int agg = (int) (Math.random() * 10 + 1);
        aggression = agg;
        int starve = (int) (Math.random() * 10 + 1);
        hunger = starve;

    }
// using the setter and getter methods for integer properties 
    public int getAge() {
        return age;
    }

    public void setAge(int agee) {
        age = agee;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggress) {
        aggression = aggress;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hung) {
        hunger = hung;
    }
    
    // methods for a friendly meeting 
    public static void friendlyMeeting() {

        System.out.println("Arf! Arf!");
    }
    // method for an angry meeting 
    public static void angryMeeting() {
        System.out.println("GRRRRRRR! GRRRRRR!");
    }
    // printing the result to the screen 
    public String toString() {
        String output = "Name: " + firstName + "\n";
        output += "Breed: " + firstBreed + "\n";
        output += "Age: " + age + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger + "\n";
        return output;
    }
}
