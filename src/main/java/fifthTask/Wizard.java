package fifthTask;

public class Wizard extends Warrior implements Mage {

    public Wizard(String name) {
        super(name, "Волшебник");
    }

    @Override
    public void fireball() {
        System.out.println(name + " кидает огненный фаербол");
    }

    @Override
    public void meteor() {
        System.out.println(name + " призывает метеорит");
    }

    @Override
    public void magicShield() {
        System.out.println(name + " активирует магический щит");
    }

    @Override
    public void run() {
        System.out.println(name + " телепортируется прочь");
    }
}

