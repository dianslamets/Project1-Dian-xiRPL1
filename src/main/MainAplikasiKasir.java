package main;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Toping;
import java.util.Scanner;

/*
    @author: Dian Slamet Saputra | XI RPL 1
 */

public class MainAplikasiKasir {

    private static String nama_pemesan;
    
    public DaftarMenu daftarMenu;
    
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    
    
    public static void main(String[] args) {
        //init
        Scanner input = new Scanner(System.in);
        
        String no_transaksi, nama_pemesanan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;
        
        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();
        
        // mulai transaksi
        System.out.println("========== TRANSAKSI ==========");
        
        // ambil data transaksi
        System.out.println("No Transaksi : ");
        no_transaksi = input.next();
        System.out.print("Pemesan : ");
        nama_pemesan = input.next();
        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.print("Makan ditempat? [Y/N] ");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")) {
            System.out.print("Nomor Meja : ");
            no_meja = input.next();
        }
        
    }
    
    public void generateDaftarMenu() {
        DaftarMenu daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen SeaFood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stoberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
        
        daftarMenu.tampilDaftarMenu();
    }
}