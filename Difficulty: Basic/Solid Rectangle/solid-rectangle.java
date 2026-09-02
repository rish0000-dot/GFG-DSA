import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {       // rows
            for(int j = 1; j <= m; j++) {   // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}