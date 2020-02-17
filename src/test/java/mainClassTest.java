import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NodesTest{
    @Test

    public void shouldGetParentID(){
        Node nodeA  = new Node(70, "Node A", 0);
        assertEquals(nodeA.getParentID(), 0);
    }
    @Test

    public void shouldGetID(){
        Node nodeD = new Node(5, "Node D", 6);
        assertEquals(nodeD.getId(), 5);
    }
    @Test
    public void shouldGetLabel(){
        Node nodeC = new Node(1, "Node C", 3);
        assertEquals(nodeC.getLabel(), "Node C");
    }
  @Test

    public void shouldAddNodes(){
//        Main main = new Main();

      List<Node> nodes = new ArrayList<Node>() {{
          add(new Node(123, "NodeB", 7000));
          add(new Node(7000, "NodeA", 0));
          add(new Node(9, "NodeC", 123));
          add(new Node(3, "NodeF", 0));
          add(new Node(25, "NodeE", 7000));
          add(new Node(2, "NodeD", 7000));
          add(new Node(10, "NodeG", 3));
      }};

      assertEquals("{3=1, 7000=3}", Main.printTree(nodes).toString());
    }


}
