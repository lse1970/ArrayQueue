package jarye;

public class ArrayQueue {
	static char queue[]  =new char[5];
	static int rear=-1, front=-1;
	public static void main(String[] args) {
		enQueue('A');
		enQueue('B');
		enQueue('C');
		deQueue();
		deQueue();
		deQueue();
		deQueue();

	}
	static void enQueue(char data) {
		queue[++rear] = data;
	}
	static void deQueue()	{
		System.out.println(queue[++front]);
	}
	

}
