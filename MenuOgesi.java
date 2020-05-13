
public class MenuSecenegi implements MenuBilgisi {

 private final String  MenuAdi;
 private final String  icecek;
 private final String  fiyat;


 public MenuSecenegi( final String MenuAdi, final String icecek, final String fiyat ) {
   this.MenuAdi = MenuAdi;
   this.icecek = icecek;
   this.fiyat = fiyat;
 }

 @Override
 public void bilgiYazdır() {
   System.out.println( "MenuAdi: " + MenuAdi + ", İçecek: " + icecek + ", Fiyat: " + fiyat);
 }
}
