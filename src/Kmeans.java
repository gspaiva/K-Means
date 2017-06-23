import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kmeans {

	public static void main(String[] args) {
		
		//filename
		String fileName = "iris.txt";
		//read the file
		List<Point> points = new ArrayList<Point>();
		FileDataReader reader = new FileDataReader(fileName);
		//get points from dataset
		points = reader.retrivePointsFromDataSet();
		//list of clusters
		List<Cluster> clusters = new ArrayList<Cluster>();
		//number of clusters
		Scanner sc = new Scanner(System.in);
		int numberOfClusters = sc.nextInt();
		
		for(int i = 0 ; i < numberOfClusters;i++){
			Cluster cluster = new Cluster(Point.randomCentroid(points, 4));
			clusters.add(cluster);
		}
		
		//Kmeans algorithm
		
		
		
		
		
		System.out.println(Point.meanPoint(points,4).coordinates.toString());
		
		
		
		
	}

}

