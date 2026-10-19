public class Gauss {
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;
        System.out.println("\nPASO 1: ELIMINACION GAUSSIANA==========");

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Procesando columna " + (i + 1) + " ---");

            int max = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matriz[k][i]) > Math.abs(matriz[max][i])) {
                    max = k;
                }
            }

            if(max != i){
                double[] temp = matriz[i];
                matriz[i] = matriz[max];
                matriz[max] = temp;
                System.out.printf("Pivoteo. Intercambio de Fila %d con Fila %d\n", (i + 1), (max + 1));
                LectorDatos.imprimirMatriz(matriz, "Estado tras pivoteo:");
            }

            if(Math.abs(matriz[i][i]) < 1e-10){
                throw new ArithmeticException("El sistema no tiene solucion unica.");
            }

            for (int k = i + 1; k < n; k++) {
                double factor = matriz[k][i] / matriz[i][i];
                if (Math.abs(factor) > 1e-10) {
                    System.out.printf("Anulando elemento [%d][%d] -> Fila %d = Fila %d - (%.4f) * Fila %d\n",
                            (k + 1), (i + 1), (k + 1), (k + 1), factor, (i + 1));

                    for (int j = i; j <= n; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                    LectorDatos.imprimirMatriz(matriz, "Matriz actualizada:");
                }
            }
        }
        System.out.println("\n>>> Triangulacion superior completada con exito. <<<");
    }
}