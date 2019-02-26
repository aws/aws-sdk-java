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
package com.amazonaws.services.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.document.internal.PageBasedCollection;
import com.amazonaws.services.dynamodbv2.document.internal.PageIterable;

/**
 * A collection of <code>Table</code>'s (initialized with the respective table
 * names).
 *
 * An <code>TableCollection</code> object maintains a cursor pointing to its
 * current pages of data. Initially the cursor is positioned before the first
 * page. The next method moves the cursor to the next row, and because it
 * returns false when there are no more rows in the <code>TableCollection</code>
 * object, it can be used in a while loop to iterate through the collection.
 *
 * Network calls can be triggered when the collection is iterated across page
 * boundaries.
 *
 * @param <R> low level result type
 */
public abstract class TableCollection<R> extends PageBasedCollection<Table, R> {

    // Overriding these just so javadocs will show up.

    /**
     * Returns an {@code Iterable<Page<Table, R>>} that iterates over pages of
     * tables from this collection. Each call to {@code Iterator.next} on an
     * {@code Iterator} returned from this {@code Iterable} results in exactly
     * one call to DynamoDB to retrieve a single page of results.
     * <p>
     * <code>
     * TableCollection&lt;?&gt; collection = ...;
     * for (Page&lt;Table&gt; page : collection.pages()) {
     *     processTables(page);
     * }
     * </code>
     * <p>
     * The use of the internal/undocumented {@code PageIterable} class instead
     * of {@code Iterable} in the public interface here is retained for
     * backwards compatibility. It doesn't expose any methods beyond those
     * of the {@code Iterable} interface. This method will be changed to return
     * an {@code Iterable<Page<Table, R>>} directly in a future release of the
     * SDK.
     *
     * @see Page
     */
    @Override
    public PageIterable<Table, R> pages() {
        return super.pages();
    }

    /**
     * Returns the maximum number of resources to be retrieved in this
     * collection; or null if there is no limit.
     */
    @Override
    public abstract Integer getMaxResultSize();

    /**
     * Returns the low-level result last retrieved (for the current page) from
     * the server side; or null if there has yet no calls to the server.
     */
    @Override
    public R getLastLowLevelResult() {
        return super.getLastLowLevelResult();
    }

    /**
     * Used to register a listener for the event of receiving a low-level result
     * from the server side.
     *
     * @param listener
     *            listener to be registered. If null, a "none" listener will be
     *            set.
     * @return the previously registered listener. The return value is never
     *         null.
     */
    @Override
    public LowLevelResultListener<R> registerLowLevelResultListener(
            LowLevelResultListener<R> listener) {

        return super.registerLowLevelResultListener(listener);
    }
}
