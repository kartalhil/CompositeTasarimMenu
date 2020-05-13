
public class MenuOgesi {

  public static void main( final String[] args ) {

    final MenuSecenegi MenuSecenegi1 = new MenuSecenegi( "Hamburger", "Kutu İçicek", "25TL" );
    final MenuSecenegi MenuSecenegi2 = new MenuSecenegi( "Köfte Ekmek", "Kutu İçicek", "25TL" );
    final MenuSecenegi MenuSecenegi3 = new MenuSecenegi( "Tavuk Dürüm", "Kutu İçicek", "20TL" );
    final MenuSecenegi MenuSecenegi4 = new MenuSecenegi( "Hamburger","Patates" "Kutu İçicek", "30TL" );
    final MenuSecenegi MenuSecenegi5 = new MenuSecenegi( "Porsiyon Köfte", "Kutu İçicek", "30TL" );

    final MenuYöneticisi yönetici1 = new MenuYöneticisi();
    final MenuYöneticisi başYönetici = new MenuYöneticisi();

    yönetici1.MenuSecenegiEkle( MenuSecenegi1 );
    yönetici1.MenuSecenegiEkle( MenuSecenegi2 );
    yönetici1.MenuSecenegiEkle( MenuSecenegi3 );
    yönetici1.MenuSecenegiEkle( MenuSecenegi4 );
    yönetici1.MenuSecenegiEkle( MenuSecenegi5 );

    başYönetici.MenuSecenegiEkle( yönetici1 );

    // Ağaç yapısı üzerinde dolaşarak menü bilgileri yazdırılır.
    başYönetici.bilgiYazdır();
  }
}
