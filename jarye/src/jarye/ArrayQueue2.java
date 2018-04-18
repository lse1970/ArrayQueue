package jarye;

public class ArrayQueue2 {
	 static int rear=-1;
	 static int front=-1;
	 static char[] queue = new char[10];
	 public static void main(String[] args) {
	  enQueue('A');
	  printQueue();
	  enQueue('B');
	  printQueue();
	  enQueue('C');
	  printQueue();
	  deQueue();
	  printQueue();
	  enQueue('D');
	  printQueue();
	  deQueue();
	  printQueue();
	  deQueue();
	  printQueue();
	  enQueue('E');
	  printQueue();
	  deQueue();
	  printQueue();
	 }
	 static void enQueue(char data) {
	  queue[++rear] = data;
	 }
	 static void deQueue() {
	  //System.out.printf("%c", queue[++front]);
	  ++front;
	 }
	 static void printQueue() {
	  for(int i=front+1;i<=rear;i++) System.out.printf("%c", queue[i]);
	  System.out.println();
	 }
	}