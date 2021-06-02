package com.test.Session3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public int x=8;

    class Inner {
        public int x = 9;

        void m(int x) {
            System.out.println("The inner menthod is invoked " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Test.this.x = " + Test.this.x);
        }


    }

        public static void main(String[] args) {
            new Test().new Inner().m(5);
            String s = "ManiMani";
            int[] freq = new int[s.length()];
            int i, j;

            //Converts given string into character array
            char string[] = s.toCharArray();

            for(i = 0; i <s.length(); i++) {
                freq[i] = 1;
                for(j = i+1; j <s.length(); j++) {
                    if(string[i] == string[j]) {
                        freq[i]++;

                        //Set string[j] to 0 to avoid printing visited character
                        string[j] = '0';
                    }
                }
            }

            //Displays the each character and their corresponding frequency
            System.out.println("Characters and their corresponding frequencies");
            for(i = 0; i <freq.length; i++) {
                if(string[i] != ' ' && string[i] != '0')
                    System.out.println(string[i] + "-" + freq[i]);
            }





            int[] values={1,9,8,9,6,5,5,4};
            Map<Integer, Integer> freqs = new HashMap<>();
            for (Integer c : values) {
                freqs.merge(c,                  // key = char
                        1,                  // value to merge
                        Integer::sum);      // counting

               // freqs.merge(c, i, Integer::sum);
            }
            System.out.println("Frequencies:\n" + freqs);
            //Iterator iterator=freqs.entrySet().iterator();



    }

}
