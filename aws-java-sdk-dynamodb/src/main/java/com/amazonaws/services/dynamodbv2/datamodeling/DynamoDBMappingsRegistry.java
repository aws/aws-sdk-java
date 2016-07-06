/*
 * Copyright 2015-2016 Amazon Technologies, Inc.
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
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanToBooleanMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CustomMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CustomUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.KeyType;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
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
     * Gets the mapping definition for a given method.
     * @param method The method.
     * @return The mapping definition.
     */
    final Mapping mappingOf(final Method method) {
        return mappingsOf(method.getDeclaringClass()).getMapping(method);
    }

    /**
     * Holds the properties for mapping an object.
     */
    static final class Mappings {
        private final Class<Object> objectType;
        private final Map<String, Mapping> byNames = new HashMap<String, Mapping>();
        private final Map<Method, Mapping> byGetters = new HashMap<Method, Mapping>();
        private final Map<KeyType, Mapping> byKeyTypes = new HashMap<KeyType, Mapping>();

        /**
         * Constructs a mapping definition for the specified class.
         * @param clazz The class.
         */
        private Mappings(final Class<?> clazz) {
            objectType = (Class<Object>)clazz;
            for (final Map.Entry<String,Bean<Object,Object>> bean : StandardBeanProperties.of(objectType).entrySet()) {
                final Mapping mapping = new Mapping(bean.getKey(), bean.getValue());
                if (byNames.containsKey(mapping.getAttributeName())) {
                    throw new DynamoDBMappingException(objectType +
                        " maps duplicate attributes named " + mapping.getAttributeName());
                }
                if (mapping.isPrimaryKey() && byKeyTypes.put(mapping.bean().annotations().keyType(), mapping) != null) {
                    throw new DynamoDBMappingException(objectType +
                        " maps multiple " + mapping.bean().annotations().keyType() +  " key attributes");
                }
                byNames.put(mapping.getAttributeName(), mapping);
                byGetters.put(mapping.getter(), mapping);
            }
        }

        /**
         * Gets the attribute mappings for this class.
         * @return The attribute mappings.
         */
        final Collection<Mapping> getMappings() {
            return byNames.values();
        }

        /**
         * Gets the attribute mapping for a specific method.
         * @param method The method.
         * @return The attribute mapping.
         */
        final Mapping getMapping(final Method method) {
            final Mapping mapping = byGetters.get(method);
            if (mapping == null) {
                throw new DynamoDBMappingException(objectType + " does not map any getter named " + method.getName());
            }
            return mapping;
        }

        /**
         * Gets the collection of key attributes.
         * @return The key attributes.
         */
        final Collection<Mapping> getPrimaryKeys() {
            return byKeyTypes.values();
        }

        /**
         * Gets the hash key attribute mapping for this class.
         * @return The range key attribute.
         */
        final Mapping getHashKey() {
            if (!byKeyTypes.containsKey(KeyType.HASH)) {
                throw new DynamoDBMappingException(objectType + " does not map a @DynamoDBHashKey attribute" +
                    "; ensure a public, zero-parameter get method/field is annotated");
            }
            return byKeyTypes.get(KeyType.HASH);
        }

        /**
         * Determines if the mapping has a range key attribute.
         * @return True if range key is present, false otherwise.
         */
        final boolean hasRangeKey() {
            return byKeyTypes.containsKey(KeyType.RANGE);
        }

        /**
         * Gets the range key attribute mapping for this class.
         * @return The attribute mapping.
         */
        final Mapping getRangeKey() {
            return byKeyTypes.get(KeyType.RANGE);
        }
    }

    /**
     * Holds the properties for mapping an object attribute.
     */
    static final class Mapping {
        private final Bean<Object,Object> bean;
        private final String attributeName;

        /**
         * Constructs an object attribute mapping for the specified method.
         * @param bean The bean property.
         * @param attributeName The attribute name.
         */
        private Mapping(final String attributeName, final Bean<Object,Object> bean) {
            this.attributeName = attributeName;
            this.bean = bean;
        }

        /**
         * Gets the bean property.
         * @return The bean property.
         */
        final Bean<Object,Object> bean() {
            return this.bean;
        }

        /**
         * Gets the getter method for this attribute.
         * @return The getter method.
         */
        final Method getter() {
            return bean.getter();
        }

        /**
         * @return True if this Mapping represents a primary key (i.e. a hash key or a range key).
         *         False otherwise.
         */
        final boolean isPrimaryKey() {
            return bean.annotations().keyType() != null;
        }

        /**
         * Determines if this attribute maps to a hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isHashKey() {
            return bean.annotations().hashKey() != null;
        }

        /**
         * Determines if this attribute maps to an index hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isIndexHashKey() {
            return bean.annotations().indexHashKey() != null;
        }

        /**
         * Determines if this attribute maps to a version attribute.
         * @return True if it maps, false otherwise.
         */
        final boolean isVersion() {
            return bean.annotations().version() != null;
        }

        /**
         * Gets the attribute name.
         * @return The attribute name.
         */
        final String getAttributeName() {
            return attributeName;
        }

        /**
         * Gets the custom marshaller.
         * @return The marshaller or null if default should be used.
         */
        final ArgumentMarshaller getCustomMarshaller() {
            if (bean.annotations().marshalling() != null) {
                return new CustomMarshaller(bean.annotations().marshalling().marshallerClass());
            } else if (bean.annotations().nativeBoolean() != null) {
                return BooleanToBooleanMarshaller.instance();
            }
            return null;
        }

        /**
         * Gets the custom unmarshaller.
         * @return The unmarshaller or null if default should be used.
         */
        final ArgumentUnmarshaller getCustomUnmarshaller() {
            if (bean.annotations().marshalling() != null) {
                return new CustomUnmarshaller(bean.targetType(), bean.annotations().marshalling().marshallerClass());
            }
            return null;
        }
    }

}
