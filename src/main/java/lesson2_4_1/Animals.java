package lesson2_4_1;

abstract class Animals {
    protected String name;
    protected static int animalCount = 0;

    public Animals(String name){
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName(){
        return name;
    }
}
