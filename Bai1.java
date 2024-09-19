import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        double n = Double.parseDouble(sc.nextLine());
        double sinValue = Math.sin(n);
        double cosValue = Math.cos(n);
        double squareRoot = Math.sqrt(n);
        System.out.println("sin:(" + n + ") = " +sinValue);
        System.out.println("cos:(" + n + ") = " +cosValue);
        System.out.println("square:(" + n + ") = " +squareRoot);
    }
}
