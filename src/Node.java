public class Node {

    int value;

    private Node left;
    private Node right;

    public Node find(int v){

        if(v == value){
            return this;
        } else if(v < value){
            return right.find(v);
        } else {
            return left.find(v);
        }

        //return null;
    }
}
