package Company;

public class Medic extends Hero{
    public int  healPoints;
    public String increaseExperience(){


        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }
    public Medic(int health, int damage, String superpower) {

        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик применил суперспособность Лечение ");
    }
}
