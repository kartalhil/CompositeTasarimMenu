# Composite Tasarim Nedir? 

## COMPOSITE TASARIM DESENI
## Desenin Amacı:
Nesneleri ağaç yapısı oluşturacak şekilde birleştirir.Parça bütün ilişkisi kurar.

## Uygulanabilirlik: 
Aşağıdaki durumlarda bu deseni kullanın:
- Nesneler arasında parça bütün ilişkisi kurmak istiyorsanız.
- Parçalar ve parçalardan oluşan bütün arasında fark yoksa ve
hepsine eşit davranılacaksa.
## Katılımcılar:
- Component (Bileşen):Birleşimde bulunacak nesneler için arayüz
tanımlar. Alt bileşenlere erişimi ve onların yönetimini sağlar.
- Leaf(Yaprak):Birleşimdeki yaprak nesnelerini tanımlar. Hiçbir alt
bileşeni (çocuğu) yoktur.
- Composite (Bileşim): Alt bileşenleri (çocukları) olan bileşenleri
tanımlar. Alt bileşenleri depolar. Alt bileşenlerle ilgili işlemleri
gerçekleştirir.
- Client(İstemci): Bileşen arayüzü aracılığı ile bileşimdeki nesneler
üzerinde işlem yapar.
## Sonuçlar:
- Parça bütün ilişkisi kuran bir hiyerarşi oluşturur.
- İstemci tarafının basitleşmesini sağlar.
- Yeni değişik yapıda bileşenler eklemeyi kolaylaştırır.
## Kullanım Alanları:
- java.util.Map#putAll(Map)
- java.util.List#addAll(Collection)
- java.util.Set#addAll(Collection)
- java.nio.ByteBuffer#put(ByteBuffer) (also on CharBuffer, ShortBuffer,
IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
- java.awt.Container#add(Component) (Swing bileşenleri)
