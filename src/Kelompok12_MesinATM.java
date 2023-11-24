import java.util.Scanner;

public class Kelompok12_MesinATM {
    static int pin, baris = 5, saldo = -1, masuk = 0, keluar = 0, pilihan, pilihan2;
    static int tarik = 0, tambah = 0;
    static boolean backLogin = true;
    static boolean isMenu = true;
    static boolean toLogin = false;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Login();
        input.close();
    }

    // function login
    public static void Login() {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int[][] account = new int[baris][2];

        // akun
        account[0][0] = 123;
        account[0][1] = 100000;

        account[1][0] = 321;
        account[1][1] = 500000;

        account[2][0] = 231;
        account[2][1] = 200000;

        do {
            if (counter == 5) {
                break;
            }
            saldo = -1;
            masuk = 0;
            keluar = 0;
            counter = 0;
            toLogin = false;
            System.out.println(
                    "========================================================================================");
            System.out.println("\t\r\n" + //
                    "\t███╗   ███╗███████╗███████╗██╗███╗   ██╗     █████╗ ████████╗███╗   ███╗\r\n" + //
                    "\t████╗ ████║██╔════╝██╔════╝██║████╗  ██║    ██╔══██╗╚══██╔══╝████╗ ████║\r\n" + //
                    "\t██╔████╔██║█████╗  ███████╗██║██╔██╗ ██║    ███████║   ██║   ██╔████╔██║\r\n" + //
                    "\t██║╚██╔╝██║██╔══╝  ╚════██║██║██║╚██╗██║    ██╔══██║   ██║   ██║╚██╔╝██║\r\n" + //
                    "\t██║ ╚═╝ ██║███████╗███████║██║██║ ╚████║    ██║  ██║   ██║   ██║ ╚═╝ ██║\r\n" + //
                    "\t╚═╝     ╚═╝╚══════╝╚══════╝╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝   ╚═╝   ╚═╝     ╚═╝\r\n" + //
                    "\t                                                                        \r\n" + //
                    "");
            System.out.println(
                    "========================================================================================");

            // input login
            System.out.println("========== Login ==========");
            System.out.print("Masukkkan PIN: ");
            pin = input.nextInt();
            System.out.println("===========================");

            // pengecekan akun
            for (int a = 0; a < account.length; a++) {
                if (pin == account[a][0]) {
                    saldo = a;
                    toLogin = true;
                    break;
                }
            }
            if (toLogin == true) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("PIN salah");
            }
            counter++;
        } while (toLogin != true);

        Menu(account);
    }

    // function menu
    public static void Menu(int[][] account) {
        Scanner input = new Scanner(System.in);
        int[] tambah_saldo = new int[10], tarik_saldo = new int[10];
        // menu area
        while (toLogin == true) {
            System.out.println("");
            loop: do {
                System.out.println("------------------------------------");
                System.out.println("********** Bank Suka Maju **********");
                System.out.println("------------------------------------");
                System.out.println("\n1.Cek Saldo");
                System.out.println("2.Simpan Uang");
                System.out.println("3.Ambil Uang");
                System.out.println("4.History Transaksi");
                System.out.println("5.Help");
                System.out.println("6.keluar");
                System.out.print("\nPilih Menu : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    // case 1 cek saldo
                    case 1 -> {
                        do {
                            System.out.println("=======================================");
                            System.out.println("              Cek Saldo");
                            System.out.println("=======================================");
                            System.out.println("\n     Saldo Anda Saat Ini : " + account[saldo][1]);
                            System.out.println("=======================================");
                            System.out.println("\n1.keluar");
                            System.out.println("2.Kembali");
                            System.out.print("\nPilih Menu : ");
                            pilihan2 = input.nextInt();
                            switch (pilihan2) {
                                case 1:
                                    toLogin = false;
                                    break loop;

                            }
                        } while (pilihan2 != 2);
                    }
                    // case 2 setor tunai
                    case 2 -> {
                        do {
                            System.out.println("======================================");
                            System.out.println(" Setor Tunai");
                            System.out.println("======================================");
                            System.out.print("\nNominal Yang Ingin Anda Setor: ");
                            tambah = input.nextInt();
                            tambah_saldo[masuk] = tambah;
                            masuk++;
                            account[saldo][1] += tambah;
                            System.out.println("Jumlah Uang Yang Di Setor : " + tambah);
                            System.out.println("Saldo Saat Ini : " + account[saldo][1]);
                            System.out.println("======================================");
                            System.out.println("\n1.keluar");
                            System.out.println("2.Kembali");
                            System.out.print("\nPilih Menu : ");
                            pilihan2 = input.nextInt();
                            switch (pilihan2) {
                                case 1:
                                    toLogin = false;
                                    break loop;
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 3 tarik uang tunai
                    case 3 -> {
                        do {
                            System.out.println("======================================");
                            System.out.println(" tarik uang Tunai");
                            System.out.println("======================================");
                            System.out.println("isi uang yang ingin ditarik");
                            System.out.print("Isi nominal : ");
                            tarik = input.nextInt();
                            tarik_saldo[keluar] = tarik;
                            keluar++;
                            account[saldo][1] -= tarik;
                            System.out.println("sisa saldo : " + account[saldo][1]);
                            System.out.println("jumlah uang yang ditarik : " + tarik);
                            System.out.println("======================================");
                            System.out.println("\n1.keluar");
                            System.out.println("2.Kembali");
                            System.out.print("\nPilih Menu : ");
                            pilihan2 = input.nextInt();
                            switch (pilihan2) {
                                case 1:
                                    toLogin = false;
                                    break;
                            }
                            break;
                        } while (pilihan2 != 2);

                    }
                    // case 4 histori transaksi
                    case 4 -> {
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
                                    toLogin = false;
                                    break loop;
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 5 fitur help
                    case 5 -> {
                        do {
                            System.out.println("=================================================");
                            System.out.println("                      Help                       ");
                            System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                            System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                            System.out
                                    .println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                            System.out
                                    .println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
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
                                    toLogin = false;
                                    break loop;
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 6 logout
                    case 6 -> {
                        toLogin = false;
                    }
                }
            } while (!toLogin == false);
            Login();
        }
    }
}