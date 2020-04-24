import java.util.Scanner;
public class arai {
    public static void main(String [] args) {
                String[] tugas = new String[5];

                Scanner scan = new Scanner(System.in);

                for( int i = 1; i < tugas.length; i++ ){
                    System.out.print("tugas ke-" + i + ": ");
                    tugas[i] = scan.nextLine();
                }

                System.out.println("---------------------------");

                for( String b : tugas ){
                    System.out.println(b);
                }

            }

}
