public class mainClass {
    public static <T> void main(String[] args) {
        Nodes<T> root = (Nodes<T>) createTree();
        printTree(root, " ");
    }

    private static <T> Nodes<T> createTree() {
        Nodes<T> root = new Nodes(23, 233, "Node A");

        Nodes<T> nodeA = root.addChild(new Nodes<T>(23, 700, "Node B"));

        Nodes<String> node11 = (Nodes<String>) nodeA.addChild(new Nodes<T>(32, 233, "Node C" ));
        Nodes<String> nodeD = (Nodes<String>) nodeA.addChild(new Nodes<T>(0, 23, "Node D" ));
        Nodes<String> nodeE = (Nodes<String>) nodeA.addChild(new Nodes<T>(32, 233, "Node E" ));
        Nodes<String> node111 = (Nodes<String>) nodeA.addChild(new Nodes<T>(32, 233, "Node F " ));
        Nodes<T> nodeG = root.addChild(new Nodes<T>(23, 700, "Node G"));




        return root;
    }

    private static <T> void printTree(Nodes<T> node, String appender) {
        System.out.println(appender + node.getLabel());
        node.getChildren().forEach(each ->  printTree(each, appender + appender));
    }
}


    

