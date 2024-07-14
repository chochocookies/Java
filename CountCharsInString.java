public class CountCharsInString {
    public static void main(String[] args) {
        String exampleString = "12345";

        int stringLength = exampleString.length();
        char temp;

        for (int i = 0; i < exampleString.length(); i++) {
            temp = exampleString.charAt(i);
            int a = Character.getNumericValue(temp);
            System.out.print(temp);
            switch (a) {
                case 1:
                    System.out.println(" = satu");
                    break;
                case 2:
                    System.out.println(" = dua");
                    break;
                case 3:
                    System.out.println(" = tiga");
                    break;
                case 4:
                    System.out.println(" = empat");
                    break;
                case 5:
                    System.out.println(" = lima");
                    break;
                case 6:
                    System.out.println(" = enam");
                    break;
                case 7:
                    System.out.println(" = tujuh");
                    break;
                case 8:
                    System.out.println(" = delapan");
                    break;
                case 9:
                    System.out.println(" = sembilan");
                    break;
                default:
                    System.out.println(" = kosong");
            }
        }
    }
}
