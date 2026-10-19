import java.util.Scanner;
public class LectorDatos {

    private static final Scanner scanner = new Scanner(System.in);

    //Solicita los coeficientes de la matriz aumentada al usuario
    public static double[][] leerMatrizAumentada() {
        System.out.print("Ingrese el número de variables (ecuaciones): ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n + 1];
        System.out.println("\nIngrese los elementos de la matriz aumentada [A | b]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextDouble();
            }
        }
        return matriz;
    }

    //Imprime la matriz en formato [ ... | ... ]
    public static void imprimirMatriz(double[][] matriz, String titulo) {
        int n = matriz.length;
        System.out.println("\n" + titulo);
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.printf("%7.2f ", matriz[i][j]);
            }
            System.out.printf("| %7.2f ]\n", matriz[i][n]);
        }
    }

    //Imprime el vector de soluciones leido directamente de la matriz identidad.
    public static void imprimirSolucionDirecta(double[][] matriz) {
        int n = matriz.length;
        System.out.println("\n--- Vector de Soluciones (Lectura Directa) ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.4f\n", (i + 1), matriz[i][n]);
        }
    }
}