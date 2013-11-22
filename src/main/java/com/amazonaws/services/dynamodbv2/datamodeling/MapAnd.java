/*
 * Copyright 2013-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * A Map with some secret extra sauce that can be used to tunnel
 * extra data through a method signature that only takes a Map.
 *
 * @param <K> the type of the map's keys
 * @param <V> the type of the map's values
 * @param <T> the type of the extra secret sauce
 */
final class MapAnd<K, V, T> implements Map<K, V> {

    private final Map<K, V> map;
    private final T extra;
    
    public static <K, V, T> MapAnd<K, V, T> wrap(
            final Map<K, V> map,
            final T extra) {
        
        return new MapAnd<K, V, T>(map, extra);
    }
    
    private MapAnd(final Map<K, V> map, final T extra) {
        this.map = map;
        this.extra = extra;
    }
    
    public Map<K, V> unwrap() {
        return map;
    }
    
    public T getExtra() {
        return extra;
    }
    
    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean containsKey(Object arg0) {
        return map.containsKey(arg0);
    }

    @Override
    public boolean containsValue(Object arg0) {
        return map.containsValue(arg0);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public V get(Object arg0) {
        return map.get(arg0);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public V put(K arg0, V arg1) {
        return map.put(arg0, arg1);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
        map.putAll(arg0);
    }

    @Override
    public V remove(Object arg0) {
        return map.remove(arg0);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Collection<V> values() {
        return map.values();
    }

    @Override
    public String toString() {
        return "{map: " + map + ", extra: " + extra + "}";
    }
}
