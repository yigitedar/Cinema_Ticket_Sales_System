package project;

import java.util.Scanner;

public class People { //Kişi hakkında bilgilerin yer aldığı sınıf.Bu sınıftan kalıtımla müşteri ve çalışan sınıfı oluşturulmuştur.
	
	private String ad;  //sınıfa ait nitelikler 
	private String soyad;
	private String dogumTarihi;
	private String ePosta;
	private String telefon;
	private String id;
	private String sifre;
	private String Tc; //nitelikler private olduğu için sadece sınıf içerisinde erişime açıktır
	
	Scanner sc=new Scanner(System.in);
	
	public People() {
	}
	
	public People(String ad, String soyad, String dogumTarihi, String ePosta, String telefon, String id, String sifre, String Tc) {
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.ePosta = ePosta;
		this.telefon = telefon;
		this.id = id;
		this.sifre = sifre;
		this.Tc = Tc;
	}
	//Kişi sınıfına ait constructor
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getePosta() {
		return ePosta;
	}
	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getTc(){return Tc;}

	public void setTc(String Tc) {
		this.Tc = Tc;
	}
	//nitelikleri almak ve üzerine yazdırmak için gerekli olan getter ve setter metotlar 
	
	public void uyeOl(String Tc) {  //Kişi sınıfının üye girişi için oluşturulan metot.Parametreli olarak oluşturulmuştur.
		System.out.println("Uye Sayfasi"); //aynı metottan bir de parametresiz oluşturulmuştur.Bu sayede overloading yapılmıştır.
	
		System.out.print("Isminizi girin : ");
		setAd(sc.next());
		System.out.print("Soyisminizi girin : ");
		setSoyad(sc.next());
		System.out.print("Dogum tarihinizi girin : ");
		setDogumTarihi(sc.next());
		System.out.print("E-postanizi girin : ");
		setePosta(sc.next());
		System.out.print("Telefon numaranizi girin : ");
		setTelefon(sc.next());
		System.out.print("TC kimlik numaranizi girin : ");
		setTc(sc.next());
	}
	public void uyeOl() {//Kişi sınıfının üye girişi için oluşturulan metot.Parametresiz olarak oluşturulmuştur.
		//aynı metottan bir de parametreli oluşturulmuştur.Bu sayede overloading yapılmıştır.
		System.out.println("Uye Sayfasi");
		System.out.print("Isminizi girin : ");
		setAd(sc.next());
		System.out.print("Soyisminizi girin : ");
		setSoyad(sc.next());
		System.out.println("Dogum tarihinizi girin : ");
		setDogumTarihi(sc.next());
		System.out.print("E-postanizi girin : ");
		setePosta(sc.next());
		System.out.print("Telefon numaranizi girin : ");
		setTelefon(sc.next());
	}
	public void uyelikTamamlama() //Kişi sınıfına üyelik tamamlandığında gelen mesaj için oluşturulan metot.
	{
		System.out.println("Uyelik isleminiz basariyla tamamlanmistir.");
	}
	public void giris() //Kişi sınıfının üye girişi için oluşturulan metot.Parametresiz olarak oluşturulmuştur.
	{
		System.out.println("ID girin:");
		String grs_id=sc.next();
    	System.out.println("Sifre girin");
    	String grs_sifre=sc.next();
    	id="calisan";
    	sifre="123";
    	if(id.equals(grs_id)&&(sifre.equals(grs_sifre)))
    	{
    		System.out.println("Hosgeldiniz!");
    	}
    	else
    	{
    		System.out.println("Hatali giris yaptiniz.");
    	}
 	}
	public void giris(String Tc) //Kişi sınıfının üye girişi için oluşturulan metot.Parametreli olarak oluşturulmuştur.
	{
		
		System.out.println("TC girin:");
		String grs_Tc=sc.next();
    	System.out.println("Sifre girin");
    	String mstr_sifre=sc.next();
    	sifre="1234";
    	if((getTc().equals(grs_Tc))&&(sifre.equals(mstr_sifre)))
    	{
    		System.out.println("Hosgeldiniz!");
    	}
    	else
    	{
    		System.out.println("Hatali giris yaptiniz.");
    		giris(getTc());
    	}
 	}
}