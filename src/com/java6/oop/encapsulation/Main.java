package com.java6.oop.encapsulation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Anis" , 29);

        Car car = new Car("BMW" , 200,111,"Black",person);
        car.printCar();
        /*Employee employee = new Employee("Robert", 1994, "64C- WallsStreat");
        System.out.println(employee.getName());
        employee.setName("Anis");
        employee.setYearOfJoining(2000);
        System.out.println(employee.getYearOfJoining());
        employee.printEmployee();
*/

    }
}
