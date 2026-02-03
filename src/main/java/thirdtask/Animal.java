package thirdtask;

public class Animal {

    private int foodNeeded;
    private String name;
    int countEat;

    public Animal(int foodNeeded) {
        this.foodNeeded = foodNeeded;
        this.countEat = 0;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void eat(BagFood bagFood) {

        int foodInBag = bagFood.getFood();

        if (foodInBag <= 0) {
            return;
        }

        if (foodInBag >= foodNeeded) {
            bagFood.setFood(foodInBag - foodNeeded);
            countEat++;
        } else {
            bagFood.setFood(0);
            countEat++;
        }
    }
}
