package fifthTask;

public class Ranger extends Warrior implements Archer {

    public Ranger(String name) {
        super(name, "Лучник");
    }

    @Override
    public void singleShot(String arrowType) {
        System.out.println(name + " стреляет " + arrowType + " стрелой");
    }

    @Override
    public void arrowRain() {
        System.out.println(name + " выпускает дождь из стрел");
    }

    @Override
    public void escape() {
        System.out.println(name + " быстро отступает в лес");
    }

    @Override
    public void run() {
        escape();
    }
}

