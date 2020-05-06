import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Map;
import java.util.Scanner;

public class EulerianPathChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Eulerian Path Checker. Please insert information about graph:\nNumber of vertices:");
        int numberOfVertices = scanner.nextInt();
        System.out.println("Number of edges:");
        int numberOfEdges = scanner.nextInt();
        Graph graph = new Graph(numberOfVertices);
        graph.generateVerticesMap(numberOfVertices);

        for (int i = 0; i < numberOfEdges; i++) {
            System.out.println("Please insert vertices of edge number " + (i+1));
            int vertexOne = scanner.nextInt();
            int vertexTwo = scanner.nextInt();
            if (vertexOne <= numberOfVertices && vertexTwo <= numberOfVertices){
                // add +1 to vertices degree
                graph.increaseVerticeDegree(vertexOne);
                graph.increaseVerticeDegree(vertexTwo);
            } else {
                System.out.println("You have entered wrong vertex number! Please type again.");
                i-=1;
            }
        }
        graph.isEulerian();
    }
}
