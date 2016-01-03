package Lists.Queue;


public class TheQueue {
    private String[] queueArray;
    private int queueSize;

    private int front, rear, numberOfItems = 0;

    public TheQueue(int value) {
        queueSize = value;
        queueArray = new String[queueSize];
    }

    public void insert(String value){
        if(numberOfItems + 1 <=  queueSize){
            queueArray[front] = value;
            front++;
            numberOfItems++;
        }
    }
}
