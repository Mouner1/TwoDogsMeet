/*
 * Mouner Dabjan 
 * 12/03/2020
 * This program takes the user's input about dogs and prints it out to them 
 */
package twodogsmeet;


// import statement
import static twodogsmeet.Dog.friendlyMeeting;

/**
 *
 * @author modab5310
 */
public class TwoDogsMeet {

    public static void main(String[] args) {
        // creating two dog objects 
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        // setting the aggression 
        dog1.setAggression(4);
        System.out.println(dog1.getAggression());
        System.out.println(dog2.getAggression());
        // printing the result to the screen 
        System.out.println(dog1.toString());
        System.out.println("----------------------------------");
        System.out.println(dog2.toString());
        System.out.println("----------------------------------");
        // performing the meeting between the two dogs 
        dog1.friendlyMeeting();
        dog2.angryMeeting();

    }
}
