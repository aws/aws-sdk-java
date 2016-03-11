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

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAnnotationRegistry.AnnotationMap;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBReflectionRegistry.BeanProperty;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.BooleanToBooleanMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.marshallers.CustomMarshaller;
import com.amazonaws.services.dynamodbv2.datamodeling.unmarshallers.CustomUnmarshaller;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class DynamoDBMappingsRegistry {

    /**
     * The logging utility.
     */
    private static final Log log = LogFactory.getLog(DynamoDBMappingsRegistry.class);

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
     * The reflection registry.
     */
    private final DynamoDBReflectionRegistry reflectionRegistry = new DynamoDBReflectionRegistry();

    /**
     * The annotation registry.
     */
    private final DynamoDBAnnotationRegistry annotationRegistry = new DynamoDBAnnotationRegistry();

    /**
     * The auto-generator registry.
     */
    private final DynamoDBAutoGeneratorRegistry autoGeneratorRegistry = new DynamoDBAutoGeneratorRegistry();

    /**
     * Gets the mapping definition for a given class.
     * @param clazz The class.
     * @return The mapping definition.
     */
    final Mappings mappingsOf(final Class<?> clazz) {
        if (!mappings.containsKey(clazz)) {
            mappings.putIfAbsent(clazz, new Mappings(clazz, this));
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
        private final Class<?> objectType;
        private final AnnotationMap annotations;
        private final Map<String, Mapping> byNames = new HashMap<String, Mapping>();
        private final Map<Method, Mapping> byGetters = new HashMap<Method, Mapping>();
        private final Collection<Mapping> primaryKeys = new HashSet<Mapping>();
        private Mapping hashKey, rangeKey, versionAttribute;

        /**
         * Constructs a mapping definition for the specified class.
         * @param clazz The class.
         * @param registry The mappings registry.
         */
        private Mappings(final Class<?> clazz, final DynamoDBMappingsRegistry registry) {
            objectType = clazz;
            annotations = registry.annotationRegistry.annotationsOf(clazz);

            for (final BeanProperty beanProperty : registry.reflectionRegistry.beanPropertiesOf(clazz)) {
                if (!getObjectType().equals(beanProperty.getGetter().getDeclaringClass())) {
                    final AnnotationMap typeAnnotations = registry.annotationRegistry.annotationsOf(beanProperty.getGetter().getDeclaringClass());
                    if (!typeAnnotations.isTable() && !typeAnnotations.isDocument()) {
                        continue;
                    }
                }

                final Mapping mapping = new Mapping(beanProperty, registry);

                if (mapping.isIgnore()) {
                    continue;
                }

                if (byNames.containsKey(mapping.getAttributeName())) {
                    throw new DynamoDBMappingException("Class " + getObjectType().getName() + " maps duplicate attributes named " + mapping.getAttributeName());
                }

                byNames.put(mapping.getAttributeName(), mapping);
                byGetters.put(mapping.getter(), mapping);

                if (mapping.isHashKey()) {
                    if (hasHashKey()) {
                        throw new DynamoDBMappingException("Class " + getObjectType().getName() + " maps @DynamoDBHashKey to multiple attributes");
                    }
                    hashKey = mapping;
                    primaryKeys.add(mapping);
                }

                if (mapping.isRangeKey()) {
                    if (hasRangeKey()) {
                        throw new DynamoDBMappingException("Class " + getObjectType().getName() + " maps @DynamoDBRangeKey to multiple attributes");
                    }
                    rangeKey = mapping;
                    primaryKeys.add(mapping);
                }

                if (mapping.isVersionAttribute()) {
                    if (hasVersionAttribute()) {
                        log.warn("Class " + getObjectType().getName() + " maps @DynamoDBVersionAttribute to multiple attributes");
                    }
                    versionAttribute = mapping;
                }
            }

            //verify that hash key exists, for legacy reasons we can't throw an exception here but we should,
            //instead we throw in getHashKey until a new version can allow for this change
            if (annotations.isTable() && !hasHashKey()) {
                log.warn("Class " + getObjectType().getName() + " does not map a @DynamoDBHashKey attribute");
            }
        }

        /**
         * Gets the object type.
         * @return The object type.
         */
        final Class<?> getObjectType() {
            return objectType;
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
                throw new DynamoDBMappingException("Class " + getObjectType().getName() + " does not map any getter named " + method.getName());
            }
            return mapping;
        }

        /**
         * Gets the collection of key attributes.
         * @return The key attributes.
         */
        final Collection<Mapping> getPrimaryKeys() {
            return primaryKeys;
        }

        /**
         * Determines if the mapping has a hash key attribute.
         * @return True if range key is present, false otherwise.
         */
        final boolean hasHashKey() {
            return (hashKey != null);
        }

        /**
         * Gets the hash key attribute mapping for this class.
         * @return The range key attribute.
         */
        final Mapping getHashKey() {
            if (!hasHashKey()) {
                throw new DynamoDBMappingException("Class " + getObjectType().getName() + " does not map a @DynamoDBHashKey attribute" +
                    "; ensure a public, zero-parameter get method/field is annotated");
            }
            return hashKey;
        }

        /**
         * Determines if the mapping has a range key attribute.
         * @return True if range key is present, false otherwise.
         */
        final boolean hasRangeKey() {
            return (rangeKey != null);
        }

        /**
         * Gets the range key attribute mapping for this class.
         * @return The attribute mapping.
         */
        final Mapping getRangeKey() {
            return rangeKey;
        }

        /**
         * Determines if the mapping has a version attribute.
         * @return True if version is present, false otherwise.
         */
        final boolean hasVersionAttribute() {
            return (versionAttribute != null);
        }

        /**
         * Gets the version attribute mapping for this class.
         * @return The attribute mapping.
         */
        final Mapping getVersionAttribute() {
            return versionAttribute;
        }

        /**
         * Determines if this is a document type.
         * @return True if document type, false otherwise.
         */
        final boolean isDocument() {
            return annotations.isDocument();
        }

        /**
         * Gets the table name; does not account for any overrides.
         * @return The table name.
         */
        final String getTableName() {
            if (!annotations.isTable()) {
                throw new DynamoDBMappingException("Class " + getObjectType().getName() + " must be annotated with @DynamoDBTable");
            }
            return annotations.getTableName();
        }
    }

    /**
     * Holds the properties for mapping an object attribute.
     */
    static final class Mapping {
        private final BeanProperty beanProperty;
        private final AnnotationMap annotations;
        private final DynamoDBAutoGeneratorRegistry.Generator<Object> autoGenerator;
        private final String attributeName;

        /**
         * Constructs an object attribute mapping for the specified method.
         * @param beanProperty The reflection property.
         * @param registry The mappings registry.
         */
        private Mapping(final BeanProperty beanProperty, final DynamoDBMappingsRegistry registry) {
            this.beanProperty = beanProperty;
            this.annotations = registry.annotationRegistry.annotationsOf(beanProperty.getGetter(), beanProperty.getField());
            this.attributeName = annotations.getAttributeName(beanProperty.getFieldName());
            this.autoGenerator = registry.autoGeneratorRegistry.generatorOf(this);
        }

        /**
         * Gets the getter method for this attribute.
         * @return The getter method.
         */
        final Method getter() {
            return beanProperty.getGetter();
        }

        /**
         * Gets the setter method for this attribute.
         * @return The setter method.
         */
        final Method setter() {
            return beanProperty.getSetter();
        }

        /**
         * Gets the attribute name.
         * @return The attribute name.
         */
        final String getAttributeName() {
            return attributeName;
        }

        /**
         * Gets the value type of the getter.
         * @return The value type.
         */
        final Class<?> getGetterType() {
            return beanProperty.getGetterType();
        }

        /**
         * Tries to get the attribute value from the object.
         * @param target The target object.
         * @return The attribute value.
         */
        final Object getValueOf(final Object target) {
            return beanProperty.getValueOf(target);
        }

        /**
         * Tries to set the attribute value on the object.
         * @param target The target object.
         * @param value The value.
         */
        final void setValueOf(final Object target, final Object value) {
            beanProperty.setValueOf(target, value);
        }

        /**
         * Determines if this attribute should be ignored.
         * @return True if it maps, false otherwise.
         */
        final boolean isIgnore() {
            return annotations.isIgnore();
        }

        /**
         * @return True if this Mapping represents a primary key (i.e. a hash key or a range key).
         *         False otherwise.
         */
        final boolean isPrimaryKey() {
            return isHashKey() || isRangeKey();
        }

        /**
         * Determines if this attribute maps to a hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isHashKey() {
            return annotations.isHashKey();
        }

        /**
         * Determines if this attribute maps to a range key.
         * @return True if it maps, false otherwise.
         */
        final boolean isRangeKey() {
            return annotations.isRangeKey();
        }

        /**
         * Determines if this attribute maps to an index hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isIndexHashKey() {
            return annotations.isIndexHashKey();
        }

        /**
         * Determines if this attribute maps to an index range key.
         * @return True if it maps, false otherwise.
         */
        final boolean isIndexRangeKey() {
            return annotations.isIndexRangeKey();
        }

        /**
         * Determines if this attribute maps to a version attribute.
         * @return True if it maps, false otherwise.
         */
        final boolean isVersionAttribute() {
            return annotations.isVersionAttribute();
        }

        /**
         * @deprecated
         * Determines if this attribute maps to a version attribute.
         * @return True if it maps, false otherwise.
         */
        @Deprecated
        final boolean isVersion() {
            return isVersionAttribute();
        }

        /**
         * Determines if this attribute maps to an auto-generated key.
         * @return True if it maps, false otherwise.
         */
        final boolean isAutoGeneratedKey() {
            return annotations.isAutoGeneratedKey();
        }

        /**
         * Determines if this attribute maps to an auto-generated timestamp.
         * @return True if it maps, false otherwise.
         */
        final boolean isAutoGeneratedTimestamp() {
            return annotations.isAutoGeneratedTimestamp();
        }

        /**
         * Determines if this attribute maps to an auto-generate strategy.
         * @return The auto-generate strategy.
         */
        final DynamoDBAutoGenerateStrategy getAutoGenerateStrategy() {
            return annotations.getAutoGenerateStrategy();
        }

        /**
         * Gets the auto-generator for this attribute.
         * @return The auto-generator.
         */
        final DynamoDBAutoGeneratorRegistry.Generator<Object> getAutoGenerator() {
            return autoGenerator;
        }

        /**
         * Gets the global secondary index names if applicable.
         * @return The names.
         */
        final Collection<String> getGlobalSecondaryIndexNamesOfIndexHashKey() {
            final Collection<String> indexNames = annotations.getGlobalSecondaryIndexNamesOfIndexHashKey();
            if (indexNames == null) {
                throw new DynamoDBMappingException(
                    "@DynamoDBIndexHashKey annotation on getter " + getter() +
                    " contains both globalSecondaryIndexName and globalSecondaryIndexNames.");
            } else if (indexNames.isEmpty()) {
                throw new DynamoDBMappingException(
                    "@DynamoDBIndexHashKey annotation on getter " + getter() +
                    " doesn't contain any index name.");
            }
            return indexNames;
        }

        /**
         * Gets the global secondary index names if applicable.
         * @return The names.
         */
        final Collection<String> getGlobalSecondaryIndexNamesOfIndexRangeKey() {
            final Collection<String> indexNames = annotations.getGlobalSecondaryIndexNamesOfIndexRangeKey();
            if (indexNames == null) {
                throw new DynamoDBMappingException(
                    "@DynamoDBIndexRangeKey annotation on getter " + getter() +
                    " contains both globalSecondaryIndexName and globalSecondaryIndexNames.");
            }
            return indexNames;
        }

        /**
         * Gets the local secondary index names if applicable.
         * @return The names.
         */
        final Collection<String> getLocalSecondaryIndexNamesOfIndexRangeKey() {
            final Collection<String> indexNames = annotations.getLocalSecondaryIndexNamesOfIndexRangeKey();
            if (indexNames == null) {
                throw new DynamoDBMappingException(
                    "@DynamoDBIndexRangeKey annotation on getter " + getter() +
                    " contains both localSecondaryIndexName and localSecondaryIndexNames.");
            }
            return indexNames;
        }

        /**
         * Gets the custom marshaller.
         * @return The marshaller or null if default should be used.
         */
        final ArgumentMarshaller getCustomMarshaller() {
            final Class<? extends DynamoDBMarshaller<?>> marshallerClass = annotations.getMarshallerClass();
            if (marshallerClass != null) {
                return new CustomMarshaller(marshallerClass);
            } else if (annotations.isNativeBoolean()) {
                return BooleanToBooleanMarshaller.instance();
            }
            return null;
        }

        /**
         * Gets the custom unmarshaller.
         * @return The unmarshaller or null if default should be used.
         */
        final ArgumentUnmarshaller getCustomUnmarshaller() {
            final Class<? extends DynamoDBMarshaller<?>> marshallerClass = annotations.getMarshallerClass();
            if (marshallerClass != null) {
                return new CustomUnmarshaller(getGetterType(), marshallerClass);
            }
            return null;
        }
    }

}
