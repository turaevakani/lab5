package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tram t1 = new Tram();
        t1.welcome();
        t1.Fare= true;
        System.out.println("Please, enter a stop1");
        System.out.println(Arrays.toString(t1.getStops()));
        String st1 = sc.nextLine();
        t1.takeTheTram(st1);

        System.out.println("Please, enter a stop2");
        System.out.println(Arrays.toString(t1.getStops()));
        String st2 = sc.nextLine();
        t1.getOffTheTram(st2);


}}
