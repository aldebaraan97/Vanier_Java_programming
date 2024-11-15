package programming_concepts_I.LAB6;

import LAB6.Temperature;
import LAB6.TestScores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        testTestScores();
        testTemperature();

    }

    public static void testTestScores() {
        double test, test2, test3, average;
        Scanner input = new Scanner(System.in);
        TestScores testScores;

        System.out.println("Program to calculate the average of three scores");
        System.out.println("Enter score of test 1: ");
        test = input.nextDouble();
        System.out.println("Enter score of test 2: ");
        test2 = input.nextDouble();
        System.out.println("Enter score of test 3: ");
        test3 = input.nextDouble();

        testScores = new TestScores(test, test2, test3);
        average = testScores.getAverage();
        System.out.println("The average is " + average);
    }

    public static void testTemperature() {
        Temperature temperature = new Temperature(50);
        System.out.println("Temperature is " + temperature.getFtemp() + " Fahrenheit");

        temperature.setFtemp(60);
        System.out.println("Temperature is " + temperature.getFtemp() + " Fahrenheit");

        System.out.println(temperature.getFtemp() + " Fahrenheit is " + temperature.getKelvin() + " Kelvin degrees");
        System.out.println(temperature.getFtemp() + " Fahrenheit is " + temperature.getCelsius() + " Celsius degrees ");
    }
}
