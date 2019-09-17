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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * An immutable map that could be built by convenient constructors.
 * <p>
 * Example of using map Builder:
 * 
 * <pre>
 * {
 *     &#064;code
 *     Map&lt;String, AttibuteValue&gt; item = new ImmutableMapParameter.Builder&lt;String, AttibuteValue&gt;()
 *             .put(&quot;one&quot;, new AttibuteValue(&quot;1&quot;))
 *             .put(&quot;two&quot;, new AttibuteValue(&quot;2&quot;))
 *             .put(&quot;three&quot;, new AttibuteValue(&quot;3&quot;)).build();
 * }
 * </pre>
 * 
 * For <i>small</i> immutable maps (up to five entries), the
 * {@code ImmutableMapParamter.of()} methods are preferred:
 * 
 * <pre>
 * {@code
 *   Map<String, AttibuteValue> item =
 *       ImmutableMapParameter
 *           .of("one", new AttributeValue("1"), 
 *               "two", new AttributeValue("2"),
 *               "three", new AttributeValue("3"), 
 * }
 * </pre>
 * 
 * @param <K>
 *            Class of the key for the map.
 * @param <V>
 *            Class of the value for the map.
 */
public class ImmutableMapParameter<K, V> implements Map<K, V> {

    private static final String UNMODIFIABLE_MESSAGE = "This is an immutable map.";
    private static final String DUPLICATED_KEY_MESSAGE = "Duplicate keys are provided.";

    private final Map<K, V> map;

    private ImmutableMapParameter(Map<K, V> map) {
        this.map = map;
    }

    /**
     * Returns a new MapParameterBuilder instance.
     */
    public static <K, V> Builder<K, V> builder() {
        return new Builder<K, V>();
    }

    /**
     * Returns an ImmutableMapParameter instance containing a single entry.
     * 
     * @param k0
     *            Key of the single entry.
     * @param v0
     *            Value of the single entry.
     */
    public static <K, V> ImmutableMapParameter<K, V> of(K k0, V v0) {
        Map<K, V> map = Collections.singletonMap(k0, v0);
        return new ImmutableMapParameter<K, V>(map);
    }

    /**
     * Returns an ImmutableMapParameter instance containing two entries.
     * 
     * @param k0
     *            Key of the first entry.
     * @param v0
     *            Value of the first entry.
     * @param k1
     *            Key of the second entry.
     * @param v1
     *            Value of the second entry.
     */
    public static <K, V> ImmutableMapParameter<K, V> of(K k0, V v0, K k1, V v1) {
        Map<K, V> map = new HashMap<K, V>();
        putAndWarnDuplicateKeys(map, k0, v0);
        putAndWarnDuplicateKeys(map, k1, v1);
        return new ImmutableMapParameter<K, V>(map);
    }

    /**
     * Returns an ImmutableMapParameter instance containing three entries.
     * 
     * @param k0
     *            Key of the first entry.
     * @param v0
     *            Value of the first entry.
     * @param k1
     *            Key of the second entry.
     * @param v1
     *            Value of the second entry.
     * @param k2
     *            Key of the third entry.
     * @param v2
     *            Value of the third entry.
     */
    public static <K, V> ImmutableMapParameter<K, V> of(K k0, V v0, K k1, V v1,
            K k2, V v2) {
        Map<K, V> map = new HashMap<K, V>();
        putAndWarnDuplicateKeys(map, k0, v0);
        putAndWarnDuplicateKeys(map, k1, v1);
        putAndWarnDuplicateKeys(map, k2, v2);
        return new ImmutableMapParameter<K, V>(map);
    }

    /**
     * Returns an ImmutableMapParameter instance containing four entries.
     * 
     * @param k0
     *            Key of the first entry.
     * @param v0
     *            Value of the first entry.
     * @param k1
     *            Key of the second entry.
     * @param v1
     *            Value of the second entry.
     * @param k2
     *            Key of the third entry.
     * @param v2
     *            Value of the third entry.
     * @param k3
     *            Key of the fourth entry.
     * @param v3
     *            Value of the fourth entry.
     */
    public static <K, V> ImmutableMapParameter<K, V> of(K k0, V v0, K k1, V v1,
            K k2, V v2, K k3, V v3) {
        Map<K, V> map = new HashMap<K, V>();
        putAndWarnDuplicateKeys(map, k0, v0);
        putAndWarnDuplicateKeys(map, k1, v1);
        putAndWarnDuplicateKeys(map, k2, v2);
        putAndWarnDuplicateKeys(map, k3, v3);
        return new ImmutableMapParameter<K, V>(map);
    }

    /**
     * Returns an ImmutableMapParameter instance containing five entries.
     * 
     * @param k0
     *            Key of the first entry.
     * @param v0
     *            Value of the first entry.
     * @param k1
     *            Key of the second entry.
     * @param v1
     *            Value of the second entry.
     * @param k2
     *            Key of the third entry.
     * @param v2
     *            Value of the third entry.
     * @param k3
     *            Key of the fourth entry.
     * @param v3
     *            Value of the fourth entry.
     * @param k4
     *            Key of the fifth entry.
     * @param v4
     *            Value of the fifth entry.
     */
    public static <K, V> ImmutableMapParameter<K, V> of(K k0, V v0, K k1, V v1,
            K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> map = new HashMap<K, V>();
        putAndWarnDuplicateKeys(map, k0, v0);
        putAndWarnDuplicateKeys(map, k1, v1);
        putAndWarnDuplicateKeys(map, k2, v2);
        putAndWarnDuplicateKeys(map, k3, v3);
        putAndWarnDuplicateKeys(map, k4, v4);
        return new ImmutableMapParameter<K, V>(map);
    }

    /** Inherited methods **/

    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    public V get(Object key) {
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public int size() {
        return map.size();
    }

    public Collection<V> values() {
        return map.values();
    }

    /** Unsupported methods **/

    public void clear() {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    public V put(K key, V value) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    public V remove(Object key) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    private static <K, V> void putAndWarnDuplicateKeys(Map<K, V> map, K key,
            V value) {
        if (map.containsKey(key))
            throw new IllegalArgumentException(DUPLICATED_KEY_MESSAGE);
        map.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        return map.equals(o);
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    @Override
    public String toString() {
        return map.toString();
    }

    /**
     * A convenient builder for creating ImmutableMapParameter instances.
     */
    public static class Builder<K, V> {

        private final Map<K, V> entries;

        public Builder() {
            this.entries = new HashMap<K, V>();
        }

        /**
         * Add a key-value pair into the built map. The method will throw
         * IllegalArgumentException immediately when duplicate keys are
         * provided.
         * 
         * @return Returns a reference to this object so that method calls can
         *         be chained together.
         */
        public Builder<K, V> put(K key, V value) {
            putAndWarnDuplicateKeys(entries, key, value);
            return this;
        }

        /**
         * Generates and returns a new ImmutableMapParameter instance which
         * contains all the entries added into the Builder by {@code put()}
         * method.
         */
        public ImmutableMapParameter<K, V> build() {
            HashMap<K, V> builtMap = new HashMap<K, V>();
            builtMap.putAll(entries);
            return new ImmutableMapParameter<K, V>(builtMap);
        }
    }
}
