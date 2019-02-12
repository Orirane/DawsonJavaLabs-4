import java.util.Scanner;
public class RaceLane {

 
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        boolean car1Left = false;
        boolean car2Left = false;
        boolean carsCollide = false;
    
        //ask user for an input
        System.out.println("Model: ");
    String model = reader.next();
    System.out.println("Location: ");
    int location = reader.nextInt();
    System.out.println("Max speed: ");
    int maxSpeed = reader.nextInt();
        /*String model = "Camry";
        int location = 0;
        int maxSpeed = 11;*/
        //create the first car object
        Car car1 = new Car(model, maxSpeed, location);
  
        // ask user for input and do a second car object

     System.out.println("Model: ");
     String model2 = reader.next();
     System.out.println("Location: ");
     int location2 = reader.nextInt();
     System.out.println("Max speed: ");
     int maxSpeed2 = reader.nextInt();

       /* String model2 = "Corolla";
        int location2 = 100;
        int maxSpeed2 = 10;*/
        Car car2 = new Car(model2, maxSpeed2, location2);
     
        //display both cars
        car1.display();
        car2.display();
     
        //determine which one is on the left
        if (car1.getLocation()<car2.getLocation()){
            System.out.println(model +  " is to the left of " + model2);
            car2.turnAround();
            car1Left = true;
            System.out.println(car1.getDirection());
        }
        if (car2.getLocation()<car1.getLocation()){
            System.out.println(model2 +  " is to the left of " + model);
            car1.turnAround();
            car2Left = true;
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
        while (!carsCollide){
            car1.cont();
            car2.cont();
            car1.display();
            car2.display();
            if(car1Left && car1.getLocation() >= car2.getLocation() )carsCollide = true;
            else if(car2Left && car1.getLocation() <= car2.getLocation()) carsCollide = true;
        }
     
        System.out.println ("Boom!");
    }
}