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

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import com.amazonaws.AmazonServiceException;

/**
 * A page contains a list of items; accessing methods on the list are
 * guaranteed to be purely in-memory operations that will not block or throw
 * exceptions because of transient network issues. A page also knows whether it
 * has a "next page", and if so knows how to retrieve it (which
 * will almost certainly involve a remote network call that may block or
 * fail).
 *
 * @param <T> item type
 * @param <R> low level result type
 */
public abstract class Page<T,R> implements Iterable<T> {
    private final List<T> content;
    private final R lowLevelResult;

    /**
     * Checks whether this page has a "next page." If this method returns
     * true, the next page can be retrieved by calling {@code next}. If it
     * returns false, any call to {@code next} will be guaranteed to throw an
     * {@code IllegalStateException}.
     *
     * @return true if there is next page; false otherwise
     */
    public abstract boolean hasNextPage();

    /**
     * Retrieves the next page.
     *
     * @return the next page
     * @throws NoSuchElementException if there is no next page
     * @throws AmazonServiceException on error making the remote call
     */
    public abstract Page<T,R> nextPage();

    /**
     * @param content an unmodifiable list of content
     * @param lowLevelResult the low level (response) result from AWSS
     */
    public Page(List<T> content, R lowLevelResult) {
        if (content == null || lowLevelResult == null)
            throw new IllegalArgumentException("both content and lowLevelResult must be specified");
        this.content = content;
        this.lowLevelResult = lowLevelResult;
    }

    public final int size() {
        return content.size();
    }

    @Override
    public final Iterator<T> iterator() {
        return content.iterator();
    }

    @Override
    public String toString() {
        return content.toString();
    }

    public final R getLowLevelResult() {
        return lowLevelResult;
    }
}
