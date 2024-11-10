public class Car implements Vehicle{

    private String model;
    private double days;

    public Car(String model, double days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public final double calculateRentalCost() {
        return getDays()*50.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+getModel()+"\nDaily Rental Rate: $50.0"+"\nRental Cost: $"+calculateRentalCost());
    }
}
