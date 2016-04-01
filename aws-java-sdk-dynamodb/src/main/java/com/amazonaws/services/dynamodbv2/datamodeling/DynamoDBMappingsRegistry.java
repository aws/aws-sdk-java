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
import java.util.ArrayList;
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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratorRegistry.Generator;;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
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
    private final DynamoDBAutoGeneratorRegistry generatorRegistry = new DynamoDBAutoGeneratorRegistry();

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
     * Get the collection of mappings for the given clazz.
     * @param clazz The class.
     * @param mappings The mappings.
     * @return The mappings.
     */
    private final Collection<Mapping> map(final Class<?> clazz, final Mappings mappings) {
        final Collection<BeanProperty> properties = reflectionRegistry.beanPropertiesOf(clazz);
        final Collection<Mapping> map = new ArrayList<Mapping>(properties.size());

        for (final BeanProperty property : properties) {
            if (!clazz.equals(property.getDeclaringType())) {
                final AnnotationMap annotations = annotationRegistry.annotationsOf(property.getDeclaringType());
                if (!annotations.isTable() && !annotations.isDocument()) {
                    continue;
                }
            }

            final AnnotationMap annotations = annotationRegistry.annotationsOf(property.getGetter(), property.getField());

            if (annotations.isIgnore()) {
                continue;
            }

            final Generator<Object> generator = generatorRegistry.generatorOf(property.getGetterType(), annotations);

            String attributeName = annotations.getAttributeName();
            if (attributeName == null) {
                attributeName = property.getFieldName();
            }

            map.add(new Mapping(mappings, property, annotations, generator, attributeName));
        }

        return map;
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
        private Mapping hashKey, rangeKey;

        /**
         * Constructs a mapping definition for the specified class.
         * @param clazz The class.
         * @param registry The mappings registry.
         */
        private Mappings(final Class<?> clazz, final DynamoDBMappingsRegistry registry) {
            objectType = clazz;
            annotations = registry.annotationRegistry.annotationsOf(clazz);

            for (final Mapping mapping : registry.map(clazz, this)) {
                if (byNames.containsKey(mapping.getAttributeName())) {
                    throw new DynamoDBMappingException("Class " + getObjectType().getName() + " maps duplicate attributes named " + mapping.getAttributeName());
                }

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

                byNames.put(mapping.getAttributeName(), mapping);
                byGetters.put(mapping.getter(), mapping);
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

        /**
         * Determnes if any of the primary keys require auto-generation.
         * @param objectValue The object to evaluate.
         * @return True if any keys should be auto-generated.
         */
        final boolean anyPrimaryKeyAutoGeneratable(final Object objectValue) {
            for (final Mapping primaryKey : getPrimaryKeys()) {
                if (primaryKey.isAutoGeneratedKey()) {
                    final Object primaryKeyValue = primaryKey.getValueOf(objectValue);
                    if (primaryKey.getAutoGenerator().canGenerate(primaryKeyValue)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /**
     * Holds the properties for mapping an object attribute.
     */
    static final class Mapping {
        private final Mappings mappings;
        private final BeanProperty property;
        private final AnnotationMap annotations;
        private final Generator<Object> generator;
        private final String attributeName;

        /**
         * Constructs an object attribute mapping for the specified method.
         * @param mappings The parent mappings reference.
         * @param property The reflection property.
         * @param annotations The annotations.
         * @param generator The generator.
         * @param attributeName The attribute name.
         */
        private Mapping(final Mappings mappings, final BeanProperty property, final AnnotationMap annotations, final Generator<Object> generator, final String attributeName) {
            this.mappings = mappings;
            this.property = property;
            this.annotations = annotations;
            this.generator = generator;
            this.attributeName = attributeName;
        }

        /**
         * Gets the auto-generator for this attribute.
         * @return The auto-generator.
         */
        private final Generator<Object> getAutoGenerator() {
            return generator;
        }

        /**
         * Gets the getter method for this attribute.
         * @return The getter method.
         */
        final Method getter() {
            return property.getGetter();
        }

        /**
         * Gets the setter method for this attribute.
         * @return The setter method.
         */
        final Method setter() {
            return property.getSetter();
        }

        /**
         * Tries to get the attribute value from the object.
         * @param target The target object.
         * @return The attribute value.
         */
        final Object getValueOf(final Object target) {
            return property.getValueOf(target);
        }

        /**
         * Tries to set the attribute value on the object.
         * @param target The target object.
         * @param value The value.
         */
        final void setValueOf(final Object target, final Object value) {
            property.setValueOf(target, value);
        }

        /**
         * @return True if this Mapping represents a primary key (i.e. a hash key or a range key).
         *         False otherwise.
         */
        final boolean isPrimaryKey() {
            return isHashKey() || isRangeKey();
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
         * Determines if this attribute maps to a hash key.
         * @return True if it maps, false otherwise.
         */
        final boolean isHashKey() {
            return annotations.isHashKey();
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
         * Determines if this attribute maps to a range key.
         * @return True if it maps, false otherwise.
         */
        final boolean isRangeKey() {
            return annotations.isRangeKey();
        }

        /**
         * Determines if this attribute maps to a version attribute.
         * @return True if it maps, false otherwise.
         */
        final boolean isVersion() {
            return annotations.isVersion();
        }

        /**
         * Gets the attribute name.
         * @return The attribute name.
         */
        final String getAttributeName() {
            return attributeName;
        }

        /**
         * Gets the global secondary index names if applicable.
         * @return The names.
         */
        final Collection<String> getGlobalSecondaryIndexNamesOfIndexHashKey() {
            final Collection<String> indexNames = annotations.getGlobalSecondaryIndexNamesOfIndexHashKey();
            if (indexNames.isEmpty()) {
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
            return annotations.getGlobalSecondaryIndexNamesOfIndexRangeKey();
        }

        /**
         * Gets the local secondary index names if applicable.
         * @return The index names.
         */
        final Collection<String> getLocalSecondaryIndexNamesOfIndexRangeKey() {
            return annotations.getLocalSecondaryIndexNamesOfIndexRangeKey();
        }

        /**
         * Determines if this attribute maps to an auto-generate strategy.
         * @return The auto-generate strategy.
         */
        final DynamoDBAutoGenerateStrategy getAutoGenerateStrategy() {
            return annotations.getAutoGenerateStrategy();
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
                return new CustomUnmarshaller(property.getGetterType(), marshallerClass);
            }
            return null;
        }

        /**
         * Determines if the mapping value can be auto-generated.
         * @param value The current mapped value.
         * @param objectValue The object instance.
         * @param saveBehaviour The save behaviour.
         * @return True if can be auto-generated, false otherwise.
         */
        final boolean canAutoGenerate(final Object value, final Object objectValue, final SaveBehavior saveBehavior) {
            if (!getAutoGenerator().canGenerate(value)) {
                return false;
            } else if (isPrimaryKey() || isIndexHashKey() || isIndexRangeKey()) {
                return isAutoGeneratedKey();
            } else if (DynamoDBAutoGenerateStrategy.CREATE == getAutoGenerateStrategy()) {
                return (saveBehavior == SaveBehavior.CLOBBER || saveBehavior == SaveBehavior.UPDATE || mappings.anyPrimaryKeyAutoGeneratable(objectValue));
            } else {
                return true;
            }
        }

        /**
         * Auto-genertes the value given the current value.
         * @param value The current value.
         * @return The auto-generated value.
         */
        final Object autoGenerate(final Object value) {
            return getAutoGenerator().generate(value);
        }
    }

}
