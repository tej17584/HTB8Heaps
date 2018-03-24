
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Jose Tejada 17584
 * @author David Soto 17551
 * @version 1.0
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    protected Vector<E> data; // el vecto

    /**
     * El constructor de la clase
     */
    public VectorHeap() //
    {
        data = new Vector<E>();
    }

    /**
     * Obtenemos el primer elemento
     *
     * @return un genérico E
     */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /**
     * Otro constructor, este recibe un parametro generico
     *
     * @param v un genérico para agregar
     */
    public VectorHeap(Vector<E> v) // post: constructs a new priority queue from an unordered vector
    {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++) { // add elements to heap
            add(v.get(i));
        }
    }

    /**
     * Método para el nodo o padre
     *
     * @param i un entero
     * @return un entero
     */
    protected static int parent(int i) // pre: 0 <= i < size
    // post: returns parent of node at location i
    {
        return (i - 1) / 2;
    }

    /**
     * método para el valor de la izquierda
     *
     * @param i un entero
     * @return un entero de izquierda
     */
    protected static int left(int i) // pre: 0 <= i < size
    // post: returns index of left child of node at location i
    {
        return 2 * i + 1;
    }

    /**
     * un método para la localizacion a la derecha
     *
     * @param i un index entero
     * @return un entero
     */
    protected static int right(int i) // post: returns index of right child of node at location i
    {
        return (2 * i + 1) + 1;
    }

    /**
     * Metodo percolateUp, sabemos que 0 es menor que la hoja y que el tamaño
     *
     * @param leaf un entero para agregar
     */
    protected void percolateUp(int leaf) // pre: 0 <= leaf < size
    // post: moves node at index leaf up to appropriate position
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0
                && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * Método para remover
     *
     * @return un genérico E
     */
    @Override
    public E remove() // pre: !isEmpty()
    // post: returns and removes minimum value from queue
    {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) {
            pushDownRoot(0);
        }
        return minVal;
    }

    /**
     * método para bajar el valor y ordenarlo
     *
     * @param root el entero de la raiz o nodo
     */
    protected void pushDownRoot(int root) // pre: 0 <= root < size
    // post: moves node at index root down
    // to appropriate position in subtree
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize)
                        && ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root, value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root, value);
                return;
            }
        }
    }

    /**
     * Método para agregar
     *
     * @param value un genérico E
     */
    @Override
    public void add(E value) // pre: value is non-null comparable
    // post: value is added to priority queue
    {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    /**
     * Un método para verificar si esta vacío
     *
     * @return un booleano, 0=vacio 1= lleno
     */
    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    /**
     * Método para el tamaño
     *
     * @return un entero con el tamaño
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Método para limpiar el vector
     */
    @Override
    public void clear() {
        data.clear();
    }

}
