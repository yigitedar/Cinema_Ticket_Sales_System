package project;
import java.util.Scanner;

public class SelectMovie {  //film hakkında bilgilerin yer aldığı sınıf

		
		private String seansSaat;//sınıfa ait nitelikler 
		private String seansTarih; //nitelikler private olduğu için sadece sınıf içerisinde erişime açıktır
		private String filmAdi;
		private String filmNo; 
		Scanner scanner =new Scanner(System.in);
		
		public SelectMovie() {
		}
		public SelectMovie(String seansSaat, String seansTarih, String filmAdi, String filmNo) {
			this.seansSaat = seansSaat;
			this.seansTarih = seansTarih;
			this.filmAdi = filmAdi;
			this.filmNo = filmNo;
		}
		//FilmSeçimi sınıfına ait constructor
		public String getFilmAdi() {
			return filmAdi;
		}
		public void setFilmAdi(String filmAdi) {
			this.filmAdi = filmAdi;
		}
		public String getFilmNo() {
			return filmNo;
		} 
		public void setFilmNo(String filmNo) {
			this.filmNo = filmNo;
		} 
		public String getSeansSaat() {
			return seansSaat;
		}
		public void setSeansSaat(String seansSaat) {
			this.seansSaat = seansSaat;
		}
		
		public String getSeansTarih() {
			return seansTarih;
		}
		public void setSeansTarih(String seansTarih) {
			this.seansTarih = seansTarih;
		}
		//nitelikleri almak ve üzerine yazdırmak için gerekli olan getter ve setter metotlar 
		  public void FilmListele() //film seçimi sınıfının filmlerin listelendiği metot
		{
		    	  
		    String [] filmListesi1= {"1-Maric -- Korku -- 8","2-Avatar -- Bilim Kurgu -- 8.1","3-Monstrous -- Korku -- 5.1",
		    			"4-Fabelmans -- Dram -- 7.8","5-Kurak Gunler -- Dram -- 6.7","6-Marnie -- Animasyon -- 10",
		    			"7-MujdemiIsterim -- Komedi -- 2.2","8-Harbinger -- Korku 2","9-Syk -- Dram--6.1",
		    			"10-TheLord -- Fantastik -- 8.9","11-ElifAna -- Dram -- 6.6",
		    			"12-Stars -- Romantik -- 4.6","13-20thCentury -- Melodram -- 7.6","14-Yaksha -- Aksiyon -- 7.1",
		    			"15-Cehennem -- Belgesel -- 6.4","16-Love -- Romantik,Komedi -- 6.2",
		    			"17-Babamiz -- Belgesel -- 8","18-FullmetalAlchemist -- Aksiyon -- 5.3",
		    			"19-JL -- Belgesel -- 6.5","20-Goodnight -- Korku -- 5.6","21-Bubble -- Anime -- 6.3",
		    			"22-Carter -- Aksiyon -- 5.1","23-Pale -- Gizem -- 6.7","24-LiSA -- Belgesel -- 7.4",
		    			"25-Seul88 -- Polisiye -- 5.5"};
		    //array kullanarak vizyondaki filmler eklendi	
		    System.out.println("Vizyondaki Filmler");
		    System.out.println("FILM NO****FILM AD****FILM TUR****FILM PUAN****");
		    for(int i=0;i<filmListesi1.length;i++)
		    {
		        System.out.println(filmListesi1[i]);
		    }
		    //for döngüsü ile bu film dizisi yazdırıldı	
		}
		public void FilmSec() //film seçimi sınıfının filmlerin seçildiği metot
		{
			
			    System.out.print("Seans tarihini girin: ");
				setSeansTarih(scanner.next());
			    System.out.println("11.00	13.15	15.30	16.15	18.30	19.45	");
				System.out.print("Seans saatini girin: ");
				setSeansSaat(scanner.next());
				System.out.print("Filmin numarasini girin: ");
				setFilmNo(scanner.next());
				System.out.print("Filmin adini girin : ");
				setFilmAdi(scanner.next());
				System.out.println();
				System.out.println("Film No : "+filmNo+"	"+"Film Adi : "+filmAdi);
				System.out.println("Seans Tarihiniz : "+seansTarih+"	"+"Seans Saatiniz : "+seansSaat);
				
				System.out.println("Bilgileri onayliyor musunuz?(e/h)");
				String cevap=scanner.next();
				if(cevap.equals("e"))
				{
					BiletBas();//bilgiler sorunsuz ise bilet basılıyor
				}
				else
				{
					FilmSec(); //bilgilerde sorun var ise film seçimine yönlendiriyor
				}
			}

			public void BiletBas() //film seçimi sınıfının biletin basıldığı metot
			{
				System.out.println("Bilet Bilgileriniz");
				System.out.println("Film No : "+filmNo+"	"+"Film Adi : "+filmAdi);
				System.out.println("Seans Tarihiniz : "+seansTarih+"	"+"Seans Saatiniz : "+seansSaat);
			}
}
