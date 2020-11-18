

public class Initials {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 8; j < i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (i == 4 || k == 0 || k == i) {
                    System.out.print(" " + "**");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= 11; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i >= 0 && i < 2 || i > 4 && i < 7 || i >= 2 && i <= 4 && j == 1 || i > 6 && i <= 9 && j == 8 || i > 9 && i <= 11) {
                    System.out.print("**");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            for (int i = 0; i <= 8; i++) {
                for (int j =0;j<8;j++){
                if (j == 0 || (4-j)==i || (4+j) ==i) {
                    System.out.print ("**");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}




