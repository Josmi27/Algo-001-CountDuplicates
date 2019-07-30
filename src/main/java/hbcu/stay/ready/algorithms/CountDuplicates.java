package hbcu.stay.ready.algorithms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String, Integer> mappedInput = new HashMap<String, Integer>();
        int duplicateCount = 0;

        for (int i = 0; i < input.length; i++) {
            if(!mappedInput.containsKey(input[i])) {
                mappedInput.put(input[i],1);
            }
            else {
                Integer currentValueAtKey = mappedInput.get(input[i]);
                if(currentValueAtKey == 1) {
                    duplicateCount += 1;
                }
                currentValueAtKey++;
                mappedInput.put(input[i], currentValueAtKey);
            }
        }
        return duplicateCount;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        HashMap<Integer, Integer> mappedInput = new HashMap<Integer, Integer>();
        int duplicateCount = 0;

        for (int i = 0; i < input.length; i++) {
            if(!mappedInput.containsKey(input[i])) {
                mappedInput.put(input[i],1);
            }
            else {
                Integer currentValueAtKey = mappedInput.get(input[i]);
                if(currentValueAtKey == 1) {
                    duplicateCount += 1;
                }
                currentValueAtKey++;
                mappedInput.put(input[i], currentValueAtKey);
            }
        }
        return duplicateCount;
    }
}
