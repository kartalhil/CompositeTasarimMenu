import java.util.ArrayList;
import java.util.List;

public class MenuYöneticisi implements MenuBilgisi {

  private final List< MenuBilgisi >  menuBilesenleri  = new ArrayList< MenuBilgisi >();

  @Override
  public void bilgiYazdır() {
    for ( final MenuBilgisi MenuSecenegi : menuBilesenleri ) {
      MenuSecenegi.bilgiYazdır();
    }
  }

  public void Ekle( final MenuBilgisi menuComponent ) {
    menuBilesenleri.add( menuComponent );
  }

  public void Çıkar( final MenuBilgisi menuComponent ) {
    menuBilesenleri.remove( menuComponent );
  }
}
