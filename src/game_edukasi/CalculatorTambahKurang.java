package game_edukasi;

public class CalculatorTambahKurang implements Interface{
//    final static String TAMBAH = "+";
//    final static String KURANG = "-";

    public static void Display(int x, int y, String operator, int z){
        System.out.println(x + " " + operator + y + " = " + z);
    }


    public static void tambah(int x, int y){
        Display(x,y, TAMBAH, x+y);
    }
    public static void kurang(int x, int y){
        Display(x,y, KURANG, x-y);

    }

}
