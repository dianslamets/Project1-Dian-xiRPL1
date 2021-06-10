package classes;
/*
    @author: Dian Slamet Saputra | XI RPL 1
 */
public class Pesanan {
    private Menu menu;
    private int jumlah;
    private String keterangan;
    
    public Pesanan (Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }
    
    public void setKeterangan (String keterangan) { }
    
    public String getKeterangan() { return ""; }
    
    public Menu getMenu() {
        return menu;
    }
    
    public int getJumlah() {
        return jumlah;
    }
}
