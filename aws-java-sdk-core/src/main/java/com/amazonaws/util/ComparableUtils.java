/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ComparableUtils {

    /**
     * Does a safe comparison of two {@link Comparable} objects accounting for nulls
     * 
     * @param d1
     *            First object
     * @param d2
     *            Second object
     * @return A positive number if the object double is larger, a negative number if the second
     *         object is larger, or 0 if they are equal. Null is considered less than any non-null
     *         value
     */
    public static <T> int safeCompare(Comparable<T> d1, T d2) {
        if (d1 != null && d2 != null) {
            return d1.compareTo(d2);
        } else if (d1 == null && d2 != null) {
            return -1;
        } else if (d1 != null && d2 == null) {
            return 1;
        } else {
            return 0;
        }
    }

}
