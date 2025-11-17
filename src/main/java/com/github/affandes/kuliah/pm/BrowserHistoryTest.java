package com.github.affandes.kuliah.pm;
public class BrowserHistoryTest {
    public static void main(String[] args) {
        System.out.println("=== TESTING BROWSER HISTORY ===\n");
        
        BrowserHistory browser = new BrowserHistory();

        System.out.println("Test 1: Menambahkan website ke history");
        browser.browse("google.com");
        browser.browse("github.com");
        browser.browse("stackoverflow.com");
        browser.view();

        System.out.println("Test 2: Menggunakan fungsi back");
        browser.back();
        browser.view();

        System.out.println("Test 3: Browse website baru setelah back");
        browser.browse("youtube.com");
        browser.view();

        System.out.println("Test 4: Multiple back operations");
        browser.back();
        browser.back();
        browser.view();

        System.out.println("Test 5: Browse dengan URL lengkap");
        browser.browse("https://www.oracle.com/java");
        browser.view();

        System.out.println("=== TESTING SELESAI ===");
    }
}