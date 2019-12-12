package com.code.practise.array;

public class DynamicArray {

    private int count;

    private String[] objs = null;

    public DynamicArray() {
        count = 0;
        objs = new String[10];
        showInfos();
    }

    public void addString(String str) {
        count++;
        if (count == objs.length) {
            objs = createNewArray(objs);
            objs[count] = str;

            showInfos();

        } else {
            objs[count] = str;
        }
    }

    public void showInfos() {
        System.out.println(count);
        System.out.println("arraySize : "+ objs.length);
        //Stream.of(objs).forEach(o->System.out.println(o));
    }

    private String[] createNewArray(String[] objs) {

        int i = Double.valueOf(objs.length * 1.5).intValue();
        String[] newStrings = new String[i];
        System.arraycopy(objs,0,newStrings,0,objs.length);

        return newStrings;
    }

//    public void deleteString(String str){
//        count++;
//        objs[count] = str;
//    }
}
