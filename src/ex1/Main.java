package ex1;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Cimba", 3, "black", 3.5);
        catOne.voice();
        catOne.setSleep(true);
        System.out.println(catOne);

        Cat catTwo = new Cat();
        catTwo.setName("Pushok");
        catTwo.setAge(2);
        catTwo.setColor("white");
        catTwo.setWeight(2.4);
        catTwo.setSleep(false);
        catTwo.voice();

        catOne.setSleep(false);
        System.out.println(catOne);
        System.out.println(catTwo);
    }
}
