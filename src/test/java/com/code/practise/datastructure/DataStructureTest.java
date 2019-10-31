package com.code.practise.datastructure;

import org.junit.jupiter.api.Test;

public class DataStructureTest {
    @Test
    void testSkipList(){
        SkipList skipList = new SkipList();
        for(int i=0;i<100;i++){
            skipList.insert(i);
        }

        System.out.println(skipList.find(1));

        skipList.printAll();
    }

    @Test
    void testLevel(){
        float f = 1.0f;
        for(int i=0;i<16;i++){
            f = f/2;
            System.out.println(f*100+"%");
        }
    }
}
