public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

//Or for reusable code try this

// public static String checkEvenOdd(int num) {
//    return (num & 1) == 0 ? "Even" : "Odd";
//}
