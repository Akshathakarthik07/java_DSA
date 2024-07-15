package Students;

class Students {
    int rollNumber;
    String name;
    void insertRecord(int r, String n){
        rollNumber=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollNumber+" "+name);
    }
}
