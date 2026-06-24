// V2 Recursiva
public class FactorialRecursivo {

    public static long calcular(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}
