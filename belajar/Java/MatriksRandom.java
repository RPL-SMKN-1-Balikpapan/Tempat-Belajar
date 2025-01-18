import java.util.Random;

public class MatriksRandom {
    // Metode untuk membuat matriks random n x n
    public static int[][] buatMatriks(int n) {
        int[][] matriks = new int[n][n];
        Random random = new Random();

        // Mengisi matriks dengan angka random 0 atau 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = random.nextInt(2); // Menghasilkan 0 atau 1
            }
        }

        return matriks;
    }

    // Metode untuk menampilkan matriks
    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(); // Pindah baris
        }
    }

    // Method main untuk menguji program
    public static void main(String[] args) {
        // Membuat matriks 3 x 3
        int n = 3;
        System.out.println("Membuat matriks " + n + " x " + n + ":");

        // Membuat dan menampilkan matriks
        int[][] matriks = buatMatriks(n);
        tampilkanMatriks(matriks);
    }
}
