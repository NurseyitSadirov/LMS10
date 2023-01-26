public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 56, 7, 8};
        System.out.println(contains(56, array));

    }

    static boolean contains(int a, int... varargs) {
        for (int b : varargs) {
            if (a == b) {
                return true;
            }
        }
        return false;
    }
}