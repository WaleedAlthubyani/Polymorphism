import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        int choice =0;
        String name;
        double period;

        do {
            System.out.println("***************************");
            System.out.println("*  Vehicle Rental System  *");
            System.out.println("***************************");

            System.out.println("*1. Rent a Car.           *\n*2. Rent a Bike.          *\n*3. Rent a Truck.         *\n*4. View Rented Vehicles. *\n*5. Exit                  *");
            System.out.println("***************************");
            System.out.println();
            System.out.print("Enter your choice: ");
            try {
                choice=input.nextInt();
                System.out.println();

            }catch (InputMismatchException e){
                System.out.println("Please enter an integer");
                input.nextLine();
                continue;
            }

            input.nextLine();
            try {
            switch (choice){
                case 1:
                    System.out.print("Enter Car Model: ");
                    name=input.nextLine();
                    System.out.println();
                    System.out.print("Enter Rental Days: ");
                    period=input.nextDouble();
                    rentedVehicles.add(new Car(name,period));
                    System.out.println();
                    rentedVehicles.getLast().displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    name=input.nextLine();
                    System.out.println();
                    System.out.print("Enter Rental Hours: ");
                    period=input.nextDouble();
                    rentedVehicles.add(new Bike(name,period));
                    System.out.println();
                    rentedVehicles.getLast().displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    name=input.nextLine();
                    System.out.println();
                    System.out.print("Enter Rental Weeks: ");
                    period=input.nextDouble();
                    rentedVehicles.add(new Truck(name,period));
                    System.out.println();
                    rentedVehicles.getLast().displayDetails();
                    break;
                case 4:
                    for (Vehicle v : rentedVehicles){
                        v.displayDetails();
                        System.out.println();
                    }
                    break;

            }}catch (InputMismatchException e){
                System.out.println("Please enter a number");
                input.next();
            }
            System.out.println();
        }while (choice!=5);
        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}