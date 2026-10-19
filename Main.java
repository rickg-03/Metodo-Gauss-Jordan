public class Main{
    public static void main(String[] neu){
        System.out.println("===METODO DE GAUSS-JORDAN===");
        try {
            //Entrada de datos
            double[][] matriz = LectorDatos.leerMatrizAumentada();

            //matriz inicial
            LectorDatos.imprimirMatriz(matriz, "--- Matriz Aumentada Inicial [A | b] ---");

            //Gauss-Jordan
            GaussJordan.resolver(matriz);

            //Matriz Identidad y Vector Solución
            System.out.println("\n========== RESULTADO FINAL ==========");
            LectorDatos.imprimirMatriz(matriz, "--- Matriz Identidad Resultante [I | x] ---");
            LectorDatos.imprimirSolucionDirecta(matriz);

        } catch (Exception e) {
            System.out.println("\nError durante la ejecución: " + e.getMessage());
        }
    }
}