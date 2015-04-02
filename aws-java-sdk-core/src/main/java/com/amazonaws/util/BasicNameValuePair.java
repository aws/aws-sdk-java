/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package com.amazonaws.util;

import java.io.Serializable;

import com.amazonaws.annotation.Immutable;

/**
 * Basic implementation of {@link NameValuePair}.
 *
 * @since 4.0
 */
@Immutable
class BasicNameValuePair implements NameValuePair, Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    public static final int HASH_SEED = 17;
    public static final int HASH_OFFSET = 37;

    private final String name;
    private final String value;

    /**
     * Default Constructor taking a name and a value. The value may be null.
     *
     * @param name The name.
     * @param value The value.
     */
    BasicNameValuePair(final String name, final String value) {
        if (name == null)
            throw new IllegalArgumentException("Name must not be null");
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        // don't call complex default formatting for a simple toString

        if (this.value == null) {
            return name;
        }
        final int len = this.name.length() + 1 + this.value.length();
        final StringBuilder buffer = new StringBuilder(len);
        buffer.append(this.name);
        buffer.append("=");
        buffer.append(this.value);
        return buffer.toString();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof NameValuePair) {
            final BasicNameValuePair that = (BasicNameValuePair) object;
            return this.name.equals(that.name)
                  && equals(this.value, that.value);
        }
        return false;
    }

    private static boolean equals(final Object obj1, final Object obj2) {
        return obj1 == null ? obj2 == null : obj1.equals(obj2);
    }

    @Override
    public int hashCode() {
        int hash = HASH_SEED;
        hash = hashCode(hash, this.name);
        hash = hashCode(hash, this.value);
        return hash;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private static int hashCode(final int seed, final Object obj) {
        return hashCode(seed, obj != null ? obj.hashCode() : 0);
    }

    private static int hashCode(final int seed, final int hashcode) {
        return seed * HASH_OFFSET + hashcode;
    }
}
