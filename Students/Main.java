package Students;

public class Main {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.insertRecord(01, "Akshatha K");
        Students s3 = new Students();
        s3.insertRecord(02, "Mathiveendhan");
        Students s4 = new Students();
        s4.insertRecord(03, "Bhavatharany");
        s1.displayInformation();
        s3.displayInformation();
        s4.displayInformation();

    }
}