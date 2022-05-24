//Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName, password;
        int chance = 3, bakiye = 1500;
        int select;

        while (chance > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = scan.nextLine();

            System.out.print("Şifreniz: ");
            password = scan.nextLine();

            if (userName .equals("patika") && password .equals("dev123")){
                System.out.println("Merhaba. X Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış yapma");
                    System.out.print("Lütfen yapmak istediğiniz işlemi giriniz: ");
                    select = scan.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int add = scan.nextInt();
                            bakiye += add;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int subtract = scan.nextInt();

                            if (subtract > bakiye){
                                System.out.println("Bakiyeniz yetersiz.");
                            }else{
                                bakiye -= subtract;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + bakiye);
                    }

                }while(select != 4);
                System.out.println("Sistemden çıkılıyor...");
                break;
            }else{
                chance--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (chance == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: " + chance);
                }
            }

        }
    }
}
