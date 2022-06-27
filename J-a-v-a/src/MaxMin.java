import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x<min)
                min = x;
            if (x>max)
                max = x;
            sum += x;
        }
        System.out.println("Сумма:" + sum);
        System.out.println("Минимум:" + min);
        System.out.println("Максимум:" + max);
    }
}