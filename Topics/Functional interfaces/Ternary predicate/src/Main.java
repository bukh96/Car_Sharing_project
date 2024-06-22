class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = ((i, y, x) -> i != x && y != i && y != x ? true : false);

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int i, int y, int x);
    }
}