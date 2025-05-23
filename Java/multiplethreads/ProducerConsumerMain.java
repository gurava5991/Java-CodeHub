package multiplethreads;
class SharedResource {
    int data;
    boolean available = false;

    public synchronized void produce(int data)  {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.data = data;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }
    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.consume();
        }
    }
}



public class ProducerConsumerMain {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);
        producer.start();
        consumer.start();
    }
}
