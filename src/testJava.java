public class testJava {
    public static void main(String[] args) {
        int kotResult = TestFileKt.product(2,4);
        System.out.println("Kotlin output = " + kotResult);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
