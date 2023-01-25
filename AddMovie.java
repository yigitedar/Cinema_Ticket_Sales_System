package project;
import java.util.ArrayList;
import java.util.Scanner;

public class AddMovie {
	
			private String seansSaat;
			private String seansTarih;
			private String filmAdi;
			private String filmNo;
			private String filmTur;
			private String filmPuan;
			
			Scanner scanner =new Scanner(System.in);
			ArrayList<AddMovie>filmListesi=new ArrayList<>();
			
			public AddMovie() {
			}
			
			public AddMovie(String seansSaat, String seansTarih, String filmAdi, String filmNo, String filmTur,
							String filmPuan) {
	
				this.seansSaat = seansSaat;
				this.seansTarih = seansTarih;
				this.filmAdi = filmAdi;
				this.filmNo = filmNo;
				this.filmTur = filmTur;
				this.filmPuan = filmPuan;
			}
			
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

			public String getFilmTur() {
				return filmTur;
			}

			public void setFilmTur(String filmTur) {
				this.filmTur = filmTur;
			}

			public String getFilmPuan() {
				return filmPuan;
			}

			public void setFilmPuan(String filmPuan) {
				this.filmPuan = filmPuan;
			}	
	}
