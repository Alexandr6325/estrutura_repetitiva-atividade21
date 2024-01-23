import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero de divisoes: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            
            System.out.println("Digite o primeiro divisor: ");
            int x = sc.nextInt();
            System.out.println("Digite o segundo divisor: ");
            int y = sc.nextInt();

            if (y==0){
                System.out.println("Divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}