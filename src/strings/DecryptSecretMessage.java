package strings;



public class DecryptSecretMessage {
    public static void main(String[] args) {
        String message = "t1e1s2t, Hell1o, 1th1e, fir2st1; is5; fine6";
        StringBuilder finalString = new StringBuilder();
        String[] decryptedMessage = solution(message);
        for (String token: decryptedMessage) {
            if (token != null){
                finalString.append(token);
                finalString.append(" ");
            }
        }
        System.out.println(finalString);
    }

    private static String[] solution(String message) {
        int sum = 0;
        message = message.replaceAll("[^A-Za-z0-9]", " ");
        String[] finalString = message.split(" ");
        String[] finalString2 = new String[finalString.length];
        for (String token: finalString) {
            if (!token.trim().equals("")){
                for (int i = 0; i < token.length(); i++) {
                    if (Character.isDigit(token.charAt(i))){
                        sum += Integer.parseInt(token.charAt(i)+"");
                    }
                }
                token = token.replaceAll("[0-9]","");
                finalString2[sum] = token;
            }
            sum = 0;
        }
        return finalString2;
    }
}
