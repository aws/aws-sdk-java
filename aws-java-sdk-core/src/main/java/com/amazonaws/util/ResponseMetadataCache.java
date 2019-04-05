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
package com.amazonaws.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Cache of response metadata for recently executed requests for diagnostic
 * purposes. This cache has a max size and as entries are added, the oldest
 * entry is aged out once the max size has been reached.
 */
@SdkInternalApi
public class ResponseMetadataCache implements MetadataCache {
    private final InternalCache internalCache;

    /**
     * Creates a new cache that will contain, at most the specified number of
     * entries.
     *
     * @param maxEntries
     *            The maximum size of this cache.
     */
    public ResponseMetadataCache(int maxEntries) {
        internalCache = new InternalCache(maxEntries);
    }

    @Override
    public synchronized void add(Object obj, ResponseMetadata metadata) {
        if (obj == null) return;
        internalCache.put(System.identityHashCode(obj), metadata);
    }

    @Override
    public synchronized ResponseMetadata get(Object obj) {
        // System.identityHashCode isn't guaranteed to be unique
        // on all platforms, but should be reasonable enough to use
        // for a few requests at a time.  We can always easily move
        // to our own unique IDs if needed.
        return internalCache.get(System.identityHashCode(obj));
    }

    /**
     * Simple implementation of LinkedHashMap that overrides the
     * <code>removeEldestEntry</code> method to turn LinkedHashMap into a
     * FIFO cache that automatically evicts old entries.
     */
    private static final class InternalCache extends LinkedHashMap<Integer, ResponseMetadata> {
        private static final long serialVersionUID = 1L;
        private int maxSize;

        InternalCache(int maxSize) {
            super(maxSize);
            this.maxSize = maxSize;
        }

        @Override
        protected boolean removeEldestEntry(Entry<Integer,ResponseMetadata> eldest) {
            return size() > maxSize;
        }
    }
}
