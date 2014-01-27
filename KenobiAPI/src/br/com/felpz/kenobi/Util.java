package br.com.felpz.kenobi;

public class Util {

	public  boolean inLocation(Double px,Double py,Triangulo t[])
	{
		boolean insidePoligono = false;
		
		for (int i = 0; i < t.length; i++) {
		
		 insidePoligono = (
				 InsideTriagulo.pntInTriangle(
						 px, py,
						 t[i].getX0(),t[i].getY0(),
						 t[i].getX1(),t[i].getY1(), 
						 t[i].getX2(), t[i].getY2()));
		 
		 if(insidePoligono)
			 		return true;
		}
		
		return false;
	}
	public boolean isNearPoints(Ponto origem,Ponto outroPonto, int distanciaEmKm){
		
		Triangulo[] triangulo = geraTriangulo(Double.valueOf(origem.getLat()), Double.valueOf(origem.getLon()), distanciaEmKm);
		boolean pointIsNearAnotherPoint =  inLocation(Double.valueOf( origem.getLat()), Double.valueOf(origem.getLon()), triangulo);
		
		return pointIsNearAnotherPoint;
	}
	
	//recupera 4 triagulos pra fazero quadrado.
	public  Triangulo[] geraTriangulo(Double x0,Double y0,int fat){
		//gerando triango
		Double fator = geraFator(fat);
		
		//triagulo 1 pontos
		
		//veritice 1
		Double t1X1 = x0;
		Double t1Y1 = y0;
		//veritice 2
		Double t1X2 = x0;
		Double t1Y2 = y0 + fator;
		//vertice 3
		Double t1X3 = x0 + fator;
		Double t1Y3 = y0;
		
		
		
		//triagulo 2 pontos

		//veritice 1
		Double t2X1 = x0;
		Double t2Y1 = y0;
		//veritice 2
		Double t2X2 = x0;
		Double t2Y2 = (y0 ) +( (fator)*(-1));
		//vertice 3
		Double t2X3 = x0 + fator;
		Double t2Y3 = y0;
		
		
		//triagulo 3 pontos

		//veritice 1
		Double t3X1 = x0;
		Double t3Y1 = y0;
		//veritice 2
		Double t3X2 = (x0 + 0)    +  ((fator) *(-1));
		Double t3Y2 = (y0 );
		//vertice 3
		Double t3X3 = x0 ;
		Double t3Y3 = (y0) + (( fator) * (-1));
		
		//triagulo 4 pontos

		//veritice 1
		Double t4X1 = x0;
		Double t4Y1 = y0;
		//veritice 2
		Double t4X2 = x0;
		Double t4Y2 = (y0 + fator)*(1);
		//vertice 3
		Double t4X3 = (x0)  + ((fator)*(-1));
		Double t4Y3 = y0;
		
		
		Triangulo t1 = new Triangulo(t1X1, t1Y1, t1X2, t1Y2, t1X3, t1Y3);
		Triangulo t2 = new Triangulo(t2X1, t2Y1, t2X2, t2Y2, t2X3, t2Y3);
		Triangulo t3 = new Triangulo(t3X1, t3Y1, t3X2, t3Y2, t3X3, t3Y3);
		Triangulo t4 = new Triangulo(t4X1, t4Y1, t4X2, t4Y2, t4X3, t4Y3);
		
		
		
		Triangulo t[] = new Triangulo[4] ;
		
		t[0]= t1;
		t[1]= t2;
		t[2]= t3;
		t[3]= t4;
		
		for (Triangulo triangulo : t) {
			System.out.println(triangulo);
		}
		return t;
	}
	
	static Double geraFator(int kmRaio)
	{
		if(kmRaio==0 || kmRaio==2)
		{
			return 0.01325d;
		}else{
			return kmRaio * 0.01325;
		}
	}
	
	public static void display(Double x1,Double x2,Double y1,Double y2)
	  {   
	     Double difx = (x2 - x1) * (x2 - x1);
		 Double dify = (y2 - y1) * (y2 - y1);
		 Double d = Math.sqrt(difx + dify);
	      System.out.println("\n Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is : " + d + " unit(s) " );
	  }
	public static Double display2(Double x1,Double x2,Double y1,Double y2)
	  {   
	     Double difx = (x2 - x1) * (x2 - x1);
		 Double dify = (y2 - y1) * (y2 - y1);
		 Double d = Math.sqrt(difx + dify);
	      System.out.println("\n Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is : " + d + " unit(s) " );
	 return d;
	  }
	
}