package lesson2_4_1;

public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public boolean hasEnoughFood(int amount) {
        return foodAmount >= amount && amount > 0;
    }

    public void consumeFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Всего: " + foodAmount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
