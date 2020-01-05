
public class Palindrome {
    //实现用Deque队列来顺序展示字符串word中的字符的签名
    public Deque<Character> wordToDeque(String word){
        ArrayDeque<Character> wordList = new ArrayDeque<>();
        for(int i=0;i<word.length();i++){
            //将char插入Deque<Character>,在字符串中获取第i个字符用.charAt(int index)方法
            wordList.addLast(word.charAt(i));
        }
        return wordList;
    }
}
