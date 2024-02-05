package com.project;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 ShoppingCart cart = new ShoppingCart();

	        // Sample products
	        Product laptop = new Product("Laptop", 999.99);
	        Product phone = new Product("Smartphone", 499.99);
	        System.out.println("Welcome to the E-Commerce App!");
	        while (true) {
	            System.out.println("\n1. Add Product to Cart\n2. View Cart\n3. Checkout\n4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	        
	            switch (choice) {
	                case 1:
	                    System.out.println("Available Products:");
	                    System.out.println("1. Laptop - $999.99\n2. Smartphone - $499.99");
	                    System.out.print("Enter product number to add to cart: ");
	                    int productChoice = scanner.nextInt();

	                    if (productChoice == 1) {
	                        cart.addProduct(laptop);
	                    } else if (productChoice == 2) {
	                        cart.addProduct(phone);
	                    } else {
	                        System.out.println("Invalid choice.");
	                    }
	                    break;

	                case 2:
	                    cart.displayCart();
	                    System.out.println("Total: $" + cart.calculateTotal());
	                    break;

	                case 3:
	                    System.out.println("Thank you for shopping! Total amount: $" + cart.calculateTotal());
	                    System.exit(0);

	                case 4:
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }     
	 }
}
