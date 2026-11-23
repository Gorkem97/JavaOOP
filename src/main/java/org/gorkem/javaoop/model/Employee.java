/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gorkem.javaoop.model;

/**
 *
 * @author gorkemucar
 */
public abstract class Employee {

    public final int defWage = 100;
    private String name;
    private String status = "employee";
    private double wage;

    public Employee() {
        name = "unknown employee";
        wage = 100;
    }

    public Employee(String name) {
        this.name = name;
        wage = 100;
    }

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public void incrementWage(double amount) {
        wage += amount;
    }

    public double getWage() {
        return wage;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public void print() {
        System.out.println("Employee: " + name + ", wage: " + wage);
    }

    public abstract double calculateBonus();

    public double totalPay() {
        return wage + calculateBonus();
    }

}
