package JavaPatterns_2_1_Structural;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.pow(4, 6));
        System.out.println(intsCalc.mult(11, 17));
        System.out.println(intsCalc.sum(7, 8));
    }
}
