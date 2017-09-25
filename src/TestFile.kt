/*
* Calling Java function from Kotlin file
* */
fun main(args : Array<String>) {
    var result = testJava.sum(2, 4)
    println("Java output = $result")
}

fun product(num1 : Int, num2 : Int) : Int {
    return num1*num2
}

/*
* public class TestFileKt {
    public static void main(String[] args) {
        int kotResult = TestFileKt.product(2,4);
        System.out.println("Kotlin output = " + kotResult);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}

*
*
*
* */