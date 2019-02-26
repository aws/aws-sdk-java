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

import com.amazonaws.services.dynamodbv2.document.LowLevelResultListener;
import com.amazonaws.services.dynamodbv2.document.Page;

/**
 * Abstract base class for all page-based collections.
 *
 * @param <T> resource type
 * @param <R> low level outcome/result type
 */
public abstract class PageBasedCollection<T,R> implements Iterable<T> {
    private volatile R lastLowLevelResult;
    private volatile LowLevelResultListener<R> listener = LowLevelResultListener.none();

    @Override
    public IteratorSupport<T,R> iterator() {
        PageIterable<T,R> pageIterable = pages();
        final PageIterator<T,R> pageIterator = pageIterable.iterator();
        return new IteratorSupport<T,R>(pageIterator);
    }

    public PageIterable<T,R> pages() {
        return new PageIterable<T,R>(this);
    }

    public abstract Page<T,R> firstPage();
    
    /**
     * Returns the maximum number of resources to be retrieved in this
     * collection; or null if there is no limit.
     */
    public abstract Integer getMaxResultSize();

    /**
     * Returns the low-level result last retrieved (for the current page) from
     * the server side; or null if there has yet no calls to the server.
     */
    public R getLastLowLevelResult() {
        return lastLowLevelResult;
    }

    /**
     * Internal method used by the implementation layer for setting
     * the low level result received from the server side.
     */
    protected void setLastLowLevelResult(R lowLevelResult) {
        this.lastLowLevelResult = lowLevelResult;
        // deliver the event of receiving a low level result from the server side 
        listener.onLowLevelResult(lowLevelResult);
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
    public LowLevelResultListener<R> registerLowLevelResultListener(LowLevelResultListener<R> listener) {
        LowLevelResultListener<R> prev = this.listener;
        if (listener == null)
            this.listener = LowLevelResultListener.none();
        else
            this.listener = listener;
        return prev;
    }
}
