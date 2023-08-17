import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("Mahmut hoca", "TRH","+905011001010");
    Teacher t2 = new Teacher("Graham Bell", "FZK", "00000");
    Teacher t3 = new Teacher("Külyutmaz", "BIO","111");

    Course tarih = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);
    Course fizik = new Course("Fizik", "102", "FZK");
    fizik.addTeacher(t2);
    Course biyoloji = new Course("Biyoloji", "103", "BIO");
    biyoloji.addTeacher(t3);
    Student s1 = new Student("İnek Şaban", "123","11/B",tarih,fizik,biyoloji);


    s1.addBulkExamNote(100,76,50);
    s1.isPass();
    Student s2 = new Student("Güdük Necmi", "456","11/c",tarih,fizik,biyoloji);
    s2.addBulkExamNote(70,50,45);
    s2.isPass();
    }

}