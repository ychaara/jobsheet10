import java.util.Scanner;
public class SurveiKepuasan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[10][6];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
        
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }
}
