// V3 Funcional usando Streams
import java.util.stream.LongStream;

public class FactorialFuncional {

    public static long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser >= 0");
        }
        return LongStream.rangeClosed(1, n)
                         .reduce(1, (a, b) -> a * b);
    }
}
