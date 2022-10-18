import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınız :");
            userName = input.nextLine();
            System.out.print("Şifreniz :");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, kodlluyoruz bankasına hoşgeldiniz");
                do {
                    System.out.print("1-Para yatırma\n" +
                            "2-Para çekme\n " +
                            "3-Bakiye sorgula\n" +
                            "4-Çıkış "
                    );
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı :");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı :");
                            int deger = input.nextInt();
                            if (deger > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= deger;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        default:
                            System.out.println("Lütfen 1-4 arası işlem giriniz.");


                            }
                    } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;


            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right ==0){
                    System.out.println("Hesabanız bloke olmuştur lütfen banka ile ietişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız :"+right);
                }

            }
        }
    }
}
