/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 *
 * @deprecated Replaced by {@link StandardBeanProperties}/{@link StandardModelFactories}
 */
@Deprecated
@SdkInternalApi
final class DynamoDBMappingsRegistry {

    /**
     * The default instance.
     */
    private static final DynamoDBMappingsRegistry INSTANCE = new DynamoDBMappingsRegistry();

    /**
     * Gets the default instance.
     * @return The default instance.
     */
    static final DynamoDBMappingsRegistry instance() {
        return INSTANCE;
    }

    /**
     * The cache of class to mapping definition.
     */
    private final ConcurrentMap<Class<?>, Mappings> mappings = new ConcurrentHashMap<Class<?>, Mappings>();

    /**
     * Gets the mapping definition for a given class.
     * @param clazz The class.
     * @return The mapping definition.
     */
    final Mappings mappingsOf(final Class<?> clazz) {
        if (!mappings.containsKey(clazz)) {
            mappings.putIfAbsent(clazz, new Mappings(clazz));
        }
        return mappings.get(clazz);
    }

    /**
     * Holds the properties for mapping an object.
     */
    static final class Mappings {
        private final Map<String, Mapping> byNames = new HashMap<String, Mapping>();
        private Mappings(final Class<?> clazz) {
            for (final Map.Entry<String,Bean<Object,Object>> bean : StandardBeanProperties.of((Class<Object>)clazz).map().entrySet()) {
                final Mapping mapping = new Mapping(bean.getValue());
                byNames.put(mapping.getAttributeName(), mapping);
            }
        }
        final Collection<Mapping> getMappings() {
            return byNames.values();
        }
    }

    /**
     * Holds the properties for mapping an object attribute.
     */
    static final class Mapping {
        private final Bean<Object,Object> bean;
        private Mapping(final Bean<Object,Object> bean) {
            this.bean = bean;
        }
        final Method getter() {
            return bean.type().getter();
        }
        final boolean isPrimaryKey() {
            return bean.properties().keyType() != null;
        }
        final boolean isVersion() {
            return bean.properties().versioned();
        }
        final String getAttributeName() {
            return bean.properties().attributeName();
        }
    }

}
