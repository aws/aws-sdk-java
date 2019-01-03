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
package com.amazonaws.test.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * This class includes some utility methods for comparing two unordered
 * collections.
 */
public class UnorderedCollectionComparator {

    /**
     * Compares two unordered lists of the same type.
     */
    public static <T> boolean equalUnorderedCollections(
            Collection<T> colA, Collection<T> colB) {
        return equalUnorderedCollections(colA, colB, new CrossTypeComparator<T, T>() {

            @Override
            public boolean equals(T a, T b) {
                return (a == null && b == null)
                        || a.equals(b);
            }

        });
    }

     /**
     * Compares two unordered lists of different types, using the specified
     * cross-type comparator. Null collections are treated as empty ones.
     * Naively implemented using N(n^2) algorithm.
     */
    public static <A, B> boolean equalUnorderedCollections(
            Collection<A> colA, Collection<B> colB,
            final CrossTypeComparator<A, B> comparator) {
        if (colA == null || colB == null){
            if ( (colA == null || colA.isEmpty())
              && (colB == null || colB.isEmpty()) ) {
                return true;
            } else {
                return false;
            }
        }

        // Add all elements into sets to remove duplicates.
        Set<A> setA = new HashSet<A>();
        setA.addAll(colA);
        Set<B> setB = new HashSet<B>();
        setB.addAll(colB);

        if ( setA.size() != setB.size() ){
            return false;
        }

        for (A a : setA) {
            boolean foundA = false;
            for (B b : setB) {
                if (comparator.equals(a, b)) {
                    foundA = true;
                    break;
                }
            }
            if ( !foundA ) {
                return false;
            }
        }
        return true;
    }

    /**
     * A simple interface that attempts to compare objects of two different types
     */
    public static interface CrossTypeComparator<A, B> {
        /**
         * @return True if a and b should be treated as equal.
         */
        public boolean equals(A a, B b);
    }
}
