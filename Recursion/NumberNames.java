package Recursion;

public class NumberNames {
    public static void convert(String[] str, String num, int i,int count){
        if(i<=num.length()-1){
            count++;
            int ans = Character.getNumericValue(num.charAt(i));
            System.out.print(str[ans]+" ");
        }
        if(i==num.length()){
            System.out.println(",The number is "+count);
            return;
        }
        convert(str,num,i+1,count);
    }
    public static void main(String args[]){
        String[] str= {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int count=0;
        String number = "219";
        convert(str,number,0,0);
    }
}
