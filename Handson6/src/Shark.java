
public class Shark extends Fish{
protected String Kind="Shark";
public static void main(String[] args) {
	Shark s=new Shark();
	System.out.println(s.Kind+" is an "+ s.Family+" which lives in "+s.Habitat+", hence it is "+ s.type);
}
}
