public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {

    }

    public void add(int index, E element) {
        Node temp = head;
        if (index == 0) addFirst(element);
        else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = new Node(element);
            holder.next = temp.next;
            temp.next = holder;
            this.numNodes++;
        }

    }

    public void addFirst(E e) {
        Node temp = this.head;
        this.head = new Node(e);
        this.head.next = temp;
        this.numNodes++;
    }

    public void addLast(E e) {
        add(this.size(), e);
    }

    public E remove(int index) {
        Node temp = head;
        if (index > this.size() - 1) {
            throw new IndexOutOfBoundsException("index : " + index);
        } else if (index == this.size() - 1) {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            E holder = (E) temp.next;
            temp.next = null;
            this.numNodes--;
            return holder;
        } else {
            for (int i = 0; i < index - 1 && temp.next.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = temp.next.next;
            this.numNodes--;
            return (E) holder;
        }
    }

    public boolean remove(Object o) {
        Node temp = head;
        boolean isRemove = false;
        for (int index = 0; index < this.size(); index++) {
//            if (temp.data == o) {

            if (temp.data.equals(o)) {
                remove(index);
                isRemove = true;
                index--;
            }
            temp = temp.next;
        }

        if (isRemove) return true;
        else return false;
    }

    public int size() {
        return this.numNodes;
    }

    public E clone(MyLinkedList linkedList) {
        MyLinkedList<E> cloneList = new <E>MyLinkedList();
        cloneList.head = linkedList.head;
        cloneList.numNodes = linkedList.numNodes;
        return (E) cloneList;
    }

    public boolean contains(E o) {
        Node temp = head;
        boolean isContain = false;
        while (temp.next != null) {
            if (temp.data == o) {
                isContain = true;
            }
            temp = temp.next;
        }
        if (isContain) return true;
        else return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (temp.data == o) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int index) {
        Node temp = this.head;
        int indexTemp = 0;
        if (index >= this.size()) throw new IndexOutOfBoundsException("cant get index : " + index);
        while (indexTemp < index) {
            temp = temp.next;
            indexTemp++;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return this.get(0);
    }

    public E getLast() {
        return get(this.size() - 1);
    }

    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }

    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}