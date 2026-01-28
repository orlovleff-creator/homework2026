package thirdtask;

public class Panda extends Animal {

    public Panda(String name) {
        super(200);

        if (name.charAt(0) != 'P') {
            throw new IllegalArgumentException("Имя Panda должно начинаться с P");
        }

        setName(name);
    }
}
