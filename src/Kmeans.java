import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kmeans {

	public static void main(String[] args) {
		
		String arqName = "iris.txt";
		List<Point> points = new ArrayList<Point>();
		
		FileDataReader reader = new FileDataReader(arqName);
		
		points = reader.retrivePointsFromDataSet();
		
		
		
	}

}
