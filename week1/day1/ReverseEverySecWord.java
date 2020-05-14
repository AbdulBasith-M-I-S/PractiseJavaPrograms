package week1.day1;

public class ReverseEverySecWord {

	public static void main(String[] args) {
		
		
		/*Write a java program to do the following.
		Input: "When the world realise its own mistakes, corona will dissolve automatically"
		output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically" */
		
		//1st approach (String Builder)
		System.out.println("1st approach");
		String text3 = "When the world realise its own mistakes, corona will dissolve automatically" ;
		String[] splitWords = text3.split(" ");
      
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitWords.length; i++) {
			//i % 2 returns the remainder after divising i by 2 
        	// ( eg: 0/2 = 0 , it will print same word "When") , " " - append white space each words
        	if(i%2 == 0) {
				sb.append(splitWords[i] + " ");
        	}
        	//(eg : 1/2 !=0 , it will revese the word "eht")
        	else {
        		sb.append(new StringBuilder(splitWords[i]).reverse() + " ");
			}
		}
            System.out.println(sb.toString());
        
        
        //2nd approach (String Buffer)
		System.out.println("2nd approach");
        String text4 = "When the world realise its own mistakes, corona will dissolve automatically" ;
		String[] splitWords2 = text4.split(" ");
        
		StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < splitWords2.length; i++) {
			//i % 2 returns the remainder after divising i by 2 
        	// ( eg: 0/2 = 0 , it will print same word "When")
        	if(i%2 == 0) {
				strBuf.append(splitWords2[i] + " ");
        	}
        	//(eg : 1/2 !=0 , it will revese the word "eht")
        	else {
        		strBuf.append(new StringBuffer(splitWords2[i]).reverse() + " ");
			}
		}
            System.out.println(strBuf.toString());


	}

}
