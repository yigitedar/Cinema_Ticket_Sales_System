package project;
import java.util.Scanner;

public class Worker extends People { //Kisi sınıfından kalıtım ile oluşturulan Çalışan sınıfı
	
	public Worker(String ad, String soyad, String dogumTarihi, String ePosta, String telefon, String id, String sifre, String tc) {
		
		super(ad,soyad,dogumTarihi,ePosta,telefon,id,sifre,tc); //super() ile Kişi sınıfının nitelikleri çağrılıyor
	}
		Scanner scanner = new Scanner(System.in);

		public Worker() {
			
		}
		public void CalisanBilgileriGetir() { //çalışan bilgilerini alan metot
			
			super.uyeOl();	//Kişi sınıfından parametresiz çağrılan metot		
			System.out.println("Calisan Bilgileriniz: ");
			System.out.println("AD: "+getAd());
			System.out.println("SOYAD: "+getSoyad());
			System.out.println("DOGUM TARIHI: "+getDogumTarihi());
			System.out.println("E-POSTA: "+getePosta());
			System.out.println("TELEFON: "+getTelefon());
		}
		public void uyelikTamamlama() //Çalışan üye bilgilerinin çıktısını veren metot.Metot overriding yapılmıştır.
		{
			System.out.println("Calisan uyeliginiz basariyla tamamlanmistir.Giris bilgileriniz asagidadir.");
			System.out.println("Calisan ID :  "+"calisan");
			System.out.println("Calisan Parola : "+"123");
		}
		public void giris() //Çalışan girişinin yapıldığı metot 
	    {
	    	super.giris(); //Kişi sınıfından parametresiz çağrılan metot
	    }
}
