package googleChallanges;

public class I_love_Janice {
    public static void main(String[] args) {
        String string= "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
        String encryptedString = solution(string);
        System.out.println(encryptedString);
    }

    public static String solution(String string) {
        StringBuilder decipheredString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int ASCIIValue = string.charAt(i);
            if (ASCIIValue>= 97 && ASCIIValue <= 122){
                int differenceFromLowerCase_a = 122 - (ASCIIValue - 97);
                decipheredString.append((char) differenceFromLowerCase_a);
            }
            else{
                decipheredString.append(string.charAt(i));
            }
        }
        return decipheredString.toString();
    }
}
