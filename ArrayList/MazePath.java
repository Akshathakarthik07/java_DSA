package ArrayList;
import java.util.ArrayList;
public class MazePath {
    static ArrayList<String> list=new ArrayList<String>();
    public static void path(int n,int row,int col,String ans){
        if(row==n && col==n){
            list.add(ans);
        }
        if(row >n||col>n){
            return;
        }
        path(n,row,col+1,ans+"H");
        path(n,row+1,col,ans+"V");
        path(n,row+1,col+1,ans+"D");

    }
    public static void main(String args[]){
        path(2,0,0,"");
        System.out.println(list);
}

}

