
public class Sphere {

	public Sphere(double diameter) {
        this.diameter = diameter;
    }
	public void setDiameter(double diameter) {
        this.diameter = diameter;
	}
	public double getDiameter() {
		return diameter;
	}
	public double volume() {
		return (4 / 3) * Math.PI * Math.pow((diameter / 2), 3);
	}
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow((diameter / 2), 2)
	}
}
