package project;

public class Student extends TicketSale { //BiletSatisi sınınfından kalıtım ile oluşturulan müşteri tipi öğrenci ise bilet tutarı ve iadesi için gerekli olan sınıf
    private int toplam2; //sınıfa ait nitelik
    public Student(int biletParasi){
        super(biletParasi);
    }//super() ile BiletSatisi sınıfından nitelik çağrılıyor
    public int getToplam2(){return toplam2;}
    public void setToplam2(int toplam2){this.toplam2 = toplam2;}
    //Bilet tutarı için olan niteliğin getter ve setter metotları
    public void ogrenciParasi(int biletSayisi) { //Müşteri tipi öğrenci olduğundan bilet tutarının
                                                 //değiştiği ve ödenecek tutarın hesaplandığı metot
        setBiletParasi(70);

        setToplam2(getBiletParasi() * biletSayisi);

        System.out.println("Odenecek Tutar = " +getToplam2());
    }

    public void iadeTutarOgrenci(int biletSayisi){ //Öğrenci biletinin iadesinin tutarını gösteren metot
        setBiletParasi(70);
        setToplam2(getBiletParasi() * biletSayisi);
        System.out.println("Iade Edilecek Tutar: "+getToplam2());
    }
}