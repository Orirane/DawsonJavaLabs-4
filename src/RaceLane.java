import java.util.*;
public class RaceLane {
 
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    
  //ask user for an input
    System.out.println("Model: ");
    String model = reader.next();
    System.out.println("Location: ");
    int location = reader.nextInt();
    System.out.println("Max speed: ");
    int maxSpeed = reader.nextInt();
    
  //create the first car object
        Car car1 = new Car(model, maxSpeed, location);
  
  // ask user for input and do a second car object
        
     System.out.println("Model: ");
     String model2 = reader.next();
     System.out.println("Location: ");
     int location2 = reader.nextInt();
     System.out.println("Max speed: ");
     int maxSpeed2 = reader.nextInt();
     
     Car car2 = new Car(model2, maxSpeed2, location2);
     
  //display both cars 
     car1.display();
     car2.display();
     
  //determine wich one is on the left   
     if (car1.getLocation()<car2.getLocation()){
            System.out.println(model +  " is to the left of " + model2);
            car1.turnAround();
            System.out.println(car1.getDirection());
        }
     if (car2.getLocation()<car1.getLocation()){
            System.out.println(model2 +  " is to the left of " + model);
            car2.turnAround();
            System.out.println(car2.getDirection());
        }
        car1.display();
        car2.display();  
  //makes cars move   
     car1.go();
     car2.go();
     
     car1.display();
     car2.display(); 
     
     System.out.println(car1.getDirection());
     System.out.println(car2.getDirection());
     
   
  //makes cars collide
    while (car1.getDirection() && car2.getDirection()){
     
      if (car1.getLocation() - car2.getLocation() < 0){
       car1.turnAround();
       car1.display();
       car2.display();
      }else if (car1.getLocation() - car2.getLocation() > 0){
       car2.turnAround();
       car1.display();
       car2.display();
    }
       car1.continu();
       car2.continu();
    } 
     
        System.out.println ("Boom!"); 
   }    
}