import java.util.Scanner;

public class Kelompok12_MesinATM {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        double saldo = 100000, tarik = 0, tambah = 0;
        int pw, pilihan, pilihan2, masuk = 0, keluar = 0;
        double[] tambah_saldo = new double[10], tarik_saldo = new double[10];
        String user;
        String username = "admin";
        int password = 123;

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
        pw = input.nextInt();
        System.out.println("===========================");

        if ((user.equals(username))) {
            if (pw == password) {
                System.out.println("Login Berhasil");
                System.out.println("");
                while (true) {

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
                            do {
                                System.out.println("=======================================");
                                System.out.println("              Cek Saldo");
                                System.out.println("=======================================");
                                System.out.println("\n     Saldo Anda Saat Ini : " + saldo);
                                System.out.println("=======================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = input.nextInt();
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            } while (pilihan2 != 2);
                            break;
                        case 2:
                            do {
                                System.out.println("======================================");
                                System.out.println("              Setor Tunai");
                                System.out.println("======================================");
                                System.out.print("\nNominal Yang Ingin Anda Setor: ");
                                tambah = input.nextDouble();
                                tambah_saldo[masuk] = tambah;
                                masuk++;
                                saldo += tambah;
                                System.out.println("Jumlah Uang Yang Di Setor    : " + tambah);
                                System.out.println("Saldo Saat Ini               : " + saldo);
                                System.out.println("======================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = input.nextInt();
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;
                                }
                            } while (pilihan2 != 2);
                            break;
                        case 3:
                            do {
                                System.out.println("======================================");
                                System.out.println("              tarik uang Tunai");
                                System.out.println("======================================");
                                System.out.println("isi uang yang ingin ditarik");
                                System.out.print("Isi nominal : ");
                                tarik = input.nextDouble();
                                tarik_saldo[keluar] = tarik;
                                keluar++;
                                saldo -= tarik;
                                System.out.println("sisa saldo : " + saldo);
                                System.out.println("jumlah uang yang ditarik : " + tarik);
                                System.out.println("======================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = input.nextInt();
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;
                                }
                                break;
                            } while (pilihan2 != 2);

                            break;
                        case 4:
                            do {
                                System.out.println("======================================");
                                System.out.println("\t\tHistori transaksi");
                                System.out.println("======================================");
                                System.out.println("Saldo Masuk");
                                for (int in = 0; in < masuk; in++) {
                                    System.out.println((in + 1) + " " + tambah_saldo[in]);
                                }
                                System.out.println("Saldo Keluar");
                                for (int out = 0; out < masuk; out++) {
                                    System.out.println((out + 1) + " " + tarik_saldo[out]);
                                }
                                System.out.println("======================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = input.nextInt();
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;
                                }
                            } while (pilihan2 != 2);
                            break;
                        case 5:
                            do {
                                System.out.println("=================================================");
                                System.out.println("                      Help                       ");
                                System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                                System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                                System.out.println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                                System.out.println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
                                System.out.println("6. Gunakan Menu ke-6 jika anda selesai menggunakan mesin ATM");
                                // System.out.println("7. Saat penarikan, saldo minimal anda adalah Rp.500000");
                                // System.out.println("8. Jika terdapat masalah pada mesin ATM hubungi
                                // 021-5437xxx");
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = input.nextInt();
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            } while (pilihan2 != 2);
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.exit(0);

                    }
                }
            } else {
                System.out.println("Password salah");
            }
        } else

        {
            System.out.println("Username salah");
        }
        input.close();
    }
}
