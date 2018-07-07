import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private String name;
    private ArrayList<Edge> edges;
    private boolean visited;
    public double pathCost;
    public Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public double getPathCost() {
        return pathCost;
    }

    public void setPathCost(double pathCost) {
        this.pathCost = pathCost;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex vertex){
        if(pathCost > vertex.getPathCost()){
            return 1;
        } else if (pathCost < vertex.getPathCost()){
            return -1;
        } else{
            return 0;
        }
    }

}
