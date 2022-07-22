package ch7;

public class UnsignedIntegerArithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = -6;

        int resultDivide = Integer.divideUnsigned(a, b);
        int compareUnsigned = Integer.compareUnsigned(c, a);
        int resultRemainder = Integer.remainderUnsigned(b, a);

        System.out.println("divide:" + resultDivide);
        System.out.println("compare:" + compareUnsigned);
        System.out.println("resultRemainder:" + resultRemainder);
    }
}
