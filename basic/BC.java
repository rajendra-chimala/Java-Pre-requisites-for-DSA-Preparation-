
public class BC {

    public static void main(String[] a) {

        System.out.println("Using the Continue statement :");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("Using the Break Statement : ");
        for (int j = 0; j < 1000; j++) {
            System.out.println(j);
            if (j == 10) {
                break;
            }
        }

    }
}
