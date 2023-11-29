public class Quiz {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sol = ((a * b) / (a - b)); // BODMAS NOT WORK IN JAVA
        int ans = a * b / a - b; // * / % > + - CALC. LEFT TO RIGHT
        System.out.println("solution : " + sol);
        System.out.println("Answer : " + ans);
    }

}
