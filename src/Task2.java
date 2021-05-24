import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner2.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
        // 2 вариант
    /*    switch (name){
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
                break;
            default:
                System.out.println("Нет такого имени");
        } */
    }
}
