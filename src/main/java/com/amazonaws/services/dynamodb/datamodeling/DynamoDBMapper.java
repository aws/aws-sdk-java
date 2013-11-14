/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
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
package com.amazonaws.services.dynamodb.datamodeling;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodb.model.AttributeValue;
import com.amazonaws.services.dynamodb.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodb.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodb.model.BatchGetItemResult;
import com.amazonaws.services.dynamodb.model.BatchResponse;
import com.amazonaws.services.dynamodb.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodb.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodb.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodb.model.DeleteItemRequest;
import com.amazonaws.services.dynamodb.model.DeleteRequest;
import com.amazonaws.services.dynamodb.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodb.model.GetItemRequest;
import com.amazonaws.services.dynamodb.model.GetItemResult;
import com.amazonaws.services.dynamodb.model.Key;
import com.amazonaws.services.dynamodb.model.KeysAndAttributes;
import com.amazonaws.services.dynamodb.model.PutItemRequest;
import com.amazonaws.services.dynamodb.model.PutRequest;
import com.amazonaws.services.dynamodb.model.QueryRequest;
import com.amazonaws.services.dynamodb.model.QueryResult;
import com.amazonaws.services.dynamodb.model.ScanRequest;
import com.amazonaws.services.dynamodb.model.ScanResult;
import com.amazonaws.services.dynamodb.model.UpdateItemRequest;
import com.amazonaws.services.dynamodb.model.WriteRequest;
import com.amazonaws.util.VersionInfoUtils;

/**
 * Object mapper for domain-object interaction with DynamoDB.
 * <p>
 * To use, annotate domain classes with the annotations found in the
 * com.amazonaws.services.dynamodb.datamodeling package. A minimal example:
 *
 * <pre>
 * &#064;DynamoDBTable(tableName = &quot;TestTable&quot;)
 * public class TestClass {
 *
 *     private Long key;
 *     private double rangeKey;
 *     private Long version;
 *
 *     private Set&lt;Integer&gt; integerSetAttribute;
 *
 *     &#064;DynamoDBHashKey
 *     public Long getKey() {
 *         return key;
 *     }
 *
 *     public void setKey(Long key) {
 *         this.key = key;
 *     }
 *
 *     &#064;DynamoDBRangeKey
 *     public double getRangeKey() {
 *         return rangeKey;
 *     }
 *
 *     public void setRangeKey(double rangeKey) {
 *         this.rangeKey = rangeKey;
 *     }
 *
 *     &#064;DynamoDBAttribute(attributeName = &quot;integerSetAttribute&quot;)
 *     public Set&lt;Integer&gt; getIntegerAttribute() {
 *         return integerSetAttribute;
 *     }
 *
 *     public void setIntegerAttribute(Set&lt;Integer&gt; integerAttribute) {
 *         this.integerSetAttribute = integerAttribute;
 *     }
 *
 *     &#064;DynamoDBVersionAttribute
 *     public Long getVersion() {
 *         return version;
 *     }
 *
 *     public void setVersion(Long version) {
 *         this.version = version;
 *     }
 * }
 * </pre>
 * <p>
 * Save instances of annotated classes to DynamoDB, retrieve them, and delete
 * them using the {@link DynamoDBMapper} class, as in the following example.
 *
 * <pre>
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * Long hashKey = 105L;
 * double rangeKey = 1.0d;
 * TestClass obj = mapper.load(TestClass.class, hashKey, rangeKey);
 * obj.getIntegerAttribute().add(42);
 * mapper.save(obj);
 * mapper.delete(obj);
 * </pre>
 * <p>
 * When using the save, load, and delete methods, {@link DynamoDBMapper} will
 * throw {@link DynamoDBMappingException}s to indicate that domain classes are
 * incorrectly annotated or otherwise incompatible with this class. Service
 * exceptions will always be propagated as {@link AmazonClientException}, and
 * DynamoDB-specific subclasses such as {@link ConditionalCheckFailedException}
 * will be used when possible.
 * <p>
 * This class is thread-safe and can be shared between threads. It's also very
 * lightweight, so it doesn't need to be.
 *
 * @see DynamoDBTable
 * @see DynamoDBHashKey
 * @see DynamoDBRangeKey
 * @see DynamoDBAutoGeneratedKey
 * @see DynamoDBAttribute
 * @see DynamoDBVersionAttribute
 * @see DynamoDBIgnore
 * @see DynamoDBMarshalling
 * @see DynamoDBMapperConfig
 */
@Deprecated
public class DynamoDBMapper {

    private final AmazonDynamoDB db;
    private final DynamoDBMapperConfig config;
    private static final DynamoDBReflector reflector = new DynamoDBReflector();

    /**
     * User agent for requests made using the {@link DynamoDBMapper}.
     */
    private static final String USER_AGENT = DynamoDBMapper.class.getName() + "/" + VersionInfoUtils.getVersion();

    /**
     * Constructs a new mapper with the service object given, using the default
     * configuration.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(AmazonDynamoDB dynamoDB) {
        this(dynamoDB, DynamoDBMapperConfig.DEFAULT);
    }

    /**
     * Constructs a new mapper with the service object and configuration given.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     */
    public DynamoDBMapper(AmazonDynamoDB dynamoDB, DynamoDBMapperConfig config) {
        this.db = dynamoDB;
        this.config = config;
    }

