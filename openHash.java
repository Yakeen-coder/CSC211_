import java.util.*;
import java.nio.file.*;


public class openHash {
    private int m; // Size of the table
    private int count; // Number of elements currently in the table
    private Node[] table;

    // The Node class handles the "Chaining" (Open Hashing)
    private static class Node {
        String key;
        String value;
        Node next;

        Node(String k, String v) {
            this.key = k;
            this.value = v;
        }
    }

    public openHash(int capacity) {
        this.m = capacity;
        this.table = new Node[m];
        this.count = 0;
    }

    //Scatter function: Uniform distribution

    public int hash(String key) {
        return Math.abs(key.hashCode()) % m;
    }


