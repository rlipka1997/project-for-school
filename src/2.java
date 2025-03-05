import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        System.out.println("Random number between 0 and 9: " + num1);
    }
}