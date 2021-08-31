public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Peter","50 тыс.","Тигр",Color.YELLOW);
        System.out.println(cat1.getInfo());
        cat1.Eat();
        System.out.println("________________________________");


        MotherLand motherLand = new MotherLand("Brazil");
        Cat cat2 = new Cat("Jack",motherLand,Color.WHITE,"100 тыс.");
        System.out.println(cat2.getInfo());
        cat2.Fly();
        System.out.println("_________________________________");


        Cat cat3 = new Cat("Kesha","40 тыс.",Color.BLUE);
        System.out.println(cat3.getInfo());
        cat3.Sitting();
    }

    }

