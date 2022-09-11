package ObserverDesignPattern;

public class Youtube {

	
	public static void main(String[] args) {
		
		Channel ch = new Channel();
		
		Subscriber s1 = new Subscriber("Pushkar");
		Subscriber s2 = new Subscriber("Saket");
		Subscriber s3 = new Subscriber("Amol");
		Subscriber s4 = new Subscriber("Savi");
		Subscriber s5 = new Subscriber("Nitesh");
		
		ch.subscribe(s1);
		ch.subscribe(s2);
		ch.subscribe(s3);
		ch.subscribe(s4);
		ch.subscribe(s5);
		
		ch.unSubscribe(s4);
		
		s1.subscibeChannel(ch);
		s2.subscibeChannel(ch);
		s3.subscibeChannel(ch);
		s4.subscibeChannel(ch);
		s5.subscibeChannel(ch);
		
		ch.upload("How to learn Java");
		
	}
	
}
