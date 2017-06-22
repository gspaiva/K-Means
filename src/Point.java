import java.util.List;

public class Point {
	
	public List<Double> coordinates;
	
	public Point(List c){
		
		this.coordinates = c; 
			
	}
	
	public static double calcEuclidianDistance(Point p1, Point p2, int numberCoordinates){
		
		double sum = 0 ;
		for(int i =0 ; i < numberCoordinates; i++){
			sum += Math.pow((p1.coordinates.get(i) - p2.coordinates.get(i)),2);
		}
		double distance  = Math.sqrt(sum);
		
		return distance;
		
	}
	
}
