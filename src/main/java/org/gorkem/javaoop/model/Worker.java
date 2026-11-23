/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gorkem.javaoop.model;

/**
 *
 * @author gorkemucar
 */
public class Worker extends Employee {

    public static int count;

    public Worker() {
        this("noName");
    }

    public Worker(String name) {
        this(name, 800);
    }

    public Worker(String name, int wage) {
        super(name, wage);
        setStatus("worker");
    }

    @Override
    public double calculateBonus() {
        return getWage() * 0.05;
    }

}
