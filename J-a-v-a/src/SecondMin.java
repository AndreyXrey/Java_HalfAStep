import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while(console.hasNextInt())
        {
            int i = console.nextInt();
            if (i < min1)
            {
                min2 = min1;
                min1 = i;
            }
            else if (i < min2 && i != min1)
            {
                min2 = i;
            }
        }
        System.out.println(min2);
    }
}