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
package com.amazonaws.internal.config;

/**
 * An internal class used to represent a key-object pair for JSON persistence purposes.
 */
public final class JsonIndex<C extends Builder<T>, T> {

    private String key;
    private C config;

    public JsonIndex() {
    }

    public JsonIndex(String key) {
        this.key = key;
    }

    public JsonIndex(String key, C config) {
        this.key = key;
        this.config = config;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public C getConfig() {
        return config;
    }

    public void setConfig(C config) {
        this.config = config;
    }

    public T newReadOnlyConfig() {
        return config.build();
    }
}