import java.util.Scanner;

public class Kelompok12_MesinATM {
    public static void main(String[] args) throws Exception {
        double saldo, tarik;
        Scanner input = new Scanner(System.in);
        System.out.println("isi saldo");
        System.out.print("Isi nominal : ");
        saldo = input.nextDouble();
        System.out.println("isi uang yang ingin ditarik");
        System.out.print("Isi nominal : ");
        tarik = input.nextDouble();
        saldo -= tarik;
        System.out.println("sisa saldo : " + saldo);
        System.out.println("jumlah uang yang ditarik : " + tarik);
    }
}
