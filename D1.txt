import java.util.Scanner;

class fibonacci {
    static int recursive(int n) {
        if (n <= 1)
            return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of terms");
        int n = sc.nextInt();

        System.out.println("non-recursive fibonacci : ");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\nRecursive fibonacci : ");

        for (int i = 0; i < n; i++) {
            System.out.print(recursive(i) + " ");
        }
        sc.close();
    }
}