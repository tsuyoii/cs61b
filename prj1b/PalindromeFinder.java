import com.example.one.prj0.In;

//找出文件中字符数大于等于4并且是回文的单词并显示
public class PalindromeFinder {
    public static void main(String []args) {
        int minlength = 4;
        In a = new In("./words.txt");
        Palindrome palindrome = new Palindrome();
        while (!a.isEmpty()) {
            String word = a.readString();
            if (word.length() >= 4 && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}
