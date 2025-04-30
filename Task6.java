import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        int[] frequency = new int[21]; 
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(21);
        }

      for (int i = 0; i <= 20; i++) {
            System.out.println("Number " + i + ": " + frequency[i] + " times");
        }
    }
}
