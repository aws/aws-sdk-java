/*
 * Copyright 2011-2015 Amazon Technologies, Inc.
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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProjectionType;

/**
 * A class responsible for parsing the primary key and index schema of a table
 * POJO.
 */
class DynamoDBTableSchemaParser {

    private final Map<Class<?>, TableIndexesInfo> tableIndexesInfoCache =
            new HashMap<Class<?>, TableIndexesInfo>();

    /**
     * Parse the given POJO class and return the CreateTableRequest for the
     * DynamoDB table it represents. Note that the returned request does not
     * include the required ProvisionedThroughput parameters for the primary
     * table and the GSIs, and that all secondary indexes are initialized with
     * the default projection type - KEY_ONLY.
     *
     * @param clazz
     *            The POJO class.
     * @param config
     *            The DynamoDBMapperConfig which contains the TableNameOverrides
     *            parameter used to determine the table name.
     * @param reflector
     *            The DynamoDBReflector that provides all the relevant getters
     *            of the POJO.
     */
    CreateTableRequest parseTablePojoToCreateTableRequest(
            Class<?> clazz,
            DynamoDBMapperConfig config,
            DynamoDBReflector reflector,
            ItemConverter converter) {

        CreateTableRequest createTableRequest = new CreateTableRequest();
        createTableRequest.setTableName(DynamoDBMapper.internalGetTableName(clazz, null, config));

        // Primary keys
        Method pHashKeyGetter = reflector.getPrimaryHashKeyGetter(clazz);
        AttributeDefinition pHashAttrDefinition = getKeyAttributeDefinition(pHashKeyGetter, converter);
        createTableRequest.withKeySchema(new KeySchemaElement(pHashAttrDefinition.getAttributeName(), KeyType.HASH));
        // Primary range
        Method pRangeKeyGetter = reflector.getPrimaryRangeKeyGetter(clazz);
        AttributeDefinition pRangeAttrDefinition = null;
        if (pRangeKeyGetter != null) {
            pRangeAttrDefinition = getKeyAttributeDefinition(pRangeKeyGetter, converter);
            createTableRequest.withKeySchema(new KeySchemaElement(pRangeAttrDefinition.getAttributeName(), KeyType.RANGE));
        }

        // Parse the index schema
        TableIndexesInfo indexesInfo = parseTableIndexes(clazz, reflector);
        if ( indexesInfo.getGlobalSecondaryIndexes().isEmpty() == false ) {
            createTableRequest.setGlobalSecondaryIndexes(indexesInfo.getGlobalSecondaryIndexes());
        }
        if ( indexesInfo.getLocalSecondaryIndexes().isEmpty() == false ) {
            createTableRequest.setLocalSecondaryIndexes(indexesInfo.getLocalSecondaryIndexes());
        }

        // Aggregate all key attribute definitions
        Map<String, AttributeDefinition> attrDefinitions = new HashMap<String, AttributeDefinition>();
        // Hash key definition
        putAfterCheckConflict(attrDefinitions, pHashAttrDefinition);
        // Range key definition
        if (pRangeKeyGetter != null) {
            putAfterCheckConflict(attrDefinitions, pRangeAttrDefinition);
        }
        for (Method indexKeyGetter : indexesInfo.getIndexKeyGetters()) {
            AttributeDefinition indexKeyAttrDefinition = getKeyAttributeDefinition(indexKeyGetter, converter);
            putAfterCheckConflict(attrDefinitions, indexKeyAttrDefinition);
        }
        createTableRequest.setAttributeDefinitions(attrDefinitions.values());

        return createTableRequest;
    }

