package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sum(5, 3));
//        System.out.println(sum(1.5, 1.3));
//
//        Student s = new Student();
//        s.setName("Pavel");
//        String name = s.getName();
//        System.out.println(name);

        Advice a = new Advice();
        a.message();
    }

    public static void foo() {
        //Тело метода
    }

    public static int sum(int a, int b){
        int x;
        x = a + b;
        return x;
    }

    public static double sum(double a, double b){
        double x;
        x = a + b;
        return x;
    }
}