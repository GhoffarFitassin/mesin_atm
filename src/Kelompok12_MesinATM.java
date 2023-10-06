import java.util.Scanner;

public class Kelompok12_MesinATM {
    public static void main(String[] args) throws Exception {
        double saldo = 100000, tarik, tambah;
        int pilihan, pilihan2;
        Scanner input = new Scanner(System.in);
        String user, pw;
        String username = "admin";
        String password = "123";

        System.out.print("Masukkkan username: ");
        user = input.nextLine();
        System.out.print("Masukkkan password: ");
        pw = input.nextLine();

        if ((user.equals(username))) {
            if ((pw.equals(password))) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Password salah");
            }
        } else {
            System.out.println("Username salah");
        }


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
            System.out.println("=======================================");
            System.out.println("              Cek Saldo");
            System.out.println("=======================================");
            System.out.println("\n     Saldo Anda Saat Ini : " + saldo);
            System.out.println("\n=======================================");
            break;
            case 2:
            System.out.println("======================================");
            System.out.println("              Setor Tunai");
            System.out.println("======================================");
            System.out.print("\nNominal Yang Ingin Anda Setor: ");
            tambah = input.nextDouble();
            saldo += tambah;
            System.out.println("Jumlah Uang Yang Di Setor    : " + tambah);
            System.out.println("Saldo Saat Ini               : " + saldo);
            System.out.println("\n======================================");
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
                System.out.println("=================================================");
                System.out.println("                      Help                       ");
                System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                System.out.println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                System.out.println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
                System.out.println("6. Gunakan Menu ke-6 jika anda selesai menggunakan mesin ATM");
                // System.out.println("7. Saat penarikan, saldo minimal anda adalah Rp.500000");
                // System.out.println("8. Jika terdapat masalah pada mesin ATM hubungi 021-5437xxx");
                System.out.println("=================================================");
            break;
            case 6:
            System.exit(0);
            break;
            default:
            System.exit(0);
        }
        input.close();
    }
}
