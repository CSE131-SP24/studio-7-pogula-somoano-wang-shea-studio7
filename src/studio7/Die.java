package studio7;

public class Die {
	private int n;

	public Die(int initn) {
		n = initn;
		
	}
	
	public int random(int n) {
		int k = (int) ((Math.random()*n)+1);
		return k;
	}
}
