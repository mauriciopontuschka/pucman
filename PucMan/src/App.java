
public class App {

	public static void main(String[] args) {
		Posicao p1 = new Posicao("A");
		Posicao p2 = new Posicao("B");
		Posicao p3 = new Posicao("C");
		Posicao p4 = new Posicao("D");
		
		p1.addPath('s', p2);
		p1.addPath('s', p3);
		
		p2.addPath('s', p4);
		p2.addPath('a', p1);

		p3.addPath('w', p1);
		p3.addPath('d', p4);

		p4.addPath('a', p3);
		p4.addPath('w', p2);
		
		

	}

}
