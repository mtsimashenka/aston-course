package lesson2_3;

public class Product {

    private String name;
    private String dateProduction;
    private String manufacture;
    private String countryOfOrigin;
    private double price;
    private boolean bookingStatus;

    public Product (String name, String dateProduction, String manufacture, String countryOfOrigin, double price, boolean bookingStatus){
        this.name = name;
        this.dateProduction = dateProduction;
        this.manufacture = manufacture;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Production Date: " + dateProduction);
            System.out.println("Manufacturer: " + manufacture);
            System.out.println("Country of Origin: " + countryOfOrigin);
            System.out.println("Price: " + price);
            System.out.println("Booking Status: " + (bookingStatus ? "Booked" : "Available"));
    }
}
