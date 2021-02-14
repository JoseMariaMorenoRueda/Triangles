package print;

public class PrintTriangles {
    public static void printPowerOf2Triangle(int size) {
        System.out.println("\nModel PowerOf2Triangle\n");
        int counter1 = size - 1;
        int aux1 = 0, aux2, aux3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < counter1; j++) {
                System.out.print("    ");
            }
            for (int k = 1; k <= i + 1; k++) {
                if (k < 3) {
                    aux2 = k;
                } else {
                    aux2 = aux1 * 2;
                }
                aux1 = aux2;
                if (aux1 < 10) {
                    System.out.print("  " + aux1 + " ");
                } else {
                    if (aux1 < 100) {
                        System.out.print(" " + aux1 + " ");
                    } else {
                        System.out.print(aux1 + " ");
                    }
                }
            }
            aux3 = aux1;
            for (int l = i; l >= 1; l--) {
                if (l < 3) {
                    aux2 = l;
                } else {
                    aux2 = aux3 / 2;
                }
                aux3 = aux2;
                if (aux3 < 10) {
                    System.out.print("  " + aux3 + " ");
                } else {
                    System.out.print(" " + aux3 + " ");
                }
            }

            counter1--;
            System.out.println();
        }
    }
    public static void printPascalTriangle1(int size) {
        System.out.println("\nModel PascalTriangle1\n");
        int[] arrayNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // In this way, an auxiliary array is created whose number of elements is the amount
            // that we pass as a parameter and with all its elements to zero
            int[] arrayAuxNumbers = new int[size];
            for (int j = 0; j < size; j++) {
                arrayAuxNumbers[j] = 0;
            }
            for (int k  = 0; k <= i; k++) {
                if (k == 0 || k == i ) {
                    arrayAuxNumbers[k] = 1;
                } else {
                    arrayAuxNumbers[k] = arrayNumbers[k] + arrayNumbers[k - 1];
                }
                System.out.print(arrayAuxNumbers[k] + " ");
            }
            arrayNumbers = arrayAuxNumbers;
            System.out.println();
        }
    }

    public static void printPascalTriangle2(int size) {
        System.out.println("\nModel PascalTriangle2\n");
        int[] arrayNumbers = new int[size];
        int counter = size;
        for (int i = 0; i < size; i++) {
            int[] arrayAuxNumbers = new int[size];
            for (int j = 0; j < size; j++) {
                arrayAuxNumbers[j] = 0;
            }
            for (int k  = counter; k >= 0; k--) {
                System.out.print("  ");
            }
            for (int l  = 0; l <= i; l++) {
                if (l == 0 || l == i ) {
                    arrayAuxNumbers[l] = 1;
                } else {
                    arrayAuxNumbers[l] = arrayNumbers[l] + arrayNumbers[l - 1];
                }
                if (arrayAuxNumbers[l] > 9) {
                    System.out.print(arrayAuxNumbers[l] + "  ");
                } else {
                    System.out.print(arrayAuxNumbers[l] + "   ");
                }

            }
            counter--;
            arrayNumbers = arrayAuxNumbers;
            System.out.println();
        }
    }

    public static void main(String[] argv) {
        printPowerOf2Triangle(8);
        printPascalTriangle1(7);
        printPascalTriangle2(7);
    }

}
