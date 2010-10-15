/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.ResponseMetadata;

/**
 * Cache of response metadata for recently executed requests for diagnostic
 * purposes. This cache has a max size and as entries are added, the oldest
 * entry is aged out once the max size has been reached.
 */
public class ResponseMetadataCache {
    private final int maxEntries;
    private Map<Integer, ResponseMetadata> map;
    private List<Object> objectList;

    /**
     * Creates a new cache that will contain, at most the specified number of
     * entries.
     *
     * @param maxEntries
     *            The maximum size of this cache.
     */
    public ResponseMetadataCache(int maxEntries) {
        this.maxEntries = maxEntries;

        objectList = new ArrayList<Object>(maxEntries);
        map = new HashMap<Integer, ResponseMetadata>();
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

        if (map.size() >= maxEntries) evictOldest();
        store(System.identityHashCode(obj), metadata);
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
        return map.get(System.identityHashCode(obj));
    }

    private void evictOldest() {
        map.remove(objectList.remove(0));
    }

    private void store(int id, ResponseMetadata metadata) {
        map.put(id, metadata);
        objectList.add(id);
    }
}