package project;

	import java.util.Scanner;
	public class Customer extends People { //Kisi sınıfından kalıtım ile oluşturulan Müşteri sınıfı
		
		private String musteriTipi;
	
		Scanner sc = new Scanner(System.in);
		
		public Customer(String ad, String soyad, String dogumTarihi, String ePosta, String telefon, String id, String sifre, String tc) {
			
			super(ad,soyad,dogumTarihi,ePosta,telefon,id,sifre,tc); //super() ile Kişi sınıfının nitelikleri çağrılıyor
		}
		
		public Customer(String musteriTipi) {
			this.musteriTipi = musteriTipi;
		}
		//Müşteri sınıfına ait constructor
		public Customer() {
		}
		
		public String getMusteriTipi() {
			return musteriTipi;
		}

		public void setMusteriTipi(String musteriTipi) {
			this.musteriTipi = musteriTipi;
		}

		public void BilgileriGetir() { //çalışan bilgilerini alan metot

			super.uyeOl(getTc()); //Kişi sınıfından parametreli çağrılan metot	
			
			System.out.print("Musteri tipini girin(tam/ogrenci) : ");
			musteriTipi=sc.next();
			
			System.out.println("Kullanici Bilgileriniz: ");
			System.out.println("AD: "+getAd());
			System.out.println("SOYAD: "+getSoyad());
			System.out.println("BILET TURU: "+getMusteriTipi());
			System.out.println("DOGUM TARIHI: "+getDogumTarihi());
			System.out.println("E-POSTA: "+getePosta());
			System.out.println("TELEFON: "+getTelefon());
			System.out.println("MUSTERI NUMARANIZ: "+getTc());
		}
		public void uyelikTamamlama()  //Müşteri üye bilgilerinin çıktısını veren metot.Metot overriding yapılmıştır.
		{
			System.out.println("Kullanici uyeliginiz basariyla tamamlanmistir.Uyelik sifreniz asagidadir.");
			System.out.println("Sifreniz : 1234");
		}
		public void giris() //Müşteri girişinin yapıldığı metot 
		{
			super.giris(getTc());  //Kişi sınıfından parametreli çağrılan olarak metot
		}
}
