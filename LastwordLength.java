package week3.day2;

public class LastwordLength {

	
	public static void main(String[] args) {
		String S = "Hello World";
		String S1 = "   fly me   to   the moon  ";
		String S2 = "luffy is still joyboy";
				
		String [] words = S.split(" ");
		String lastword = words[words.length-1];
		System.out.println(lastword);
		
		
		String [] words1 = S1.split(" ");
		String lastword1 = words1[words1.length-1];
		System.out.println(lastword1);
		
		String [] words2 = S2.split(" ");
		String lastword2 = words2[words2.length-1];
		System.out.println(lastword2);
		
	}
}
