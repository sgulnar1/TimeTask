public class Factorial {
    public static void main(String[] args) {
        int a = 6;
        Factorial factorial = new Factorial();
        factorial.forFaktorial(a);
        System.out.println(factorial.faktorial(a));
    }

    private void forFaktorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++)
            result *= i;
        System.out.println(result);
    }

    private int faktorial(int a) {
        int result = 1;
        if (a == 1 || a == 0)
            return 1;
        else
            return a * faktorial(a - 1);
    }
}
