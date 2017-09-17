
public class RunnerSmurf {
public static void main(String[] args) {
	Smurf Bob = new Smurf("Bob");
	System.out.println(Bob.getName());
	Bob.eat();

	 Smurf Papa = new Smurf("Papa");
	 Smurf Smurfette = new Smurf("Smurfette");
	 System.out.println(Papa.getName());
		System.out.println("My hat color is " +Papa.getHatColor());
		
		System.out.println("I am a " +Papa.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println("My hat color is "+Smurfette.getHatColor());
		
		System.out.println("I am a " +Smurfette.isGirlOrBoy());
}
}
