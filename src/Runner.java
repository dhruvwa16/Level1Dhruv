
public class Runner {
   public static void main(String[] args) {
	

	SeaCreature Spongebob = new SeaCreature("Spongebob");
    Spongebob.eat();
    Spongebob.laugh();
   String a = Spongebob.getName();
   System.out.print(a);
    SeaCreature Squidward = new SeaCreature("Squidward");
    SeaCreature Patrick = new SeaCreature("Patrick");
   Squidward.eat();
   Squidward.laugh();
   String b = Squidward.getName();
   System.out.print(b);
    Patrick.eat();
    Patrick.laugh();
    String c = Patrick.getName();
    System.out.print(c);
}
}
