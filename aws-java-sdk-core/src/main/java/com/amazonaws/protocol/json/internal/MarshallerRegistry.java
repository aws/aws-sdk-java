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
package com.amazonaws.protocol.json.internal;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.StructuredPojo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SdkInternalApi
public class MarshallerRegistry {

    private final Map<MarshallLocation, Map<MarshallingType, JsonMarshaller<?>>> marshallers;
    private final Set<MarshallingType<?>> marshallingTypes;
    private final Map<Class<?>, MarshallingType<?>> marshallingTypeCache;

    private MarshallerRegistry(Builder builder) {
        this.marshallers = builder.marshallers;
        this.marshallingTypes = builder.marshallingTypes;
        this.marshallingTypeCache = new HashMap<Class<?>, MarshallingType<?>>(marshallingTypes.size());

    }

    public <T> JsonMarshaller<T> getMarshaller(MarshallLocation marshallLocation, T val) {
        return getMarshaller(marshallLocation, toMarshallingType(val));
    }

    public <T> JsonMarshaller<T> getMarshaller(MarshallLocation marshallLocation, MarshallingType<T> marshallingType, T val) {
        return getMarshaller(marshallLocation,
                             val == null ? MarshallingType.NULL : marshallingType);
    }

    @SuppressWarnings("unchecked")
    private <T> JsonMarshaller<T> getMarshaller(MarshallLocation marshallLocation, MarshallingType<?> marshallingType) {
        return (JsonMarshaller<T>) marshallers.get(marshallLocation).get(marshallingType);
    }

    @SuppressWarnings("unchecked")
    public <T> MarshallingType<T> toMarshallingType(T val) {
        if (val == null) {
            return (MarshallingType<T>) MarshallingType.NULL;
        } else if (val instanceof StructuredPojo) {
            // We don't want to cache every single POJO type so we make a special case of it here.
            return (MarshallingType<T>) MarshallingType.STRUCTURED;
        } else if (!marshallingTypeCache.containsKey(val.getClass())) {
            return (MarshallingType<T>) populateMarshallingTypeCache(val.getClass());
        }
        return (MarshallingType<T>) marshallingTypeCache.get(val.getClass());
    }

    private MarshallingType<?> populateMarshallingTypeCache(Class<?> clzz) {
        synchronized (marshallingTypeCache) {
            if (!marshallingTypeCache.containsKey(clzz)) {
                for (MarshallingType<?> marshallingType : marshallingTypes) {
                    if (marshallingType.isDefaultMarshallerForType(clzz)) {
                        marshallingTypeCache.put(clzz, marshallingType);
                        return marshallingType;
                    }
                }
                throw new SdkClientException("MarshallingType not found for class " + clzz);
            }
        }
        return marshallingTypeCache.get(clzz);
    }

    /**
     * Merge the given overrides with 'this' registry. Overrides are higher precedence than 'this' registry. Both 'this'
     * registry and the override registry are immutable so a new registry object is returned. If the marshallerRegistryOverrides
     * are null then this method just returns the current registry since there is nothing to merge.
     *
     * @param marshallerRegistryOverrides Override registry.
     * @return New {@link MarshallerRegistry} with marshallers merged.
     */
    public MarshallerRegistry merge(MarshallerRegistry.Builder marshallerRegistryOverrides) {
        if(marshallerRegistryOverrides == null) {
            return this;
        }
        Builder merged = MarshallerRegistry.builder();
        merged.copyMarshallersFromRegistry(this.marshallers);
        merged.copyMarshallersFromRegistry(marshallerRegistryOverrides.marshallers);
        return merged.build();
    }

    /**
     * @return Builder instance to construct a {@link MarshallerRegistry}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link MarshallerRegistry}.
     */
    public static final class Builder {

        private final Map<MarshallLocation, Map<MarshallingType, JsonMarshaller<?>>> marshallers
                = new HashMap<MarshallLocation, Map<MarshallingType, JsonMarshaller<?>>>();
        private final Set<MarshallingType<?>> marshallingTypes
                = new HashSet<MarshallingType<?>>();

        private Builder() {
        }

        public <T> Builder payloadMarshaller(MarshallingType<T> marshallingType,
                                             JsonMarshaller<T> marshaller) {
            return addMarshaller(MarshallLocation.PAYLOAD, marshallingType, marshaller);
        }

        public <T> Builder headerMarshaller(MarshallingType<T> marshallingType,
                                            JsonMarshaller<T> marshaller) {
            return addMarshaller(MarshallLocation.HEADER, marshallingType, marshaller);
        }

        public <T> Builder queryParamMarshaller(MarshallingType<T> marshallingType,
                                                JsonMarshaller<T> marshaller) {
            return addMarshaller(MarshallLocation.QUERY_PARAM, marshallingType, marshaller);
        }

        public <T> Builder pathParamMarshaller(MarshallingType<T> marshallingType,
                                               JsonMarshaller<T> marshaller) {
            return addMarshaller(MarshallLocation.PATH, marshallingType, marshaller);
        }

        public <T> Builder greedyPathParamMarshaller(MarshallingType<T> marshallingType,
                                                     JsonMarshaller<T> marshaller) {
            return addMarshaller(MarshallLocation.GREEDY_PATH, marshallingType, marshaller);
        }

        public <T> Builder addMarshaller(MarshallLocation marshallLocation,
                                         MarshallingType<T> marshallingType,
                                         JsonMarshaller<T> marshaller) {
            marshallingTypes.add(marshallingType);
            if (!marshallers.containsKey(marshallLocation)) {
                marshallers.put(marshallLocation, new HashMap<MarshallingType, JsonMarshaller<?>>());
            }
            marshallers.get(marshallLocation).put(marshallingType, marshaller);
            return this;
        }

        /**
         * @return An immutable {@link MarshallerRegistry} object.
         */
        public MarshallerRegistry build() {
            return new MarshallerRegistry(this);
        }

        /**
         * Fill this builder with marshallers from the source {@link MarshallerRegistry}. Will overwrite anything that is
         * registered with the same location and type.
         *
         * @param sourceMarshallers Marshallers to copy in.
         */
        private void copyMarshallersFromRegistry(
                Map<MarshallLocation, Map<MarshallingType, JsonMarshaller<?>>> sourceMarshallers) {

            for (Map.Entry<MarshallLocation, Map<MarshallingType, JsonMarshaller<?>>> byLocationEntry :
                    sourceMarshallers.entrySet()) {
                for (Map.Entry<MarshallingType, JsonMarshaller<?>> byTypeEntry : byLocationEntry.getValue().entrySet()) {
                    this.addMarshaller(byLocationEntry.getKey(), byTypeEntry.getKey(), byTypeEntry.getValue());
                }
            }
        }
    }
}
