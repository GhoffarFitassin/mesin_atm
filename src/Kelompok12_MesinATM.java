import java.util.Scanner;
import java.util.Date;

public class Kelompok12_MesinATM {
    static Date now = new Date();
    static String[][] arrDate = {};
    static String mutasi = "";
    static int pin, noRek, transfer = 0, countDate = 0, saldo = -1, Rek = 0, masuk = 0, tf = 0, keluar = 0, pilihan, pilihan2, duit = 0;
    static String pins;
    static boolean backLogin = true;
    static boolean isMenu = true;
    static boolean toLogin = false;
    static boolean toRek = false;
    static Scanner input = new Scanner(System.in);

    // account
    static int[][] account = {
            { 123, 100000, 123456 },
            { 321, 500000, 234567 },
            { 231, 200000, 345678 }
    };
    // accound

    public static void main(String[] args) throws Exception {

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
        Login();
        input.close();
    }

    // function login
    public static void Login() {

        int counter = 0;

        do {
            if (counter == 5) {
                break;
            }
            saldo = -1;
            masuk = 0;
            keluar = 0;
            toLogin = false;

            // input login
            System.out.println("========== Login ==========");
            pin = getStringNumber("Masukkan PIN : ");
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

        Menu();
    }

    // function menu
    public static void Menu() {
        int[] tf_saldo = new int[10];
        // menu area
        while (toLogin == true) {
            System.out.println("");
            loop: do {
                System.out.println("************************************");
                System.out.println("|          Bank Suka Maju          |");
                System.out.println("************************************");
                pilihan = getPickMenu(new String[] {
                        "Cek Saldo",
                        "Simpan Uang",
                        "Ambil Uang",
                        "Transfer",
                        "History Transaksi",
                        "Help",
                        "keluar"
                });
                switch (pilihan) {
                    // case 1 cek saldo
                    case 1 -> {
                        do {
                            System.out.println("=======================================");
                            System.out.println("|               Cek Saldo             |");
                            System.out.println("=======================================");
                            System.out.println("\n     Saldo Anda Saat Ini : " + account[saldo][1]);
                            System.out.println("=======================================");
                            pilihan2 = getPickMenu(new String[] {
                                    "Keluar",
                                    "Kembali"
                            });
                            switch (pilihan2) {
                                case 1 -> {
                                    toLogin = false;
                                    break loop;
                                }
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 2 setor tunai
                    case 2 -> {
                        do {
                            System.out.println("======================================");
                            System.out.println("|             Setor Tunai            |");
                            System.out.println("======================================");
                            System.out.println("Nominal Yang Ingin Anda Setor ");
                            duit = getStringNumber("Isi Nominal : ");
                            account[saldo][1] += duit;
                            mutasi = "Setor";
                            countDate++;
                            dateTime();
                            System.out.println("Jumlah Uang Yang Di Setor : " + duit);
                            System.out.println("Saldo Saat Ini : " + account[saldo][1]);
                            System.out.println("======================================");
                            pilihan2 = getPickMenu(new String[] {
                                    "Keluar",
                                    "Kembali"
                            });
                            switch (pilihan2) {
                                case 1 -> {
                                    toLogin = false;
                                    break loop;
                                }
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 3 tarik uang tunai
                    case 3 -> {
                        do {
                            System.out.println("======================================");
                            System.out.println("|             Tarik Tunai            |");
                            System.out.println("======================================");
                            System.out.println("Nominal Yang Ingin Anda Tarik");
                            duit = getStringNumber("Isi Nominal : ");
                            account[saldo][1] -= duit;
                            mutasi = "Tarik";
                            countDate++;
                            dateTime();
                            System.out.println("sisa saldo : " + account[saldo][1]);
                            System.out.println("jumlah uang yang ditarik : " + duit);
                            System.out.println("======================================");
                            pilihan2 = getPickMenu(new String[] {
                                    "Keluar",
                                    "Kembali"
                            });
                            switch (pilihan2) {
                                case 1 -> {
                                    toLogin = false;
                                    break;
                                }
                            }
                            break;
                        } while (pilihan2 != 2);

                    }
                    case 4 -> {
                        do {
                           System.out.println("======================================");
                           System.out.println("|              Transfer              |");
                           System.out.println("======================================");
                           System.out.println("============= No. Rekening ===========");
                           noRek = getStringNumber("Masukkan No. Rek : ");
                           System.out.println("==================================");
                           for (int a = 0; a < account.length; a++) {
                               if (noRek == account[a][2]) {
                               Rek = a;
                               toRek = true;                               
                               break;
                           }
                           }
                           if (toRek == true) {
                           System.out.println("sisa saldo : " + account[saldo][1]);
                           System.out.print("isi nominal yang ingin di transfer : ");                            
                           transfer = input.nextInt();
                           tf_saldo[tf] = transfer;
                           tf++;
                           account[saldo][1] -= transfer;
                           account[Rek][1] += transfer;
                           System.out.println("jumlah uang yang ditransfer : " + transfer);
                           System.out.println("======================================");
                            } else {
                               System.out.println("No rekening tidak di temukan");
                            }                                                          
                           input.nextLine();
                           pilihan2 = getPickMenu(new String[] {
                                   "Keluar",
                                   "Kembali"
                           });
                           switch (pilihan2) {
                               case 1 -> {
                                   toLogin = false;
                                   break;
                               }
                           }
                           break;
                       } while (pilihan2 != 2);

                   }
                    // case 5 histori transaksi
                    case 5 -> {
                        do {
                            pins = Integer.toString(pin);
                            System.out.println("=================================================================");
                            System.out.println("|                       Histori transaksi                       |");
                            System.out.println("=================================================================");
                            for (int i = 0; i < arrDate.length; i++) {
                                if (arrDate[i][0].equals(pins)) {
                                    System.out.print((i + 1) + " ");
                                    for (int j = 0; j < arrDate[i].length; j++) {
                                        System.out.print(arrDate[i][j] + "   ");
                                    }
                                    System.out.println();
                                }
                            }
                            System.out.println("=================================================================");
                            pilihan2 = getPickMenu(new String[] {
                                    "Keluar",
                                    "Kembali"
                            });
                            switch (pilihan2) {
                                case 1 -> {
                                    toLogin = false;
                                    break loop;
                                }
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 5 fitur help
                    case 6 -> {
                        do {
                            System.out.println("=================================================");
                            System.out.println("|                     Help                      |");
                            System.out.println("=================================================");
                            System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                            System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                            System.out
                                    .println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                            System.out
                                    .println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
                            System.out.println("6. Gunakan Menu ke-6 jika anda selesai menggunakan mesin ATM");
                            pilihan2 = getPickMenu(new String[] {
                                    "Keluar",
                                    "Kembali"
                            });
                            switch (pilihan2) {
                                case 1 -> {
                                    toLogin = false;
                                    break loop;
                                }
                            }
                        } while (pilihan2 != 2);
                    }
                    // case 6 logout
                    case 7 -> {
                        toLogin = false;
                    }
                }
            } while (!toLogin == false);
            Login();
        }
    }

    static int getStringNumber(String promt) {
        String pilih;
        int pil;
        while (true) {
            try {
                System.out.print(promt);
                pilih = input.nextLine().trim();
                if (pilih.isEmpty()) {
                    System.out.println("Input Tidak Boleh Kosong");
                    continue;
                }
                pil = Integer.parseInt(pilih);
                return pil;
            } catch (Exception e) {
                System.out.println("Harus Angka!!");
                continue;
            }
        }
    }

    static int getPickMenu(String[] menu) {
        int pil;
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        while (true) {
            pil = getStringNumber("PIlih Menu : ");
            if (!(1 > pil || menu.length < pil)) {
                return pil;
            }
            System.out.println("Menu tidak tersedia");
        }
    }

    static void dateTime() {
        String[][] dateNow = new String[countDate][4];
        for (int i = 0; i < arrDate.length; i++) {
            for (int j = 0; j < arrDate[i].length; j++) {
                dateNow[i][j] = arrDate[i][j];
            }
        }
        arrDate = dateNow;

        arrDate[countDate - 1][0] = Integer.toString(account[saldo][0]);
        arrDate[countDate - 1][1] = mutasi;
        arrDate[countDate - 1][2] = Integer.toString(duit);
        arrDate[countDate - 1][3] = String.valueOf(now);

    }
}