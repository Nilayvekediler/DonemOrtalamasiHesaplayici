/* Dönem not ortalamasını bulan programı tasarlayınız. Bir dönemde 5 adet ders olduğu, her dersin sadece bir vize
bir final sınavı olduğu, 5 dersin de kredisinin eşit olduğu bilgisi verilmiştir. 5 adet dersin sırayla vize ve final
notunu konsol ekranda alan ve dönem not ortalamasını yine konsol ekrana yadıran program. Hesaplamada vize ağırlığı yüzde 40
final ağırlığı yüzde 60 olarak alınacaktır. (100 üzerinden)
 */

public class Main {

	public static void main(String[] args) {

		Ogrenci ogrenci=new Ogrenci(); //Ogrenci sınıfının metotlarını kullanabilmek için ogrenci nesnesini oluşturdum.

		ogrenci.vizeGir(); //Ogrenci sınıfındaki vizeGir metodunu çağırdım. Metotla kullanıcıdan klavyeden 5 vize notunu alıp diziye aktardım.
		ogrenci.finalGir(); //Ogrenci sınıfındaki finalGir metodunu çağırdım. Metotla kullanıcıdan klavyeden 5 final notunu alıp diziye aktardım.


		double ortalama=ogrenci.ortalamaHesapla(ogrenci.vizeNot, ogrenci.finalNot);/*Ogrenci sınıfındaki ortalamaHesapla metoduna parametre olarak
		Ogrenci sınfındaki vizeNot ve finalNot dizilerini girdim. Onlara da ogrenci nesnesi ile eriştim. Bu ortalamaHesapla metotunun return ettiği
		double değer ortalama değişkenine atandı. Aşağıda da bunu yazdırdım.*/
		System.out.println("Dönem ortalamanız: "+ortalama);


	}

}
