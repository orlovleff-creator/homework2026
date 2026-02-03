package fifthTask;

public class EvilBarbarian extends Warrior implements Barbarian {

    public EvilBarbarian(String name) {
        super(name, "Воин");
    }

    @Override
    public void strongHit() {
        System.out.println(name + " наносит мощный удар двумя топорами");
    }

    @Override
    public void throwAxe() {
        System.out.println(name + " метает топор в противника");
    }

    @Override
    public void block() {
        System.out.println(name + " блокирует удар оружием");
    }

    @Override
    public void run() {
        System.out.println(name + " яростно отступает, рыча");
    }
}
