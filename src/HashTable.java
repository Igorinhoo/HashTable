public class HashTable<K, V> {
    Node<K, V>[] values;

    public HashTable(int size) {
        values = (Node<K, V>[]) new Node<?, ?>[size];
    }

    private int HashFunction(K key) {
        int index = key.hashCode() % values.length;
        if (index < 0) {
            index += values.length;
        }
        return index;
    }

    public void Put(K key, V value) {
        int index = HashFunction(key);
        Node<K, V> node = values[index];
        if (node == null) {
            node = new Node<K, V>(key, value);
            values[index] = node;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            Node<K, V> newNode = new Node<K, V>(key, value);
            node.next = newNode;
        }
    }

    public V Get(K key) {
        int index = HashFunction(key);
        Node<K, V> node = values[index];
        if (node == null)
            return null;
        while (node.next != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        if (node.key.equals(key)) {
            return node.value;
        }
        return null;
    }

    public void Delete(K key) {
        int index = HashFunction(key);
        Node<K, V> node = values[index];
        if (node == null) {
            System.out.println("There is no value to delete");
            return;
        }
        if (key.equals(node.key)) {
            values[index] = node.next;
            return;
        }
        while (node.next != null) {
            if (key.equals(node.next.key)) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
        System.out.println("There is no value to delete");
    }
}
