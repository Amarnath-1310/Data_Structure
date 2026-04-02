
public class SingleLinkedList {
    Node root;
    Node tail;
    int size;

    public void display(Node root)
    {
        Node x = root;
        while(x != null)
        {
            System.out.print(x.data+" -> ");
            x = x.next;
        }
        System.out.print("null");
    }

    public void insertEnd(int data)
    {
        Node n = new Node(data);
        if(root==null){
            root = tail = n;
            size++;
            return;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    public void insertFront(int data)
    {
        Node n = new Node(data);
        if(root==null) {
            root = tail = n;
            size++;
            return;
        }
        n.next = root;
        root = n;
        size++;
    }

    public void insertMiddle(int data,int pos)
    {
        Node n = new Node(data);
        if(root==null)
        {
            root = tail = n;
            size++;
            return;
        }
        Node x = root;
        int index = 0;
        while(size > pos && pos - 1 != index)
        {
            x = x.next;
            index++;
        }
        n.next = x.next;
        x.next = n;
        size++;
    }

    public void deleteEnd()
    {
        if(root==null || root.next==null){
            root = null;
            size--;
            return;
        }
        Node x = root;
        while(x.next != tail)
        {
            x = x.next;
        }
        x.next = null;
        tail = x;
        size--;
    }

    public void deleteFront()
    {
        if(root == null || root.next == null){
            root = null;
            size--;
            return;
        }
        Node x = root;
        root = x.next;
        x.next = null;
        size--;
    }

    public void deleteMiddlePos(int pos)
    {
        if(root==null || root.next == null)
        {
            root = null;
            size--;
            return;
        }
        Node x = root;
        int index = 0;
        while(pos - 1 != index)
        {
            x = x.next;
            index++;
        }
        Node temp = x.next;
        x.next = temp.next;
        temp.next = null;
        size--;
    }

    public void deleteElement(int val)
    {
        if(root==null || root.next == null)
        {
            root = null;
            size--;
            return;
        }
        Node x = root;
        int count = 1;
        if(x.data == val)
        {
            deleteFront();
            return;
        }
        while(x.next.data != val)
        {
            x = x.next;
            count++;
            if(count == size)
            {
                System.out.println("No Element Exist...");
                return;
            }
        }
        Node temp = x.next;
        x.next = temp.next;
        temp.next = null;
    }
}
