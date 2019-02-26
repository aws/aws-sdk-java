/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map with auto construct flag to indicate whether it is auto constructed by
 * Java SDK.
 */
public class SdkInternalMap<K,V> implements Map<K,V>, Serializable {
    private static final long serialVersionUID = 1L;

    private final Map<K, V> map;

    /**
    * Auto construct flag to indicate whether the map is auto constructed by
    * Java SDK.
    */
    private final boolean autoConstruct;

    public SdkInternalMap() {
        this.map = new HashMap<K,V>();
        autoConstruct = true;
    }

    public SdkInternalMap(Map<K, V> m) {
        this.map = m;
        autoConstruct = false;
    }

    /**
    * Return true if the map is auto constructed by Java SDK; false otherwise.
    */
    public boolean isAutoConstruct() {
        return autoConstruct;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return map.get(key);
    }

    @Override
    public V put(K key, V value) {
        return map.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (map == null ) return o == null;
        if (!(o instanceof Map<?,?>)) return false;
        
        Map<?, ?> that = (Map<?, ?>) o;

        return map.equals(that);
    }

    @Override
    public int hashCode() {
        return map == null ? 0 : map.hashCode();
    }

    @Override
    public String toString() {
        return map == null ? null : map.toString();
    }
}
