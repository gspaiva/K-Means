
public class CandidateCluster {

    private Cluster c;
    private double dist;
    private Point p;

    public CandidateCluster(Cluster c, double dist, Point p ) {
        this.c = c;
        this.dist = dist;
        this.p = p;
    }
    public Cluster getC() {
        return c;
    }
    public void setC(Cluster c) {
        this.c = c;
    }
    public double getDist() {
        return dist;
    }
    public void setDist(double dist) {
        this.dist = dist;
    }
    public Point getP() {
        return p;
    }
    public void setP(Point p) {
        this.p = p;
    }


}
