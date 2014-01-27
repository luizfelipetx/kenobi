package br.com.felpz.kenobi;

public class InsideTriagulo {

	
	 public static boolean pntInTriangle(double px, double py, double x1, double y1, double x2, double y2, double x3, double y3) {

		    double o1 = getOrientationResult(x1, y1, x2, y2, px, py);
		    double o2 = getOrientationResult(x2, y2, x3, y3, px, py);
		    double o3 = getOrientationResult(x3, y3, x1, y1, px, py);

		    return (o1 == o2) && (o2 == o3);
		}

		private static int getOrientationResult(double x1, double y1, double x2, double y2, double px, double py) {
		    double orientation = ((x2 - x1) * (py - y1)) - ((px - x1) * (y2 - y1));
		    if (orientation > 0) {
		        return 1;
		    }
		    else if (orientation < 0) {
		        return -1;
		    }
		    else {
		        return 0;
		    }
		}
}
