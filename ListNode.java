public class ListNode implements Linkable {
    private Comparable listNodeValue;
    private ListNode nextListNode;

    public ListNode() {
        listNodeValue = null;
        nextListNode = null;
    }

    public ListNode(Comparable value, ListNode next) {
        listNodeValue = value;
        nextListNode = next;
    }

    public Comparable getValue() {
        return listNodeValue;
    }

    public void setValue(Comparable value) {
        listNodeValue = value;
    }

    public ListNode getNext() {
        return nextListNode;
    }

    public void setNext(Linkable next) {
        nextListNode = (ListNode) next;
    }
}