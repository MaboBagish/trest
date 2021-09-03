package Home25;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        Random random = new Random ( );

        System.out.println ("\n Игра камень, ножницы, бумага");
        String[] kamNoBu = {"Камень", "Ножницы", "Бумага"};
        System.out.println ("Выберите -- 1. Камень, 2. Ножницы, 3. Бумага");
        int viborHuman = scanner.nextInt ( ) - 1;
        System.out.println ("Выбор человека" );
        for (int i = 0; i < kamNoBu.length; i++) {
            i = viborHuman;
            System.out.println (kamNoBu[i]);
            break;
        }




        System.out.println ("Выбор компьютера");
        int viborKomp = random.nextInt ( 2 );

        for (int i = 0; i < kamNoBu.length; i++) {
            i = viborKomp;
            System.out.println (kamNoBu[i]);
            break;
        }


        if(viborHuman == viborKomp ){
            System.out.println (" Ничья" );
        }else if (viborHuman==0 &&  viborKomp== 1){
            System.out.println ("Победил человек" );
        }else if (viborHuman==1 && viborKomp== 2){
            System.out.println ("Победил человек" );
        }else if (viborHuman==2 && viborKomp == 0){
            System.out.println ("Победил человек" );
        }else {
            System.out.println ("Победил компьютер" );
        }


    }


    }



