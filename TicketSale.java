package project;

import java.util.Scanner;

public class TicketSale extends Customer { //Müşteri sınıfından kalıtım ile oluşturulan bilet satışı ve iadesinin yapılabildiği sınıf
	//sınıfa ait nitelikler	---	nitelikler private olduğundan sadece sınıf içinde erişime açıktır
	private String odemeTipi;
	private String kartNo;
	private String kartIsmi;
	private String kartSoyismi;
	private int biletSayisi;
	private int biletParasi;
	private String IBAN;

	Scanner sc = new Scanner(System.in);

	public TicketSale(String musteriTipi) {
		super(musteriTipi);
	}//super() ile musteri sınıfından nitelik çağrılıyor

	//BiletSatisi sınıfına ait biletParasi için constructor
	public TicketSale(int biletParasi) {
		this.biletParasi = biletParasi;
	}
	public TicketSale(String ad, String soyad, String dogumTarihi, String ePosta, String telefon, String id,    //BiletSatisi sınıfına ait constructor
					  String sifre, String tc, String odemeTipi, String kartNo, String kartIsmi, String kartSoyismi,
					  int biletSayisi, String iBAN) {
		super(ad, soyad, dogumTarihi, ePosta, telefon, id, sifre, tc);
		this.odemeTipi = odemeTipi;
		this.kartNo = kartNo;
		this.kartIsmi = kartIsmi;
		this.kartSoyismi = kartSoyismi;
		this.biletSayisi = biletSayisi;
		IBAN = iBAN;
	}

	//nitelikleri almak ve üzerine yazdırmak için gerekli olan getter ve setter metotları
	public int getBiletParasi() {
		return biletParasi;
	}
	public void setBiletParasi(int biletParasi) {
		this.biletParasi = biletParasi;
	}
	
	public String getKartSoyismi() {
		return kartSoyismi;
	}

	public void setKartSoyismi(String kartSoyismi) {
		this.kartSoyismi = kartSoyismi;
	}

	public String getKartNo() {
		return kartNo;
	}
	public void setKartNo(String kartNo) {
		this.kartNo = kartNo;
	}
	public String getKartIsmi() {
		return kartIsmi;
	}
	public void setKartIsmi(String kartIsmi) {
		this.kartIsmi = kartIsmi;
	}
	public String getOdemeTipi() {
		return odemeTipi;
	}
	public void setOdemeTipi(String odemeTipi) {
		this.odemeTipi = odemeTipi;
	}
	public int getBiletSayisi() {
		return biletSayisi;
	}
	public void setBiletSayisi(int biletSayisi) {
		this.biletSayisi = biletSayisi;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}

	public TicketSale() { //hata vermemesi için boş constructor
	}

	public void OdemeTipi(String musteriTipi) { //Ödeme tipinin ve ödenecek bilet tutarının gösterildiği metot
		
		Student studentMoney = new Student(biletParasi);
		Adult adultMoney = new Adult(biletParasi);

		System.out.print("Odeme Tipini Girin(kart/havale): ");
		setOdemeTipi(sc.nextLine());

		if (getOdemeTipi().equals("havale")) {  //eğer müşteri havale işlemini seçerse istenecek bilgiler
			System.out.print("Bilet sayisini girin: ");
			setBiletSayisi(sc.nextInt());

			System.out.print("IBAN girin: ");
			setIBAN(sc.next());

			if (musteriTipi.equals("ogrenci")) {
				studentMoney.ogrenciParasi(biletSayisi); //eğer müşteri tipi öğrenci ise bilet tutarının gösterilmesi için gerekli olan metot
			} else if (musteriTipi.equals("tam")) {
				adultMoney.tamParasi(biletSayisi);  //eğer müşteri tipi tam ise bilet tutarının gösterilmesi için gerekli olan metot
			}
		} else if (getOdemeTipi().equals("kart")) { //eğer müşteri kart işlemini seçerse istenecek bilgiler
			System.out.println("Bilet Sayisini Girin: ");
			setBiletSayisi(sc.nextInt());

			System.out.println("Kart Sahibinin Adini Girin: ");
			setKartIsmi(sc.next());
			
			System.out.println("Kart Sahibinin Soyadini Girin: ");
			setKartSoyismi(sc.next());
			
			System.out.println("Kart Numarasini Girin: ");
			setKartNo(sc.next());

			System.out.println("-----------------");

			if (musteriTipi.equals("ogrenci")) 
			{
				studentMoney.ogrenciParasi(biletSayisi);//eğer müşteri tipi öğrenci ise bilet tutarının gösterilmesi için gerekli olan metot
			} 
			else if (musteriTipi.equals("tam")) 
			{
				adultMoney.tamParasi(biletSayisi);//eğer müşteri tipi tam ise bilet tutarının gösterilmesi için gerekli olan metot
			}
		}
	}

	public void IadeOlusturma(String musteriTipi) { //Bilet parasinin iade edilebilmesi için gerekli olan metot
		Student studentMoney = new Student(biletParasi);
		Adult adultMoney = new Adult(biletParasi);

		System.out.println("----------------------");
		System.out.println("Bileti Satin Aldiniz!!");
		System.out.println("----------------------");
		System.out.println("Bilet Satin Alma Islemini Onayliyor Musunuz?\nEVET - 1\nHAYIR - 2"); //eğer müşteri işlemi onaylamazsa iade etme kısmına geçebilir
		int secim = sc.nextInt();

		if (secim == 2) {

			if (getOdemeTipi().equals("havale")) //havale ile ödeme yapıldıysa gösterilecek olan bilgiler
			{
				System.out.println("Paranin Iade Edilecegi IBAN: " + getIBAN());

				if (musteriTipi.equals("ogrenci")) {
					studentMoney.iadeTutarOgrenci(biletSayisi);
					System.out.println("Paraniz Hesabiniza Iade Edilmistir!\nIyi Gunler!");
					
				} else if (musteriTipi.equals("tam")) {
					adultMoney.iadeTutarTam(biletSayisi);
					System.out.println("Paraniz Hesabiniza Iade Edilmistir!\nIyi Gunler!");
				}

			} else if (getOdemeTipi().equals("kart")) {//kart ile ödeme yapıldıysa gösterilecek olan bilgiler
				System.out.println("Paranin Iade Edilecegi Kartin Sahibi: " + getKartIsmi()+" "+getKartSoyismi());
				System.out.println("Paranin Iade Edilecegi Kartin Numarasi: " + getKartNo());

				if (musteriTipi.equals("ogrenci")) 
				{
					studentMoney.iadeTutarOgrenci(biletSayisi);//müşteri tipi öğrenciyse iade edilecek tutarı gösteren metot
					System.out.println("Paraniz Kartiniza Iade Edilmistir!\nIyi Gunler!");
				} 
				else if (musteriTipi.equals("tam")) 
				{
					adultMoney.iadeTutarTam(biletSayisi);//müşteri tipi tam ise iade edilecek tutarı gösteren metot
					System.out.println("Paraniz Kartiniza Iade Edilmistir!\nIyi Gunler!");
				}
			}
		} else if (secim == 1) {//müşteri satın alma işlemini onaylarsa gösterilecek yazı
			System.out.println("IYI SEYIRLER DILERIZ!!");
		}
	}
}