package game_edukasi;

public class CalculatorKaliBagi extends CalculatorTambahKurang{
    final static String KALI = "*";
    final static String BAGI = "/";

    public static void kali (int x, int y){
        Display(x,y,KALI,x*y);
    }
    public static void bagi(int x, int y){
        Display(x, y, BAGI, x/y);

    }
}
