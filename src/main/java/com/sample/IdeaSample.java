package com.sample;

import java.util.List;

public class IdeaSample {
    private Integer acheeme;
    public void sample(List<Integer> integerList) {

        // 全部
        for (Integer integer : integerList) {
            acheeme = integer;
            printInt(integer);

        }

        // 偶数
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                acheeme = integer;
                printInt(integer);
            }
        }
    }

    private void printInt(Integer integer) {
        System.out.println("the number is " + integer);
    }
}
