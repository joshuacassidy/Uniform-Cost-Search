import java.util.*;

public class UniformCostSearch {

    public String search(Vertex start, Vertex target) {
        start.setPathCost(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(start);
        ArrayList<Vertex> explored = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            Vertex current = priorityQueue.poll();
            explored.add(current);

            if (current.getName().equals(target.getName())) {
                return reconstructPath(target);
            } else {
                    for (Edge edge : current.getEdges()) {
                        Vertex child = edge.getTarget();
                        double newChildCost = current.pathCost + edge.getWeight();

                        if(!explored.contains(child) && !priorityQueue.contains(child)){
                            child.setPathCost(newChildCost);
                            child.predecessor = current;
                            priorityQueue.add(child);
                        } else if((priorityQueue.contains(child)) && newChildCost < child.getPathCost()) {
                            child.setPathCost(newChildCost);
                            child.predecessor = current;
                            priorityQueue.remove(child);
                            priorityQueue.add(child);
                        } else {
                            continue;
                        }
                    }
                }
            }

        return "No path found from Vertex " + start + " to Vertex " + target;


    }

    public String reconstructPath(Vertex targetVertex) {
        ArrayList<Vertex> shortestPath = new ArrayList<>();
        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
            shortestPath.add(vertex);
        }

        Collections.reverse(shortestPath);
        return shortestPath.toString() + " has a total cost path of path cost: " + targetVertex.getPathCost();

    }

}
