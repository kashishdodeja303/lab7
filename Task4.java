public class Task4 {

 public static void countVowelsAndConsonants(String str) {
    int vowels = 0;
     int consonants = 0;
     str = str.toLowerCase(); 
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (Character.isLetter(ch)) {
         if (isVowel(ch)) {
         vowels++;
                } else {
        consonants++;
            }
            }
               }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}
