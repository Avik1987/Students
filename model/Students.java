package model;

import java.util.Scanner;

public class Students<i> {
    private String name;
    private String surname;
    private double mark;
    private char mail;
    private boolean isPHD;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double Mark) {
        this.mark = Mark;
    }

    public char getMail() {
        return mail;
    }

    public void setMail(char mail) {
        this.mail = mail;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Name is:" + getName());
        System.out.println("Surname is: " + getSurname());
        System.out.println("Mark is: " + getMark());
        System.out.println("Mail is: " + getMail());
        System.out.println("IsPHD: " + isPHD);
        System.out.println("Age is:" + getAge());
        ;

    }

    public Students sl() {
        Students k = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        k.setName(name);
        System.out.println("Enter surname ");
        String surname = sc.next();
        k.setSurname(surname);
        System.out.println("Enter mark");
        double mark = sc.nextDouble();
        k.setMark(mark);
        System.out.println("Enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        k.setAge(age);
        System.out.println("isPHD");
        boolean Phd = sc.nextBoolean();
        k.setPHD(Phd);
        k.print();
        return k;
    }


    }





