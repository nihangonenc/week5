import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String [] fruits = new String[10];
        fruits [0] = "Karpuz";
        fruits [1] = "Böğürtlen";
        fruits [2] = "Kiraz";
        fruits [3] = "Erik";
        fruits [4] = "Portakal";
        fruits [5] = "Ayva";
        fruits [6] = "Kavun";
        fruits [7] = "Çilek";
        fruits [8] = "Muz";
        fruits [9] = "Ahududu";


        System.out.print("10 elemanlı meyveler dizisinin kaçıncı indeksini görmek istersiniz?: ");
        int number = input.nextInt();

        try{
            System.out.println( number + ". indeksteki meyve: " + fruits[number] );

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi boyutunun dışına çıktınız.");
            System.out.println(e.getMessage());

        } finally {
            input.close();
        }









    }
}