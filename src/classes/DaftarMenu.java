package classes;
import java.util.ArrayList;
/*
    @author: Dian Slamet Saputra | XI RPL 1
 */
public class DaftarMenu {
    private ArrayList<Menu> daftarMenu;
    private int l;
    
    public DaftarMenu() {
        daftarMenu = new ArrayList<>();
    }
    
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }
    
    public void getMenuByKategori(String kategori) {
        System.out.println("======== " + kategori + " ========");
        
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)) {
                System.out.println((i + l) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }
    
    public void tampilDaftarMenu() {
        System.out.println("======== ALDEBARAMEN ========");
        getMenuByKategori("Ramen");
        getMenuByKategori("Kuah");
        getMenuByKategori("Toping");
        getMenuByKategori("Minuman");
    }
}
