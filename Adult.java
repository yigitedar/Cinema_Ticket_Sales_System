package project;

public class Adult extends TicketSale {  //BiletSatisi sınıfından kalıtım ile oluşturulan müşteri tipi tam ise bilet tutarı ve iadesi için gerekli olan sınıf
    private int toplam3; //sınıfa ait nitelik
    public Adult(int biletParasi){
        super(biletParasi);
    }//super() ile BiletSatisi sınıfından nitelik çağrılıyor
    public int getToplam3(){return toplam3;}
    public void setToplam3(int toplam3){this.toplam3 = toplam3;}
    //Bilet tutarı için olan niteliğin getter ve setter metotları
    public void tamParasi(int biletSayisi) { //Müşteri tipi tam olduğundan bilet tutarının
                                             //değiştiği ve ödenecek tutarın hesaplandığı metot
        setBiletParasi(120);

        setToplam3(getBiletParasi() * biletSayisi);

        System.out.println("Odenecek Tutar = " + getToplam3());
    }
    public void iadeTutarTam(int biletSayisi){  //Tam biletinin iadesinin tutarını gösteren metot
        setBiletParasi(120);
        setToplam3(getBiletParasi() * biletSayisi);
        System.out.println("Iade Edilecek Tutar: "+getToplam3());
    }

}