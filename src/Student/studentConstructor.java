package Student;

public class studentConstructor {

	String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    
    studentConstructor(String k, int b, char v, char h, int s1, int s2, int s3){
        name = k;
        age = b;
        section = v;
        gender = h;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    public int marks(){
        return subject1+subject2+subject3;
    }
    public float percentage(){
        return (marks()*100)/300;
    }
    public static void main(String[] args) {
        studentConstructor s1 = new studentConstructor("Yuvraj", 24, 'A','M', 77,79,89);
        studentConstructor s2 = new studentConstructor("sehwag", 29, 'B','M', 0,56,65);
        studentConstructor s3 = new studentConstructor("sachin", 21, 'A','M', 0,89,66);
        studentConstructor s4 = new studentConstructor("hardik", 24, 'B','F', 79,98,87);
        
        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
        System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s3 " + s3.percentage());
        System.out.println("Marks of student s4 "+ s4.marks() + " Percentage of student s4 " + s4.percentage());
	}

}
