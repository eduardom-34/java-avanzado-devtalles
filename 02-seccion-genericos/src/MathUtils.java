public class MathUtils {
    public static <T extends Number> double saum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}
