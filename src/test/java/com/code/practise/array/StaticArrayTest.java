package com.code.practise.array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * StaticArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11�� 20, 2019</pre>
 */
public class StaticArrayTest {

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
     * Method: deleteString(String str)
     */
    @Test
    public void testDeleteString() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateString(String str)
     */
    @Test
    public void testUpdateString() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: showInfos()
     */
    @Test
    public void testShowInfos() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: sort(String[] objs)
     */
    @Test
    public void testSort() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = StaticArray.getClass().getMethod("sort", String[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: partSort(int start, int end, int comparePosition, String[] objs)
     */
    @Test
    public void testPartSort() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = StaticArray.getClass().getMethod("partSort", int.class, int.class, int.class, String[].class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: query(String str)
     */
    @Test
    public void testQuery() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = StaticArray.getClass().getMethod("query", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: quickQuery(int start, int end, String[] objs, String str)
     */
    @Test
    public void testQuickQuery() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = StaticArray.getClass().getMethod("quickQuery", int.class, int.class, String[].class, String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    @Test
    public void testAll() throws Exception {
        StaticArray staticArray = new StaticArray(5);

        staticArray.addString("aaa");
        staticArray.showInfos();

        staticArray.addString("ccc");

        staticArray.addString("bbb");
        staticArray.showInfos();

        staticArray.updateString("aaa","ddd");
        staticArray.showInfos();

        staticArray.addString("eee");

        staticArray.addString("fff");

        staticArray.addString("ggg");

        staticArray.showInfos();

        staticArray.deleteString("aaa");

        staticArray.showInfos();

        staticArray.deleteString("eee");

        staticArray.addString("aaa");

        staticArray.showInfos();
    }

} 
