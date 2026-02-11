package thirdtask;

public class Fox extends Animal {

    public Fox(String name) {
        super(21);

        if (name.charAt(0) != 'F') {
            throw new IllegalArgumentException("Имя Fox должно начинаться с F");
        }

        setName(name);
    }
}
