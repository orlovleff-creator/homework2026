package thirdtask;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(5);

        if (name.charAt(0) != 'R') {
            throw new IllegalArgumentException("Имя Rabbit должно начинаться с R");
        }

        setName(name);
    }
}
