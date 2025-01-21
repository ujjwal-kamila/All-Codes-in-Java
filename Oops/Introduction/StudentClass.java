public class StudentClass {

    public static void main(String[] args) {
        // store 5 roll numbers and names
        int[] numbers = new int[5];
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Array of Student objects
        Student[] students = new Student[5]; // students will store Student objects but remain uninitialized

        // Creating and initializing individual Student objects
        Student ujjwal = new Student(33, "Ujjwal Kamila", 88.3f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

        // Print properties of `ujjwal`
        System.out.println("\nUjjwal's Details: \n");
        System.out.println(ujjwal.name);
        System.out.println(ujjwal.rollno);
        System.out.println(ujjwal.marks);

        System.out.println("\nRahul's Details: \n");
        System.out.println("Name: " + rahul.name);
        System.out.println("Roll No: " + rahul.rollno);
        System.out.println("Marks: " + rahul.marks);

        // ujjwal.changename("Raj");
        // ujjwal.greeting();

        
        // Student ujjwal = new Student();

        // Using copy constructor
        Student random = new Student(ujjwal);
        System.out.println(random.name);

        // Creating a default Student object
        Student random2 = new Student();
        System.out.println(random2.name);

        // Demonstrating shared references
        Student one = new Student();
        Student two = one; // Both `one` and `two` refer to the same object

        one.name = "Something something"; 
        System.out.println(two.name);
    }
}

// Create a class for every single student
class Student {
    int rollno;
    String name;
    float marks;

    // Default constructor
    Student() {
        this(13, "Default Person", 90.0f); // Call the parameterized constructor
    }

    // Parameterized constructor
    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello, My name is: " + this.name);
    }

    void changename(String newname) {
        this.name = newname;
    }
}
