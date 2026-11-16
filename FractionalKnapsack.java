import java.util.*;

class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] w = new int[n];
        double[] r = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit: ");
            p[i] = sc.nextInt();

            System.out.print("Enter weight: ");
            w[i] = sc.nextInt();

            r[i] = (double) p[i] / w[i];
        }
        System.out.print("Enter capacity: ");
        int cap = sc.nextInt();

        // Sort by profit/weight ratio
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (r[i] < r[j]) {
                    double temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;

                    int t = p[i];
                    p[i] = p[j];
                    p[j] = t;

                    t = w[i];
                    w[i] = w[j];
                    w[j] = t;
                }
            }
        }
        double profit = 0;
        for (int i = 0; i < n; i++) {
            if (cap >= w[i]) {
                profit += p[i];
                cap -= w[i];
            } else {
                profit += r[i] * cap;
                break;
            }
        }
        System.out.println("Maximum Profit: " + profit);
    }
}