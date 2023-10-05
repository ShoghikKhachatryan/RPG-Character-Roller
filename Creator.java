import java.util.Random;

public class Creator {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Write a name");
            return;
        }

        System.out.println("-----------------------------------------");
        System.out.println("Welcome to the character generator!");

        Random random = new Random();
        int n = random.nextInt(3);

        // Random [2, 13)
        int  strengthState = random.nextInt(11) + 2;
        int  magicState = random.nextInt(11) + 2;
        int  healthState = random.nextInt(11) + 2;

        String be;
        switch (n) {
            case 0:
                be = "Warrior";
                strengthState *= 3;
                break;
            case 1:
                be = "Wizard";
                magicState *= 3;
                break;
            default:
                be = "Potato";
                healthState *= 3;
                break; // This is not necessary, but it is good style. For adding other cases
        }

        System.out.println(args[0] + " is.... a " + be);
        System.out.println("\tStrength: " + strengthState);
        System.out.println("\tMagic: " + magicState);
        System.out.println("\tHealth: " + healthState);
        System.out.println("Happy adventuring!");
        System.out.println("-----------------------------------------");
    }
}
