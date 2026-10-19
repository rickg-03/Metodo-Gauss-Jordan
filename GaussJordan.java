public class GaussJordan {
    public static void resolver(double[][] matriz) {
        int n = matriz.length;

        //Llama al metodo de la practica anterior
        Gauss.eliminacionGaussiana(matriz);

        System.out.println("\nPASO 2. BARRIDO SUPERIOR Y NORMALIZACION");

        //Normalizar pivotes a 1
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("\n--- Procesando pivote en Fila " + (i + 1) + " ---");

            double pivote = matriz[i][i];

            //normalizacion de la fila si el pivote no es 1
            if (Math.abs(pivote - 1.0) > 1e-10) {
                System.out.printf("Normalizando Fila %d (dividiendo todo entre el pivote %.4f):\n", (i + 1), pivote);
                for (int j = 0; j <= n; j++) {
                    matriz[i][j] /= pivote;
                }
                LectorDatos.imprimirMatriz(matriz, "Matriz tras normalizar fila " + (i + 1) + ":");
            }

            //Anulamos coeficientes ARRIBA del pivote
            for(int k = i - 1; k >= 0; k--){
                double factor = matriz[k][i];
                if(Math.abs(factor) > 1e-10){
                    System.out.printf("Anulando elemento superior [%d][%d] -> Fila %d = Fila %d - (%.4f) * Fila %d\n",
                            (k + 1), (i + 1), (k + 1), (k + 1), factor, (i + 1));

                    for (int j = 0; j <= n; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                    LectorDatos.imprimirMatriz(matriz, "Matriz actualizada:");
                }
            }
        }
        System.out.println("\n=============================================================");
        System.out.println(">>>Matriz transformada en la Identidad<<<");
        System.out.println("=============================================================");
    }
}