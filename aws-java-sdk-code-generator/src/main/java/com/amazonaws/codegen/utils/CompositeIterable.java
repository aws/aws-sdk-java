/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.codegen.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class CompositeIterable<T> implements Iterable<T> {

    private Iterable<Iterable<T>> iterables;

    public CompositeIterable(Iterable<Iterable<T>> iterables) {
        this.iterables = iterables;
    }

    @SafeVarargs
    public CompositeIterable(Iterable<T>... iterables) {
        this.iterables = Arrays.asList(iterables);
    }

    @Override
    public Iterator<T> iterator() {
        return new CompositeIterator();
    }

    private class CompositeIterator implements Iterator<T> {

        private Iterator<Iterable<T>> iterableIterator = iterables.iterator();

        private Iterator<T> currentIterator;

        @Override
        public boolean hasNext() {
            if (currentIterator != null && currentIterator.hasNext()) {
                return true;
            }

            if (iterableIterator.hasNext()) {
                currentIterator = iterableIterator.next().iterator();
                return hasNext();
            }

            return false;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentIterator.next();
        }
    }
}
