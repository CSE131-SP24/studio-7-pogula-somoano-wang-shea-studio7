package studio7;

public class Rectangle {
	private int w;
	private int l;



public Rectangle(int initw, int initl) {
	w=initw;
	l = initl;
	
}

public int area(int w, int l) {
	return w*l;
}

public int perim(int w, int l) {
	return w+l+w+l;
}

public boolean square(int w, int l) {
	if(w==l) {
		return true;
	}
	else {
		return false;
	}
}

}


