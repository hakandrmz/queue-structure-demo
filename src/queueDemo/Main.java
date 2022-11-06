package queueDemo;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Student student1 = new Student(1, "Hakan");
        Student student2 = new Student(2, "Ali");
        Student student3 = new Student(3, "Furkan");
        Student student4 = new Student(4, "Ayşe");
        Student student5 = new Student(5, "Bedirhan");
        q.enqueue(student1);
        q.enqueue(student2);
        q.dequeue();
        q.dequeue();
        q.enqueue(student3);
        q.enqueue(student4);
        q.enqueue(student5);
        q.dequeue();
        System.out.println("Sıranın önündeki öğrenci : " + q.front.studentNumber + " numaralı " + q.front.studentName);
        System.out.println("Sıranın sonundaki öğrenci : " + q.rear.studentNumber + " numaralı " + q.rear.studentName);
    }
}
