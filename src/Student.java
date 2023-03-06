import java.util.Scanner;
public class Student {
    // data/attributes
    Name name;
    private String kp;
    private String address;

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    private String schoolname;
    float[] marks = new float[5];

    // methods or operations
    float calcAvg(Student student) {
        float avg = 0;
        float sum = 0;
        for(int i=0; i<marks.length; i++){
            sum += student.marks[i];
        }
        avg = sum/(marks.length);
        return avg;
    }

    float calcMin(Student student) {
        float min = 100;
        int index = 0;
        for(int i=0; i<marks.length; i++){
            if (student.marks[i] < min){
                min = student.marks[i];
                index = i;
            }
        }
        return marks[index];
    }

    void setName(Name name) {
        this.name = name;
    }

    void setMark(float mark, int i) throws Exception {
        if (mark < 0)
            throw new Exception("Error in mark detected");
        else
            marks[i] = mark;
    }

    void displayMarks(Student student) {
        // print the marks
        for (int i=0; i<marks.length; i++) {
            System.out.println(student.name.getFname()+" marks for Subject "+i+" :"+marks[i]);
        }
        System.out.println("\n");
    }

    void addMark(Student student){
        for (int i=0; i<5; i++) {
            try {  // try block. something in here can cause exception
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter "+student.name.getFname()+ " mark for Subject " + (i + 1) + ": ");
                float mark = scanner.nextFloat();
                student.setMark(mark, i);
            } catch (Exception ex) {  // catch block. action to be taken
                // in case of Exception
                System.out.println("Cannot continue");
                ex.printStackTrace();
            }
        }
    }
}
