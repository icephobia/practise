package com.code.practise.array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * DynamicArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 20, 2019</pre>
 */
public class DynamicStaticArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addString(String str)
     */
    @Test
    public void testAddString() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: createNewArray(String[] objs)
     */
    @Test
    public void testCreateNewArray() throws Exception {
//TODO: Test goes here...
    }

    @Test
    public void testDynamicArray() throws Exception {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 23; i++) {
            dynamicArray.addString(i + "");
        }

        dynamicArray.showInfos();
    }

} 
