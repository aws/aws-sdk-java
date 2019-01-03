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

package com.amazonaws.client.builder;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkProtectedApi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Type safe map of key/value pairs. Used for advanced or service specific client configuration in the client
 * builders.
 */
@SdkProtectedApi
@Immutable
public final class AdvancedConfig {

    public final static AdvancedConfig EMPTY = AdvancedConfig.builder().build();

    /**
     * Type safe key for config options.
     *
     * @param <T> Type of value.
     */
    public static class Key<T> {
    }

    private final Map<Key<?>, Object> config;

    private AdvancedConfig(Builder builder) {
        this.config = Collections.unmodifiableMap(new HashMap<Key<?>, Object>(builder.config));
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Key<T> key) {
        return (T) config.get(key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Map<Key<?>, Object> config = new HashMap<Key<?>, Object>();

        private Builder() {
        }

        @SuppressWarnings("unchecked")
        public <T> T get(Key<T> key) {
            return (T) config.get(key);
        }

        public <T> Builder put(Key<T> key, T value) {
            config.put(key, value);
            return this;
        }

        public AdvancedConfig build() {
            return new AdvancedConfig(this);
        }
    }

}
