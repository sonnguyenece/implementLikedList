public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Object> brick = new MyLinkedList<>();
        brick.add(0, 5);
        brick.add(300, 7);
        brick.add(1, 6);
        brick.addFirst(4);
        brick.addLast(8);
        brick.addFirst("a");
        brick.addLast(5);
        brick.addLast("a");
        brick.addLast(5);
        brick.add(3, "a");
        System.out.println("Brick list : ");
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());

        brick.remove(4);
        System.out.println("\nBrick list after remove : ");
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());

        System.out.println("\nCan remove \"5\"?" + brick.remove((Object) 5));
        System.out.println("Brick list after remove : ");
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());

        System.out.println("index 3 value: " + brick.get(3));
        System.out.println("get head value: " + brick.getFirst());
        System.out.println("get tail value: " + brick.getLast());
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());

//        MyLinkedList<Object> brickClone =(MyLinkedList<Object>) brick.clone(brick);
//        System.out.println("Brick clone list : ");
//        brickClone.displayLinkedList();
//        System.out.println("Num nodes : " + brickClone.size());
//        brickClone.remove(1);

        System.out.println("Brick list : ");
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());

//        System.out.println("\nCan remove \"a\"?" + brick.remove( "a"));
//        System.out.println("Brick list after remove : ");
//        brick.displayLinkedList();
//        System.out.println("Num nodes : " + brick.size());

        brick.clear();
        System.out.println("\nList after clear : ");
        brick.displayLinkedList();
        System.out.println("Num nodes : " + brick.size());


    }
}
