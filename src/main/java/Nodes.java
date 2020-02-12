import java.util.ArrayList;
import java.util.List;

public class Nodes<T> {

    private int id;
    private int parentID;
    private T label = null;


    private List<Nodes<T>> children = new ArrayList<>();

    private Nodes<T> parent = null;

    //create a constructor
    public Nodes(int id, int parentID, String label) {
        this.id = id;
        this.parentID =parentID;
        this.label = (T) label;
    }

    public Nodes<T> addChild(Nodes<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<Nodes<T>> children) {
        children.forEach(each -> each.setParent(this));
        this.children.addAll(children);
    }

    public List<Nodes<T>> getChildren() {
        return children;
    }

    //getters
    public int getId() {
        return id;
    }

    public T getLabel() {
        return label;
    }
    public int getParentID(){
        return parentID;
    }

    //setters
    public void setId(T id) {
        this.id = (int) id;

    }

//    public void setParentID(T parentID) {
//        this.parentID = (int) parentID;
//    }
//
//    public void setLabel(T label) {
//        this.label = label;
//    }

    private void setParent(Nodes<T> parent) {
        this.parent = parent;
    }}

//    public Nodes<T> getParent() {
//        return parent;
//    }}