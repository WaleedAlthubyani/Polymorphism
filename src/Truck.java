public class Truck implements Vehicle{
    private String type;
    private double week;

    public Truck(String type, double week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }


    public double getWeek() {
        return week;
    }


    @Override
    public final double calculateRentalCost() {
        return getWeek()*500.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: "+getType()+"\nWeekly Rental Rate: $500.0"+"\nRental Cost: $"+calculateRentalCost());
    }
}