    /**
     * Loads an object with the hash key given and a configuration override.
     * This configuration overrides the default provided at object construction.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config) {
        return load(clazz, hashKey, null, config);
    }

    /**
     * Loads an object with the hash key given, using the default configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey) {
        return load(clazz, hashKey, null, config);
    }

    /**
     * Loads an object with a hash and range key, using the default
     * configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey) {
        return load(clazz, hashKey, rangeKey, config);
    }

    /**
     * Returns an object with the given hash key, or null if no such object
     * exists.
     *
     * @param clazz
     *            The class to load, corresponding to a DynamoDB table.
     * @param hashKey
     *            The key of the object.
     * @param rangeKey
     *            The range key of the object, or null for tables without a
     *            range key.
     * @param config
     *            Configuration for the service call to retrieve the object from
     *            DynamoDB. This configuration overrides the default given at
     *            construction.
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        String tableName = getTableName(clazz, config);

        // Fill in the hash key element in the service request
        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(hashKey, hashKeyGetter);

        // Determine the range key, if provided
        AttributeValue rangeKeyElement = null;
        if ( rangeKey != null ) {
            Method rangeKeyMethod = reflector.getRangeKeyGetter(clazz);
            if ( rangeKeyMethod == null ) {
                throw new DynamoDBMappingException("Zero-parameter range key property must be annotated with "
                        + DynamoDBRangeKey.class);
            }
            rangeKeyElement = getRangeKeyElement(rangeKey, rangeKeyMethod);
        }

        GetItemResult item = db.getItem(applyUserAgent(new GetItemRequest().withTableName(tableName)
                .withKey(new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement))
                .withConsistentRead(config.getConsistentReads() == ConsistentReads.CONSISTENT)));
        Map<String, AttributeValue> itemAttributes = item.getItem();
        if ( itemAttributes == null ) {
            return null;
        }

        return marshallIntoObject(clazz, itemAttributes);
    }

    private <T> String getTableName(Class<T> clazz, DynamoDBMapperConfig config) {
        DynamoDBTable table = reflector.getTable(clazz);
        String tableName = table.tableName();
        if ( config.getTableNameOverride() != null ) {
            if ( config.getTableNameOverride().getTableName() != null ) {
                tableName = config.getTableNameOverride().getTableName();
            } else {
                tableName = config.getTableNameOverride().getTableNamePrefix() + tableName;
            }
        }

        return tableName;
    }

    private AttributeValue getHashKeyElement(Object hashKey, Method hashKeyGetter) {
        return getSimpleAttributeValue(hashKeyGetter, hashKey);
    }

    private AttributeValue getRangeKeyElement(Object rangeKey, Method rangeKeyGetter) {
        return getSimpleAttributeValue(rangeKeyGetter, rangeKey);
    }

    /**
     * Creates and fills in the attributes on an instance of the class given
     * with the attributes given.
     * <p>
     * This is accomplished by looking for getter methods annotated with an
     * appropriate annotation, then looking for matching attribute names in the
     * item attribute map.
     *
     * @param clazz
     *            The class to instantiate and hydrate
     * @param itemAttributes
     *            The set of item attributes, keyed by attribute name.
     */
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {
        T toReturn = null;
        try {
            toReturn = clazz.newInstance();
        } catch ( InstantiationException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        } catch ( IllegalAccessException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        }

        if ( itemAttributes == null || itemAttributes.isEmpty() )
            return toReturn;

        itemAttributes = untransformAttributes(clazz, itemAttributes);

        for ( Method m : reflector.getRelevantGetters(clazz) ) {
            String attributeName = reflector.getAttributeName(m);
            if ( itemAttributes.containsKey(attributeName) ) {
                setValue(toReturn, m, itemAttributes.get(attributeName));
            }
        }

        return toReturn;
    }

