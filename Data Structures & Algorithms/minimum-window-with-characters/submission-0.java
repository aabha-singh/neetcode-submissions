class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        for(int i =0;i<t.length();i++){
            char ch =t.charAt(i);
            count[ch]++;
        }
        int left =0;
        int start =0;
        int minlength =Integer.MAX_VALUE;
        int required =t.length();
        for(int right=0;right<s.length();right++){
            char ch =s.charAt(right);

            if(count[ch]>0){
                required--;
            }
            count[ch]--;

        while(required==0){
            if(right-left+1<minlength){
                minlength=right-left+1;
                start =left;
            }
               char leftChar = s.charAt(left);

                count[leftChar]++;

                // important char removed
                if (count[leftChar] > 0) {

                    required++;
                }

                left++;
            }
        }
           if (minlength == Integer.MAX_VALUE) {

            return "";
        }

        return s.substring(start, start + minlength);
    }

        }

    

