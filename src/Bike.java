public class Bike implements Vehicle{
    private String brand;
    private double hour;

    public Bike(String brand, double hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public final double calculateRentalCost() {
        return getHour()*10.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+getBrand()+"\nHourly Rental Rate: $10.0"+"\nRental Cost: $"+calculateRentalCost());
    }
}