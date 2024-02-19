public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setAge(7);
        System.out.println("age = " + wolf.getAge());

        wolf.setColor("black");
        System.out.println("color = " + wolf.getColor());

        wolf.setGender("male");
        System.out.println("gender = " + wolf.getGender());

        wolf.setName("Wolfy");
        System.out.println("name = " + wolf.getName());

        wolf.setWeightKg(12.5f);
        System.out.println("weight = " + wolf.getWeightKg() + "kg");

        wolf.walk();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
        wolf.run();
    }
}
