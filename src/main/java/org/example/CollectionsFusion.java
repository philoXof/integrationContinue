package org.example;

public class CollectionsFusion {

    public int[] fusion(int[] collection1, int[] collection2){

        int sizeNew = collection1.length + collection2.length;

        int[] fusionCollections = new int[sizeNew];


        System.arraycopy(collection1, 0, fusionCollections, 0, collection1.length);
        for (int j = 0; j < collection2.length; j++) {
            fusionCollections[j + collection2.length + 1] = collection2[j];
        }

        return fusionCollections;
    }
}
