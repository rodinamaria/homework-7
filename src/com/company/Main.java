package com.company;

public class Main {

    public static void main(String[] args) {
        task3();
    }

    public static void task12() {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        String upperFullName = fullName.toUpperCase();
        System.out.println(upperFullName);


    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String changeFullName = fullName.replace("ё", "е");
        System.out.println(changeFullName);
    }
}
