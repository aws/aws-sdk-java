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
package com.amazonaws.services.dynamodbv2.document.utils;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Utility subclass of {@link LinkedHashSet} that supports fluent API.
 */
public class FluentHashSet<E> extends LinkedHashSet<E> {
    private static final long serialVersionUID = -549868294257559427L;

    public FluentHashSet() {
        super();
    }

    public FluentHashSet(Collection<? extends E> c) {
        super(c);
    }

//    @SafeVarargs
    public FluentHashSet(E ... elements) {
        withAll(elements);
    }

    public FluentHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public FluentHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Fluent method to add the specified element to this set.
     */
    public FluentHashSet<E> with(E e) {
        super.add(e);
        return this;
    }

    /**
     * Fluent method to add the elements from the specified collection to this
     * set.
     */
    public FluentHashSet<E> withAll(Collection<? extends E> c) {
        super.addAll(c);
        return this;
    }

    /**
     * Fluent method to add the elements to this set.
     */
//    @SuppressWarnings("unchecked")
    public FluentHashSet<E> withAll(E ...elements) {
        if (elements != null) {
            for (E e: elements)
                add(e);
        }
        return this;
    }

    /**
     * Fluent method to remove the specified element from this set.
     */
    public FluentHashSet<E> delete(Object o) {
        super.remove(o);
        return this;
    }
}
