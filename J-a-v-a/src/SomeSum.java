public class SomeSum {
    public static void main(String[] args) {
        //напишите тут ваш код

        int s = 0;
        for (int i = 0; i<100; i++) {
            if ((i % 3) == 0)
                continue;
            s += i;
        }
        int i = 1;
        while (i <= 20)
        {
            if ( (i % 7) == 0) continue;
            System.out.println(i);
            i++;
        }
        System.out.println(s);
    }
}
