package dafeult;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 10-i; j <= 10; j++) {
                System.out.print("*");
            }
        }
    }
}
