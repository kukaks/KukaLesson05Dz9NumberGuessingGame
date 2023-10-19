import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int attempts = 3;
        Random random = new Random();
        int numericPc = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вгадайте ціле число від 0 до 10.");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Спроба №" + attempt + ": ");
            int guess = scanner.nextInt();

            if (guess == numericPc ) {
                System.out.println("Ви вгадали! Число " + numericPc + " було відгадано.");
                break;
            } else if (attempt < attempts )
                System.out.println("Ви не вгадали. Спробуйте ще ;)\nЗалишилось спроб: " + (attempts - attempt));
            else
                System.out.println("Ви не вгадали. Правильне число: " + numericPc);
        }
    }
}
