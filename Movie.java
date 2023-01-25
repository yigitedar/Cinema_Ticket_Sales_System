package project;

import java.util.Scanner;
	public class Movie {

		public static void main(String[] args) {

			int girisSecim;

			Scanner sc = new Scanner(System.in);
			Worker calisanBilgi = new Worker();
			Customer musteriBilgi = new Customer();
			SelectMovie filmBilgi = new SelectMovie();
			SelectMovieTheater salonBilgi = new SelectMovieTheater();
			TicketSale biletBilgi = new TicketSale();

			System.out.println("Calisan Girisi - 1\nMusteri Girisi - 2");
			System.out.println("Lutfen giris yapin : ");
			girisSecim = sc.nextInt();

			if(girisSecim == 1){

					calisanBilgi.CalisanBilgileriGetir();
					calisanBilgi.uyelikTamamlama();
					calisanBilgi.giris();

				}else if(girisSecim == 2){

					musteriBilgi.BilgileriGetir();
					musteriBilgi.uyelikTamamlama();
					musteriBilgi.giris();
					filmBilgi.FilmListele();
					filmBilgi.FilmSec();
					salonBilgi.SalonKoltukSec();
					biletBilgi.OdemeTipi(musteriBilgi.getMusteriTipi());
					filmBilgi.BiletBas();
					biletBilgi.IadeOlusturma(musteriBilgi.getMusteriTipi());
				}
			}
		}