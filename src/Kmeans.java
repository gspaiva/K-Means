import java.util.ArrayList;
import java.util.List;

public class Kmeans {

	public static void main(String[] args) {
		
		String fileName = "iris.txt";
		
		List<Point> points = new ArrayList<Point>();
		FileDataReader reader = new FileDataReader(fileName);
		
		points = reader.retrivePointsFromDataSet();
		
		
	}

}

