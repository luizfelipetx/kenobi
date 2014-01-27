package br.com.felpz.kenobi;

public class Triangulo {

	//vertice 1
	private Double x0 ;
	private Double y0;
	
	//vertice 2
	private Double x1;
	private Double y1;
	
	//vertice 3
	private Double x2;
	private Double y2;
	public Double getX0() {
		return x0;
	}
	public void setX0(Double x0) {
		this.x0 = x0;
	}
	public Double getY0() {
		return y0;
	}
	public void setY0(Double y0) {
		this.y0 = y0;
	}
	public Double getX1() {
		return x1;
	}
	public void setX1(Double x1) {
		this.x1 = x1;
	}
	public Double getY1() {
		return y1;
	}
	
	@Override
	public String toString() {
		return "Triangulo [x0=" + x0 + ", y0=" + y0 + ", x1=" + x1 + ", y1="
				+ y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
	}
	public void setY1(Double y1) {
		this.y1 = y1;
	}
	public Double getX2() {
		return x2;
	}
	public Triangulo(Double x0, Double y0, Double x1, Double y1, Double x2,
			Double y2) {
		super();
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void setX2(Double x2) {
		this.x2 = x2;
	}
	public Double getY2() {
		return y2;
	}
	public void setY2(Double y2) {
		this.y2 = y2;
	}
	
	
	
}
