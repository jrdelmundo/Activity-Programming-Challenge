public class StringBuilderDemo {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(10);

        sb.append("abcdefghij");

        System.out.println("Original StringBuilder: " + sb.toString());

        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb.toString());

        sb.append("klmnop");
        System.out.println("Appended StringBuilder: " + sb.toString());

        sb.replace(0, 5, "12345");
        System.out.println("Replaced StringBuilder: " + sb.toString());

        sb.delete(5, 10);
        System.out.println("Deleted StringBuilder: " + sb.toString());

        sb.insert(5, "XYZ");
        System.out.println("Inserted StringBuilder: " + sb.toString());

        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("Current Length: " + length);
        System.out.println("Current Capacity: " + capacity);
    }
}
