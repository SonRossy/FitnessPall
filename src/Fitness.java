
/**
 *quiz 2
 * @author Son-Rossy Dorvil
 */
public class Fitness {
 
     public static void main(String[] args) {
         
         //creating the objects
        Person person1=new Person("Tom","H",152.5,5,6);
        Person Leslie=new Person("Leslie","Knope",'K',32,122.9,4,11);
        Person man = new Person("Ron","Swanson",222.2,6,0);
        Person woman=new Person("April","Ludgate",110.5,5,5);
        
        
        //printing out objects atributes
        System.out.println(person1.getFirstName()+" : "+person1.calculateBMI());
        System.out.println(Leslie.getFirstName()+" : "+Leslie.calculateBMI());
        System.out.println(man.getFirstName()+" : "+man.calculateBMI());
        System.out.println(woman.getFirstName()+" : "+woman.calculateBMI());
        System.out.println(Leslie);
    }
     
   
    
}
