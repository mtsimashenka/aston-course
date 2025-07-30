public class MainPark {

    public static void main(String[] args) {

        Park disneyland = new Park("Disneyland Park");

        Park.Attraction carousel = disneyland.new Attraction("Carousel", "08:00-24:00", 8.75 );
        System.out.println("Welcome to " + disneyland.getParkName());
        carousel.displayInfo();
    }
}
