package Company;

public class Medic extends Hero{
    public int  healPoints;
    public String increaseExperience(){
        double str=(((10*healPoints)/100)+healPoints);
        return "Heal Points:"+healPoints+"Увеличелся на 10% стало"+str;
    }
    public Medic(int health, int damage, String superpower) {
        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Madic применил суперспособность Health ");
    }
}
