package com.github.affandes.kuliah.pm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistory browser = new BrowserHistory();
        
        System.out.println("=== BROWSER HISTORY SIMULATOR ===");
        System.out.println("Dibuat oleh: Aidil Pramadita Putra");
        
        while (true) {
            displayMenu();
            System.out.print("Pilih menu (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    browser.view();
                    break;

                case "2":
                    System.out.print("Masukkan URL website: ");
                    String website = scanner.nextLine();
                    browser.browse(website);
                    break;

                case "3":
                    browser.back();
                    break;

                case "4":
                    System.out.println("Website saat ini: " + browser.getCurrentWebsite());
                    System.out.println("Total history: " + browser.getHistoryCount());
                    break;

                case "5":
                    System.out.print("Yakin ingin menghapus semua history? (y/n): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        browser.clearHistory();
                    }
                    break;

                case "6":
                    System.out.println("Terima kasih telah menggunakan Browser History Simulator!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-6.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- MENU BROWSER HISTORY ---");
        System.out.println("1. View History");
        System.out.println("2. Browse Website Baru");
        System.out.println("3. Back (Kembali ke sebelumnya)");
        System.out.println("4. Info Website Saat Ini");
        System.out.println("5. Clear All History");
        System.out.println("6. Keluar");
    }
}