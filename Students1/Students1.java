package Students1;

public class Students1 {
    int rollNumber;
    String name;
    int mark1,mark2,mark3,mark4,mark5;
    int total;
    int average;
    int percentage;
    void insert(int i,String n,int m1,int m2,int m3,int m4,int m5){
        rollNumber = i;
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
        mark5 = m5;
        total = m1+m2+m3+m4+m5;
        average= total/5;
        percentage = average;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Marks:"+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5);
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);
        System.out.println("Percentage:"+percentage+"%");
    }
}