    /**
     * Marshalls the list of item attributes into objects of type clazz
     *
     * @see DynamoDBMapper#marshallIntoObject(Class, Map)
     */
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes) {
        List<T> result = new ArrayList<T>();
        for (Map<String, AttributeValue> item : itemAttributes) {
            result.add(marshallIntoObject(clazz, item));
        }
        return result;
    }

    /**
     * Sets the value in the return object corresponding to the service result.
     */
    private <T> void setValue(final T toReturn, final Method getter, AttributeValue value) {

        Method setter = reflector.getSetter(getter);
        ArgumentUnmarshaller unmarhsaller = reflector.getArgumentUnmarshaller(toReturn, getter, setter);
        unmarhsaller.typeCheck(value, setter);

        Object argument;
        try {
            argument = unmarhsaller.unmarshall(value);
        } catch ( IllegalArgumentException e ) {
            throw new DynamoDBMappingException("Couldn't unmarshall value " + value + " for " + setter, e);
        } catch ( ParseException e ) {
            throw new DynamoDBMappingException("Error attempting to parse date string " + value + " for "+ setter, e);
        }

        safeInvoke(setter, toReturn, argument);
    }

    /**
     * Returns an {@link AttributeValue} corresponding to the getter and return
     * result given, treating it as a non-versioned attribute.
     */
    private AttributeValue getSimpleAttributeValue(final Method getter, final Object getterReturnResult) {
        if ( getterReturnResult == null )
            return null;

        ArgumentMarshaller marshaller = reflector.getArgumentMarshaller(getter);
        return marshaller.marshall(getterReturnResult);
    }

    /**
     * Saves the object given into DynamoDB, using the default configuration.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBMapperConfig)
     */
    public <T extends Object> void save(T object) {
        save(object, config);
    }

    /**
     * Saves an item in DynamoDB. The service method used is determined by the
     * {@link DynamoDBMapperConfig#getSaveBehavior()} value, to use either
     * {@link AmazonDynamoDB#putItem(PutItemRequest)} or
     * {@link AmazonDynamoDB#updateItem(UpdateItemRequest)}. For updates, a null
     * value for an object property will remove it from that item in DynamoDB.
     * For puts, a null value will not be passed to the service. The effect is
     * therefore the same, except when the item in DynamoDB contains attributes
     * that aren't modeled by the domain object given.
     *
     * @param object
     *            The object to save into DynamoDB
     * @param config
     *            The configuration to use, which overrides the default provided
     *            at object construction.
     */
    public <T extends Object> void save(T object, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        @SuppressWarnings("unchecked")
        Class<? extends T> clazz = (Class<? extends T>) object.getClass();
        String tableName = getTableName(clazz, config);

        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(safeInvoke(hashKeyGetter, object), hashKeyGetter);

        AttributeValue rangeKeyElement = null;
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        if ( rangeKeyGetter != null ) {
            rangeKeyElement = getRangeKeyElement(safeInvoke(rangeKeyGetter, object), rangeKeyGetter);
        }

        Key objectKey = new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement);

        Map<String, AttributeValueUpdate> updateValues = new HashMap<String, AttributeValueUpdate>();
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();

        boolean forcePut = config.getSaveBehavior() == SaveBehavior.CLOBBER;
        boolean nonKeyAttributePresent = false;
        List<ValueUpdate> inMemoryUpdates = new LinkedList<ValueUpdate>();

        /*
         * First look at the keys and construct updates for them independently
         */
        List<Method> keyGetterMethods = new LinkedList<Method>();
        keyGetterMethods.add(hashKeyGetter);
        if ( rangeKeyGetter != null ) {
            keyGetterMethods.add(rangeKeyGetter);
        }

        /*
         * Determine if there are any auto-assigned keys to assign. If so, force
         * a put and assign the keys
         */
        if ( !forcePut ) {
            for ( Method method : keyGetterMethods ) {
                Object getterResult = safeInvoke(method, object);
                if ( getterResult == null && reflector.isAssignableKey(method) ) {
                    forcePut = true;
                }
            }
        }

        /*
         * If we're doing a put, that means that we need update values for the
         * key attributes.
         */
        if ( forcePut ) {
            for ( Method method : keyGetterMethods ) {
                Object getterResult = safeInvoke(method, object);
                String attributeName = reflector.getAttributeName(method);

                if ( getterResult == null && reflector.isAssignableKey(method) ) {
                    AttributeValue newVersionValue = getAutoGeneratedKeyAttributeValue(method, getterResult);
                    updateValues.put(attributeName,
                            new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
                    inMemoryUpdates.add(new ValueUpdate(method, newVersionValue, object));

                    if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
                        // Add an expect clause to make sure that the item
                        // doesn't already exist, since it's supposed to be new
                        ExpectedAttributeValue expected = new ExpectedAttributeValue();
                        expected.setExists(false);
                        expectedValues.put(attributeName, expected);
                    }
                } else {
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    if ( currentValue != null ) {
                        updateValues.put(attributeName,
                                new AttributeValueUpdate().withValue(currentValue).withAction("PUT"));
                    } else {
                        throw new DynamoDBMappingException("Null value for non-generated key for method " + method);
                    }
                }
            }
        } else {
            /*
             * If we don't have the required keys by this point, it's an error
             */
            if ( hashKeyElement == null ) {
                throw new DynamoDBMappingException("No value provided for hash key for object " + object);
            }
            if ( rangeKeyGetter != null && rangeKeyElement == null ) {
                throw new DynamoDBMappingException("No value provided for range key for object " + object);
            }
        }

        // Look at every getter and construct an update object for it
        for ( Method method : reflector.getRelevantGetters(clazz) ) {

            // Skip any key methods, since they are handled separately
            if ( method.equals(hashKeyGetter) || method.equals(rangeKeyGetter) )
                continue;

            nonKeyAttributePresent = true;

            Object getterResult = safeInvoke(method, object);
            String attributeName = reflector.getAttributeName(method);

            /*
             * If this is a versioned field, update it
             */
            if ( reflector.isVersionAttributeGetter(method) ) {
                if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
                    // First establish the expected (current) value for the
                    // update call
                    ExpectedAttributeValue expected = new ExpectedAttributeValue();

                    // For new objects, insist that the value doesn't exist.
                    // For existing ones, insist it has the old value.
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    expected.setExists(currentValue != null);
                    if ( currentValue != null ) {
                        expected.setValue(currentValue);
                    }
                    expectedValues.put(attributeName, expected);
                }

                AttributeValue newVersionValue = getVersionAttributeValue(method, getterResult);
                updateValues
                        .put(attributeName, new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
                inMemoryUpdates.add(new ValueUpdate(method, newVersionValue, object));
            }

            /*
             * Otherwise apply the update value for this attribute.
             */
            else  {
                AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                if ( currentValue != null ) {
                    updateValues.put(attributeName, new AttributeValueUpdate().withValue(currentValue)
                            .withAction("PUT"));
                } else if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
                    updateValues.put(attributeName, new AttributeValueUpdate().withAction("DELETE"));
                }
            }
        }

        /*
         * Do a put or an update, according to the configuration. For a put (not
         * the default), we need to munge the data type.
         */
        if ( config.getSaveBehavior() == SaveBehavior.CLOBBER || forcePut ) {
            db.putItem(applyUserAgent(new PutItemRequest().withTableName(tableName)
                    .withItem(transformAttributes(clazz, convertToItem(updateValues)))
                    .withExpected(expectedValues)));
        } else if ( !nonKeyAttributePresent ) {
            keyOnlyPut(clazz, tableName, objectKey, hashKeyGetter, rangeKeyGetter);
        } else {
            db.updateItem(applyUserAgent(new UpdateItemRequest().withTableName(tableName).withKey(objectKey)
                                         .withAttributeUpdates(transformAttributeUpdates(clazz, objectKey, updateValues)).withExpected(expectedValues)));
        }

        /*
         * Finally, after the service call has succeeded, update the in-memory
         * object with new field values as appropriate.
         */
        for ( ValueUpdate update : inMemoryUpdates ) {
            update.apply();
        }
    }

    /**
     * Edge case to deal with the problem reported here:
     * https://forums.aws.amazon.com/thread.jspa?threadID=86798&tstart=25
     * <p>
     * DynamoDB cannot process an updateItem request that only contains the key
     * attribute(s), so we have to do a putItem. Somewhat confusingly, we also
     * insist that an item with the key(s) given doesn't already exist. This
     * isn't perfect, but we should be doing a putItem at all in this case, so
     * it's the best we can do.
     */
    private void keyOnlyPut(Class<?> clazz, String tableName, Key objectKey,
                            Method hashKeyGetter, Method rangeKeyGetter) {
        Map<String, AttributeValue> attributes = new HashMap<String, AttributeValue>();
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();

        String hashKeyAttributeName = reflector.getAttributeName(hashKeyGetter);
        attributes.put(hashKeyAttributeName, objectKey.getHashKeyElement());
        expectedValues.put(hashKeyAttributeName, new ExpectedAttributeValue().withExists(false));

        if (rangeKeyGetter != null) {
            String rangeKeyAttributeName = reflector.getAttributeName(rangeKeyGetter);
            attributes.put(rangeKeyAttributeName, objectKey.getRangeKeyElement());
            expectedValues.put(rangeKeyAttributeName, new ExpectedAttributeValue().withExists(false));
        }
        attributes = transformAttributes(clazz, attributes);
        db.putItem(applyUserAgent(new PutItemRequest().withTableName(tableName).withItem(attributes)
                .withExpected(expectedValues)));
    }

    /**
     * Deletes the given object from its DynamoDB table.
     */
    public void delete(Object object) {
        delete(object, this.config);
    }

    /**
     * Deletes the given object from its DynamoDB table.
     *
     * @param config
     *            Config override object. If {@link SaveBehavior#CLOBBER} is
     *            supplied, version fields will not be considered when deleting
     *            the object.
     */
    public void delete(Object object, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        Class<?> clazz = object.getClass();

        String tableName = getTableName(clazz, config);

        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(safeInvoke(hashKeyGetter, object), hashKeyGetter);

        AttributeValue rangeKeyElement = null;
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        if ( rangeKeyGetter != null ) {
            rangeKeyElement = getRangeKeyElement(safeInvoke(rangeKeyGetter, object), rangeKeyGetter);
        }

        Key objectKey = new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement);

        /*
         * If there is a version field, make sure we assert its value. If the
         * version field is null (only should happen in unusual circumstances),
         * pretend it doesn't have a version field after all.
         */
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();
        if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
            for ( Method method : reflector.getRelevantGetters(clazz) ) {

                if ( reflector.isVersionAttributeGetter(method) ) {
                    Object getterResult = safeInvoke(method, object);
                    String attributeName = reflector.getAttributeName(method);

                    ExpectedAttributeValue expected = new ExpectedAttributeValue();
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    expected.setExists(currentValue != null);
                    if ( currentValue != null )
                        expected.setValue(currentValue);
                    expectedValues.put(attributeName, expected);
                    break;
                }
            }
        }

        db.deleteItem(applyUserAgent(new DeleteItemRequest().withKey(objectKey).withTableName(tableName).withExpected(expectedValues)));
    }

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public void batchDelete(List<? extends Object> objectsToDelete) {
        batchWrite(Collections.emptyList(), objectsToDelete, this.config);
    }

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public void batchDelete(Object... objectsToDelete) {
        batchWrite(Collections.emptyList(), Arrays.asList(objectsToDelete), this.config);
    }

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public void batchSave(List<? extends Object> objectsToSave) {
        batchWrite(objectsToSave, Collections.emptyList(), this.config);
    }

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public void batchSave(Object... objectsToSave) {
        batchWrite(Arrays.asList(objectsToSave), Collections.emptyList(), this.config);
    }

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public void batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete) {
        batchWrite(objectsToWrite, objectsToDelete, this.config);
    }

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @param objectsToWrite
     *            A list of objects to save to DynamoDB. No version checks are
     *            performed, as required by the
     *            {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param objectsToDelete
     *            A list of objects to delete from DynamoDB. No version checks
     *            are performed, as required by the
     *            {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} is
     *            considered; if specified, all objects in the two parameter
     *            lists will be considered to belong to the given table
     *            override.
     */
    public void batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        HashMap<String, List<WriteRequest>> requestItems = new HashMap<String, List<WriteRequest>>();

        List<ValueUpdate> inMemoryUpdates = new LinkedList<ValueUpdate>();
        for ( Object toWrite : objectsToWrite ) {
            Class<?> clazz = toWrite.getClass();
            String tableName = getTableName(clazz, config);

            Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();

            // Look at every getter and construct a value object for it
            for ( Method method : reflector.getRelevantGetters(clazz) ) {
                Object getterResult = safeInvoke(method, toWrite);
                String attributeName = reflector.getAttributeName(method);

                AttributeValue currentValue = null;
                if ( getterResult == null && reflector.isAssignableKey(method) ) {
                    currentValue = getAutoGeneratedKeyAttributeValue(method, getterResult);
                    inMemoryUpdates.add(new ValueUpdate(method, currentValue, toWrite));
                } else {
                    currentValue = getSimpleAttributeValue(method, getterResult);
                }

                if ( currentValue != null ) {
                    attributeValues.put(attributeName, currentValue);
                }
            }

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            requestItems.get(tableName).add(
                    new WriteRequest().withPutRequest(new PutRequest().withItem(transformAttributes(clazz, attributeValues))));
        }

        for ( Object toDelete : objectsToDelete ) {
            Class<?> clazz = toDelete.getClass();

            String tableName = getTableName(clazz, config);

            Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
            AttributeValue hashKeyElement = getHashKeyElement(safeInvoke(hashKeyGetter, toDelete), hashKeyGetter);

            AttributeValue rangeKeyElement = null;
            Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
            if ( rangeKeyGetter != null ) {
                rangeKeyElement = getRangeKeyElement(safeInvoke(rangeKeyGetter, toDelete), rangeKeyGetter);
            }

            Key objectKey = new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            requestItems.get(tableName).add(
                    new WriteRequest().withDeleteRequest(new DeleteRequest().withKey(objectKey)));
        }

        // Break into chunks of 25 items and make service requests to DynamoDB
        while ( !requestItems.isEmpty() ) {
            HashMap<String, List<WriteRequest>> batch = new HashMap<String, List<WriteRequest>>();
            int i = 0;
            Iterator<Entry<String, List<WriteRequest>>> tableIter = requestItems.entrySet().iterator();
            while ( tableIter.hasNext() && i < 25 ) {
                Entry<String, List<WriteRequest>> tableRequest = tableIter.next();
                batch.put(tableRequest.getKey(), new LinkedList<WriteRequest>());
                Iterator<WriteRequest> writeRequestIter = tableRequest.getValue().iterator();
                while ( writeRequestIter.hasNext() && i++ < 25 ) {
                    WriteRequest writeRequest = writeRequestIter.next();
                    batch.get(tableRequest.getKey()).add(writeRequest);
                    writeRequestIter.remove();
                }

                // If we've processed all the write requests for this table,
                // remove it from the parent iterator.
                if ( !writeRequestIter.hasNext() ) {
                    tableIter.remove();
                }
            }

            BatchWriteItemResult result = db.batchWriteItem(new BatchWriteItemRequest().withRequestItems(batch));

            // add any unprocessed items back into the list to process
            for ( Entry<String, List<WriteRequest>> unprocessedItem : result.getUnprocessedItems().entrySet() ) {
                if ( !requestItems.containsKey(unprocessedItem.getKey()) ) {
                    requestItems.put(unprocessedItem.getKey(), new LinkedList<WriteRequest>());
                }
                requestItems.get(unprocessedItem.getKey()).addAll(unprocessedItem.getValue());
            }
        }

        // Once the entire batch is processed, update assigned keys in memory
        for ( ValueUpdate update : inMemoryUpdates ) {
            update.apply();
        }
    }

    /**
     * Retrieves the attributes for multiple items from multiple tables using
     * their primary keys.
     * {@link AmazonDynamoDB#batchGetItem(BatchGetItemRequest)} API.
     *
     * @see #batchLoad(Map, DynamoDBMapperConfig)
     */
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet) {
        return batchLoad(itemsToGet, this.config);
    }

    /**
     *
     * Retrieves the attributes for multiple items from multiple tables using
     * their primary keys.
     * {@link AmazonDynamoDB#batchGetItem(BatchGetItemRequest)} API.
     *
     * @param itemsToGet
     *            Container for the necessary parameters to execute the
     *            BatchGetItem service method on Amazon DynamoDB.
     *            {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} is
     *            considered; if specified, all objects in the two parameter
     *            lists will be considered to belong to the given table
     *            override.
     */
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        boolean consistentReads = (config.getConsistentReads() == ConsistentReads.CONSISTENT);

        if ( !validBatchGetRequest(itemsToGet) ) {
            return null;
        }

        Map<String, KeysAndAttributes> requestItems = new HashMap<String, KeysAndAttributes>();
        Map<String, Class<?>> classesByTableName = new HashMap<String, Class<?>>();
        Map<String, List<Object>> resultSet = new HashMap<String, List<Object>>();
        int count = 0;

        for ( Class<?> clazz : itemsToGet.keySet() ) {
            String tableName = getTableName(clazz, config);
            List<KeyPair> keyPairs = itemsToGet.get(clazz);
            if ( keyPairs == null ) {
                continue;
            }
            classesByTableName.put(tableName, clazz);

            Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
            for ( KeyPair keyPair : keyPairs ) {
                AttributeValue hashKeyElement = getHashKeyElement(keyPair.getHashKey(), hashKeyGetter);

                // Determine the range key, if provided
                AttributeValue rangeKeyElement = null;
                if ( keyPair.getRangeKey() != null ) {
                    Method rangeKeyMethod = reflector.getRangeKeyGetter(clazz);
                    if ( rangeKeyMethod == null ) {
                        throw new DynamoDBMappingException("Zero-parameter range key property must be annotated with "
                                + DynamoDBRangeKey.class);
                    }
                    rangeKeyElement = getRangeKeyElement(keyPair.getRangeKey(), rangeKeyMethod);
                }

                if ( !requestItems.containsKey(tableName) ) {
                    requestItems
                            .put(tableName,
                                    new KeysAndAttributes().withConsistentRead(consistentReads).withKeys(
                                            new LinkedList<Key>()));
                }

                requestItems.get(tableName).getKeys()
                        .add(new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement));

                // Reach the maximum number which can be handled in a single
                // batchGet
                if ( ++count == 100 ) {
                    processBatchGetRequest(classesByTableName, requestItems, resultSet);
                    requestItems.clear();
                    count = 0;
                }

            }
        }

        if ( count > 0 ) {
            processBatchGetRequest(classesByTableName, requestItems, resultSet);
        }

        return resultSet;
    }

    private void processBatchGetRequest(Map<String, Class<?>> tableNameToClassMapper,
            Map<String, KeysAndAttributes> requestItems, Map<String, List<Object>> resultSet) {
        BatchGetItemResult batchGetItemResult = null;
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(requestItems);
        do {
            if (batchGetItemResult != null) {
                batchGetItemRequest.setRequestItems(batchGetItemResult.getUnprocessedKeys());
            }

            batchGetItemResult = db.batchGetItem(batchGetItemRequest);
            Map<String, BatchResponse> responses = batchGetItemResult.getResponses();
            for (String tableName : responses.keySet()) {
                BatchResponse batchResponse = responses.get(tableName);
                List<Object> objects = null;
                if (resultSet.get(tableName) != null) {
                    objects = resultSet.get(tableName);
                } else {
                    objects = new LinkedList<Object>();
                }
                List<Map<String, AttributeValue>> items = batchResponse.getItems();
                for (Map<String, AttributeValue> item : items) {

                    objects.add(marshallIntoObject(tableNameToClassMapper.get(tableName), item));
                }
                resultSet.put(tableName, objects);

            }
            // To see whether there are unprocessed keys.
        } while (batchGetItemResult.getUnprocessedKeys() != null && batchGetItemResult.getUnprocessedKeys().size() > 0);

    }

    /**
     * Check whether the batchGetRequest meet all the constraints.
     *
     * @param itemsToGet
     */
    private boolean validBatchGetRequest(Map<Class<?>, List<KeyPair>> itemsToGet) {
        if (itemsToGet == null || itemsToGet.size() == 0) {
            return false;
        }

        for (Class<?> clazz : itemsToGet.keySet()) {
            if (itemsToGet.get(clazz) != null && itemsToGet.get(clazz).size() > 0) {
                return true;
            }
        }
        return false;
    }


    /**
     * Swallows the checked exceptions around Method.invoke and repackages them
     * as {@link DynamoDBMappingException}
     */
    private Object safeInvoke(Method method, Object object, Object... arguments) {
        try {
            return method.invoke(object, arguments);
        } catch ( IllegalAccessException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        } catch ( IllegalArgumentException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        } catch ( InvocationTargetException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        }
    }

    private final class ValueUpdate {

        private Method method;
        private AttributeValue newValue;
        private Object target;

        public ValueUpdate(Method method, AttributeValue newValue, Object target) {
            this.method = method;
            this.newValue = newValue;
            this.target = target;
        }

        public void apply() {
            setValue(target, method, newValue);
        }
    }

    /**
     * Converts the {@link AttributeValueUpdate} map given to an equivalent
     * {@link AttributeValue} map.
     */
    private Map<String, AttributeValue> convertToItem(Map<String, AttributeValueUpdate> putValues) {
        Map<String, AttributeValue> map = new HashMap<String, AttributeValue>();
        for ( Entry<String, AttributeValueUpdate> entry : putValues.entrySet() ) {
            /*
             * AttributeValueUpdate allows nulls for its values, since they are
             * semantically meaningful. AttributeValues never have null values.
             */
            if ( entry.getValue().getValue() != null )
                map.put(entry.getKey(), entry.getValue().getValue());
        }
        return map;
    }

    /**
     * Gets the attribute value object corresponding to the
     * {@link DynamoDBVersionAttribute} getter, and its result, given. Null
     * values are assumed to be new objects and given the smallest possible
     * positive value. Non-null values are incremented from their current value.
     */
    private AttributeValue getVersionAttributeValue(final Method getter, Object getterReturnResult) {
        ArgumentMarshaller marshaller = reflector.getVersionedArgumentMarshaller(getter, getterReturnResult);
        return marshaller.marshall(getterReturnResult);
    }

    /**
     * Returns an attribute value corresponding to the key method and value given.
     */
    private AttributeValue getAutoGeneratedKeyAttributeValue(Method getter, Object getterResult) {
        ArgumentMarshaller marshaller = reflector.getAutoGeneratedKeyArgumentMarshaller(getter);
        return marshaller.marshall(getterResult);
    }

    /**
     * Scans through an Amazon DynamoDB table and returns the matching results as
     * an unmodifiable list of instantiated objects, using the default configuration.
     *
     * @see DynamoDBMapper#scan(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scan(clazz, scanExpression, config);
    }

    /**
     * Scans through an Amazon DynamoDB table and returns the matching results as
     * an unmodifiable list of instantiated objects. The table to scan is
     * determined by looking at the annotations on the specified class, which
     * declares where to store the object data in Amazon DynamoDB, and the scan
     * expression parameter allows the caller to filter results and control how
     * the scan is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     * <p>
     * The unmodifiable list returned is lazily loaded when possible, so calls
     * to DynamoDB will be made only as needed.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply
     *            to limit results.
     * @param config
     *            The configuration to use for this scan, which overrides the
     *            default provided at object construction.
     * @return An unmodifiable list of the objects constructed from the results
     *         of the scan operation.
     * @see PaginatedScanList
     */
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        return new PaginatedScanList<T>(this, clazz, db, scanRequest, scanResult);
    }
    
    /**
     * Scans through an Amazon DynamoDB table and returns a single page of matching
     * results. The table to scan is determined by looking at the annotations on
     * the specified class, which declares where to store the object data in AWS
     * DynamoDB, and the scan expression parameter allows the caller to filter
     * results and control how the scan is executed.
     * 
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply
     *            to limit results.
     * @param config
     *            The configuration to use for this scan, which overrides the
     *            default provided at object construction.
     */
    public <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        ScanResultPage<T> result = new ScanResultPage<T>();
        result.setResults(marshallIntoObjects(clazz, scanResult.getItems()));
        result.setLastEvaluatedKey(scanResult.getLastEvaluatedKey());
        
        return result;
    }
    
    /**
     * Scans through an Amazon DynamoDB table and returns a single page of matching
     * results. 
     * 
     * @see DynamoDBMapper#scanPage(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    public <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scanPage(clazz, scanExpression, this.config);
    }

    /**
     * Queries an Amazon DynamoDB table and returns the matching results as an
     * unmodifiable list of instantiated objects, using the default
     * configuration.
     *
     * @see DynamoDBMapper#query(Class, DynamoDBQueryExpression,
     *      DynamoDBMapperConfig)
     */
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression queryExpression) {
        return query(clazz, queryExpression, config);
    }

    /**
     * Queries an Amazon DynamoDB table and returns the matching results as an
     * unmodifiable list of instantiated objects. The table to query is
     * determined by looking at the annotations on the specified class, which
     * declares where to store the object data in Amazon DynamoDB, and the query
     * expression parameter allows the caller to filter results and control how
     * the query is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     * <p>
     * The unmodifiable list returned is lazily loaded when possible, so calls
     * to DynamoDB will be made only as needed.
     * 
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in Amazon DynamoDB.
     * @param queryExpression
     *            Details on how to run the query, including any conditions on
     *            the key values
     * @param config
     *            The configuration to use for this query, which overrides the
     *            default provided at object construction.
     * @return An unmodifiable list of the objects constructed from the results
     *         of the query operation.
     * @see PaginatedQueryList
     */
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        return new PaginatedQueryList<T>(this, clazz, db, queryRequest, queryResult);
    }
    
    /**
     * Queries an Amazon DynamoDB table and returns a single page of matching
     * results. The table to query is determined by looking at the annotations
     * on the specified class, which declares where to store the object data in
     * Amazon DynamoDB, and the query expression parameter allows the caller to
     * filter results and control how the query is executed.
     * 
     * @see DynamoDBMapper#queryPage(Class, DynamoDBQueryExpression, DynamoDBMapperConfig)
     */
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression queryExpression) {
        return queryPage(clazz, queryExpression, this.config);
    }
    
    /**
     * Queries an Amazon DynamoDB table and returns a single page of matching
     * results. The table to query is determined by looking at the annotations
     * on the specified class, which declares where to store the object data in
     * Amazon DynamoDB, and the query expression parameter allows the caller to
     * filter results and control how the query is executed.
     * 
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in AWS DynamoDB.
     * @param queryExpression
     *            Details on how to run the query, including any conditions on
     *            the key values
     * @param config
     *            The configuration to use for this query, which overrides the
     *            default provided at object construction.
     */
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult scanResult = db.query(applyUserAgent(queryRequest));
        QueryResultPage<T> result = new QueryResultPage<T>();
        result.setResults(marshallIntoObjects(clazz, scanResult.getItems()));
        result.setLastEvaluatedKey(scanResult.getLastEvaluatedKey());
        
        return result;
    }

    /**
     * Evaluates the specified scan expression and returns the count of matching
     * items, without returning any of the actual item data, using the default configuration.
     *
     * @see DynamoDBMapper#count(Class, DynamoDBScanExpression, DynamoDBMapperConfig)
     */
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression) {
        return count(clazz, scanExpression, config);
    }

    /**
     * Evaluates the specified scan expression and returns the count of matching
     * items, without returning any of the actual item data.
     * <p>
     * This operation will scan your entire table, and can therefore be very
     * expensive. Use with caution.
     *
     * @param clazz
     *            The class mapped to a DynamoDB table.
     * @param scanExpression
     *            The parameters for running the scan.
     * @param config
     *            The configuration to use for this scan, which overrides the
     *            default provided at object construction.
     * @return The count of matching items, without returning any of the actual
     *         item data.
     */
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);
        scanRequest.setCount(true);

        // Count scans can also be truncated for large datasets
        int count = 0;
        ScanResult scanResult = null;
        do {
            scanResult = db.scan(applyUserAgent(scanRequest));
            count += scanResult.getCount();
            scanRequest.setExclusiveStartKey(scanResult.getLastEvaluatedKey());
        } while (scanResult.getLastEvaluatedKey() != null);

        return count;
    }


    /**
     * Evaluates the specified query expression and returns the count of matching
     * items, without returning any of the actual item data, using the default configuration.
     *
     * @see DynamoDBMapper#count(Class, DynamoDBQueryExpression, DynamoDBMapperConfig)
     */
    public int count(Class<?> clazz, DynamoDBQueryExpression queryExpression) {
        return count(clazz, queryExpression, config);
    }

    /**
     * Evaluates the specified query expression and returns the count of
     * matching items, without returning any of the actual item data.
     *
     * @param clazz
     *            The class mapped to a DynamoDB table.
     * @param queryExpression
     *            The parameters for running the scan.
     * @param config
     *            The mapper configuration to use for the query, which overrides
     *            the default provided at object construction.
     * @return The count of matching items, without returning any of the actual
     *         item data.
     */
    public int count(Class<?> clazz, DynamoDBQueryExpression queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);
        queryRequest.setCount(true);

        // Count queries can also be truncated for large datasets
        int count = 0;
        QueryResult queryResult = null;
        do {
            queryResult = db.query(applyUserAgent(queryRequest));
            count += queryResult.getCount();
            queryRequest.setExclusiveStartKey(queryResult.getLastEvaluatedKey());
        } while (queryResult.getLastEvaluatedKey() != null);

        return count;
    }

    /**
     * Merges the config object given with the one specified at construction and
     * returns the result.
     */
    private DynamoDBMapperConfig mergeConfig(DynamoDBMapperConfig config) {
        if ( config != this.config )
            config = new DynamoDBMapperConfig(this.config, config);
        return config;
    }

    private ScanRequest createScanRequestFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(getTableName(clazz, config));
        scanRequest.setScanFilter(scanExpression.getScanFilter());
        scanRequest.setLimit(scanExpression.getLimit());
        scanRequest.setExclusiveStartKey(scanExpression.getExclusiveStartKey());

        return scanRequest;
    }

    private QueryRequest createQueryRequestFromExpression(Class<?> clazz, DynamoDBQueryExpression queryExpression, DynamoDBMapperConfig config) {
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setConsistentRead(queryExpression.isConsistentRead());
        queryRequest.setTableName(getTableName(clazz, config));
        queryRequest.setHashKeyValue(queryExpression.getHashKeyValue());
        queryRequest.setScanIndexForward(queryExpression.isScanIndexForward());
        queryRequest.setRangeKeyCondition(queryExpression.getRangeKeyCondition());
        queryRequest.setLimit(queryExpression.getLimit());
        queryRequest.setExclusiveStartKey(queryExpression.getExclusiveStartKey());

        return queryRequest;
    }

    /**
     * By default, just calls {@link #untransformAttributes(String, String, Map)}.
     * @param clazz
     * @param attributeValues
     * @return the decrypted attribute values
     */
    protected Map<String, AttributeValue> untransformAttributes(Class<?> clazz, Map<String, AttributeValue> attributeValues) {
        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        String hashKeyName = reflector.getAttributeName(hashKeyGetter);
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        String rangeKeyName = rangeKeyGetter == null ? null : reflector.getAttributeName(rangeKeyGetter);
        return untransformAttributes(hashKeyName, rangeKeyName, attributeValues);
    }
    
    /**
     * Transforms the attribute values after loading from DynamoDb.
     * Only ever called by {@link #untransformAttributes(Class, Map)}.
     * By default, returns the attributes unchanged. Currently, the
     * values associated with the hash key and range key must be left unchanged.
     * 
     * @param hashKey the attribute name of the hash key
     * @param rangeKey the attribute name of the range key (or null if there is none)
     * @param attributeValues
     * @return the decrypted attributes
     */
    protected Map<String, AttributeValue> untransformAttributes(String hashKey, String rangeKey,
            Map<String, AttributeValue> attributeValues) {
        return attributeValues;
    }
    
    /**
     * By default, just calls {@link #transformAttributes(String, String, Map)}.
     * @param clazz
     * @param attributeValues
     * @return the decrypted attribute values
     */
    protected Map<String, AttributeValue> transformAttributes(Class<?> clazz, Map<String, AttributeValue> attributeValues) {
        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        String hashKeyName = reflector.getAttributeName(hashKeyGetter);
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        String rangeKeyName = rangeKeyGetter == null ? null : reflector.getAttributeName(rangeKeyGetter);
        return transformAttributes(hashKeyName, rangeKeyName, attributeValues);
    }
    
    /**
     * Transform attribute values prior to storing in DynamoDB.
     * Only ever called by {@link #transformAttributes(Class, Map)}.
     * By default, returns the attributes unchanged.
     * 
     * @param hashKey the attribute name of the hash key
     * @param rangeKey the attribute name of the range key (or null if there is none)
     * @param attributeValues
     * @return the encrypted attributes
     */
    protected Map<String, AttributeValue> transformAttributes(String hashKey, String rangeKey,
            Map<String, AttributeValue> attributeValues) {
        return attributeValues;
    }

    /**
     * A transformation expects to see all values, including keys, when
     * determining the transformation, therefore we must insert them if they are
     * not already present. However, we must remove the keys prior to actual
     * storage as this method is called when updating DynamoDB, which does
     * not permit the modification of key attributes as part of an update call.
     **/
    private Map<String, AttributeValueUpdate> transformAttributeUpdates(Class<?> clazz,
            Key objectKey, Map<String, AttributeValueUpdate> updateValues) {
        Map<String, AttributeValue> item = convertToItem(updateValues);

        boolean hashKeyAdded = false;
        boolean rangeKeyAdded = false;
        String hashKey = reflector.getAttributeName(reflector.getHashKeyGetter(clazz));
        if(!item.containsKey(hashKey)) {
            item.put(hashKey, objectKey.getHashKeyElement());
            hashKeyAdded = true;
        }
        String rangeKey = null;
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        if (rangeKeyGetter != null) {
            rangeKey = reflector.getAttributeName(rangeKeyGetter);
            if (!item.containsKey(rangeKey)) {
                item.put(rangeKey, objectKey.getRangeKeyElement());
                rangeKeyAdded = true;
            }
        }

        item = transformAttributes(clazz, item);

        // Remove the keys if we added them before.
        if (hashKeyAdded) {
            item.remove(hashKey);
        }
        if (rangeKeyAdded) {
            item.remove(rangeKey);
        }

        for(String key: item.keySet()) {
            if (updateValues.containsKey(key)) {
                updateValues.get(key).getValue()
                    .withB(item.get(key).getB())
                    .withBS(item.get(key).getBS())
                    .withN(item.get(key).getN())
                    .withNS(item.get(key).getNS())
                    .withS(item.get(key).getS())
                    .withSS(item.get(key).getSS());
            } else {
                updateValues.put(key, new AttributeValueUpdate(item.get(key), "PUT"));
            }
        }
        return updateValues;
    }

    static <X extends AmazonWebServiceRequest> X applyUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }
}
