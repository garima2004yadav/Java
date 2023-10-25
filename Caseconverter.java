public class Caseconverter {
    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        String uppercaseText = "HI THIS IS GARIMA";
        String lowercaseText = convertToLowerCase(uppercaseText);
        System.out.println(lowercaseText);  // Output: "hello, world!"

        String lowercaseText2 = "hi this is garima";
        String uppercaseText2 = convertToUpperCase(lowercaseText2);
        System.out.println(uppercaseText2);  // Output: "HELLO, WORLD!"
    }
}
