public class CLASSES_IN_JAVA {
    public static void main(String [ ] args){
        Student rahul = new Student();
        // method 1 of modifing an object;
//        rahul.rollno = 15;
//        rahul.name = "rahul kushwaha";
//        rahul.marks = 90.82f;
        Student rohit = new Student(16,"rohit" , 45.3f);
//        System.out.println(rohit.rollno);
//        System.out.println(rohit.name);
//        System.out.println(rohit.marks);
        final int a = 10;

    }
    static class Student {
        int rollno;
        String name;
        float marks;

        Student() {
            this.rollno = 13;
            this.name = "rahul kushwaha" ;
            this.marks = 82.3f ;
        }
        Student(int roll , String naam, float mark){
            this.rollno = roll;
            this.name = naam;
            this.marks = mark;
        }
    }
}