    TableIndexesInfo parseTableIndexes(final Class<?> clazz, final DynamoDBReflector reflector) {
        synchronized(tableIndexesInfoCache) {
            if ( !tableIndexesInfoCache.containsKey(clazz) ) {
                TableIndexesInfo tableIndexInfo = new TableIndexesInfo();
                String pHashName = reflector.getPrimaryHashKeyName(clazz);

                for (Method getter : reflector.getRelevantGetters(clazz)) {
                    // Only consider 0-arg getters
                    if (getter.getParameterTypes().length != 0) {
                        continue;
                    }

                    String attributeName = reflector.getAttributeName(getter);

                    if (ReflectionUtils.getterOrFieldHasAnnotation(getter, DynamoDBIndexHashKey.class)) {
                        DynamoDBIndexHashKey indexHashKeyAnnotation = ReflectionUtils
                                .getAnnotationFromGetterOrField(getter, DynamoDBIndexHashKey.class);
                        String gsiName = indexHashKeyAnnotation.globalSecondaryIndexName();
                        String[] gsiNames = indexHashKeyAnnotation.globalSecondaryIndexNames();

                        boolean singleGsiName = gsiName != null &&
                                                gsiName.length() != 0;
                        boolean multipleGsiNames = gsiNames != null &&
                                                   gsiNames.length != 0;

                        if ( singleGsiName && multipleGsiNames) {
                            throw new DynamoDBMappingException(
                                    "@DynamoDBIndexHashKey annotation on getter " + getter +
                                    " contains both globalSecondaryIndexName and globalSecondaryIndexNames.");
                        } else if ( (!singleGsiName) && (!multipleGsiNames) ) {
                            throw new DynamoDBMappingException(
                                    "@DynamoDBIndexHashKey annotation on getter " + getter +
                                    " doesn't contain any index name.");
                        }

                        if (singleGsiName) {
                            tableIndexInfo.addGsiKeys(gsiName, attributeName, null);
                        } else if (multipleGsiNames) {
                            for (String gsi : gsiNames) {
                                tableIndexInfo.addGsiKeys(gsi, attributeName, null);
                            }
                        }
                        tableIndexInfo.addIndexKeyGetter(getter);
                    }

                    if (ReflectionUtils.getterOrFieldHasAnnotation(getter, DynamoDBIndexRangeKey.class)) {
                        DynamoDBIndexRangeKey indexRangeKeyAnnotation = ReflectionUtils
                                .getAnnotationFromGetterOrField(getter, DynamoDBIndexRangeKey.class);
                        String gsiName = indexRangeKeyAnnotation.globalSecondaryIndexName();
                        String[] gsiNames = indexRangeKeyAnnotation.globalSecondaryIndexNames();
                        String lsiName = indexRangeKeyAnnotation.localSecondaryIndexName();
                        String[] lsiNames = indexRangeKeyAnnotation.localSecondaryIndexNames();

                        boolean singleGsiName = gsiName != null &&
                                                gsiName.length() != 0;
                        boolean multipleGsiNames = gsiNames != null &&
                                                   gsiNames.length != 0;
                        boolean singleLsiName = lsiName != null &&
                                                lsiName.length() != 0;
                        boolean multipleLsiNames = lsiNames != null &&
                                                   lsiNames.length != 0;

                        if ( singleGsiName && multipleGsiNames ) {
                            throw new DynamoDBMappingException(
                                    "@DynamoDBIndexRangeKey annotation on getter " + getter +
                                    " contains both globalSecondaryIndexName and globalSecondaryIndexNames.");
                        }
                        if ( singleLsiName && multipleLsiNames ) {
                            throw new DynamoDBMappingException(
                                    "@DynamoDBIndexRangeKey annotation on getter " + getter +
                                    " contains both localSecondaryIndexName and localSecondaryIndexNames.");
                        }
                        if ( (!singleGsiName) && (!multipleGsiNames) && (!singleLsiName) && (!multipleLsiNames) ) {
                            throw new DynamoDBMappingException(
                                    "@DynamoDBIndexRangeKey annotation on getter " + getter +
                                    " doesn't contain any index name.");
                        }

                        if (singleGsiName) {
                            tableIndexInfo.addGsiKeys(gsiName, null, attributeName);
                        } else if (multipleGsiNames) {
                            for (String gsi : gsiNames) {
                                tableIndexInfo.addGsiKeys(gsi, null, attributeName);
                            }
                        }
                        if (singleLsiName) {
                            tableIndexInfo.addLsiRangeKey(lsiName, pHashName, attributeName);
                        } else if (multipleLsiNames) {
                            for (String lsi : lsiNames) {
                                tableIndexInfo.addLsiRangeKey(lsi, pHashName, attributeName);
                            }
                        }
                        tableIndexInfo.addIndexKeyGetter(getter);
                    }
                } // end of for loop
                tableIndexesInfoCache.put(clazz, tableIndexInfo);
            } // end of the if-cache-does-not-contain block
            return tableIndexesInfoCache.get(clazz);
        } // end of synchronized block
    }

