public class YourSimpleLinkedList extends SimpleLinkedList{
    
    @Override
    protected int countNegative() {
        int countNeg=0;
        Item root = super.start;
        while (root!=null && root.next !=null) {
            if (root.value <0) countNeg++;
            root = root.next;
        }
        if (root!=null) {
            if (root.value <0) countNeg++;
        }
        return countNeg;
    }
}
