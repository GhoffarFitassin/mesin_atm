import java.util.Scanner;

public class Kelompok12_MesinATM {
    public static void main(String[] args) throws Exception {
        double saldo = 100000, tarik, tambah;
        int pilihan;
        Scanner input = new Scanner(System.in);
        String user, pw;
        String username = "admin";
        String password = "123";

        System.out.println("========================================================================================");
        System.out.println("\t\r\n" + //
                "\t███╗   ███╗███████╗███████╗██╗███╗   ██╗     █████╗ ████████╗███╗   ███╗\r\n" + //
                "\t████╗ ████║██╔════╝██╔════╝██║████╗  ██║    ██╔══██╗╚══██╔══╝████╗ ████║\r\n" + //
                "\t██╔████╔██║█████╗  ███████╗██║██╔██╗ ██║    ███████║   ██║   ██╔████╔██║\r\n" + //
                "\t██║╚██╔╝██║██╔══╝  ╚════██║██║██║╚██╗██║    ██╔══██║   ██║   ██║╚██╔╝██║\r\n" + //
                "\t██║ ╚═╝ ██║███████╗███████║██║██║ ╚████║    ██║  ██║   ██║   ██║ ╚═╝ ██║\r\n" + //
                "\t╚═╝     ╚═╝╚══════╝╚══════╝╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝   ╚═╝   ╚═╝     ╚═╝\r\n" + //
                "\t                                                                        \r\n" + //
                "");
        System.out.println("========================================================================================");

        System.out.println("========== Login ==========");
        System.out.print("Masukkkan username: ");
        user = input.nextLine();
        System.out.print("Masukkkan password: ");
        pw = input.nextLine();
        System.out.println("===========================");

        if ((user.equals(username))) {
            if ((pw.equals(password))) {
                System.out.println("Login Berhasil");
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
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.exit(0);
                }
                input.close();
            } else {
                System.out.println("Password salah");
            }
        } else {
            System.out.println("Username salah");
        }

    }
}
