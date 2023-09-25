import java.util.Scanner;

public class Kelompok12_MesinATM {
    public static void main(String[] args) throws Exception {
        double saldo, tarik;
        int pilihan;
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("********** Bank Suka Maju **********");
        System.out.println("-----------------------------------");
        System.out.println("\n1.Cek Saldo");
        System.out.println("2.Simpan Uang");
        System.out.println("3.Ambil Uang");
        System.out.println("4.History Transaksi");
        System.out.println("5.Help");
        System.out.println("6.keluar");
        System.out.print("\nPilih Menu : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
            break;
            case 2:
            break;
            case 3:
            System.out.println("isi uang yang ingin ditarik");
            System.out.print("Isi nominal : ");
            tarik = input.nextDouble();
            saldo -= tarik;
            System.out.println("sisa saldo : " + saldo);
            System.out.println("jumlah uang yang ditarik : " + tarik);
            break;
            case 4:
            break;
            case 5:
            break;
            default:
            System.exit(0);
        }

    }
}
