package com.Cal;
import java.util.Scanner;


public class Calculator {

	

	    // Method for addition
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // Method for subtraction
	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Method for multiplication
	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Method for division
	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: Cannot divide by zero.");
	            return Double.NaN; // Not a Number
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        boolean running = true;

	        while (running) {
	            System.out.println("\n=== Basic Calculator ===");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	            System.out.print("Choose an operation (1-5): ");

	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                running = false;
	                System.out.println("Exiting calculator...");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result = 0;

	            switch (choice) {
	                case 1:
	                    result = add(num1, num2);
	                    break;
	                case 2:
	                    result = subtract(num1, num2);
	                    break;
	                case 3:
	                    result = multiply(num1, num2);
	                    break;
	                case 4:
	                    result = divide(num1, num2);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	                    continue;
	            }

	            if (!Double.isNaN(result)) {
	                System.out.println("Result: " + result);
	            }
	        }

	        scanner.close();
	    }
	}


