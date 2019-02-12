public class Car {
 private String model;
 private int location;
 private int currentSpeed;
 private boolean movingForward;
 private int maxSpeed;
 
 // constructor creates a car object
 public Car (String model, int maxSpeed, int location){
   this.model = model;
   this.maxSpeed = maxSpeed;
   this.location = location;
   this.movingForward = true;
   this.currentSpeed = 0;
 }
 //getters
 public String getModel(){
   return this.model;
 }
 
 public boolean getDirection(){
   return this.movingForward;
 }
 
 public int getLocation(){
    return this.location;
 }
//method sets the current speeed of car to be the object maxSpeed
   public int go(){
     return currentSpeed = maxSpeed;  
   }
//method sets the current speed of the car to 0
   public int stop(){
       return currentSpeed = 0;
   }
   public boolean turnAround(){
     if (this.movingForward){
       this.movingForward = false;
     }else{
         this.movingForward = true;
       }
     return movingForward;
   }
//change the location: add or subtract the currentSpeed from the location
   public int continu(){
     if (movingForward = true){
       this.location += this.currentSpeed;
     }
     if (movingForward = false) {
       this.location -= this.currentSpeed;
     }
     return this.location;
   }
   public void display(){
     String temp = "";
     if (movingForward = true) {
       temp = "forward"; 
     }else if (movingForward = false) {
       temp = "backwards";
     }
       System.out.println(this.model + ": Located at " + this.location + 
               ", fasing " + temp + " and moving at " + this.currentSpeed + " speed.");
   }
  
}