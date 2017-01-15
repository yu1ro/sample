package com.sample;

import java.util.List;

public class IdeaSample {
    private Integer acheeme;
    public void sample(List<Integer> integerList) {

        // 全部
        integerList.forEach(integer -> {
            acheeme = integer;
            printInt(integer);
        });

        // 偶数
        integerList.stream().filter(integer -> integer % 2 == 0).forEach(integer -> {
            acheeme = integer;
            printInt(integer);
        });
    }

    private void printInt(Integer integer) {
        System.out.println("the number is " + integer);
    }
}
