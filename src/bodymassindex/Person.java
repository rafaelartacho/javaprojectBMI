/*
 * author : 6122403
 */
package bodymassindex;

import java.text.DecimalFormat;

/**
 *
 * @author cristy
 */
public class Person {
    
    private String firstName;
    private double  heightInches;
    private double weightPounds;
    private double bmi;
//    private double secondpw; 
//    private double division; 
//    private int n=703; ?another way to do it 
   
    
    
    public Person (String aFirstName, double aHeightInches, double aWeightPounds)
    {
        //Complete constructor here. 
        //Remember to move each parameter to its corresponding instance variable:
        firstName = aFirstName; 
        heightInches = aHeightInches; 
        weightPounds = aWeightPounds;
    }
    
    //Create all the getters for the attributes here:
    public String getFirstName(){
        return firstName;
    }
    public double getHeightInches(){ 
        return heightInches;
    }
    public double getWeightPounds(){
        return weightPounds;        
    } 
    
    public double getBmi(){
        return bmi;
    }
    //Create all the setters for the attributes here 
    public void setFirstName (String aFirstName){
        aFirstName = firstName;
    }
    public void setHeightInches (double aHeightInches){
        aHeightInches = heightInches;
    }
    public void setWeightPounds (double aWeightPounds){
        aWeightPounds = weightPounds;
    } 
     //Create the calculateBMI() method here, using the following formulat:
    //BMI= [weight in pounds / (height in inches) X (height in inches)]	X 703
     public void calculateBMI(){
        
//        secondpw = heightInches *  heightInches; 
//        division = weightPounds/secondpw; 
//        bmi = division * n; ?another way to do it 
         bmi = (weightPounds/(heightInches*heightInches))*703;
        
    }
    
    
    //Create the .toString() method here:
    public String toString(){ 
         DecimalFormat df = new DecimalFormat("#0.00"); 
       

     
        return "Yo name is "+ firstName + ", your height is "+ heightInches+" inches" + 
                ", and your weight is "+ weightPounds + " pounds." 
                + "\n Your BMI is "+ df.format(bmi);
    }
    
   
   
    
}
