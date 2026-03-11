public class UC5 {
    public static void main(String[] args) {

        // Inline declaration + initialization using String.join()
        String[] banner = {
            String.join("", " ***  ", " ***  ", " ***** ", " ***** "),
            String.join("", "*   * ", "*   * ", "*     ", "*     "),
            String.join("", "*   * ", "*   * ", "*     ", "*     "),
            String.join("", "*   * ", "*   * ", "***** ", "***** "),
            String.join("", "*   * ", "*   * ", "*     ", "    * "),
            String.join("", "*   * ", "*   * ", "*     ", "    * "),
            String.join("", " ***  ", " ***  ", " ***** ", "***** ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}