/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtils {

    public static <T> boolean isNullOrEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * Returns a new list containing the second list appended to the first list.
     */
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> merged = new LinkedList<T>();
        if (list1 != null) {
            merged.addAll(list1);
        }
        if (list2 != null) {
            merged.addAll(list2);
        }
        return merged;
    }

    /**
     * Joins a collection of strings with the given separator into a single string.
     *
     * @param toJoin    Collection containing items to join.
     * @param separator String to join items with.
     * @return Empty string if collection is null or empty. Otherwise joins all strings in the collection with the separator.
     */
    public static String join(Collection<String> toJoin, String separator) {
        if (isNullOrEmpty(toJoin)) {
            return "";
        }

        StringBuilder joinedString = new StringBuilder();
        int currentIndex = 0;
        for (String s : toJoin) {
            if(s != null) {
                joinedString.append(s);
            }
            if (currentIndex++ != toJoin.size() - 1) {
                joinedString.append(separator);
            }
        }
        return joinedString.toString();
    }
}
