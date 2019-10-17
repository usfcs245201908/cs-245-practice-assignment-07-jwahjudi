public class LinkedList<T> implements List<T>
{
    Node head;
    int size;
    class Node
    {
        T a;
        Node next;
        public Node(T item)
        {
            a = item;
            next = null;
        }
    }
    public LinkedList()
    {
        head = null;
        size = 0;
    }
    public void add(T item)
    {
        if (head == null)
        {
            Node current = new Node(item);
            head = current;
            ++size;
        }
        else
        {
            Node prev = head;
            while (prev.next != null)
                prev = prev.next;
            Node current = new Node(item);
            prev.next = current;
            ++size;
        }
    }

    public void add(int pos, T item)
    {
        if (pos == 0)
        {
            Node current = new Node(item);
            current.next = head;
            head = current;
            ++size;
        }
        else
        {
            Node current = new Node(item);
            Node prev = head;
            for (int i = 0; i < pos-1; i++)
                prev = prev.next;
            current.next = prev.next;
            prev.next = current;
            ++size;
        }
    }
    public T get(int pos)
    {
        if (pos == 0)
            return head.a;
        else
        {
            Node current = head;
            for (int i = 0; i < pos; i++)
                current = current.next;
            return current.a;
        }
    }

    public T remove(int pos)
    {
        if (pos == 0)
        {
            Node temp = head;
            head = head.next;
            --size;
            return temp.a;
        }
        else
        {
            Node prev = head;
            for (int i = 0; i < pos-1; i++)
                prev = prev.next;
            Node temp = prev.next;
            prev.next = temp.next;
            --size;
            return temp.a;
        }
    }

    public int size()
    {
        return size;
    }

}
