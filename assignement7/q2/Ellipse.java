package assignement7.q2;

public class Ellipse implements ClosedCurve{
	private double semiMajorAxis;
	private double eccentricity;

	Ellipse(double s, double e){
		this.eccentricity = e;
		this.semiMajorAxis = s;
	}
	
	@Override
	public double computePerimeter() {
		return 4*semiMajorAxis*eccentricity;
	}

}
