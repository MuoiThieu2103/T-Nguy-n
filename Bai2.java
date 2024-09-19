import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();
        int sokituchuoi = chuoi.length();
        System.out.print("So ki tu cua chuoi la: " + sokituchuoi);
    }
}
