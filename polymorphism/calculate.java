package polymorphism;

public class calculate {
    int a,b,c,i,j,d;
    double dou;
    calculate(){
        this.a=a;
        this.b=b;
        this.c=c;
        this.i=i;
        this.j=j;
    }
    void add(int i,int j){
        d=i+j;
        System.out.println("add of these two numbers is "+d);
    }
    void add(int a,int b,int c){
        int s=a+b+c;
        System.out.println("add of these three numbers is "+s);
    }
    void add(double i,double j){
        double du=i+j;
        System.out.println("add of these two numbers is "+du);
    }
    void add(double a,double b,double c){
        double dou=a+b+c;
        System.out.println("add of these three numbers is "+dou);
    }

}
