/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.pojos;

/**
 * Simple key-val domain class.
 */
public class KeyAndVal<K,V> {
    private K key;
    private V val;
    public KeyAndVal(final K key, final V val) {
        this.key = key;
        this.val = val;
    }
    public KeyAndVal() {
        this((K)null, (V)null);
    }
    public K getKey() {
        return this.key;
    }
    public void setKey(final K key) {
        this.key = key;
    }
    public V getVal() {
        return this.val;
    }
    public void setVal(final V val) {
        this.val = val;
    }
    public final boolean keyEquals(final Object o) {
        return key == o || (key != null && key.equals(o));
    }
    public final boolean valEquals(final Object o) {
        return val == o || (val != null && val.equals(o));
    }
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof KeyAndVal && keyEquals(((KeyAndVal)o).key) && valEquals(((KeyAndVal)o).val));
    }
    @Override
    public final int hashCode() {
        return 1 + (key == null ? 0 : key.hashCode()) + (val == null ? 0 : val.hashCode());
    }
    @Override
    public final String toString() {
        return "[" + key + "," + val + "]";
    }
}
