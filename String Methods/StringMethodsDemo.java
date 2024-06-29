public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, Dear!  ";

        int length = str.length();
        System.out.println("Length: " + length);

        char charAt = str.charAt(7);
        System.out.println("Character at index 7: " + charAt);

        String substringFrom = str.substring(7);
        System.out.println("Substring from index 7: " + substringFrom);

        String substringRange = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);

        boolean contains = str.contains("Dear");
        System.out.println("Contains 'Dear': " + contains);

        boolean equals = str.equals("  Hello, Dear!  ");
        System.out.println("Equals '  Hello, Dear!  ': " + equals);

        boolean equalsIgnoreCase = str.equalsIgnoreCase("  hello, dear!  ");
        System.out.println("Equals ignore case '  hello, dear!  ': " + equalsIgnoreCase);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        String replaced = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replaced);

        String[] split = str.split(",");
        System.out.println("Split by ',': ");
        for (String part : split) {
            System.out.println(part);
        }
    }
    
}
