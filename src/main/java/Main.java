import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "src/main/resources/nodes.json";
        Path path = Paths.get(fileName);
        try (Reader reader = Files.newBufferedReader(path,
                StandardCharsets.UTF_8)) {

            JsonParser parser = new JsonParser();
            JsonElement tree = parser.parse(reader);

            JsonArray array = tree.getAsJsonArray();

            for (JsonElement element : array) {

                if (element.isJsonObject()) {

                    JsonObject car = element.getAsJsonObject();

                    System.out.println("********************");
                    System.out.println(car.get("id").getAsLong());
                    System.out.println(car.get("label").getAsString());
                    System.out.println(car.get("parentID").getAsLong());
                }
            }
        }



    List<Node> nodes = new ArrayList<Node>() {{
        add(new Node(123, "NodeB", 7000));
        add(new Node(7000, "NodeA", 0));
        add(new Node(9, "NodeC", 123));
        add(new Node(3, "NodeF", 0));
        add(new Node(25, "NodeE", 7000));
        add(new Node(2, "NodeD", 7000));
        add(new Node(10, "NodeG", 3));
    }};

    printTree(nodes);

}

    static Map<Integer, Integer> printTree(List<Node> nodes) {
        ArrayList<Integer> parentIds = new ArrayList<>();
        nodes.forEach(n -> parentIds.add(n.parentID));
        Collections.sort(parentIds);

        Map<Integer, Integer> map = new HashMap<>();
        for (Node n : nodes) {
            if (n.parentID == 0) {
                System.out.println(n);

                //This action should repeat for all children
                for (Node node : nodes) {
                    if (n.id == node.parentID) {
                        System.out.println("\t" + node);

                        // this will show how many children a  parentID has.
                        if (map.containsKey(n.id)) {
                            map.put(n.id, map.get(n.id)+1);
                        }
                        else {
                            map.put(n.id, 1);
                        }
                    }
                }
            }
        }
        System.out.println(map);
        return map;
    }
}