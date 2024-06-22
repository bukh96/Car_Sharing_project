import java.util.function.*;


class Operator {


    public static LongBinaryOperator binaryOperator = (x, y) -> {
        long result = 1L;
        for (long i = x; i <= y; i++) {
            result *= x;
            x++;
        }
        return result;
    };
}