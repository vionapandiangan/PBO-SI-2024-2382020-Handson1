public class TipeDataArray {
    public static void main(String[] args) {
        // Array adalah kumpulan dari sebuah data dengan tipe data yang sama
        //A Array one dimension
        int[] kumpulanAngka = new int[3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 40;
        kumpulanAngka[2] = 50;
        System.out.println(kumpulanAngka[2]);

        // Array multi-dimension
        int[][] kumpulanAngkaMultiMension = new int[3][3];
        kumpulanAngkaMultiMension[0] = kumpulanAngka;
        System.out.println(kumpulanAngkaMultiMension[0][2]);
    }
}
