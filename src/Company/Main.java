package Company;

public class Main {
    public static void main(String[] args) {

        Magic gender= new Magic(400,33,"magical");
        Warrior wr= new Warrior(450,44,"berserk");
        Medic medic=new Medic(333,11,"health");
        Hero[] heroes={gender,wr,medic};
        for (Hero i:heroes) {
            i.applySuperAbility();
            for (int j = 0; j < heroes.length; j++) {
                System.out.println(medic.increaseExperience()+"  "+j);
            }
        }
    }
}