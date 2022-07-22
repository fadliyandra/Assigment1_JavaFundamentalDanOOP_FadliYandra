package game_edukasi;

import java.util.Scanner;

public class MainClass extends CalculatorKaliBagi{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b;
        String op;


        System.out.println("PERMAINAN DI MULAI");
        System.out.println("TAMAN BERMAIN ANAK");
        System.out.println("GAME EDUKATIF");
        System.out.println("APLIKSI INTERFACE \n");

        System.out.println("PILIH MENU");
        System.out.println("[1] Belajar Menghitung");
        System.out.println("[2] Belajar Bentuk");

        System.out.print("pilih [1] atau [2] : ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1 :
                System.out.println("Masukan Angka pertama : ");
                a = input.nextInt();

                System.out.println("Masukan angka kedua : ");
                b = input.nextInt();

                input.nextLine();

                System.out.println("Masukan operator  + - * /");
                op = input.nextLine();

                if (op.equals(TAMBAH)){
                    tambah(a,b);
                }
                if (op.equals(KURANG)){
                    kurang(a,b);
                }
                if (op.equals(KALI)){
                    kali(a,b);
                }
                if (op.equals(BAGI)){
                    bagi(a,b);
                }
                break;

            case 2 :

                System.out.println("PILIH MENU");
                System.out.println("[1] Belah Ketupat");
                System.out.println("[2] Segitiga");
                System.out.println("[3] Persegi");
                System.out.println("[0] Keluar" );

                System.out.print("pilih [1] [2] [3] [0]  : ");
               int Pilih = input.nextInt();
                switch (Pilih){
                    case 1:
                        int jumlahSisiBelahKetupat;
                        System.out.println("Bentuk Belah Ketupat");
                        System.out.println("Masukan jumlah sisi : ");
                        jumlahSisiBelahKetupat = input.nextInt();
                        input.close();


                        for(int i = 0; i< jumlahSisiBelahKetupat; i++){
                            System.out.print("*");
                            for (int j = 0; j< jumlahSisiBelahKetupat; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        int jumlahSisiSegitiga;
                        System.out.println("Bentuk Segitiga");
                        System.out.println("Masukan jumlah sisi : ");
                        jumlahSisiSegitiga = input.nextInt();
                        input.close();

                        for(int i = 0; i< jumlahSisiSegitiga; i++){
                            System.out.print("*");
                            for (int j = 0; j< jumlahSisiSegitiga; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        int jumlahSisiPersegi;
                        System.out.println("Bentuk Persegi");
                        System.out.println("Masukan jumlah sisi : ");
                        jumlahSisiPersegi = input.nextInt();
                        input.close();

                        for(int i = 0; i< jumlahSisiPersegi; i++){
                            System.out.print("*");
                            for (int j = 0; j< jumlahSisiPersegi; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 0:
                        break;

                }

        }

    }
}
