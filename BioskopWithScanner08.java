import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Daftar Menu");
            System.out.println("1. Input Penonton");
            System.out.println("2. Tampilkan daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            if (baris >= 1 && baris <= 4 &&
                                    kolom >= 1 && kolom <= 2) {
                                if (penonton[baris - 1][kolom - 1] == null) {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    break;
                                } else {
                                    System.out.println("Kursi sudah terisi!");
                                    System.out.println("Silakan pilih kursi lain.");
                                }
                            } else {
                                System.out.println("Nomor baris atau kolom tidak tersedia!");
                            }
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.next();
                        sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terimakasih");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }
}