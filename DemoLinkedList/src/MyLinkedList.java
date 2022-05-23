public class MyLinkedList<E> {
    private Node<E> nodeRoot;
    private int numberNode;

    public MyLinkedList() {

    }

    public MyLinkedList(Node<E> nodeRoot, int numberNode) {
        this.nodeRoot = nodeRoot;
        this.numberNode = numberNode;
    }
public void add(E e){
        Node<E> node = new Node<>();
        node.setData(e);

        if (nodeRoot == null){
            nodeRoot=node;}
        else {
            Node<E> temp = nodeRoot;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        numberNode ++;
}








    public Node<E> getNodeRoot() {
        return nodeRoot;
    }

    public void setNodeRoot(Node<E> nodeRoot) {
        this.nodeRoot = nodeRoot;
    }

    public int getNumberNode() {
        return numberNode;
    }

    public void setNumberNode(int numberNode) {
        this.numberNode = numberNode;
    }
}
