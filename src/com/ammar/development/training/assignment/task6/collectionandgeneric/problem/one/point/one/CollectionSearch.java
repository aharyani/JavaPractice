package com.ammar.development.training.assignment.task6.collectionandgeneric.problem.one.point.one;

import java.util.*;

public class CollectionSearch {

    public static int searchValue(ArrayList numList, int value) {

        int index = Collections.binarySearch(numList, value);
        return index;

    }

}
