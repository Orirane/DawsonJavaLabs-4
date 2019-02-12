public class Car {
    private String model;
    private int location;
    private int currentSpeed;
    private boolean movingForward;
    private int maxSpeed;
    private boolean changedDirection = false;
 
    // constructor creates a car object
    Car (String model, int maxSpeed, int location){
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
 
    boolean getDirection(){
        return this.movingForward;
    }
 
    int getLocation(){
        return this.location;
    }
//method sets the current speed of car to be the object maxSpeed
void go(){
    this.currentSpeed = this.maxSpeed;

}
//method sets the current speed of the car to 0
public int stop(){
    return currentSpeed = 0;
}
    void turnAround(){
        this.movingForward = !this.movingForward;
        changedDirection = true;
    }
//change the location: add or subtract the currentSpeed from the location
void cont(){
    if (movingForward){
        this.location += this.currentSpeed;
    }
    if (!movingForward) {
        this.location -= this.currentSpeed;
    }
}
    void display(){
        String temp = "";
        if (movingForward) {
            temp = "forward";
        } else if (!movingForward) {
            temp = "backwards";
        }
        System.out.println(this.model + ": Located at " + this.location +
                ", facing " + temp + " and moving at " + this.currentSpeed + " speed.");
    }

}