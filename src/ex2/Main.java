package ex2;

public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(3, 4, 6);
        System.out.println(triangleOne.squere());

        Triangle triangleTwo = new Triangle();
        triangleTwo.setSide1(5);
        triangleTwo.setSide2(7);
        triangleTwo.setSide3(3);
        System.out.println(triangleTwo.squere());
    }
}