    private static AttributeDefinition getKeyAttributeDefinition(
            Method keyGetter,
            ItemConverter converter) {

        DynamoDBMapperFieldModel fieldModel = converter.getFieldModel(keyGetter);

        String keyAttrName = fieldModel.getDynamoDBAttributeName();
        DynamoDBAttributeType keyType = fieldModel.getDynamoDBAttributeType();

        if (keyType == DynamoDBAttributeType.S ||
            keyType == DynamoDBAttributeType.N ||
            keyType == DynamoDBAttributeType.B) {
            return new AttributeDefinition(keyAttrName, keyType.toString());
        }

        throw new DynamoDBMappingException(
                "The key attribute must be in a scalar type "
                + "(String, Number or Binary).");
    }

    private static void putAfterCheckConflict(Map<String, AttributeDefinition> map,
                                              AttributeDefinition attrDefinition) {
        String attrName = attrDefinition.getAttributeName();
        AttributeDefinition existingDefinition = map.get(attrName);
        if (existingDefinition != null && !existingDefinition.equals(attrDefinition)) {
            throw new DynamoDBMappingException(
                    "Found conflicting definitions for attribute [" + attrName + "]: " +
                    existingDefinition + " and " + attrDefinition + ".");
        } else {
            map.put(attrName, attrDefinition);
        }
    }

    /**
     * This class contains all the information about a table's index schema
     * parsed from a table POJO class.
     */
    static class TableIndexesInfo {

        /** Used for mapping an index key name to all the applicable indexes. */
        private final Map<String, Set<String>> lsiRangeKeyNameToIndexNames =
                new HashMap<String, Set<String>>();
        private final Map<String, Set<String>> gsiHashKeyNameToIndexNames =
                new HashMap<String, Set<String>>();
        private final Map<String, Set<String>> gsiRangeKeyNameToIndexNames =
                new HashMap<String, Set<String>>();

        /** Note that the KeySchema in each LocalSecondaryIndex does not include the hash key. */
        private final Map<String, LocalSecondaryIndex> lsiNameToLsiDefinition = new HashMap<String, LocalSecondaryIndex>();
        private final Map<String, GlobalSecondaryIndex> gsiNameToGsiDefinition = new HashMap<String, GlobalSecondaryIndex>();

        /** All getter methods of index key attributes. */
        private final Set<Method> indexKeyGetters = new HashSet<Method>();

        /**
         * Returns the names of all the annotated local secondary indexes that
         * use the given attribute as the index range key.
         */
        public Set<String> getLsiNamesByIndexRangeKey(String indexRangeKeyName) {
            Set<String> lsiNames = lsiRangeKeyNameToIndexNames.get(indexRangeKeyName);
            if (lsiNames != null) {
                lsiNames = Collections.unmodifiableSet(lsiNames);
            }
            return lsiNames;
        }

        /**
         * Returns the names of all the annotated global secondary indexes that
         * use the given attribute as the index hash key.
         */
        public Set<String> getGsiNamesByIndexHashKey(String indexHashKeyName) {
            Set<String> gsiNames = gsiHashKeyNameToIndexNames.get(indexHashKeyName);
            if (gsiNames != null) {
                gsiNames = Collections.unmodifiableSet(gsiNames);
            }
            return gsiNames;
        }

