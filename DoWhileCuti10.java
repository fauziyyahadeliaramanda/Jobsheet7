import java.util.Scanner;
public class DoWhileCuti10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int jatahcuti, jumlahhari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if(konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari: ");
                jumlahhari = sc.nextInt();

                if(jumlahhari <= jatahcuti){
                    jatahcuti -= jumlahhari;
                    System.out.println("Sisa jatah cuti : " + jatahcuti);
                } else {
                    System.out.println("Jumlah cuti yang anda minta melebihi jatah cuti anda");
                }
            }else {
                System.out.println("");
                break;
            }

        } while (jatahcuti > 0);
    }
}