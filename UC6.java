public class UC6 {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " **     ** ",
            "**       **",
            "**       **",
            "**       **",
            " **     ** ",
            "  *****  "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " **     ** ",
            " **     ** ",
            " ******  ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            "  ****** ",
            " **      ",
            " **      ",
            "  *****  ",
            "       **",
            "       **",
            " ******  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Printing O O P S
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}