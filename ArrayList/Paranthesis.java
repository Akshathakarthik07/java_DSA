package ArrayList;

import java.util.ArrayList;

public class Paranthesis {
        static ArrayList<String> list=new ArrayList<String>();
        public static void paranthesis(String ans, int open,int close,int n){
            if(open==n&&close==n){
                list.add(ans);
            }
            if(open>n||close>n){
                return;
            }
            paranthesis(ans+"(",open+1,close,n);
            if(close<open){
                paranthesis(ans+")",open,close+1,n);
            }
        }
        public static void main(String args[]){
            paranthesis("",0,0,3);
            System.out.println(list);
        }
    }


