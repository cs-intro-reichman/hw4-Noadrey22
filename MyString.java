public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));
        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCaseNewSentence = "";
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                int asci = (int) str.charAt(i);
                asci += 32;
                lowerCaseNewSentence += (char) asci;
            } else {
                lowerCaseNewSentence += str.charAt(i);
            }
        }
        return lowerCaseNewSentence;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean flag = true;
        if (str1 == "") {
            return false;
        }
        if (str1.length() < str2.length()) {
            return false;
        }
        if (str2 == "") {
            return true;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            flag = true;
            if (str1.charAt(i) == str2.charAt(0)) {
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(j + i) != str2.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
