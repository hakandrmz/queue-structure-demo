package queueDemo;

class Student {
    int studentNumber;
    String studentName;
    Student next;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.next = null;
    }


    @Override
    public String toString() {
        return studentNumber + " numaralı " + studentName;
    }
}