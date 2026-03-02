import java.util.*;
import java.nio.file.*;
import java.io.*;

class Pair{
    String key;
    String value;

    Pair(String key, String value){
        this.key = key;
        this.value = value;
    }
}

public class hashShuffle {
    public static void main(String [] args){
        int N = 1<<20;
//Creating Keys
        List<Integer> keys = new ArrayList<>(N);
        
        for(int i = 0; i < N; i++){
            keys.add(i);
        }
        
        Collections.shuffle(keys);

    }
}
