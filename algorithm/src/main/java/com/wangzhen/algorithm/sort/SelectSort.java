package com.wangzhen.algorithm.sort;

import org.junit.Test;

// 选择排序
public class SelectSort extends SortBaic {

    @Override
    public void sort(Comparable[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            Comparable temp = array[i];
            for(int j =i+1;j<length;j++){
                if(less(array[j],array[i])){
                    swap(array,j,i);
                }
            }
        }
        if(isSorted(array)){
            show(array);
        }

    }

    @Test
    public void test(){
        testSort();
    }

}
