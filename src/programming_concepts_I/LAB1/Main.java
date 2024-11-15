package programming_concepts_I.LAB1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //nestedLoops();
        //somefunction();

        // **********************
        // * In class exercises *
        // **********************
//        System.out.println(romanNumerals(1));
//        testScoresGrade();
//        timeCalculator();
//        sortedNames();

//         **********************
//         * homework exercises *
//         **********************
//        magicDates();
//        bodyMassIndex();
//        softwareSales();
//        shippingCharges();
//        speedOfSound();
//        internetServiceProvider();
//        float num = (float) 3.14;

//        boolean x = true;
//        boolean y = false;
//        boolean z = true;
//        System.out.println(x && (y || z));
//        System.out.println(5 + 12  % (4 * (3 - 1)) - (8 / (2 + 2)) + 6);
        int x = 2;
        int y;
        System.out.println(x++);
        System.out.println(x);
    }

    // If amount1 is greater than 10 and amount2 is less than 100,
    // display the greater of the two.
    public static void nestedLoops() {
        double amount1 = 10;
        double amount2 = 9;

        if (amount1 > amount2){
            if (amount2 < 100)
                System.out.println(amount1);
        }

        if (amount1 > amount2 && amount2 < 100)
            System.out.println(amount1);
    }

    public static void somefunction() {
        double x = 0;
        double y = 0;
        double z = 0;

        if (x > 0)
            if (y < 20)
                z ++;
            else
                z += 0;
    }

    // In class Exercises

    public static String romanNumerals(int number) {
        return switch (number) {
            case 1 -> "\nI";
            case 2 -> "\nII";
            case 3 -> "\nIII";
            case 4 -> "\nIV";
            case 5 -> "\nV";
            case 6 -> "\nVI";
            case 7 -> "\nVII";
            case 8 -> "\nVIII";
            case 9 -> "\nIX";
            case 10 -> "\nX";
            default -> "Please enter a valid integer 1-10";
        };
    }

    public static void testScoresGrade() {
        Scanner input = new Scanner(System.in);
        float x,y,z;
        float average;

        System.out.println("Please enter your test scores\nTest 1:\n");
        x = input.nextFloat();
        input.nextLine();
        System.out.println("Test 2:\n");
        y = input.nextFloat();
        input.nextLine();
        System.out.println("Test 3:\n");
        z = input.nextFloat();

        average = (x + y + z) / 3;
        System.out.println("Your average is: " + average);
    }

    public static void timeCalculator() {
        Scanner input = new Scanner(System.in);
        float userNumber;
        float timeInNumber =0;

        System.out.println("Enter a number of seconds >= 60:\n");
        userNumber = input.nextFloat();

        if (userNumber >= 60 && userNumber < 3600)
            timeInNumber = userNumber / 60;
        else if (userNumber >= 3600 && userNumber < 86_400)
            timeInNumber = userNumber / 3600;
        else if (userNumber >= 86_400)
            timeInNumber = userNumber / 86_400;

        System.out.println(userNumber + " seconds is " + timeInNumber +
                ((userNumber >= 86400)? " days." :
                        (userNumber >= 3600)? " hours." : " minutes"));
    }

    public static void sortedNames() {
        Scanner input = new Scanner(System.in);
        String name1, name2, name3;

        System.out.println("Please enter three names.\nFirst name:\n");
        name1 = input.nextLine();
        System.out.println("\nSecond name:\n");
        name2 = input.nextLine();
        System.out.println("\nThird name:\n");
        name3 = input.nextLine();

        if (name1.compareTo(name2) <= 0 && name1.compareTo(name3) <= 0) {
            System.out.println(name1 + " " +
                    ((name2.compareTo(name3) <= 0)? name2 + " " + name3 :
                            name3 + " " + name2));
        }
        else if (name2.compareTo(name1) <= 0 && name2.compareTo(name3) <= 0) {
            System.out.println( name2 + " " +
                    ((name1.compareTo(name3) <= 0)? name1 + " " + name3 :
                            name3 + " " + name1));
        }
        else
            System.out.println(name3 + " " +
                    ((name2.compareTo(name1) <= 0)? name2 + " " + name1 :
                            name1 + " " + name2));
    }

    // Homework exercises

    public static void magicDates() {
        Scanner input = new Scanner(System.in);
        int day, month, year;
        boolean magicNumber;

        System.out.println("Enter a month in numbers:\n");
        month = input.nextInt();
        System.out.println("Enter a day in numbers:\n");
        day = input.nextInt();
        System.out.println("Enter the last two digits of a year:\n");
        year = input.nextInt();

        magicNumber = (day * month == year);

        System.out.println("The date entered is " +
                ((magicNumber)? "a magic date " : "not a magic date"));
    }

    public static void bodyMassIndex() {
        Scanner input = new Scanner(System.in);
        double weight = 1;
        double height = 1;
        double BMI;

        System.out.println("Enter your weight in pounds:\n");
        weight = input.nextDouble();
        System.out.println("Enter your height in inches:\n");
        height = input.nextDouble();

        BMI = (weight * 703) / Math.pow(height, 2);

        System.out.println("The BMI is: " + BMI +
                "\nFor a sedentary person you are considered " +
                ((BMI < 18.5)? "underweight." :
                        (BMI >= 18.5 && BMI <= 25)?
                                "in optimal weight." : "overweight."));
    }

    public static void softwareSales() {
        Scanner input = new Scanner(System.in);
        int purchasedPackages;
        double discount = 1;
        double  total;

        System.out.println("Enter the number of packages purchased:\n");
        purchasedPackages = input.nextInt();

        if (purchasedPackages >= 10 && purchasedPackages <= 19)
            discount = .2;
        else if (purchasedPackages >= 20 && purchasedPackages <= 49) {
            discount = .3;
        } else if (purchasedPackages >= 50 && purchasedPackages <= 99) {
            discount = .4;
        }
        else if (purchasedPackages >= 100)
            discount = .5;

        total = purchasedPackages * discount * 99;

        System.out.println("The total is: $" + total +
                ((discount != 1) ?
                        "\nA discount of " + (int)(discount * 100) + "% was applied." :
                        "."));
    }

    public static void shippingCharges() {
        Scanner input = new Scanner(System.in);
        double packageWeight;
        double ratePerMile = 1;

        System.out.println("Enter the weight of a package in pounds:\n");
        packageWeight = input.nextFloat();

        if (packageWeight < 2)
            ratePerMile = 1.10;
        else if (packageWeight >= 2 && packageWeight <= 6)
            ratePerMile = 2.20;
        else if (packageWeight > 6 && packageWeight <= 10)
            ratePerMile = 3.70;
        else if (packageWeight > 10)
            ratePerMile = 3.80;

        System.out.println("The shipping charges for a package of " +
                packageWeight + "lbs is $" + ratePerMile + " per mile.");
    }

    public static void speedOfSound() {
        Scanner input = new Scanner(System.in);
        String medium;
        double time = 0;
        double distance;

        System.out.println("This program will calculate the time it take a sound wave" +
                " to travel in three different mediums with a given distance.");
        System.out.println("Type 'air', 'water', or 'steel':\n");
        medium = input.nextLine();
        System.out.println("Enter the distance:\n");
        distance = input.nextDouble();

        if (medium.compareToIgnoreCase("air") == 0 )
            time = distance / 1100.0;
        else if (medium.compareToIgnoreCase("water") == 0) {
            time = distance / 4900.0;
        } else if (medium.compareToIgnoreCase("steel") == 0) {
            time = distance / 16400.0;
        }
        else
            System.out.println("Please enter a valid input.");

        System.out.println("The time it takes the sound to travel " + distance +
                " feet is " + time + " seconds.");
    }

    public static void internetServiceProvider() {
        Scanner input = new Scanner(System.in);
        String packageLetter;
        double monthlyCost, additionalHours;
        double totalCharges = 0;
        int accessHours, usedHours;

        System.out.println("Please enter letter of the package you purchased:\n");
        packageLetter = input.nextLine();
        System.out.println("Please enter number of hours used:\n");
        usedHours = input.nextInt();

        if (packageLetter.compareToIgnoreCase("a") == 0) {
            monthlyCost = 9.95;
            additionalHours = 2;
            accessHours = 10;
            totalCharges = (usedHours > accessHours) ?
                    (usedHours - accessHours) * additionalHours + monthlyCost : monthlyCost;
        }
        else if (packageLetter.compareToIgnoreCase("b") == 0) {
            monthlyCost = 13.95;
            accessHours = 10;
            totalCharges = (usedHours > accessHours) ?
                    (usedHours - accessHours) + monthlyCost : monthlyCost;
        }
        else if (packageLetter.compareToIgnoreCase("c") == 0) {
            monthlyCost = 19.95;
            totalCharges = monthlyCost;
        }
        else
            System.out.println("Please enter a valid input.");
        System.out.println("Total charges:\n" + totalCharges);
    }
}
