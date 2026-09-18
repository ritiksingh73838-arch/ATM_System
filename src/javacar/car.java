package javacar;

public class car {
    private String color;
    private int  wheels;
    private int mileage;


    public car(String color,int wheels,int mileage){
        this.color=color;
        this.wheels=wheels;
        this.mileage=mileage;
    }

    public String getColur() {
        return color;
    }

    public int getWhilse() {
        return wheels;
    }

    public int getMaligeg() {
        return mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void  displayCarDetails(){
        System.out.println("carDetails");
        System.out.println("color"+color);
        System.out.println("wheels"+wheels);
        System.out.println("mileage"+mileage);

    }


}
