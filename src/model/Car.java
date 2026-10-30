package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gorkemucar
 */
public class Car {

    private String brand;
    private String color;
    private int speed;
    private static int carCount = 0;
    private static final int WHEEL_COUNT = 4;
    private Gear gear = Gear.PARK;

    public record License(String number, String owner) {}

    public Car() {
        brand = "bilinmiyor";
        color = "bilinmiyor";
        carCount++;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    public static int getWheelCount() {
        return WHEEL_COUNT;
    }

    public void serviceCosts(int... costs) {
        int totalCost = 0;
        for (int c : costs) {
            totalCost += c;
        }
        System.out.println("toplam tutar: " + totalCost);
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public Car accelerate(int amount) {
        this.speed += amount;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void paint(String color) {
        if (color.toLowerCase().equals("black")) {
            System.out.println("Siyah renge boyanamaz!");
            return;
        }
        this.color = color;
    }
}
