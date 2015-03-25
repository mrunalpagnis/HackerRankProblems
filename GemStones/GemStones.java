package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GemStones {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScan = new Scanner(System.in);
        int total = Integer.parseInt(myScan.nextLine());
        String inputString[] = new String[total];
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int n=0;n<total;n++)
        {
            inputString[n] = myScan.nextLine();
        }
        for(int i=0;i<inputString[0].length();i++)
            {
                hm.put(inputString[0].charAt(i),1);
            }
        for(int n=1;n<total;n++)
        {
            for(int i=0;i<inputString[n].length();i++)
            {
                if(hm.containsKey(inputString[n].charAt(i)) && hm.get(inputString[n].charAt(i))==n)
                    hm.put(inputString[n].charAt(i),n+1);
            }
        }
        int ans = 0;
        for(Map.Entry<Character, Integer> entry: hm.entrySet())
        {
            if(entry.getValue()==total)
            {
                 ans++;
            }   
        }
        System.out.print(ans);
        myScan.close();
    }
}
