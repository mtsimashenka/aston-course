package lesson2_4;

public class Cat extends Animals{
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isSatiated = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум " + maxRunDistance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public boolean eatFromBowl(FoodBowl bowl, int amount) {
        if (bowl.hasEnoughFood(amount)) {
            bowl.consumeFood(amount);
            isSatiated = true;
            System.out.println(name + " покушал " + amount + " единиц еды и теперь сыт.");
            return true;
        } else {
            System.out.println(name + " не стал есть, потому что в миске недостаточно еды.");
            return false;
        }
    }

    public boolean isSatiated() {
        return isSatiated;
    }

    public static int getCatCount() {
        return catCount;
    }
}
