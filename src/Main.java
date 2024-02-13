import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[4];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++ ){
            System.out.print("Введите число: ");
            int vallue = scanner.nextInt();
            arr[i] = vallue;
        }
        System.out.println("Закончили вводить!");

        int min = arr[0];
        for (int у =0; у< arr.length; у++){
            if (arr[у] < min)
                min = arr[у];

        }
        System.out.println("Ваше Минимальное число:  " + min);

        int j = min *= 2;
        System.out.println("Ваше Минимальное число увеличили в двое:  " + j);

    }
}