        /**
         * Returns the names of all the annotated global secondary indexes that
         * use the given attribute as the index range key.
         */
        public Set<String> getGsiNamesByIndexRangeKey(String indexRangeKeyName) {
            Set<String> gsiNames = gsiRangeKeyNameToIndexNames.get(indexRangeKeyName);
            if (gsiNames != null) {
                gsiNames = Collections.unmodifiableSet(gsiNames);
            }
            return gsiNames;
        }

        /**
         * Returns the names of all the annotated local secondary indexes of
         * this POJO class.
         */
        public Set<String> getAllLsiNames() {
            return Collections.unmodifiableSet(lsiNameToLsiDefinition.keySet());
        }

        /**
         * Returns the names of all the annotated global secondary indexes of
         * this POJO class.
         */
        public Set<String> getAllGsiNames() {
            return Collections.unmodifiableSet(gsiNameToGsiDefinition.keySet());
        }

        /*
         * Private interfaces
         */

        private void addGsiKeys(String gsiName, String gsiHashKeyName, String gsiRangeKeyName) {
            GlobalSecondaryIndex gsi;
            if (gsiNameToGsiDefinition.containsKey(gsiName)) {
                GlobalSecondaryIndex existingGsi = gsiNameToGsiDefinition.get(gsiName);
                gsi = existingGsi;

                if ( !gsiName.equals(existingGsi.getIndexName()) ) {
                    throw new IllegalStateException("Found invalid state of an existing GlobalSecondaryIndex object " +
                            "associated with the GSI [" + gsiName + "].");
                }

                for (KeySchemaElement existingKey : existingGsi.getKeySchema()) {
                    String existingKeyName = existingKey.getAttributeName();
                    String existingKeyType = existingKey.getKeyType();

                    if (KeyType.HASH.toString().equals(existingKeyType)) {
                        if (gsiHashKeyName != null && !gsiHashKeyName.equals(existingKeyName)) {
                            throw new DynamoDBMappingException("Multiple hash keys [" + existingKeyName + ", " + gsiHashKeyName +
                                    "] are found for the GSI [" + gsiName + "]. " +
                                    "Each index allows at most one range key attribute.");
                        }
                    } else if (KeyType.RANGE.toString().equals(existingKeyType)) {
                        if (gsiRangeKeyName != null && !gsiRangeKeyName.equals(existingKeyName)) {
                            throw new DynamoDBMappingException("Multiple range keys [" + existingKeyName + ", " + gsiRangeKeyName +
                                    "] are found for the GSI [" + gsiName + "]. " +
                                    "Each index allows at most one range key attribute.");
                        }
                    } else {
                        // Existing key element is neither HASH nor RANGE.
                        throw new IllegalStateException("Found invalid state of an existing GlobalSecondaryIndex object " +
                                "associated with the GSI [" + gsiName + "].");
                    }
                }
            } else {
                gsi = new GlobalSecondaryIndex()
                    .withIndexName(gsiName)
                    .withProjection(new Projection().withProjectionType(ProjectionType.KEYS_ONLY));
                gsiNameToGsiDefinition.put(gsiName, gsi);
            }

            if (gsiHashKeyName != null) {
                // Make sure that the HASH key element is always inserted at the beginning of the list
                if (gsi.getKeySchema() == null || gsi.getKeySchema().isEmpty()) {
                    gsi.withKeySchema(new KeySchemaElement(gsiHashKeyName, KeyType.HASH));
                } else {
                    LinkedList<KeySchemaElement> orderedKeys = new LinkedList<KeySchemaElement>(gsi.getKeySchema());
                    orderedKeys.addFirst(new KeySchemaElement(gsiHashKeyName, KeyType.HASH));
                    gsi.setKeySchema(orderedKeys);
                }

                // Register the mapping from the hash key name to the GSI name
                mapGsiHashKeyToIndexName(gsiHashKeyName, gsiName);
            }
            if (gsiRangeKeyName != null) {
                gsi.withKeySchema(new KeySchemaElement(gsiRangeKeyName, KeyType.RANGE));

                // Register the mapping from the range key name to the GSI name
                mapGsiRangeKeyToIndexName(gsiRangeKeyName, gsiName);
            }
        }

