class MyCircularQueue {
    private int[] queue;
    private int front, rear, size;
     public MyCircularQueue(int k) {
        queue = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }
    public boolean enQueue(int value) {
        if ((rear + 1) % size == front) {
            return false; //Full?
        }
        if (front == -1) {
            front = 0; //Empty?
        }
        rear = (rear + 1) % size;//general case!
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if (front == -1) {
            return false; //Empty??
        }
        
        if (front == rear) {
            front = rear = -1; // would be same only initially
        } else {
            front = (front + 1) % size;
        }
        return true;
    }
    
    public int Front() {
        if (front == -1) {
            return -1; // Queue is empty
        }
        return queue[front];
    }
    
    public int Rear() {
        if (rear == -1) {
            return -1; // Queue is empty
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */