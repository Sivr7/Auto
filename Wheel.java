package week1.day2.homework.auto;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Wheel {

    private int serialNumber;

    public Wheel() {
        this.serialNumber = (int) (Math.random() * 10_000);
    }

    @Override
    public String toString(){
       return "wheel " + serialNumber;
    }

}
