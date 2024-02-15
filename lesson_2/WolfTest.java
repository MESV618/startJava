public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.age = 7;
        System.out.println("age = " + wolf.age);

        wolf.color = "black";
        System.out.println("color = " + wolf.color);

        wolf.gender = "male";
        System.out.println("gender = " + wolf.gender);

        wolf.name = "Wolfy";
        System.out.println("name = " + wolf.name);

        wolf.weightKg = 12.5f;
        System.out.println("weight = " + wolf.weightKg + "kg");

        wolf.walk();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
        wolf.run();
    }
}
