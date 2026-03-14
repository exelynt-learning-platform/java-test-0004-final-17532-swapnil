public class Code4 {
public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top    = i;
                int bottom = size - 1 - i;
                int left   = j;
                int right  = size - 1 - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                int value = n - minDist;

                System.out.print(value);
                if (j < size - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}