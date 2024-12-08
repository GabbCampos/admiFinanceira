import java.util.Scanner;

public class CalculadoraFinanceira {

    
    public static double calcularValorFuturo(double pv, double i, int n) {
        return pv * Math.pow(1 + i, n);
    }

    public static double calcularValorPresente(double vf, double i, int n) {
        return vf / Math.pow(1 + i, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Valor Futuro e Valor Presente");
        System.out.println("========================================");

        
        System.out.print("\nDigite a taxa de juros anual (em %): ");
        double i = scanner.nextDouble() / 100; // Convertendo para taxa decimal

        
        System.out.print("\nDigite o valor futuro desejado: $");
        double vfDesejado = scanner.nextDouble();
        System.out.print("\nDigite o número de anos: ");
        int n = scanner.nextInt();

        
        double pvDesejado = calcularValorPresente(vfDesejado, i, n);
        System.out.printf("\nPara obter $%.2f após %d anos, você precisaria depositar: $%.2f\n",
                vfDesejado, n, pvDesejado);

        
        System.out.print("\nDigite o valor presente (depósito inicial): $");
        double pv = scanner.nextDouble();
        System.out.print("\nDigite o número de anos: ");
        n = scanner.nextInt();

      
        double vf = calcularValorFuturo(pv, i, n);
        System.out.printf("\nO valor futuro após %d anos será: $%.2f\n", n, vf);

        scanner.close();
    }
}
