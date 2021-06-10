package classes;

import java.util.ArrayList;

/*
    @author: Dian Slamet Saputra | XI RPL 1
 */
public class Transaksi {
    private String noTranksaksi;
    private String namaPemesan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    private double biayaService=0;
    
    public Transaksi (String no_transaksi, String nm_pemesan, String tanggal, String no_meja) {
        this.noTranksaksi = no_transaksi;
        this.namaPemesan = nm_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;
        
        pesanan = new ArrayList<>();
    }
    
    public void tambahPesanan (Pesanan pesanan) {
        this.pesanan.add(pesanan);
    }
     
    public ArrayList<Pesanan> getSemuaPesanan() {
        return pesanan;
    }
    
    public double hitungTotalBayar() { return 0; }
    
    public double hitungKembalian() { return 0; }
    
    public void cetakStruk() { }
}
