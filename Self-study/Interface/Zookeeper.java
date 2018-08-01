package interfacePractice;

public class Zookeeper {
	public void feed(Predator predator) {
		String food = predator.getFood();
		System.out.println("feed "+food);
	}
	
	public static void main(String[] args) {
		Zookeeper zooKeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
	}
}
