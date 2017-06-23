import java.util.ArrayList;
import java.util.List;

public class Cluster {
	
	private Point point;
	private List<Point> pointsOfGroup;

	public Cluster(Point point) {
		this.point = point;
		pointsOfGroup = new ArrayList<>();
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	public void addPointToCluster(Point p){
		this.pointsOfGroup.add(p);
	}
	

	
}
