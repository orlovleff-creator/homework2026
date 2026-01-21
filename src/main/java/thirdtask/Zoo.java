package thirdtask;

public class Zoo {

    public boolean foodBagIsEmpty(BagFood bagFood) {
        return bagFood.getFood() <= 0;
    }

    public void feedAnimals(BagFood bagFood) {

        Panda panda = new Panda("Paul");
        Rabbit rabbit = new Rabbit("Robert");
        Fox fox = new Fox("Frank");

        Animal[] animals = {panda, rabbit, fox};

        while (!foodBagIsEmpty(bagFood)) {
            for (Animal animal : animals) {
                if (foodBagIsEmpty(bagFood)) {
                    break;
                }
                animal.eat(bagFood);
            }
        }

        for (Animal animal : animals) {
            System.out.println(
                    animal.getName() + " поел " + animal.countEat + " раз"
            );
        }
    }
}