public class YourBinaryTree extends BinaryTree{
    @Override 
    protected int countLessThan(Comparable value) {
        if (value == null) throw new IllegalArgumentException();
        return countTree(super.root, value);
        
    }
    
    public int countTree(BinaryTree.Node node, Comparable val) {
        if (node == null) return 0;
        if ((node.value).compareTo(val) > 0) {
            return 1 + countTree(node.left, val) + countTree(node.right, val);
        } else {
            return countTree(node.left, val) + countTree(node.right, val);
        }
    }
}
