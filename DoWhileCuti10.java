import java.util.Scanner;

public class DoWhileCuti10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jatahCuti;
        int jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti = ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("apakah anda akan mengambil cuti? (y/t) ");
            konfirmasi = scan.next();

           
            if (konfirmasi.equalsIgnoreCase("t")) {
                
                break;
            } else if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari = ");
                jumlahHari = scan.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti = " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi. Silakan coba lagi.");
                }
            }

        } while (jatahCuti > 0);
    }
}