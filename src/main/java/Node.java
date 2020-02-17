public class Node {
    public int id;
    public int parentID;
    public String label;

    public Node(int id,String label,int parentID) {
        this.id = id;
        this.parentID = parentID;
        this.label = label;
    }

    public int getParentID() {
        return parentID;
    }

    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return this.label +  " ID :"+this.id + " ParentID : "+this.parentID ;
    }
}