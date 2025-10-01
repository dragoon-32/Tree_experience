import java.util.*;

public class Tree_exp {
    public static void main(String args[]){

    }

    static String priority[] = {"<->", "->", "v", "^", "~", "("};
}

class Node_T{
    public Node_T left;
    public Node_T right;
    public char value;
}

class Tree{
    private Node_T root;
    private Vector<String> operands = new Vector<String>();
}