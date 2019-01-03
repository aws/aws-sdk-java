/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Interface for caches interacting with response metadata.
 */
@SdkInternalApi
public interface MetadataCache {

    /**
     * Adds a new entry to this cache, possibly evicting the oldest entry if the
     * cache is at its size limit.
     *
     * @param obj
     *            The key by which to store the metadata.
     * @param metadata
     *            The metadata for this entry.
     */
    void add(Object obj, ResponseMetadata metadata);

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
    ResponseMetadata get(Object obj);
}
