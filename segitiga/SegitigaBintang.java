/*
    *
    **
    ***
    ****
    *****
*/
public class SegitigaBintang {
    public static void main(String[] args) {
        int N = 5;
        for(int y = -1; ++y < N;) {
            for(int x = -1; ++x <= y;) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
