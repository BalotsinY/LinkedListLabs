public class ListFunHouse2 {
    private ListNode theList;

    public ListFunHouse2() {
        theList = new ListNode();
    }

    public void add(Comparable data) {
        ListNode temp = new ListNode(data, null);
        if (theList.getValue() == null) {
            theList = temp;
        } else {
            ListNode last = theList;

            while (last.getNext() != null) {
                last = last.getNext();
            }

            last.setNext(temp);
        }
    }

    //this method will return the number of nodes present in list
    public int nodeCount() {
        int counter = theList.getValue() != null ? 1 : 0;

        ListNode last = theList;
        while (last.getNext() != null) {
            last = last.getNext();
            counter++;
        }

        return counter;
    }

    //this method will create a new node with the same value as the first node and add this
    //new node at the front of the list.  Once finished, the first node will occur twice.
    public void doubleFirst() {
        theList = new ListNode(theList.getValue(), theList);
    }

    //this method will create a new node with the same value as the last node and add this
    //new node at the end.  Once finished, the last node will occur twice.
    public void doubleLast() {
        ListNode last = theList;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        ListNode temp = new ListNode(last.getValue(), null);
        last.setNext(temp);
    }

    //method skipEveryOther will remove every other node
    public void skipEveryOther() {
        Boolean remove = false;
        ListNode last = theList;

        while (last.getNext() != null) {
            if (remove) {
                if (last.getNext().getNext() != null) {
                    last.setNext(last.getNext().getNext());
                } else {
                    last.setNext(null);
                }
            }
            last = last.getNext();
            remove = !remove;
        }
    }

    //this method will set the value of every xth node in the list
    public void setXthNode(int x, Comparable value) {
        int set = x;
        ListNode last = theList;

        while (last.getNext() != null) {
            if (set == x) {
                last.setValue(value);
            }
            set = set == x ? 1 : set + 1;
            last = last.getNext();
        }
    }

    //this method will remove every xth node in the list
    public void removeXthNode(int x) {
        int set = x;
        ListNode last = theList;

        while (last.getNext() != null) {
            if (set == x) {
                if (last.getNext().getNext() != null) {
                    last.setNext(last.getNext().getNext());
                } else {
                    last.setNext(null);
                }
                set = 0;
            }
            set++;
            if (last.getNext() == null)
                break;
            last = last.getNext();
        }
    }

    //this method will return a String containing the entire list
    public String toString() {
        ListNode last = theList;
        String output = last.getValue() + ", ";

        while (last.getNext() != null) {
            last = last.getNext();
            output += last.getValue() + ", ";
        }

        return output;
    }

}