        private void addLsiRangeKey(String lsiName, String pHashKeyName, String lsiRangeKeyName) {
            if (pHashKeyName == null) {
                throw new IllegalArgumentException("The name of the primary hash key must be specified.");
            }

            if (lsiNameToLsiDefinition.containsKey(lsiName)) {
                LocalSecondaryIndex existingLsi = lsiNameToLsiDefinition.get(lsiName);
                if ( !lsiName.equals(existingLsi.getIndexName())
                        || existingLsi.getKeySchema() == null
                        || existingLsi.getKeySchema().size() != 2  // the hash key element should be already added
                        || !KeyType.RANGE.toString().equals(existingLsi.getKeySchema().get(1).getKeyType()) ) {
                    throw new IllegalStateException("Found invalid state of an existing LocalSecondaryIndex object " +
                            "associated with the LSI [" + lsiName + "].");
                }

                String existingLsiRangeKeyName = existingLsi.getKeySchema().get(1).getAttributeName();
                if ( !existingLsiRangeKeyName.equals(lsiRangeKeyName) ) {
                    throw new DynamoDBMappingException("Multiple range keys [" + existingLsiRangeKeyName + ", " + lsiRangeKeyName +
                            "] are found for the LSI [" + lsiName + "]. " +
                            "Each index allows at most one range key attribute.");
                }
            } else {
                lsiNameToLsiDefinition.put(
                        lsiName,
                        new LocalSecondaryIndex()
                                .withIndexName(lsiName)
                                .withKeySchema(
                                        new KeySchemaElement(pHashKeyName, KeyType.HASH),
                                        new KeySchemaElement(lsiRangeKeyName, KeyType.RANGE))
                                .withProjection(new Projection().withProjectionType(ProjectionType.KEYS_ONLY)));
                mapLsiRangeKeyToIndexName(lsiRangeKeyName, lsiName);
            }
        }

        private void mapLsiRangeKeyToIndexName(String lsiRangeKeyName, String lsiName) {
            mapIndexKeyToIndexName(lsiRangeKeyNameToIndexNames, lsiRangeKeyName, lsiName);
        }

        private void mapGsiHashKeyToIndexName(String gsiHashKeyName, String gsiName) {
            mapIndexKeyToIndexName(gsiHashKeyNameToIndexNames, gsiHashKeyName, gsiName);
        }

        private void mapGsiRangeKeyToIndexName(String gsiRangeKeyName, String gsiName) {
            mapIndexKeyToIndexName(gsiRangeKeyNameToIndexNames, gsiRangeKeyName, gsiName);
        }

        private void mapIndexKeyToIndexName(Map<String, Set<String>> indexKeyNameToIndexNames,
                                            String indexKeyName,
                                            String indexName) {
            if (indexKeyNameToIndexNames.get(indexKeyName) == null) {
                Set<String> indexNames = new HashSet<String>();
                indexNames.add(indexName);
                indexKeyNameToIndexNames.put(indexKeyName, indexNames);
            } else {
                indexKeyNameToIndexNames.get(indexKeyName).add(indexName);
            }
        }

        private void addIndexKeyGetter(Method indexKeyGetter) {
            indexKeyGetters.add(indexKeyGetter);
        }

        private Set<Method> getIndexKeyGetters() {
            return Collections.unmodifiableSet(indexKeyGetters);
        }

        private Collection<LocalSecondaryIndex> getLocalSecondaryIndexes() {
            return Collections.unmodifiableCollection(lsiNameToLsiDefinition.values());
        }

        private Collection<GlobalSecondaryIndex> getGlobalSecondaryIndexes() {
            return Collections.unmodifiableCollection(gsiNameToGsiDefinition.values());
        }
    }
}
