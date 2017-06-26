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


        //Kmeans algorithm

        // here we random the initial centroids
        for (int i = 0; i < numberOfClusters; i++) {
            Cluster cluster = new Cluster(Point.randomCentroid(points, 4));
            clusters.add(cluster);
            System.out.println(cluster.getPoint().coordinates.toString());
        }

        // begin the clustering
        int cont = 0;

        while (cont < 500) {

            for (int i = 0; i < points.size(); i++) {
                Point p = points.get(i);
                CandidateCluster candidate =
                        new CandidateCluster(clusters.get(0), Point.calcEuclidianDistance(clusters.get(0).getPoint(), p, 4), p);
                for (int j = 1; j < numberOfClusters; j++) {
                    Cluster c = clusters.get(j);
                    double dist = Point.calcEuclidianDistance(c.getPoint(), p, 4);
                    if (dist < candidate.getDist()) {
                        candidate.setC(c);
                        candidate.setDist(dist);
                    }

                }

                int indexOfCluster = clusters.indexOf(candidate.getC());

                if (!clusters.get(indexOfCluster).getPointsOfGroup().contains(p))
                    clusters.get(indexOfCluster).addPointToCluster(p);
            }

            //now we have to calculate the new centroids

            for (int j = 0; j < numberOfClusters; j++) {
                Cluster c = clusters.get(j);
                Cluster cAux = clusters.get(j);
                cAux.setPoint(Point.meanPoint(c.getPointsOfGroup(), 4));
                if (c.getPoint().equals(cAux.getPoint())) {
                    cont++;
                }

                c.setPoint(Point.meanPoint(c.getPointsOfGroup(), 4));
            }

        }


        for (int i = 0; i < numberOfClusters; i++) {
            System.out.println("------------------------" + "CLUSTER (" + i + ")------------------------");
            System.out.println(clusters.get(i).getPoint().coordinates.toString());
            System.out.println("---------------------------------------------------------------------------");
            for (int j = 0; j < clusters.get(i).getPointsOfGroup().size(); j++) {

                System.out.println(clusters.get(i).getPointsOfGroup().get(j).coordinates.toString() + " -> " + clusters.get(i).getPointsOfGroup().get(j).getDescription());
            }

        }


        //System.out.println(Point.meanPoint(points,4).coordinates.toString());


    }
}