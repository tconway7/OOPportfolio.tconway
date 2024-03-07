
class Sphere {

	private double diameter;
	
	public Sphere(double diameter) {
        this.diameter = diameter;
    }
	public void setDiameter(double diameter) {
        this.diameter = diameter;
	}
	public double getDiameter() {
		return diameter;
	}
	public double getVolume() {
		return (4 / 3) * Math.PI * Math.pow((diameter / 2), 3);
	}
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(diameter / 2, 2);
	}			
    public String toString() {
        return "Diameter=" + diameter + ", Volume=" + getVolume() +
                ", Surface Area=" + getSurfaceArea();
    }
}

