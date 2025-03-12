public class Main {
    public static void main(String[] args) {
        int p = 7;
        System.out.println(alg1(p));
    }
    public static boolean alg1(int p) {
        for(int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}