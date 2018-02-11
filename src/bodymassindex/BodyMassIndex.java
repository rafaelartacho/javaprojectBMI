/**  
 * @author 6122403   
 *  Title:            BodyMassIndex* 
 * Semester:         COP2250 - Spring 2018*
 * Lecturer's Name:  Maria Charters*  
 * Description of Program’s Functionality: It is described in the word document 
 * attached.
 */ 
package bodymassindex;
import java.util.Scanner; 

public class BodyMassIndex {
    public static Person anyPerson;
    
    public static void main(String[] args) 
    {
        
          createPersonObject();
          displayBMI();
        
    }
    
    public static void createPersonObject()
    {  
        Scanner keyboard = new Scanner(System.in); 
        String firstName;
        double heightInches;
        double weightPounds; 
        
        //Ask user for their first name, height in inches, and weight in pounds.
        System.out.println("What is your  first name");
        firstName = keyboard.nextLine(); 
        System.out.println("How tall are you(inches)");
        heightInches = keyboard.nextDouble();
        System.out.println("How much do you weight(pounds)");
        weightPounds = keyboard.nextDouble();
        //Create a Person object and store it in the static variable, anyPerson 
        anyPerson = new Person (firstName, heightInches, weightPounds);
    }
    
    public static void displayBMI()
    {   
        //Call the method in the anyPerson object that calculates BMI
        double bmi; 
        anyPerson.calculateBMI();
        bmi = anyPerson.getBmi(); 

        System.out.print(anyPerson);//Display the BMI of the anyPerson object.
        //Display the appropriate message to the user, depending on 
        //the following ranges:
        //A BMI below 18.5 is considered underweight.
        //A BMI of 18.5 to 24.9 is considered healthy.
        //A BMI of 25 to 29.9 is considered overweight.
        //A BMI of 30 or higher is considered obese.
        
        if (bmi <= 18.5){
            System.out.println("\n You are an underweight person");
        }
        else if (bmi <= 24.9){
            System.out.println("\n You are a healthy person");
        }
        else if (bmi <= 29.9){
            System.out.println("\n You are an overweight person"); 
        }
        else if (bmi >=30){
            System.out.println("\n You are an obese person");
        }
    }
    
}
