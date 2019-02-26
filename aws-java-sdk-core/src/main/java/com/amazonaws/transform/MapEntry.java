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
package com.amazonaws.transform;

import java.util.Map;

/**
 * Simple implementation of the Map.Entry interface.
 *
 * @param <K>
 *            The type of the key held in this map entry.
 * @param <V>
 *            The type of the value held in this map entry.
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    /* (non-Javadoc)
     * @see java.util.Map.Entry#getKey()
     */
    public K getKey() {
        return key;
    }

    /* (non-Javadoc)
     * @see java.util.Map.Entry#getValue()
     */
    public V getValue() {
        return value;
    }

    /* (non-Javadoc)
     * @see java.util.Map.Entry#setValue(java.lang.Object)
     */
    public V setValue(V value) {
        this.value = value;
        return this.value;
    }

    public K setKey(K key) {
        this.key = key;
        return this.key;
    }

}
