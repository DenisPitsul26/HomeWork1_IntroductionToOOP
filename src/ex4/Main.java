package ex4;

public class Main {
    public static void main(String[] args) {
        Network network = new Network("Kyivstar");

        Phone phoneOne = new Phone("380965698556");
        Phone phoneTwo = new Phone("380984472341");
        Phone phoneThree = new Phone("380977665492");

        phoneOne.registerToNetwork(network);
        phoneTwo.registerToNetwork(network);
        network.printNumbers();

        phoneOne.call(network, phoneTwo.getNumber());
        phoneTwo.call(network, phoneThree.getNumber());
        phoneThree.call(network, phoneOne.getNumber());
    }
}
