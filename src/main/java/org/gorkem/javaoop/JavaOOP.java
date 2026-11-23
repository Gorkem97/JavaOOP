/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.gorkem.javaoop;

import java.util.Scanner;

import org.gorkem.javaoop.model.Employee;
import org.gorkem.javaoop.model.Manager;
import org.gorkem.javaoop.model.Worker;

/**
 *
 * @author gorkemucar
 */
public class JavaOOP {

    public static void main(String[] args) {
        Manager michael = new Manager("Michael", 1000);
        Worker dwight = new Worker("Dwight");
        Manager jim = new Manager("Jim", 800);
        String name, title;
        Employee newEmployee;
        System.out.println("Enter your employee and title(m/w)");
        name = new Scanner(System.in).nextLine();
        title = new Scanner(System.in).nextLine();
        if (title.equals("m")) {
            newEmployee = new Manager(name);
        } else if (title.equals("w")) {
            newEmployee = new Worker(name);
        } else {
            newEmployee = null;
        }

        Employee[] staff = {michael, dwight, jim, newEmployee};
        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.totalPay());
        }

    }
}
