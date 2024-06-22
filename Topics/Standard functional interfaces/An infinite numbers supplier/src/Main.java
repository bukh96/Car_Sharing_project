import java.util.function.*;

 class FunctionUtils {

     public static Supplier<Integer> getInfiniteRange() {
         return new Supplier<Integer>() {
             private Integer current = 0;

             @Override
             public Integer get() {
                 return current++;
             }
         };
     }
 }
