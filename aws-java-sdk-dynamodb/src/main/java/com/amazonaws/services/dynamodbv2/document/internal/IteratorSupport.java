/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.amazonaws.services.dynamodbv2.document.Page;

/**
 * An internal iterator implementation for {@link PageBasedCollection}.
 * <p>
 * <b>NOTE</b>: this internal class is marked as public since it has been incorrectly
 * exposed in the public method {@link PageBasedCollection#iterator()}, and it
 * will be changed to be package private in the next major version.
 *
 * @param <T>
 *            resource type
 * @param <R>
 *            low level result type
 */
public class IteratorSupport<T,R> implements Iterator<T> {
    /**
     * Used to iterate through the resource pages, dynamically making network
     * calls as needed.
     */
    final PageIterator<T,R> resourcePageIterator;
    /**
     * Used to iterate through a list of resources already retrieved.
     */
    private Iterator<T> localResourceIterator;
    private T resource;

    IteratorSupport(PageIterator<T,R> resourcePageIterator) {
        this.resourcePageIterator = resourcePageIterator;
    }

    @Override
    public boolean hasNext() {
        if (resource != null) {
            return true;
        }
        resource = nextResource();
        return (resource != null);
    }

    @Override
    public T next() {
        T rval = resource;
        if (rval == null) {
            rval = nextResource();
            if (rval == null) {
                throw new NoSuchElementException("No more elements");
            }
        } else {
            resource = null;
        }
        return rval;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Collection is read-only");
    }

    private T nextResource() {
        while (true) {
            if (localResourceIterator != null && localResourceIterator.hasNext()) {
                return localResourceIterator.next();
            }
            if (!resourcePageIterator.hasNext()) {
                return null;
            }
            Page<T,R> resourcePage = resourcePageIterator.next();
            localResourceIterator = resourcePage.iterator();
        }
    }
}
