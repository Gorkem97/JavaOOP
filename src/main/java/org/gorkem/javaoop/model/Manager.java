/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gorkem.javaoop.model;

/**
 *
 * @author gorkemucar
 */
public class Manager extends Employee {

    private Employee managedUnit;

    public Manager() {
        this("unknown manager");
    }

    public Manager(String name) {
        this(name, 100);
    }

    public Manager(String name, double wage) {
        super(name, wage);
        setStatus("manager");
    }

    public void assignUnit(Employee managedUnit) {
        this.managedUnit = managedUnit;
    }

    public Employee getUnit() {
        return this.managedUnit;
    }

    @Override
    public void print() {
        System.out.println("Manager: " + getName() + ", wage: " + getWage()
                + ", unit: " + (managedUnit != null ? managedUnit.getName() : "None"));
    }

    @Override
    public double calculateBonus() {
        return getWage() * 0.2;
    }
}
