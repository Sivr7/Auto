package week1.day2.homework.auto;

/**
 * Created by Andriy on 14.10.2016.
 */
public class MyAuto {
    public static void main(String[] args){

        Auto mazda = new Auto("Mazda", 5);

        System.out.println(mazda.toString());

        mazda.refuel(20);
        System.out.println("Fuel = " + mazda.fuel);

        mazda.drive();


        mazda.checkWheels();

        mazda.changeWheel(2);

        mazda.changeWheel(1);

        mazda.checkWheels();




    }
}
