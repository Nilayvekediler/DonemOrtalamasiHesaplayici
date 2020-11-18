import java.util.Scanner;
public class Ogrenci { //Ogrenciden vize,final notlarını isteyen ve ortalama hesaplayan metotların bulunduğu Ogrenci sınıfı.

    int[] vizeNot;
    int[] finalNot;
    final int vizeSayisi = 5;
    final int finalSayisi = 5; //Vize ve final sayısı 5'tir ve bu değiştirilemez o yüzden final ile değeri sabitledim.

    public void vizeGir() {//Vize notlarının klavyeden girilmesi için vizeGir metodu.

       vizeNot=new int[vizeSayisi];

        System.out.println("Dönem vize notlarınızı giriniz:");

        for (int i = 0; i < vizeSayisi; i++) {
            System.out.print(i + 1 + ". vize notu:");
            Scanner klavye = new Scanner(System.in);
            vizeNot[i] = klavye.nextInt(); //vizeNot dizisine döngüyle klavyeden girilen 5 vize notu aktarılır.

            if (vizeNot[i] < 0 || vizeNot[i] > 100) { //girilen notun 0'dan küçük 100'den büyük olması durumunda tekrar tekrar değeri girmesi istenir geçerli bir sayı girene kadar.
                int sayac = 0;
                while (sayac == 0) {
                    System.out.println("Geçersiz bir not girdiniz. Lütfen tekrar deneyiniz.");
                    vizeNot[i] = klavye.nextInt();
                    if (vizeNot[i] >= 0 && vizeNot[i] <= 100) {
                        sayac++;
                    }
                }

            }
        }
    }

    public void finalGir(){//Vize notlarının klavyeden girilmesi için finalGir metodu.

        finalNot=new int[finalSayisi];

        System.out.println("Dönem final notlarınızı giriniz:");

        for (int i = 0; i < finalSayisi; i++) {
            System.out.print(i + 1 + ". final notu:");
            Scanner klavye = new Scanner(System.in);
            finalNot[i] = klavye.nextInt();//finalNot dizisine döngüyle klavyeden girilen 5 final notu aktarılır.

            if (finalNot[i] < 0 || finalNot[i] > 100) {//girilen notun 0'dan küçük 100'den büyük olması durumunda tekrar tekrar değeri girmesi istenir geçerli bir sayı girene kadar.
                int sayac2 = 0;
                while (sayac2 == 0) {
                    System.out.println("Geçersiz bir not girdiniz. Lütfen tekrar deneyiniz.");
                    finalNot[i] = klavye.nextInt();
                    if (finalNot[i] >= 0 && finalNot[i] <= 100) {
                        sayac2++;
                    }
                }

            }
        }

    }
    
    public double ortalamaHesapla(int [] vizeNot, int [] finalNot){//vize ve final notlarından dönem ortalamasını hesaplayan ortalamaHesapla metotu.

        int total=0;
        double vizeOrt;
        for (int notlarim: vizeNot ) {
            total=total+notlarim; //girilen 5 vize notunu topladı.
        }
        vizeOrt=(double) total/5;


        int total2=0;
        double finalOrt;
        for (int notlarim2: finalNot){
            total2=total2+notlarim2;//girilen 5 final notunu topladı.
        }
        finalOrt=(double) total2/5;


        double ort= vizeOrt*(0.4) + finalOrt*(0.6);//dönem ortalaması hesaplandı ve değer ort değişkenine atandı.

        return ort;

    }

}
