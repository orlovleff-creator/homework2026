package fifthTask;

import java.util.Random;

public class Battle {

    public void start() {
        Random random = new Random();

        Wizard wizard = new Wizard("Isendra");
        DarkNecromancer necromancer = new DarkNecromancer("Xul");
        EvilBarbarian barbarian = new EvilBarbarian("Man");
        Ranger archer = new Ranger("Akara");

        System.out.println("Битва начинается!");

        // Раунд 1
        wizard.attackPhrase();
        wizard.fireball();
        barbarian.block();

        // Раунд 2
        necromancer.boneSpear();
        archer.escape();
        archer.singleShot("огненной");

        // Раунд 3
        barbarian.strongHit();
        necromancer.boneShield();

        // Раунд 4
        wizard.meteor();
        archer.arrowRain();

        System.out.println("\n⚠️ Исход битвы решается...\n");

        int fate = random.nextInt(4);

        switch (fate) {
            case 0 -> {
                wizard.die();
                System.out.println("Победа сил тьмы!");
            }
            case 1 -> {
                necromancer.die();
                System.out.println("Победа сил света!");
            }
            case 2 -> {
                barbarian.die();
                System.out.println("Покойся с миром, сын Гондора!");
            }
            case 3 -> {
                archer.die();
                System.out.println("Весь мой колчан опустел!");
            }
        }

        System.out.println("Битва окончена!");
    }
}

