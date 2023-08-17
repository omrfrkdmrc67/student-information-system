public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }
    void addBulkExamNote(int not1,int not2,int not3){
        if (not1>=0 && not1 <= 100 ){
        this.c1.note = not1;
        }
        if (not2 >= 0 && not2 <=100){
        this.c2.note = not2;
        }
        if (not3>= 0 && not3 <= 100){
        this.c3.note = not3;
        }
    }


    void isPass(){
        System.out.println("========================");
        this.average = (this.c1.note + this.c2.note +this.c3.note) / 3.0;
        if (this.average > 55){
            System.out.println("Hababam Sınıfı Uyanıyor!! ");
            this.isPass = true;
        }else{
            System.out.println("Hababam Sınıfı Sınıfta Kaldı!!");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name+ " Notu\t: "+ this.c1.note);
        System.out.println(this.c2.name+ " Notu\t: "+ this.c2.note);
        System.out.println(this.c3.name+ " Notu\t: "+ this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
