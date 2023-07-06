public class Main {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
    }

    public static String fizzbuzz (int b){
        String output = "0 ";
        for (int i = 1; i < b + 1; i++){
            if (i % 15 == 0){
                output += "fizzbuzz";
            } else if (i % 3 == 0){
                output += "fizz";
            } else if (i % 5 == 0){
                output += "buzz";
            } else {
                output += i;
            }
            output += " ";
        }
        return output;
    }
}
