package queueDemo;

class Queue {
    Student front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(Student student) {

        Student temp = new Student(student.studentNumber, student.studentName);

        if (this.rear == null) {
            this.front = this.rear = temp;
            System.out.println(temp + " sıraya girdi.");
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
        System.out.println(temp + " sıraya eklendi.");
    }

    void dequeue() {

        if (this.front == null) return;

        Student temp = this.front;
        this.front = this.front.next;

        if (this.front == null) this.rear = null;

        System.out.println(temp + " sıradan ayrıldı.");
    }
}

