package pack1;

import java.util.Objects;

public class Circle {

	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(r);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return r == other.r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	public  double getArea() {
		return 3.14*r*r;
	}
	
	
}
