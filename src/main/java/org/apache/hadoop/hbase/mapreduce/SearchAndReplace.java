package org.apache.hadoop.hbase.mapreduce;
import java.util.Arrays;

public class SearchAndReplace {
    public static byte[] searchAndReplace(byte[] array, byte[] search, byte[] replace) {
        if (search.length != replace.length)
            return array;
        int p = searchFor(array, search);
        if (p == -1)
            return array;
        byte[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < replace.length; i++) {
            result[p] = replace[i];
            p++;
        }
        return result;
    }

    public static int searchFor(byte[] array, byte[] subArray) {
        if (subArray.length > array.length)
            return -1;
        int p = (new String(array)).indexOf(new String(subArray));
        for (int i = 1; i < subArray.length; i++) {
            if (array[p + i] != subArray[i])
                return -1;
        }
        return p;
    }

    public static void main(String[] args) {
        String a = "hello/world!";
        String b = "/";
        System.out.println(new String(searchAndReplace(a.getBytes(), b.getBytes(), " ".getBytes())));
    }

}
