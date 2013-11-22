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
package com.amazonaws.internal.config;

/**
 * An internal class used to represent a key-object pair for JSON persistence
 * purposes.
 */
final class JsonIndex<C extends Builder<T>, T> {
    private String key;
    private C config;

    JsonIndex(String key, C config) {
        this.key = key;
        this.config = config;
    }

    JsonIndex(String key) {
        this.key = key;
    }

    JsonIndex() {}

    public String getKey() {
        return key;
    }

    void setKey(String key) {
        this.key = key;
    }

    public C getConfig() {
        return config;
    }

    T newReadOnlyConfig() {
        return config.build();
    }
}