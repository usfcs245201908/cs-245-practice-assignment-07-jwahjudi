public class ArrayList<T> implements List<T>
{
    T[] a;
    int size;
    public ArrayList()
    {
        a = (T[]) new Object[10];
        size = 0;
    }

    public void add (T item)
    {
        if (size == a.length)
            growArray();
        a[size++] = item;
    }

    public void add (int pos, T item)
    {
        if (size == a.length)
            growArray();
        for (int i = size; i > pos; i--)
            a[i] = a[i-1];
        a[pos] = item;
        size++;
    }

    public T get(int pos)
    {
        return a[pos];
    }

    public T remove(int pos)
    {
        T thing = a[pos];
        for (int i = pos; i < size; i++)
            a[i] = a[i+1];
        --size;
        return thing;
    }

    public int size()
    {
        return size;
    }

    public void growArray()
    {
        T[] temp = (T[]) (new Object[a.length*2]);

        for (int index=0; index < a.length; index++)
            temp[index] = a[index];
        a = temp;
    }
}
