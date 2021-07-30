public class Driver
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enqueue("Vikings");
		q.enqueue("Outlander");
		q.enqueue("Kim's Convenience");
		q.enqueue("Killing Eve");
		q.enqueue("Below Deck");
		System.out.println("Queue " + q);
		System.out.println("Front " + q.front());
		System.out.println("Dequeue 1 " + q.dequeue());
		System.out.println("Dequeue 2 " + q.dequeue());
		System.out.println("Dequeue all from q " + q);
		while(!q.isEmpty())
		{
			System.out.println("DQ " + q.dequeue());
		}
		System.out.println("Queue after dequeue all " + q);
	}
}