import java.util.*;

public class Graph {

    private Map<Integer, Integer> verticesMap;

    public Graph(int numberOfVertices){
        this.verticesMap = new HashMap<Integer, Integer>();
    }

    public void generateVerticesMap(int numberOfVertices){
        for (int i = 1; i <= numberOfVertices; i++) {
            verticesMap.put(i, 0);
        }
    }

    public void increaseVerticeDegree(int vertice){
        verticesMap.put(vertice, verticesMap.get(vertice) + 1);
    }

    public Map<Integer, Integer> getVerticesMap() {
        return verticesMap;
    }

    public void isEulerian(){
        int countOddVertices = 0;
        for (int i = 1; i <= verticesMap.size(); i++) {
            if(verticesMap.get(i)%2 != 0){
                countOddVertices += 1;
            }
        }
        if(countOddVertices > 2 || countOddVertices == 1){
            System.out.println("This graph is not Eulerian!");
        }

        if(countOddVertices == 0){
            System.out.println("This graph has a Eulerian cycle!");
        } else if(countOddVertices == 2){
            System.out.println("This graph has Eulerian path!");
        }
    }
}
