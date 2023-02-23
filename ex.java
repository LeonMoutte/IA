/*
* pass from decimal to binary using recursivity
*/

public static void main(String[] args) {
    System.out.println(binary(JETS.input("Enter A Dec... ")));
}
private static String binary(String s) {
    if (Integer.valueOf(s) == 1) {
        return "1";
    }
    return binary(String.valueOf(Integer.valueOf(s)/2)) + String.valueOf(Integer.valueOf(s)%2);
}
