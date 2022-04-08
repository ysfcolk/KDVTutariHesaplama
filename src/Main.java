import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        double miktar;
        Scanner input = new Scanner(System.in);
        System.out.println("KDV Hesaplayıcısı Programına Hoşgeldiniz \n Ödediğiniz Miktar 0 - 1000 TL arasında ise %18, 1000 TL'den yukarı ise %8 oranla KDV hesaplanacaktır.");
        System.out.println("Ödediğiniz Miktar:");
        miktar = input.nextInt();

        boolean kdvHesaplayici = (miktar<=1000);
        double islem = kdvHesaplayici ? (miktar * 18)/100 : (miktar * 8) / 100;
        String kdvInfo = kdvHesaplayici ? "%18" : "%8";
        double toplamTutar = miktar + islem;
        System.out.println("Ödediğiniz Miktar: "+miktar+" TL\n"+"KDV Tutarı ("+kdvInfo+"): "+islem+" TL\n"+"Ödenecek Toplam Tutar: "+toplamTutar+" TL");

    }
}
