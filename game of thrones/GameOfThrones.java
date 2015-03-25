package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameOfThrones {
	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        Set<Character> hs = new HashSet<Character>();
        for(int i=0;i<inputString.length();i++)
        {
            if(hs.contains(inputString.charAt(i)))
                hs.remove(inputString.charAt(i));
            else
                hs.add(inputString.charAt(i));
        }
        if(hs.size()>1)
            ans = "NO";
        else
            ans = "YES";
        System.out.println(ans);
        myScan.close();
    }

}
