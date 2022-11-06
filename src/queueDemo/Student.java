package queueDemo;

class Student {
    int studentNumber;
    String studentName;
    Student next;

    // constructor to create a new linked list node
    public Student(int studentNumber,String studentName)
    {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.next = null;
    }


    @Override
    public String toString() {
        return studentNumber + " numaralı " + studentName;
    }
}

// A class to represent a queue
// The queue, front stores the front node of LL and rear
// stores the last node of LL
class Queue {
    Student front, rear;

    public Queue() { this.front = this.rear = null; }

    // Method to add an key to the queue.
    void enqueue(Student student)
    {

        // Create a new LL node
        Student temp = new Student(student.studentNumber,student.studentName);

        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change
        // rear
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;

        // Store previous front and move front one node
        // ahead
        Student temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }
}

// Driver class
public class Main {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        Student student1 = new Student(1,"Hakan");
        Student student2 = new Student(2,"Ali");
        Student student3 = new Student(3,"Furkan");
        Student student4 = new Student(4,"Ayşe");
        Student student5 = new Student(5,"Bedirhan");
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
// This code is contributed by Gaurav Miglani