package fifthTask;

public class DarkNecromancer extends Warrior implements Necromancer {

    public DarkNecromancer(String name) {
        super(name, "Некромант");
    }

    @Override
    public void boneSpear() {
        System.out.println(name + " выпускает костяное копьё");
    }

    @Override
    public void corpseExplosion() {
        System.out.println(name + " взрывает труп");
    }

    @Override
    public void boneShield() {
        System.out.println(name + " создает костянную броню");
    }

    @Override
    public void run() {
        System.out.println(name + " растворяется в тени");
    }
}

