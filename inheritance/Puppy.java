package inheritance;

public class Puppy extends Dog {
	public void play() {
		System.out.println("Playing");
	}
	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.play();
	}

}