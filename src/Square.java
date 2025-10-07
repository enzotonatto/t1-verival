public class Square {

    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int r = (int) Math.sqrt(n);
        return r * r == n;
    }

    // Exemplo rápido de uso:
    public static void main(String[] args) {
        System.out.println(isSquare(81));
    }
}
