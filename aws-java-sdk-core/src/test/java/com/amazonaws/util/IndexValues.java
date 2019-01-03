/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.util.Iterator;

/**
 * Used to iterate through all possible combination of array index values given
 * the array lengths. This can be useful for generating unit test cases.
 */
public class IndexValues implements Iterable<int[]> {
    private final int[] lengths;

    /**
     * Constructs an {@link Iterable} for all possible combination of array
     * index values given the array lengths. This can be useful for generating
     * unit test cases.
     * 
     * @param lengths
     *            array lengths
     */
    public IndexValues(int ... lengths) {
        if (lengths == null || lengths.length == 0)
            throw new IllegalArgumentException();
        for (int len: lengths) {
            if (len < 1)
                throw new IllegalArgumentException();
        }
        this.lengths = lengths.clone();
    }

    private static class Iter implements Iterator<int[]> {
        private final int[] lengths;
        /**
         * Contains the next combination of array index values to be returned;
         * null if the iterator has exhausted all possible index values.
         */
        private int[] curr;
        
        private Iter(int[] lengths) {
            this.lengths = lengths;
            this.curr = new int[lengths.length];
        }

        @Override public boolean hasNext() { return curr != null; }

        /**
         * Returns the next combination of array index values, or null if
         * the index value space has been exhausted.
         */
        @Override
        public int[] next() {
            if (curr == null)
                return null;
            final int last=lengths.length-1;
            if (curr[last] < lengths[last]-1) {
                int[] ret = curr.clone();
                curr[last]++;
                return ret;
            }
            if (curr[last] == lengths[last]-1) {
                // go left to search for more capacity
                for (int j=last-1; j >= 0; j--) {
                    if (curr[j] < lengths[j]-1) {
                        int[] ret = curr.clone();
                        curr[j]++;
                        for (int k=j+1; k < lengths.length; k++) {
                            curr[k] = 0;
                        }
                        return ret;
                    }
                }
                int[] ret = curr;   // last combination
                curr = null;
                return ret;
            }
            throw new IllegalStateException("Bug ?");
        }

        @Override public void remove() {}
    }

    @Override public Iterator<int[]> iterator() { return new Iter(lengths); }
}
