import java.util.*;
import java.nio.file.*;
import java.io.*;

class Pair{
    String key;
    String value;

    Pair(String k, String v){
        this.key = k;
        this.value = v;
    }
}

public class hashShuffle {
    public static void main(String [] args){
        int N = 1<<20;
        int experimentLimit = 950_000;
        int total_limit = 1_000_000;

//Creating Keys
        List<Integer> keys = new ArrayList<>(N);
        
        for(int i = 0; i < N; i++){
            keys.add(i);
        }
        // Shuffling
        Collections.shuffle(keys);

        Pair [] dataStore = new Pair[N];
        for(int i = 0; i < N; i++){
            String keyStr = String.valueOf(keys.get(i));
            String valStr = String.valueOf(i + 1);
            dataStore[i] = new Pair(keyStr, valStr);
        }


        

    }
}
