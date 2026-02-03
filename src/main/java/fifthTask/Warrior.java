package fifthTask;

public abstract class Warrior {
    protected String name;
    protected String specialization;

    public Warrior(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void run();

    public void die() {
        System.out.println(specialization + " " + name + " погибает");
    }

    public void attackPhrase() {
        String[] phrases = {
                "За Гондор!",
                "За Пиво!",
                "Лерой Дженкенс!"
        };
        int i = (int) (Math.random() * phrases.length);
        System.out.println(name + " кричит: \"" + phrases[i] + "\"");
    }
}
