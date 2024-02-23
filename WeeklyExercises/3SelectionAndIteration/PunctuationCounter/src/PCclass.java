public class PCclass {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        System.out.println("Punctuation Marks\tCount");
        System.out.println("----------------\t------");

        for (char c : text.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println(c + "\t\t\t1");
            }
        }
    }
}