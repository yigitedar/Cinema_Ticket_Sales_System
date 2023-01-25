package project;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectMovieTheater { //Salon hakkında bilgilerin yer aldığı sınıf

			private String salonAdi; //sınıfa ait nitelikler
			private int koltukNo; //nitelikler private olduğu için sadece sınıf içerisinde erişime açıktır
			
			Scanner scan=new Scanner(System.in);
			
			public SelectMovieTheater() {
			}
			//SalonSeç sınıfına ait parametresiz constructor
			public SelectMovieTheater(String salonAdi, int koltukNo) {
				this.salonAdi = salonAdi;
				this.koltukNo = koltukNo;
			}
			//SalonSeç sınıfına ait parametreli constructor
			
			public String getSalonAdi() {
				return salonAdi;
			}

			public void setSalonAdi(String salonAdi) {
				this.salonAdi = salonAdi;
			}

			public int getKoltukNo() {
				return koltukNo;
			}

			public void setKoltukNo(int koltukNo) {
				this.koltukNo = koltukNo;
			}
			//nitelikleri almak ve üzerine yazdırmak için gerekli olan getter ve setter metotlar 
			public void SalonKoltukSec() //Salon seçiminin yapıldığı parametresiz metot.
			{
				int sayi;

				//3 adet Salon bulunmaktadır
				System.out.println(" A Salonu");
				System.out.println(" B Salonu");
				System.out.println(" C Salonu");
				System.out.print("Salon Adi girin : ");
				String secim = scan.next();

				System.out.print("Koltuk Sayisini Girin: ");
				sayi = scan.nextInt();
				for (int i = 0; i < sayi; i++) {
					switch (secim) {
						case "A":
							ArrayList<SelectMovieTheater> doluKoltukA = new ArrayList<>();
							SelectMovieTheater koltuk = new SelectMovieTheater();
							System.out.print("Koltuk numarasi girin(1-100): ");
							setKoltukNo(scan.nextInt());  //koltuk seçimin yapılır.

							if (doluKoltukA.size() == 100) {
								System.out.println(secim + " Salonu doludur.");
							} else {
								System.out.println(koltukNo + " Numarali koltuk secilmistir.");
								doluKoltukA.add(koltuk);
							}
							break;

						case "B":

							ArrayList<SelectMovieTheater> doluKoltukB = new ArrayList<>();
							SelectMovieTheater koltuk1 = new SelectMovieTheater();
							System.out.print("Koltuk numarasi girin(1-150): ");
							setKoltukNo(scan.nextInt());  //koltuk seçimin yapılır.

							if (doluKoltukB.size() == 150) {
								System.out.println(secim + " Salonu doludur.");
							} else {
								System.out.println(koltukNo + " Numarali koltuk secilmistir.");
								doluKoltukB.add(koltuk1);
							}
							break;
						case "C":

							ArrayList<SelectMovieTheater> doluKoltukC = new ArrayList<>();
							SelectMovieTheater koltuk2 = new SelectMovieTheater();
							System.out.print("Koltuk numarasi girin(1-120): ");
							setKoltukNo(scan.nextInt());  //koltuk seçimin yapılır.

							if (doluKoltukC.size() == 120) {
								System.out.println(secim + " Salonu doludur.");
							} else {
								System.out.println(koltukNo + " Numarali koltuk secilmistir.");
								doluKoltukC.add(koltuk2);
							}
							break;

						default:
							System.out.println("Hatali giris yaptiniz");
							break;
					}
				}
			}
	}
