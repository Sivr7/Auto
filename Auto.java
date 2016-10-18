package week1.day2.homework.auto;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Auto {

    private String make;
    int fuel;
    Wheel[] wheels;
    Engine autoEngine = new Engine();


    public Auto(String make, int fuel) {
        this.make = make;
        this.fuel = fuel;
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(i);
        }

    }

    @Override
    public String toString(){
        return "This car make is " + make + ". Fuel level => " + fuel;
    }


    void checkWheels(){
        for(int i = 0; i < wheels.length; i++){
            System.out.println(wheels[i]);
        }
    }


    Wheel[] changeWheel(int position){
        wheels[position] = new Wheel(1);
        return wheels;
    }

    void refuel(int fuel){
        this.fuel += fuel;
    }

    void drive(){
        if(fuel > 0){
            autoEngine.startEngine();
            System.out.println("drive.....");
        } else {
            System.out.println("The tank is empty!");
        }
    }



}
