public class MainProduct {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 6299, false);
        productsArray[2] = new Product("MacBook Air M3", "10.11.2024",
                "Apple Inc.", "China", 8999, true);
        productsArray[3] = new Product("PlayStation 5", "20.05.2023",
                "Sony Corp.", "Japan", 3999, false);
        productsArray[4] = new Product("Xbox Series X", "12.12.2023",
                "Microsoft", "USA", 3499, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].displayInfo();
        }
    }
}
