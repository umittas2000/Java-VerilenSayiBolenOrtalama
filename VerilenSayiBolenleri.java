import java.util.Scanner;

public class VerilenSayiBolenleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi,bolen=0,ortalama=0;

        //Verilen sayiya kadar olan 3e ve 4e tam bolunenlerin ortalamasi

        System.out.print("Luftfen Bir sayi girin[1-9999]");
        sayi=input.nextInt();

        if(sayi>0 && sayi<=9999){
            for(int i=1;i<=sayi;i++){
                if(i%3==0 && i%4==0)
                {
                    bolen++;
                    ortalama+=i;
                    System.out.println("3e ve 4e tam bolunuyor: "+i+", toplam: "+ ortalama+ " Bolen:"+bolen);
                }
            }

            if(bolen>0)
                ortalama = ortalama / bolen;

            System.out.println("3e ve 4e bolunen tum sayilarin ortalamasi: "+ ortalama);

        }else{
            System.out.println("Verilen sayi kurallara uymuyor [1-9999], luften Tekrar deneyin...");
        }
    }
}
