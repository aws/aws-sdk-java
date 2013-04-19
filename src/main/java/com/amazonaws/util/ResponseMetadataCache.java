/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Cache of response metadata for recently executed requests for diagnostic
 * purposes. This cache has a max size and as entries are added, the oldest
 * entry is aged out once the max size has been reached.
 */
public class ResponseMetadataCache {
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

    /**
     * Adds a new entry to this cache, possibly evicting the oldest entry if the
     * cache is at its size limit.
     *
     * @param obj
     *            The key by which to store the metadata.
     * @param metadata
     *            The metadata for this entry.
     */
    public synchronized void add(Object obj, ResponseMetadata metadata) {
        if (obj == null) return;
        internalCache.put(System.identityHashCode(obj), metadata);
    }

    /**
     * Returns the response metadata associated with the specified object, or
     * null if no metadata is associated with that object.
     *
     * @param obj
     *            The key by which the desired metadata is stored.
     *
     * @return The response metadata associated with the given object key,
     *         otherwise null if no metadata is associated with that object.
     */
    public ResponseMetadata get(Object obj) {
        // System.identityHashCode isn't guaranteed to be unique
        // on all platforms, but should be reasonable enough to use
        // for a few requests at a time.  We can always easily move
        // to our own unique IDs if needed.
        return internalCache.get(System.identityHashCode(obj));
    }


    /**
     * Simple implementation of LinkedHashMap that overrides the
     * <code>removeEldestEntry</code> method to turn LinkedHashMap into a
     * LRU(ish) cache that automatically evicts old entries.
     */
    private static final class InternalCache extends LinkedHashMap<Integer, ResponseMetadata> {
        private int maxSize;

        public InternalCache(int maxSize) {
            super(maxSize);
            this.maxSize = maxSize;
        }

        @Override
        protected boolean removeEldestEntry(Entry eldest) {
            return size() > maxSize;
        }
    }
}
