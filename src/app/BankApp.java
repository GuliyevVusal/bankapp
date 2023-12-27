package app;

import java.util.Scanner;

public class BankApp {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;
        BankAccount userAccount = new BankAccount("1991");
        while(attempts < maxAttempts){
        System.out.print(BLUE_BOLD_BRIGHT + "Vusal Quliyev. 4 Reqemli sifreni daxil edin:" +
                " " + '*' + '*' + '*' + '*' + " " + RESET);
        String enteredPassword = sc.nextLine();
        if (userAccount.autoEnter(enteredPassword)) {
            System.out.println(BLUE_BOLD_BRIGHT + "Sifre Dogrudur: \nMr.Quliyev Kapital Banka Xos gelmisiniz:" +
                    "" + RESET);
                 break;
        }else{
            attempts++;
            System.out.println("daxil etdiyiniz Sifre Yalnisdir !! Qalan Shansiniz: " + (maxAttempts - attempts));
                if (attempts == maxAttempts) {
                   throw new Exception("3 Defe Yalnis Shifre daxil edildi \n Elaqe-196 Qaynar xett");
                }
            }
        }
            while (true) {
                System.out.println(BLUE_BOLD_BRIGHT + "1-) Medaxil edin " + RESET);
                System.out.println(BLUE_BOLD_BRIGHT + "2-) Pul Cekin " + RESET);
                System.out.println(BLUE_BOLD_BRIGHT + "3-) Balans " + RESET);
                System.out.println(BLUE_BOLD_BRIGHT + "4-) Cixis " + RESET);
                System.out.print(BLUE_BOLD_BRIGHT + "Secim Edin: " + RESET);
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print(BLUE_BOLD_BRIGHT + "Medaxil etmek istediyiniz meblegi daxil edin: " + RESET);
                        double medaxilMiqdari = sc.nextDouble();
                        userAccount.Medaxil(medaxilMiqdari);
                        break;
                    case 2:
                        System.out.print(BLUE_BOLD_BRIGHT + "Cekmek istediyiniz meblegi daxil edin: " + RESET);
                        double pulCekmek = sc.nextDouble();
                        userAccount.PulCek(pulCekmek);
                        break;
                    case 3:
                        System.out.println(RED + "Cari Balans: " + userAccount.getBalans() + " Azn " + RESET);
                        break;
                    case 4:
                        System.out.println(RED + "Kapital banki secdiyiniz ucun Tesekurler. " + RESET);
                        System.exit(0);
                    default:
                        System.out.println(RED + "Dogru Secim Etmediniz !!" + RESET);
                }
            }

