

/**
 * Quiz 2
 *
 * @author Son-Rossy Dorvil
 */
public class Person {

    //attributes
    private String firstName;
    private String lastName;
    private char lastNameInitial;
    private int age;
    private double weight; //Assume weight is in pounds
    private int feet;
    private int inches;
    
    //constructors
    Person(String firstName,String lastName,double weight,int feet,int inches){
        this.firstName=firstName;
        this.lastName=lastName;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;
    }
    
    Person(String firstName,char lastNameInitial,double weight,int feet,int inches){
        this.firstName=firstName;
        this.lastNameInitial=lastNameInitial;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;
    }
    
    Person(String firstName,String lastName,char lastNameInitial,int age,double weight,int feet,int inches){
        this.firstName=firstName;
        this.lastName=lastName;
        this.lastNameInitial=lastNameInitial;
        this.age=age;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;
        
    }
    
    //setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getLastNameInitial() {
        return lastNameInitial;
    }

    public void setLastNameInitial(char lastNameInitial) {
        this.lastNameInitial = lastNameInitial;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    /**
     * @param args the command line arguments
     */
   
    /**
     * this method calculate the BMI of a person and return the value as a string 
     * @return 
     */
    String calculateBMI(){
  
      //calculating the person height in inches 1 foot is 12 inches  
     int heightInInches=(getFeet()*12)+getInches();
     
     //calculating the BMI
     double BMI=(getWeight() * 703)/(heightInInches * heightInInches);
     
     //our variable that will hold the BIM string to be returned
     String BMIlevel="";
     
     if(BMI<18.5){
         BMIlevel="Underweight";
     }else if(BMI>=18.5 && BMI<=24.9){
         BMIlevel="Normal";
     }else if(BMI>=25 && BMI<=29.9){
         BMIlevel="Overweight";
     }else if(BMI>=30){
         BMIlevel="Obese";
     }
     
     return (BMI+" "+BMIlevel);
    }

    //overriding the toString() method
   public String toString(){
       
       return"First Name: "+getFirstName()+","+" Last Name: "+getLastName()+","+" Initial: "+getLastNameInitial()+","+ " Age: "+
               getAge()+","+" Weight: "+getWeight()+","+ " Feet: "+getFeet()+","+ " Inches: "+getInches();
   }

}
