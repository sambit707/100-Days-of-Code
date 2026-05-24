public class Set2 {

    public static void main(String[] args) {
        String s = "banglore";
        int vowelCount = 0;
        int consonantCount = 0;
        char ch[] = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }
         System.out.println("Vowelcount: " + vowelCount);
         System.out.println("consonantCount: " + consonantCount);
    }
}