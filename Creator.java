import java.util.Random;

public class Creator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Write your name");
            return;
        }

        System.out.println("-----------------------------------------");
        System.out.println("Welcome to the character generator!");

        Random random = new Random();
        int n = random.nextInt(3);

        // 2 included 2 not 13 for stats
        int  statsStrength = random.nextInt(11) + 2;
        int  statsMagic = random.nextInt(11) + 2;
        int  statsHealth = random.nextInt(11) + 2;

        String be;
        switch (n) {
            case 0:
                be = "Warrior";
                statsStrength *= 3;
                break;
            case 1:
                be = "Wizard";
                statsMagic *= 3;
                break;
            default:
                be = "Potato";
                statsHealth *= 3;
                break;                 // This is not necessary, but it is good style. For adding other cases
        }

        System.out.println(args[0] + " is.... a " + be);
        System.out.println("\tStrength: " + statsStrength);
        System.out.println("\tMagic: " + statsMagic);
        System.out.println("\tHealth: " + statsHealth);
        System.out.println("Happy adventuring!");
        System.out.println("-----------------------------------------");
    }
}
