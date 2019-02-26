/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.utils;

import java.util.LinkedHashMap;

/**
 * Utility subclass of {@link LinkedHashMap} that supports fluent API.
 */
public class FluentHashMap<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 4857340227048063855L;

    /**
     * Fluent method to remove the specified key from this map.
     */
    public FluentHashMap<K, V> delete(Object key) {
        remove(key);
        return this;
    }
}
