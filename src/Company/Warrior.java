package Company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String superpower) {
        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");

    }
}
