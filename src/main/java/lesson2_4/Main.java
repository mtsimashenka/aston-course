package lesson2_4;

public class Main {
    public static void main(String[] args) {

        Animals[] animals = {new Dog("Мухтар"), new Dog("Шарик"), new Cat("Мурка"), new Cat("Барсик"), new Cat("Муся")};

        System.out.println("Всего животных создано: " + Animals.getAnimalCount());
        System.out.println("Собак создано: " + Dog.getDogCount());
        System.out.println("Котов создано: " + Cat.getCatCount());

        animals[0].run(150);
        animals[0].run(600);
        animals[2].run(100);
        animals[2].run(250);

        animals[0].swim(5);
        animals[0].swim(15);
        animals[2].swim(3);

        FoodBowl bowl = new FoodBowl(25);
        System.out.println("В миске изначально: " + bowl.getFoodAmount() + " единиц еды");

        Cat[] cats = {
                new Cat("Мурка"),
                new Cat("Барсик"),
                new Cat("Муся"),
                new Cat("Рыжик")
        };

        System.out.println("\n--- Процесс кормления ---");
        cats[0].eatFromBowl(bowl, 10); // Мурзик ест 10 единиц
        System.out.println("В миске осталось: " + bowl.getFoodAmount());

        cats[1].eatFromBowl(bowl, 15); // Барсик ест 15 единиц
        System.out.println("В миске осталось: " + bowl.getFoodAmount());

        cats[2].eatFromBowl(bowl, 5);  // Рыжик пытается есть 5 единиц (не хватит)
        System.out.println("В миске осталось: " + bowl.getFoodAmount());

        bowl.addFood(10);
        System.out.println("В миске теперь: " + bowl.getFoodAmount());

        cats[2].eatFromBowl(bowl, 5);  // Теперь хватит
        System.out.println("В миске осталось: " + bowl.getFoodAmount());

        cats[3].eatFromBowl(bowl, 3);
        System.out.println("В миске осталось: " + bowl.getFoodAmount());

        System.out.println("\n--- Состояние котов ---");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " - " +
                    (cats[i].isSatiated() ? "сыт" : "голоден"));
        }
    }
}
