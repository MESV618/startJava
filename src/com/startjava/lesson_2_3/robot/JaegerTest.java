package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Brawler Yukon");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("USA");
        jaeger1.setStatus("Destroyed");
        jaeger1.setPilot("Caitlin Lightcap");
        jaeger1.setHeight(190);
        jaeger1.setWeight(1000);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);

        jaeger1.fight();
        jaeger1.move();
        jaeger1.setHeight(200);
        System.out.println(jaeger1.toString());

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan",
                "Destroyed", "Tamsin Sevier", 85.34f, 2326, 7, 4);
        jaeger2.fight();
        jaeger2.move();
        jaeger2.setArmor(5);
        System.out.println(jaeger2.toString());
    }
}
