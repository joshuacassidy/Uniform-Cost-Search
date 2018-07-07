public class Main {

    public static void main(String[] args) {

        Vertex vertexA = new Vertex("a");
        Vertex vertexB = new Vertex("b");
        Vertex vertexC = new Vertex("c");
        Vertex vertexD = new Vertex("d");
        Vertex vertexE = new Vertex("e");
        Vertex vertexF = new Vertex("f");
        Vertex vertexG = new Vertex("g");
        Vertex vertexH = new Vertex("h");

        vertexA.addEdge(new Edge(5, vertexA, vertexB));
        vertexA.addEdge(new Edge(9, vertexA, vertexC));
        vertexA.addEdge(new Edge(6, vertexA, vertexE));

        vertexB.addEdge(new Edge(3, vertexB, vertexC));
        vertexB.addEdge(new Edge(9, vertexB, vertexH));

        vertexC.addEdge(new Edge(2, vertexC, vertexB));
        vertexC.addEdge(new Edge(1, vertexC, vertexD));

        vertexD.addEdge(new Edge(5, vertexD, vertexH));
        vertexD.addEdge(new Edge(7, vertexD, vertexG));


        vertexE.addEdge(new Edge(2, vertexE, vertexD));
        vertexE.addEdge(new Edge(2, vertexE, vertexF));

        vertexF.addEdge(new Edge(7, vertexF, vertexH));

        vertexG.addEdge(new Edge(2, vertexG, vertexE));


        UniformCostSearch ucs = new UniformCostSearch();
        System.out.println(ucs.search(vertexA, vertexH));

    }

}
