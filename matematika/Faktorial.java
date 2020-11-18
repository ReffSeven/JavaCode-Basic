public class Faktorial {
    public static void main(String[] args) {
        int N = 5, F = 1;
        for(int i = 1; i<= N; i++) {
            F *= i;
        }
        System.out.println(String.format("%d! = %d", N, F));
    }
}
