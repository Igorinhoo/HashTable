public class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K Key, V Value) {
        key = Key;
        value = Value;
        next = null;
    }
}
