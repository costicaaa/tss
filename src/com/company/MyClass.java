package com.company;

public class MyClass {

    public int method(int[] array, int start, int end, int search) {
        if(start != 0 || end != array.length - 1){
            if(start != 0 && end != array.length - 1){
                throw new Error("invalid start and end");
            }
            if (start != 0 ) {
                throw new Error("invalid start");
            }
            if(end != array.length - 1){
                throw new Error("invalid end");
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
