// V1 Iterativa
public class Factorial {

    public static long calcular(int n) {
        long resultado = 1;

        for(int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
