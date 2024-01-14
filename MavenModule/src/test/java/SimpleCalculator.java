public class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int i, int i1) {
        if (i1 == 0) {
            return 0;

        } else
            return i / i1;
    }


    @Override
    public int multiply(int i, int i1) {
        return i * i1;
    }

    @Override
    public int subtract(int i, int i1) {
        return i - i1;
    }
}
