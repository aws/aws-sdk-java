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

import java.util.ArrayList;
import java.util.Collection;

/**
 * Utility subclass of {@link ArrayList} that supports fluent API.
 */
public class FluentArrayList<E> extends ArrayList<E> {
    private static final long serialVersionUID = -8269850815375778149L;

    public FluentArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public FluentArrayList() {
        super();
    }

//    @SafeVarargs
    public FluentArrayList(E ... elements) {
        appendAll(elements);
    }

    public FluentArrayList(Collection<? extends E> c) {
        super(c);
    }

    /**
     * Fluent method to add the specified element to this list.
     */
    public FluentArrayList<E> append(E e) {
        super.add(e);
        return this;
    }

    /**
     * Fluent method to remove the specified element from this list.
     */
    public FluentArrayList<E> delete(Object o) {
        super.remove(o);
        return this;
    }

    /**
     * Fluent method to add the elements from the specified collection to this
     * list.
     */
    public FluentArrayList<E> appendAll(Collection<? extends E> c) {
        super.addAll(c);
        return this;
    }

    /**
     * Fluent method to add the elements to this list.
     */
//    @SuppressWarnings("unchecked")
    public FluentArrayList<E> appendAll(E ... elements) {
        if (elements != null) {
            for (E e: elements)
                add(e);
        }
        return this;
    }
}
