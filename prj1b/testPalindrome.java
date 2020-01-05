import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testPalindrome {
    /*法一
    public static void main(String args[]){
        testWordToDeque();
    }
    public static void testWordToDeque(){
        Palindrome testWord = new Palindrome();
        Deque wordList = testWord.wordToDeque("persiflage");
        checkStringToChar("persiflage",wordList);
    }
    public static void checkStringToChar(String expect,Deque d){
        String actual = "";
        for(int i=0;i<expect.length();i++){
            actual += d.get(i);
        }
        assertEquals(expect,actual);
    }
*/

/***@Test表示测试，可以不用写main方法***/
    static Palindrome palindrome = new Palindrome();
    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        /**具体使用可以参见jUnit使用文档，网页http://junit.sourceforge.net/javadoc/org/junit/Assert.html**/
        assertEquals("persiflage", actual);
    }

}