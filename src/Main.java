
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDafence("fly");
        boss.setDamage(50);
        boss.setHealth(500);

        Hero[] herous = creatHerous();

        System.out.println("Information of boss: " + "Boss defence: " + boss.getDafence() +
                "Boss health: " + boss.getHealth() + "Boss damage: " + boss.getDamage());

        System.out.println("Information of Herous: ");
        // Hero В данном случае это тип данных и в hero говориться что в Hero может храниться тип данных Hero А herous это маиссив из обьектов класса Hero
        for (Hero hero : herous) {
            int numberOfHero = 0;
            numberOfHero++;
            System.out.println("Hero" + numberOfHero + " health: " + hero.getHealth() +
                    " damage: " + hero.getDamage() + " Supper ability" + hero.getSuperAbility());
        }

    }

    //Hero Это массив каторый может содержать обьекты класса Hero
    public static Hero[] creatHerous() {
        Hero hero1 = new Hero(100, "Fly", 30);
        Hero hero2 = new Hero(100, "Fly", 30);
        Hero hero3 = new Hero(100, 30);

        Hero[] allHerous = new Hero[]{hero1, hero2, hero3};
        return allHerous;


    }

}