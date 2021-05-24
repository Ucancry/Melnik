import java.util.Random;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        // Числовой массив заполним рандомными числами от 0 до 1000, колл-во чисел введем с клавиатуры
        Scanner scanner3 = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите число: ");
        int num = scanner3.nextInt();
        int[] numbers = new int[num];
        System.out.println("Элементы массива кратные 3: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            if ((numbers[i] % 3) == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
