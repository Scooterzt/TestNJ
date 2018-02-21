package QauberTestNj;

public class TestManager {
    public static void main(String[] args) {
        Manager m = new Manager("Max", 25, 5000);

        //set experience for Max
        m.setExp(9);
        double actualbonus = m.getSalary() * 0.15;
        int experience = m.getExp();
        double bonus = m.getBonus(experience);

        System.out.println(bonus);
        if(Double.compare(actualbonus, bonus)== 0) {
            System.out.println("Pass");
            } else{
            System.out.println("Fail");
        }
    }
}
