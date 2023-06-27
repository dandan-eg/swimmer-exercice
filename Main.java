package swimmer;


public class Main {
	
	public static void main(String[] args) {
		Swimmer s = new Swimmer(1);
		Pool p = new Pool(s, 12);
	
	
		for (int i = 0; i < 50; i++) {
			System.out.println(p.toString()); 
			s.swim();
		}
	}
}
