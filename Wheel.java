package week1.day2.homework.auto;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Wheel {

    private int serialNumber;

    public Wheel(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
       return "wheel " + serialNumber;
    }

}
