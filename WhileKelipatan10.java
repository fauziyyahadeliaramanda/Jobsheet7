import java.util.Scanner;
public class WhileKelipatan10 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        int kelipatan, total=0, jumlah=0, counter=0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while(i<= 50){
            if(i% kelipatan == 0){
                total += i;
                counter++;
            } i++;
        }
        double rataRata = (double) total/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n" , kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %2f\n", kelipatan, rataRata);
    }
}
