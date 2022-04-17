import models.Active;
import models.Balance_Checker;
import models.Card_checker;
import models.Data_Checker;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Card_checker card = new Card_checker();
        Data_Checker data = new Data_Checker();
        Active active = new Active();
        Balance_Checker bc = new Balance_Checker();
        bc.fillBalance(19000000);
        while (true){
            System.out.println("Karta raqamini kiriting? ");
            if (card.checker(scanner.nextLine())){
                System.out.println("Amal qilish muddatini kiriting (Misol: 0126)? ");
                if (data.checker(scanner.nextLine())){
                    System.out.println("Karta Holatini kiriting(Misol: (active bolsa- 1, inactive bo'lsa- 0))? ");
                    if (active.checker(scanner.nextInt())){
                        System.out.println("Qancha pul yechmoqchisiz");
                        if (bc.withdraw(scanner.nextInt())){
                            System.out.println("1% qo'shimcha komissiya yechildi. Hizmatimizdan foydalanganingiz uchun raxmat balansingizdagi qoldiq: "+bc.getBalance());
                        }
                    } else System.out.println("Karta bloklangan");
                } else System.out.println("Amal qilish muddati eskirgan");
            } else System.out.println("Bunday karta raqami mavjud emas");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
