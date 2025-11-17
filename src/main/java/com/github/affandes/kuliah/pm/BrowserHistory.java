package com.github.affandes.kuliah.pm;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> historyStack;
    private Stack<String> backStack;

    public BrowserHistory() {
        historyStack = new Stack<>();
        backStack = new Stack<>();
    }

    public void view() {
        if (historyStack.isEmpty()) {
            System.out.println("History browser kosong.");
            return;
        }

        System.out.println("\n=== BROWSER HISTORY ===");
        Stack<String> tempStack = (Stack<String>) historyStack.clone();
        Stack<String> displayStack = new Stack<>();

        while (!tempStack.isEmpty()) {
            displayStack.push(tempStack.pop());
        }

        int count = 1;
        while (!displayStack.isEmpty()) {
            System.out.println(count + ". " + displayStack.pop());
            count++;
        }
        System.out.println("=======================\n");
    }

    public void browse(String website) {
        if (website == null || website.trim().isEmpty()) {
            System.out.println("URL website tidak valid!");
            return;
        }

        if (!website.startsWith("http://") && !website.startsWith("https://")) {
            website = "https://" + website;
        }

        historyStack.push(website);
        backStack.clear(); 
        System.out.println("Berhasil membuka: " + website);
    }

    public void back() {
        if (historyStack.size() <= 1) {
            System.out.println("Tidak bisa kembali, history tidak cukup!");
            return;
        }

        String currentSite = historyStack.pop();
        backStack.push(currentSite);
        String previousSite = historyStack.peek();

        System.out.println("Kembali ke: " + previousSite);
        System.out.println("Menutup: " + currentSite);
    }

    public String getCurrentWebsite() {
        if (historyStack.isEmpty()) {
            return "Tidak ada website yang aktif";
        }
        return historyStack.peek();
    }

    public int getHistoryCount() {
        return historyStack.size();
    }
    
    public void clearHistory() {
        historyStack.clear();
        backStack.clear();
        System.out.println("Semua history telah dihapus!");
    }
}