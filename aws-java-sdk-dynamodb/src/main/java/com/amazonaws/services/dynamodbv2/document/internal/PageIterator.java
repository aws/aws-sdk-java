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

import com.amazonaws.services.dynamodbv2.document.Page;

/**
 * @param <T> resource type
 * @param <R> low level result type
 */
class PageIterator<T,R> implements Iterator<Page<T,R>> {

    private Page<T,R> page;
    private final PageBasedCollection<T,R> col;

    PageIterator(PageBasedCollection<T,R> col) {
        this.col = col;
    }

    @Override
    public boolean hasNext() {
        Integer max = col.getMaxResultSize();
        if (max != null && max.intValue() <= 0)
            return false;
        return page == null || page.hasNextPage();
    }

    @Override
    public Page<T,R> next() {
        if (page == null) {
            page = col.firstPage();
        } else {
            page = page.nextPage();
            col.setLastLowLevelResult(page.getLowLevelResult());
        }
        return page;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Collection is read-only");
    }
}
