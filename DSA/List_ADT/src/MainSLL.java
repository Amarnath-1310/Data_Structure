public class MainSLL {
    static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertEnd(10);
        list.insertEnd(10);
        list.insertEnd(5);
        list.insertEnd(1);
        list.insertFront(100);
        list.insertFront(200);
        list.insertFront(300);
        list.insertFront(400);
        list.insertMiddle(250,2);
        list.insertMiddle(450,4);
        list.insertMiddle(1000,6);
        list.deleteEnd();
        list.deleteEnd();
        list.deleteFront();
        list.deleteFront();
        list.deleteFront();
        list.deleteMiddlePos(1);
        list.deleteMiddlePos(3);
        list.deleteMiddlePos(2);
        list.deleteElement(0);
        System.out.println(list.size);
        list.display(list.root);
    }
}
