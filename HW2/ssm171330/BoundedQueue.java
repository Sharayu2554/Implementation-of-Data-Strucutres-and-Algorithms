
package ssm171330;
import java.util.Arrays;
import java.util.Scanner;

public class BoundedQueue<T> {
    Object[] queue;
    int capacity;
    int size;
    int front, rear;

    public BoundedQueue(int size) {
        this.queue = new Object[size];
        this.size = 0;
        this.capacity = size;
        front = rear = -1;
    }

    //add
    boolean offer(T x) {
        if(size == capacity) {
            return false;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = x ;
        size++;
        return true;
    }

    //remove
    T poll() {
        if (size == 0){
            return null;
        }

        T data = ((T) queue[front]);
        if ( front == rear ){
            front = rear = -1;
        }
        else {
            front = (front + 1) % capacity;
        }
        size--;
        return data;
    }

    T peek() {
        if (size == 0) return null;
        return ((T) queue[front]);
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void clear() {
        front = rear = -1;
        size = 0;
    }

    void toArray(T[] a) {
        int index = 0;

        for (int i = front; index < size ; ) {
            a[index] = ((T) queue[i]);
            i = (i + 1) % capacity;
            index++;
        }
    }

    void print() {
        int index = 0;
        for (int i = front; index < size ; ) {
            System.out.print((T) queue[i] + " , ");
            i = (i + 1) % capacity;
            index++;
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        int n = 10;
        if(args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        BoundedQueue<Integer> q = new BoundedQueue<>(n);
        for(int i=1; i<= n; i++) {
            q.offer(i);
        }

        q.print();

        Scanner in= new Scanner(System.in);
        whileloop:
        while(in.hasNext()) {
            int com = in.nextInt();
            switch(com) {
                case 1:
                    System.out.println(q.offer(in.nextInt()));
                    q.print();
                    break;
                case 2:
                    System.out.println(q.poll());
                    q.print();
                    break;
                case 3:
                    System.out.println(" size : " + q.size() );
                    break;
                case 4:
                    if(!q.isEmpty()) {
                        Integer temp[] = new Integer[q.size()];
                        q.toArray(temp);
                        System.out.println(" Array : " + Arrays.toString(temp));
                    }
                    break;
                case 5:
                    q.print();
                    break;
                default:  // Exit loop
                    break whileloop;
             }
        }
    }

}
