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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteRequest;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.util.VersionInfoUtils;

/**
 * Object mapper for domain-object interaction with DynamoDB.
 * <p>
 * To use, annotate domain classes with the annotations found in the
 * com.amazonaws.services.dynamodbv2.datamodeling package. A minimal example:
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
public class DynamoDBMapper {
    
    private final S3ClientCache s3cc;
    private final AmazonDynamoDB db;
    private final DynamoDBMapperConfig config;
    private final DynamoDBReflector reflector = new DynamoDBReflector();

    private final AttributeTransformer transformer;
    
    /** The max back off time for batch write */
    private static final long MAX_BACKOFF_IN_MILLISECONDS = 1000 * 3;

    /**
     * User agent for requests made using the {@link DynamoDBMapper}.
     */
    private static final String USER_AGENT = DynamoDBMapper.class.getName() + "/" + VersionInfoUtils.getVersion();

    private static final String NO_RANGE_KEY = new String();
    
    /**
     * Constructs a new mapper with the service object given, using the default
     * configuration.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(final AmazonDynamoDB dynamoDB) {
        this(dynamoDB, DynamoDBMapperConfig.DEFAULT, null, null);
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
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config) {
        
        this(dynamoDB, config, null, null);
    }
    
    /**
     * Constructs a new mapper with the service object and S3 client cache
     * given, using the default configuration.
     *
     * @param ddb
     *            The service object to use for all service calls.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(
            final AmazonDynamoDB ddb,
            final AWSCredentialsProvider s3CredentialProvider) {
        
        this(ddb, DynamoDBMapperConfig.DEFAULT, s3CredentialProvider);
    }
    
    /**
     * Constructs a new mapper with the given service object, configuration,
     * and transform hook.
     *
     * @param dynamoDB
     *            the service object to use for all service calls
     * @param config
     *            the default configuration to use for all service calls. It
     *            can be overridden on a per-operation basis
     * @param transformer
     *            The custom attribute transformer to invoke when serializing or
     *            deserializing an object.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AttributeTransformer transformer) {
        
        this(dynamoDB, config, transformer, null);
    }

    /**
     * Constructs a new mapper with the service object, configuration, and S3
     * client cache given.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AWSCredentialsProvider s3CredentialProvider) {
        
        this(dynamoDB, config, null, validate(s3CredentialProvider));
    }
    
    /**
     * Throws an exception if the given credentials provider is {@code null}.
     */
    private static AWSCredentialsProvider validate(
            final AWSCredentialsProvider provider) {
        if (provider == null) {
            throw new IllegalArgumentException(
                    "s3 credentials provider must not be null");
        }
        return provider;
    }
    
    /**
     * Constructor with all parameters.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     * @param transformer
     *            The custom attribute transformer to invoke when serializing or
     *            deserializing an object.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AttributeTransformer transformer,
            final AWSCredentialsProvider s3CredentialsProvider) {
        
        this.db = dynamoDB;
        this.config = config;
        this.transformer = transformer;
        
        if (s3CredentialsProvider == null) {
            this.s3cc = null;
        } else {
            this.s3cc = new S3ClientCache(s3CredentialsProvider.getCredentials());
        }
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
     * Returns an object whose keys match those of the prototype key object given,
     * or null if no such item exists.
     *
     * @param keyObject
     *            An object of the class to load with the keys values to match.
     *
     * @see DynamoDBMapper#load(Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(T keyObject) {
        return load(keyObject, this.config);
    }

    /**
     * Returns an object whose keys match those of the prototype key object given,
     * or null if no such item exists.
     *
     * @param keyObject
     *            An object of the class to load with the keys values to match.
     * @param config
     *            Configuration for the service call to retrieve the object from
     *            DynamoDB. This configuration overrides the default given at
     *            construction.
     */
    public <T extends Object> T load(T keyObject, DynamoDBMapperConfig config) {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) keyObject.getClass();

        config = mergeConfig(config);

        String tableName = getTableName(clazz, config);

        GetItemRequest rq = new GetItemRequest();

        Map<String, AttributeValue> key = getKey(keyObject, clazz);

        rq.setKey(key);
        rq.setTableName(tableName);
        rq.setConsistentRead(config.getConsistentReads() == ConsistentReads.CONSISTENT);


        GetItemResult item = db.getItem(applyUserAgent(rq));
        Map<String, AttributeValue> itemAttributes = item.getItem();
        if ( itemAttributes == null ) {
            return null;
        }

        T object = marshalIntoObject(toParameters(itemAttributes, clazz, config));
        return object;
    }


    /**
     * Returns a key map for the key object given.
     *
     * @param keyObject
     *            The key object, corresponding to an item in a dynamo table.
     */
    @SuppressWarnings("unchecked")
    private <T> Map<String, AttributeValue> getKey(T keyObject) {
        return getKey(keyObject, (Class<T>)keyObject.getClass());
    }

    private <T> Map<String, AttributeValue> getKey(T keyObject, Class<T> clazz) {
        Map<String, AttributeValue> key = new HashMap<String, AttributeValue>();
        for (Method keyGetter : reflector.getKeyGetters(clazz)) {
            Object getterResult = safeInvoke(keyGetter, keyObject);
            AttributeValue keyAttributeValue = getSimpleAttributeValue(keyGetter, getterResult);
            if (keyAttributeValue == null) {
                throw new DynamoDBMappingException("Null key found for " + keyGetter);
            }
            key.put(reflector.getAttributeName(keyGetter), keyAttributeValue);
        }

        if ( key.isEmpty() ) {
            throw new DynamoDBMappingException("Class must be annotated with " + DynamoDBHashKey.class + " and "
                    + DynamoDBRangeKey.class);
        }
        return key;
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
        T keyObject = createKeyObject(clazz, hashKey, rangeKey);
        return load(keyObject, config);
    }

    /**
     * Creates a key prototype object for the class given with the single hash and range key given.
     */
    private <T> T createKeyObject(Class<T> clazz, Object hashKey, Object rangeKey) {
        T keyObject = null;
        try {
            keyObject = clazz.newInstance();
        } catch ( Exception e ) {
            throw new DynamoDBMappingException("Failed to instantiate class", e);
        }
        boolean seenHashKey = false;
        boolean seenRangeKey = false;
        for ( Method getter : reflector.getKeyGetters(clazz) ) {
            if ( getter.isAnnotationPresent(DynamoDBHashKey.class) ) {
                if ( seenHashKey ) {
                    throw new DynamoDBMappingException("Found more than one method annotated with "
                            + DynamoDBHashKey.class + " for class " + clazz
                            + ". Use load(Object) for tables with more than a single hash and range key.");
                }
                seenHashKey = true;
                safeInvoke(reflector.getSetter(getter), keyObject, hashKey);
            } else if ( getter.isAnnotationPresent(DynamoDBRangeKey.class) ) {
                if ( seenRangeKey ) {
                    throw new DynamoDBMappingException("Found more than one method annotated with "
                            + DynamoDBRangeKey.class + " for class " + clazz
                            + ". Use load(Object) for tables with more than a single hash and range key.");
                }
                seenRangeKey = true;
                safeInvoke(reflector.getSetter(getter), keyObject, rangeKey);
            }
        }
        if ( !seenHashKey ) {
            throw new DynamoDBMappingException("No method annotated with " + DynamoDBHashKey.class + " for class "
                    + clazz + ".");
        } else if ( rangeKey != null && !seenRangeKey ) {
            throw new DynamoDBMappingException("No method annotated with " + DynamoDBRangeKey.class + " for class "
                    + clazz + ".");
        }
        return keyObject;
    }

    /**
     * Returns a map of attribute name to EQ condition for the key prototype
     * object given.
     */
    private Map<String, Condition> getHashKeyEqualsConditions(Object obj) {
        Map<String, Condition> conditions = new HashMap<String, Condition>();
        for ( Method getter : reflector.getKeyGetters(obj.getClass()) ) {
            if ( getter.isAnnotationPresent(DynamoDBHashKey.class) ) {
                conditions.put(
                        reflector.getAttributeName(getter),
                        new Condition().withComparisonOperator(ComparisonOperator.EQ).withAttributeValueList(
                                getSimpleAttributeValue(getter, safeInvoke(getter, obj, (Object[])null))));
            }
        }
        return conditions;
    }

    /**
     * Returns the table name for the class given.
     */
    protected final String getTableName(final Class<?> clazz,
                                        final DynamoDBMapperConfig config) {

        return getTableName(clazz, config, reflector);
    }

    private static String getTableName(final Class<?> clazz,
                                       final DynamoDBMapperConfig config,
                                       final DynamoDBReflector reflector) {

        DynamoDBTable table = reflector.getTable(clazz);
        String tableName = table.tableName();
        if ( config.getTableNameOverride() != null ) {
            if ( config.getTableNameOverride().getTableName() != null ) {
                tableName = config.getTableNameOverride().getTableName();
            } else {
                tableName = config.getTableNameOverride().getTableNamePrefix()
                            + tableName;
            }
        }

        return tableName;        
    }

    /**
     * A replacement for {@link #marshallIntoObject(Class, Map)} that takes
     * extra parameters to tunnel through to {@code privateMarshalIntoObject}.
     * <p>
     * Once {@code marshallIntoObject} is removed, this method will directly
     * call {@code privateMarshalIntoObject}.
     */
    private <T> T marshalIntoObject(
            final AttributeTransformer.Parameters<T> parameters
    ) {
        return marshallIntoObject(
            parameters.getModelClass(),
            MapAnd.wrap(parameters.getAttributeValues(), parameters));
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
     * @deprecated in favor of {@link #marshalIntoObject(AttributeTransformer.Parameters)}
     */
    @Deprecated
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {
        if (itemAttributes instanceof MapAnd) {
            
            @SuppressWarnings("unchecked")
            AttributeTransformer.Parameters<T> parameters =
                ((MapAnd<?, ?, AttributeTransformer.Parameters<T>>) itemAttributes)
                    .getExtra();

            return privateMarshalIntoObject(parameters);
            
        } else {
            // Called via some unexpected external codepath; use the class-level
            // config.
            return privateMarshalIntoObject(
                toParameters(itemAttributes, clazz, this.config));
        }
    }
    
    /**
     * The one true implementation of marshalIntoObject.
     */
    private <T> T privateMarshalIntoObject(
            final AttributeTransformer.Parameters<T> parameters) {

        T toReturn = null;
        try {
            toReturn = parameters.getModelClass().newInstance();
        } catch ( InstantiationException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        } catch ( IllegalAccessException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        }

        if ( parameters.getAttributeValues() == null
          || parameters.getAttributeValues().isEmpty() ) {
            
            return toReturn;
        }

        Map<String, AttributeValue> result = untransformAttributes(parameters);

        for ( Method m : reflector.getRelevantGetters(parameters.getModelClass()) ) {
            String attributeName = reflector.getAttributeName(m);
            if ( result.containsKey(attributeName) ) {
                setValue(toReturn, m, result.get(attributeName));
            }
        }

        return toReturn;
    }

    /**
     * Unmarshalls the list of item attributes into objects of type clazz.
     *
     * @see DynamoDBMapper#marshallIntoObject(Class, Map)
     * @deprecated in favor of {@link #marshalIntoObjects(List)}
     */
    @Deprecated
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes) {
        List<T> result = new ArrayList<T>(itemAttributes.size());
        for (Map<String, AttributeValue> item : itemAttributes) {
            result.add(marshallIntoObject(clazz, item));
        }
        return result;
    }
    
    /**
     * A replacement for {@link #marshallIntoObjects(Class, List)} that takes
     * an extra set of parameters to be tunneled through to
     * {@code privateMarshalIntoObject} (if nothing along the way is
     * overridden). It's package-private because some of the Paginated*List
     * classes call back into it, but final because no one, even in this
     * package, should ever override it.
     * <p>
     * In the future, when the deprecated {@code marshallIntoObjects} is
     * removed, this method will be changed to directly call
     * {@code privateMarshalIntoObject}.
     */
    final <T> List<T> marshalIntoObjects(
            final List<AttributeTransformer.Parameters<T>> parameters
    ) {
        if (parameters.isEmpty()) {
            return Collections.emptyList();
        }

        Class<T> clazz = parameters.get(0).getModelClass();

        List<Map<String, AttributeValue>> list =
            new ArrayList<Map<String, AttributeValue>>(parameters.size());
        for (AttributeTransformer.Parameters<T> entry : parameters) {
            list.add(MapAnd.wrap(entry.getAttributeValues(), entry));
        }

        return marshallIntoObjects(clazz, list);
    }
    
    /**
     * Sets the value in the return object corresponding to the service result.
     */
    private <T> void setValue(final T toReturn, final Method getter, AttributeValue value) {

        Method setter = reflector.getSetter(getter);
        ArgumentUnmarshaller unmarhsaller = reflector.getArgumentUnmarshaller(toReturn, getter, setter, s3cc);
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
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    public <T extends Object> void save(T object) {
        save(object, null, config);
    }

    /**
     * Saves the object given into DynamoDB, using the default configuration and the specified saveExpression.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    public <T extends Object> void save(T object, DynamoDBSaveExpression saveExpression) {
        save(object, saveExpression, config);
    }

    private boolean needAutoGenerateAssignableKey(Class<?> clazz, Object object) {
        Collection<Method> keyGetters = reflector.getKeyGetters(clazz);
        boolean forcePut = false;
        /*
         * Determine if there are any auto-assigned keys to assign. If so, force
         * a put and assign the keys.
         */
        boolean hashKeyGetterFound = false;
        for ( Method method : keyGetters ) {
            Object getterResult = safeInvoke(method, object);
            if ( getterResult == null && reflector.isAssignableKey(method) ) {
                forcePut = true;
            }
            if ( method.isAnnotationPresent(DynamoDBHashKey.class) ) {
                hashKeyGetterFound = true;
            }
        }
        if ( !hashKeyGetterFound ) {
            throw new DynamoDBMappingException("No " + DynamoDBHashKey.class + " annotation found in class " + clazz);
        }
        return forcePut;
    }

    /**
     * Saves the object given into DynamoDB, using the specified configuration.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBSaveExpression, DynamoDBMapperConfig)
     */
    public <T extends Object> void save(T object, DynamoDBMapperConfig config) {
        save(object, null, config);
    }

    /**
     * Saves an item in DynamoDB. The service method used is determined by the
     * {@link DynamoDBMapperConfig#getSaveBehavior()} value, to use either
     * {@link AmazonDynamoDB#putItem(PutItemRequest)} or
     * {@link AmazonDynamoDB#updateItem(UpdateItemRequest)}:
     * <ul>
     * <li><b>UPDATE</b> (default) : UPDATE will not affect unmodeled attributes
     * on a save operation and a null value for the modeled attribute will
     * remove it from that item in DynamoDB. Because of the limitation of
     * updateItem request, the implementation of UPDATE will send a putItem
     * request when a key-only object is being saved, and it will send another
     * updateItem request if the given key(s) already exists in the table.</li>
     * <li><b>UPDATE_SKIP_NULL_ATTRIBUTES</b> : Similar to UPDATE except that it
     * ignores any null value attribute(s) and will NOT remove them from that
     * item in DynamoDB. It also guarantees to send only one single updateItem
     * request, no matter the object is key-only or not.</li>
     * <li><b>CLOBBER</b> : CLOBBER will clear and replace all attributes,
     * included unmodeled ones, (delete and recreate) on save. Versioned field
     * constraints will also be disregarded.</li>
     * </ul>
     *
     *
     * Any options specified in the saveExpression parameter will be overlaid on
     * any constraints due to versioned attributes.
     *
     * @param object
     *            The object to save into DynamoDB
     * @param saveExpression
     *            The options to apply to this save request
     * @param config
     *            The configuration to use, which overrides the default provided
     *            at object construction.
     *
     * @see DynamoDBMapperConfig.SaveBehavior
     */
    public <T extends Object> void save(T object, DynamoDBSaveExpression saveExpression, DynamoDBMapperConfig config) {
        final DynamoDBMapperConfig finalConfig = mergeConfig(config);

        @SuppressWarnings("unchecked")
        Class<? extends T> clazz = (Class<? extends T>) object.getClass();
        String tableName = getTableName(clazz, finalConfig);

        final Map<String, ExpectedAttributeValue> userProvidedExpectedValues = (saveExpression == null) ? null : saveExpression.getExpected();

        /*
         * We force a putItem request instead of updateItem request either when
         * CLOBBER is configured, or part of the primary key of the object needs
         * to be auto-generated.
         */
        boolean forcePut = (finalConfig.getSaveBehavior() == SaveBehavior.CLOBBER)
                || needAutoGenerateAssignableKey(clazz, object);

        SaveObjectHandler saveObjectHandler;

        if (forcePut) {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig.getSaveBehavior(), userProvidedExpectedValues) {

                @Override
                protected void onKeyAttributeValue(String attributeName,
                        AttributeValue keyAttributeValue) {
                    /* Treat key values as common attribute value updates. */
                    getAttributeValueUpdates().put(attributeName,
                            new AttributeValueUpdate().withValue(keyAttributeValue)
                                    .withAction("PUT"));
                }

                /* Use default implementation of onNonKeyAttribute(...) */

                @Override
                protected void onNullNonKeyAttribute(String attributeName) {
                    /* When doing a force put, we can safely ignore the null-valued attributes. */
                    return;
                }

                @Override
                protected void executeLowLevelRequest(boolean onlyKeyAttributeSpecified) {
                    /* Send a putItem request */
                    Map<String, AttributeValue> attributeValues =
                            convertToItem(getAttributeValueUpdates());
                    
                    attributeValues = transformAttributes(
                        toParameters(attributeValues, this.clazz, finalConfig));
                    
                    db.putItem(applyUserAgent(new PutItemRequest().withTableName(getTableName())
                            .withItem(attributeValues)
                            .withExpected(getExpectedAttributeValues())));
                }
            };
        } else {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig.getSaveBehavior(), userProvidedExpectedValues) {

                @Override
                protected void onKeyAttributeValue(String attributeName,
                        AttributeValue keyAttributeValue) {
                    /* Put it in the key collection which is later used in the updateItem request. */
                    getKeyAttributeValues().put(attributeName, keyAttributeValue);
                }


                @Override
                protected void onNonKeyAttribute(String attributeName,
                        AttributeValue currentValue) {
                    /* If it's a set attribute and the mapper is configured with APPEND_SET,
                     * we do an "ADD" update instead of the default "PUT".
                     */
                    if (getLocalSaveBehavior() == SaveBehavior.APPEND_SET) {
                        if (currentValue.getBS() != null
                                || currentValue.getNS() != null
                                || currentValue.getSS() != null) {
                            getAttributeValueUpdates().put(
                                    attributeName,
                                    new AttributeValueUpdate().withValue(
                                            currentValue).withAction("ADD"));
                            return;
                        }
                    }
                    /* Otherwise, we do the default "PUT" update. */
                    super.onNonKeyAttribute(attributeName, currentValue);
                }

                @Override
                protected void onNullNonKeyAttribute(String attributeName) {
                    /*
                     * If UPDATE_SKIP_NULL_ATTRIBUTES or APPEND_SET is
                     * configured, we don't delete null value attributes.
                     */
                    if (getLocalSaveBehavior() == SaveBehavior.UPDATE_SKIP_NULL_ATTRIBUTES
                            || getLocalSaveBehavior() == SaveBehavior.APPEND_SET) {
                        return;
                    }

                    else {
                        /* Delete attributes that are set as null in the object. */
                        getAttributeValueUpdates()
                                .put(attributeName,
                                        new AttributeValueUpdate()
                                                .withAction("DELETE"));
                    }
                }

                @Override
                protected void executeLowLevelRequest(boolean onlyKeyAttributeSpecified) {
                    /*
                     * Do a putItem when a key-only object is being saved with
                     * UPDATE configuration.
                     * Here we only need to consider UPDATE configuration, since
                     * only UPDATE could cause the problematic situation of
                     * updating an existing primary key with "DELETE" action on
                     * non-key attributes. See the javadoc of keyOnlyPut(...)
                     * for more detail.
                     */
                    boolean doUpdateItem = true;
                    if (onlyKeyAttributeSpecified && getLocalSaveBehavior() == SaveBehavior.UPDATE) {
                        doUpdateItem = false;
                        try {
                            keyOnlyPut(this.clazz, this.object, getTableName(),
                                    reflector.getHashKeyGetter(this.clazz),
                                    reflector.getRangeKeyGetter(this.clazz),
                                    userProvidedExpectedValues,
                                    finalConfig);
                        } catch (AmazonServiceException ase) {
                            if (ase.getErrorCode().equals(
                                    "ConditionalCheckFailedException")) {
                                /*
                                 * If another item with the given keys is found
                                 * in the table, we follow up an updateItem
                                 * request.
                                 */
                                doUpdateItem = true;
                            } else {
                                throw ase;
                            }
                        }
                    }
                    if ( doUpdateItem ) {
                        /* Send an updateItem request. */
                        db.updateItem(applyUserAgent(new UpdateItemRequest()
                                .withTableName(getTableName())
                                .withKey(getKeyAttributeValues())
                                .withAttributeUpdates(
                                        transformAttributeUpdates(
                                                this.clazz,
                                                getKeyAttributeValues(),
                                                getAttributeValueUpdates(),
                                                finalConfig))
                                .withExpected(getExpectedAttributeValues())));
                    }
                }
            };
        }

        saveObjectHandler.execute();
    }

    /**
     * The handler for saving object using DynamoDBMapper. Caller should
     * implement the abstract methods to provide the expected behavior on each
     * scenario, and this handler will take care of all the other basic workflow
     * and common operations.
     */
    protected abstract class SaveObjectHandler {

        protected final Object object;
        protected final Class<?> clazz;
        private String tableName;
        private SaveBehavior saveBehavior;

        private Map<String, AttributeValue> key;
        private Map<String, AttributeValueUpdate> updateValues;
        private Map<String, ExpectedAttributeValue> expectedValues;
        private List<ValueUpdate> inMemoryUpdates;

        private boolean nonKeyAttributePresent;

        /**
         * Constructs a handler for saving the specified model object.
         *
         * @param object            The model object to be saved.
         * @param clazz             The domain class of the object.
         * @param tableName         The table name.
         * @param userProvidedExpectedValues Any expected values that should be applied to the save
         */
        public SaveObjectHandler(Class<?> clazz, Object object, String tableName, SaveBehavior saveBehavior, Map<String, ExpectedAttributeValue> userProvidedExpectedValues) {
            this.clazz = clazz;
            this.object = object;
            this.tableName = tableName;
            this.saveBehavior = saveBehavior;

            updateValues = new HashMap<String, AttributeValueUpdate>();
            expectedValues = new HashMap<String, ExpectedAttributeValue>();

            if(userProvidedExpectedValues != null){
                expectedValues.putAll(userProvidedExpectedValues);
            }

            inMemoryUpdates = new LinkedList<ValueUpdate>();
            key = new HashMap<String, AttributeValue>();

            nonKeyAttributePresent = false;
        }

        /**
         * The general workflow of a save operation.
         */
        public void execute() {
            Collection<Method> keyGetters = reflector.getKeyGetters(clazz);

            /*
             * First handle keys
             */
            for ( Method method : keyGetters ) {
                Object getterResult = safeInvoke(method, object);
                String attributeName = reflector.getAttributeName(method);

                if ( getterResult == null && reflector.isAssignableKey(method) ) {
                    onAutoGenerateAssignableKey(method, attributeName);
                }

                else {
                    AttributeValue newAttributeValue = getSimpleAttributeValue(method, getterResult);
                    if ( newAttributeValue == null ) {
                        throw new DynamoDBMappingException("Null or empty value for key: " + method);
                    }

                    onKeyAttributeValue(attributeName, newAttributeValue);
                }
            }

            /*
             * Next construct an update for every non-key property
             */
            for ( Method method : reflector.getRelevantGetters(clazz) ) {

                // Skip any key methods, since they are handled separately
                if ( keyGetters.contains(method) )
                    continue;

                Object getterResult = safeInvoke(method, object);
                String attributeName = reflector.getAttributeName(method);

                /*
                 * If this is a versioned field, update it
                 */
                if ( reflector.isVersionAttributeGetter(method) ) {
                    onVersionAttribute(method, getterResult, attributeName);
                    nonKeyAttributePresent = true;
                }

                /*
                 * Otherwise apply the update value for this attribute.
                 */
                else  {
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    if ( currentValue != null ) {
                        onNonKeyAttribute(attributeName, currentValue);
                        nonKeyAttributePresent = true;
                    } else {
                        onNullNonKeyAttribute(attributeName);
                    }
                }
            }

            /*
             * Execute the implementation of the low level request.
             */
            executeLowLevelRequest(! nonKeyAttributePresent);

            /*
             * Finally, after the service call has succeeded, update the
             * in-memory object with new field values as appropriate. This
             * currently takes into account of auto-generated keys and versioned
             * attributes.
             */
            for ( ValueUpdate update : inMemoryUpdates ) {
                update.apply();
            }
        }

        /**
         * Implement this method to do the necessary operations when a key
         * attribute is set with some value.
         *
         * @param attributeName
         *            The name of the key attribute.
         * @param keyAttributeValue
         *            The AttributeValue of the key attribute as specified in
         *            the object.
         */
        protected abstract void onKeyAttributeValue(String attributeName, AttributeValue keyAttributeValue);

        /**
         * Implement this method for necessary operations when a non-key
         * attribute is set a non-null value in the object.
         * The default implementation simply adds a "PUT" update for the given attribute.
         *
         * @param attributeName
         *            The name of the non-key attribute.
         * @param currentValue
         *            The updated value of the given attribute.
         */
        protected void onNonKeyAttribute(String attributeName, AttributeValue currentValue) {
            updateValues.put(attributeName, new AttributeValueUpdate()
                    .withValue(currentValue).withAction("PUT"));
        }

        /**
         * Implement this method for necessary operations when a non-key
         * attribute is set null in the object.
         *
         * @param attributeName
         *            The name of the non-key attribute.
         */
        protected abstract void onNullNonKeyAttribute(String attributeName);

        /**
         * Implement this method to send the low-level request that is necessary
         * to complete the save operation.
         *
         * @param onlyKeyAttributeSpecified
         *            Whether the object to be saved is only specified with key
         *            attributes.
         */
        protected abstract void executeLowLevelRequest(boolean onlyKeyAttributeSpecified);

        /** Get the SaveBehavior used locally for this save operation. **/
        protected SaveBehavior getLocalSaveBehavior() {
            return saveBehavior;
        }

        /** Get the table name **/
        protected String getTableName() {
            return tableName;
        }

        /** Get the map of all the specified key of the saved object. **/
        protected Map<String, AttributeValue> getKeyAttributeValues() {
            return key;
        }

        /** Get the map of AttributeValueUpdate on each modeled attribute. **/
        protected Map<String, AttributeValueUpdate> getAttributeValueUpdates() {
            return updateValues;
        }

        /** Get the map of ExpectedAttributeValue on each modeled attribute. **/
        protected Map<String, ExpectedAttributeValue> getExpectedAttributeValues() {
            return expectedValues;
        }

        /** Get the list of all the necessary in-memory update on the object. **/
        protected List<ValueUpdate> getInMemoryUpdates() {
            return inMemoryUpdates;
        }

        private void onAutoGenerateAssignableKey(Method method, String attributeName) {
            AttributeValue newVersionValue = getAutoGeneratedKeyAttributeValue(method, null);

            updateValues.put(attributeName,
                    new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
            inMemoryUpdates.add(new ValueUpdate(method, newVersionValue, object));

            if ( getLocalSaveBehavior() != SaveBehavior.CLOBBER && !expectedValues.containsKey(attributeName)) {
                // Add an expect clause to make sure that the item
                // doesn't already exist, since it's supposed to be new
                ExpectedAttributeValue expected = new ExpectedAttributeValue();
                expected.setExists(false);
                expectedValues.put(attributeName, expected);
            }
        }

        private void onVersionAttribute(Method method, Object getterResult,
                String attributeName) {
            if ( getLocalSaveBehavior() != SaveBehavior.CLOBBER && !expectedValues.containsKey(attributeName)) {
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
    }

    /**
     * Edge case to deal with the problem reported here:
     * https://forums.aws.amazon.com/thread.jspa?threadID=86798&tstart=25
     * <p>
     * DynamoDB fails silently on updateItem request that
     * <ul>
     * <li>is specified with a primary key that does not exist in the table</li>
     * <li>and contains only non-"PUT" AttributeValueUpdate on any non-key
     * attribute.</li>
     * </ul>
     * <p>
     * So we have to do a putItem when a key-only object is being saved with
     * UPDATE configuration. In order to make sure this putItem request won't
     * replace any existing item in the table, we also insist that an item with
     * the key(s) given doesn't already exist. This isn't perfect, but we shouldn't
     * be doing a putItem at all in this case, so it's the best we can do.
     */
    private void keyOnlyPut(
            Class<?> clazz,
            Object object,
            String tableName,
            Method hashKeyGetter,
            Method rangeKeyGetter,
            Map<String, ExpectedAttributeValue> userProvidedExpectedValues,
            DynamoDBMapperConfig config) {
        
        Map<String, AttributeValue> attributes = new HashMap<String, AttributeValue>();
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();

        String hashKeyAttributeName = reflector.getAttributeName(hashKeyGetter);
        Object hashGetterResult = safeInvoke(hashKeyGetter, object);
        attributes.put(hashKeyAttributeName, getSimpleAttributeValue(hashKeyGetter, hashGetterResult));
        expectedValues.put(hashKeyAttributeName, new ExpectedAttributeValue().withExists(false));

        if (rangeKeyGetter != null) {
            String rangeKeyAttributeName = reflector.getAttributeName(rangeKeyGetter);
            Object rangeGetterResult = safeInvoke(rangeKeyGetter, object);
            attributes.put(rangeKeyAttributeName, getSimpleAttributeValue(rangeKeyGetter, rangeGetterResult));
            expectedValues.put(rangeKeyAttributeName, new ExpectedAttributeValue().withExists(false));
        }
        
        attributes = transformAttributes(
            toParameters(attributes, clazz, config));

        //overlay any user provided expected values.
        if(userProvidedExpectedValues != null){
            expectedValues.putAll(userProvidedExpectedValues);
        }

        db.putItem(applyUserAgent(new PutItemRequest().withTableName(tableName).withItem(attributes)
                .withExpected(expectedValues)));
    }

    /**
     * Deletes the given object from its DynamoDB table using the default configuration.
     */
    public void delete(Object object) {
        delete(object, null, this.config);
    }

    /**
     * Deletes the given object from its DynamoDB table using the specified deleteExpression and default configuration.
     */
    public void delete(Object object, DynamoDBDeleteExpression deleteExpression) {
        delete(object, deleteExpression, this.config);
    }

    /**
     * Deletes the given object from its DynamoDB table using the specified configuration.
     */
    public void delete(Object object, DynamoDBMapperConfig config) {
        delete(object, null, config);
    }

    /**
     * Deletes the given object from its DynamoDB table using the provided deleteExpression and provided configuration.
     * Any options specified in the deleteExpression parameter will be overlaid on any constraints due to
     * versioned attributes.
     * @param deleteExpression
     *            The options to apply to this delete request
     * @param config
     *            Config override object. If {@link SaveBehavior#CLOBBER} is
     *            supplied, version fields will not be considered when deleting
     *            the object.
     */
    public <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) object.getClass();

        String tableName = getTableName(clazz, config);

        Map<String, AttributeValue> key = getKey(object, clazz);

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

        //Overlay any user provided expected values onto the generated ones
        if(deleteExpression != null && deleteExpression.getExpected() != null){
            expectedValues.putAll(deleteExpression.getExpected());
        }

        db.deleteItem(applyUserAgent(new DeleteItemRequest().withKey(key).withTableName(tableName).withExpected(expectedValues)));
    }

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No
     * version checks are performed</b>, as required by the API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public List<FailedBatch> batchDelete(List<? extends Object> objectsToDelete) {
        return batchWrite(Collections.emptyList(), objectsToDelete, this.config);
    }

    /**
     * Deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No
     * version checks are performed</b>, as required by the API.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public List<FailedBatch> batchDelete(Object... objectsToDelete) {
        return batchWrite(Collections.emptyList(), Arrays.asList(objectsToDelete), this.config);
    }

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No
     * version checks are performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and
     * always behaves as if SaveBehavior.CLOBBER was specified, as
     * the AmazonDynamoDB.batchWriteItem() request does not support updating
     * existing items.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public List<FailedBatch> batchSave(List<? extends Object> objectsToSave) {
        return batchWrite(objectsToSave, Collections.emptyList(), this.config);
    }

    /**
     * Saves the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No
     * version checks are performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and
     * always behaves as if SaveBehavior.CLOBBER was specified, as
     * the AmazonDynamoDB.batchWriteItem() request does not support updating
     * existing items.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public List<FailedBatch> batchSave(Object... objectsToSave) {
        return batchWrite(Arrays.asList(objectsToSave), Collections.emptyList(), this.config);
    }

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API. <b>No
     * version checks are performed</b>, as required by the API.
     * <p/>
     * <b>This method ignores any SaveBehavior set on the mapper</b>, and
     * always behaves as if SaveBehavior.CLOBBER was specified, as
     * the AmazonDynamoDB.batchWriteItem() request does not support updating
     * existing items.
     *
     * @see DynamoDBMapper#batchWrite(List, List, DynamoDBMapperConfig)
     */
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete) {
        return batchWrite(objectsToWrite, objectsToDelete, this.config);
    }

    /**
     * Saves and deletes the objects given using one or more calls to the
     * {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)} API.
     *
     * @param objectsToWrite
     *            A list of objects to save to DynamoDB. <b>No version checks
     *            are performed</b>, as required by the
     *            {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param objectsToDelete
     *            A list of objects to delete from DynamoDB. <b>No version
     *            checks are performed</b>, as required by the
     *            {@link AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)}
     *            API.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} is
     *            considered; if specified, all objects in the two parameter
     *            lists will be considered to belong to the given table
     *            override. In particular, this method <b>always acts as
     *            if SaveBehavior.CLOBBER was specified</b> regardless of the
     *            value of the config parameter.
     * @return A list of failed batches which includes the unprocessed items and
     *         the exceptions causing the failure.
     */
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        List<FailedBatch> totalFailedBatches = new LinkedList<FailedBatch>();

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

            AttributeTransformer.Parameters<?> parameters =
                toParameters(attributeValues, clazz, config);
            
            requestItems.get(tableName).add(
                new WriteRequest().withPutRequest(
                    new PutRequest().withItem(
                        transformAttributes(parameters))));
        }

        for ( Object toDelete : objectsToDelete ) {
            Class<?> clazz = toDelete.getClass();

            String tableName = getTableName(clazz, config);

            Map<String, AttributeValue> key = getKey(toDelete);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            requestItems.get(tableName).add(
                    new WriteRequest().withDeleteRequest(new DeleteRequest().withKey(key)));
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

            List<FailedBatch> failedBatches = writeOneBatch(batch);
            if (failedBatches != null) {
                totalFailedBatches.addAll(failedBatches);

                // If contains throttling exception, we do a backoff
                if (containsThrottlingException(failedBatches)) {
                    try {
                        Thread.sleep(1000 * 2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new AmazonClientException(e.getMessage(), e);
                    }
                }
            }
        }



        // Once the entire batch is processed, update assigned keys in memory
        for ( ValueUpdate update : inMemoryUpdates ) {
            update.apply();
        }

        return totalFailedBatches;
    }

    /**
     * Process one batch of requests(max 25). It will divide the batch if
     * receives request too large exception(the total size of the request is beyond 1M).
     */
    private List<FailedBatch> writeOneBatch(Map<String, List<WriteRequest>> batch) {

        List<FailedBatch> failedBatches = new LinkedList<FailedBatch>();
        Map<String, List<WriteRequest>> firstHalfBatch = new HashMap<String, List<WriteRequest>>();
        Map<String, List<WriteRequest>> secondHalfBatch = new HashMap<String, List<WriteRequest>>();
        FailedBatch failedBatch = callUntilCompletion(batch);

        if (failedBatch != null) {
            // If the exception is request entity too large, we divide the batch
            // into smaller parts.

            if (failedBatch.getException() instanceof AmazonServiceException
            && RetryUtils.isRequestEntityTooLargeException((AmazonServiceException) failedBatch.getException())) {

                // If only one item left, the item size must beyond 64k, which
                // exceedes the limit.

                if (computeFailedBatchSize(failedBatch) == 1) {
                    failedBatches.add(failedBatch);
                } else {
                    divideBatch(batch, firstHalfBatch, secondHalfBatch);
                    failedBatches.addAll(writeOneBatch(firstHalfBatch));
                    failedBatches.addAll(writeOneBatch(secondHalfBatch));
                }

            } else {
                failedBatches.add(failedBatch);
            }

        }
        return failedBatches;
    }

    /**
     * Check whether there are throttling exception in the failed batches.
     */
    private boolean containsThrottlingException (List<FailedBatch> failedBatches) {
        for (FailedBatch failedBatch : failedBatches) {
           Exception e = failedBatch.getException();
            if (e instanceof AmazonServiceException
                    && RetryUtils.isThrottlingException((AmazonServiceException) e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Divide the batch of objects to save into two smaller batches. Each contains half of the elements.
     */
    private void divideBatch(Map<String, List<WriteRequest>> batch, Map<String, List<WriteRequest>> firstHalfBatch, Map<String, List<WriteRequest>> secondHalfBatch) {
        for (String key : batch.keySet()) {

            List<WriteRequest> requests = batch.get(key);

            List<WriteRequest> firstHalfRequests = requests.subList(0, requests.size() / 2);

            List<WriteRequest> secondHalfRequests = requests.subList(requests.size() / 2, requests.size());

            firstHalfBatch.put(key, firstHalfRequests);

            secondHalfBatch.put(key, secondHalfRequests);

        }

    }

    /**
     * Count the total number of unprocessed items in the failed batch.
     */

    private int computeFailedBatchSize(FailedBatch failedBatch) {

        int count = 0;

        for (String tableName : failedBatch.getUnprocessedItems().keySet()) {
            count += failedBatch.getUnprocessedItems().get(tableName).size();
        }
        return count;
    }

    /**
     * Continue trying to process the batch until it finishes or an exception
     * occurs.
     */

    private FailedBatch callUntilCompletion(Map<String, List<WriteRequest>> batch) {
        BatchWriteItemResult result = null;
        int retries = 0;
        FailedBatch failedBatch = null;
        while (true) {
            try {
                result = db.batchWriteItem(new BatchWriteItemRequest().withRequestItems(batch));
            } catch (Exception e) {
                failedBatch = new FailedBatch();
                failedBatch.setUnprocessedItems(batch);
                failedBatch.setException(e);
                return failedBatch;
            }
            retries++;
            batch = result.getUnprocessedItems();
            if (batch.size() > 0) {
                pauseExponentially(retries);
            } else {
                break;
            }
        }
        return failedBatch;
    }

    /**
     * Retrieves multiple items from multiple tables using their primary keys.
     *
     * @see DynamoDBMapper#batchLoad(List, DynamoDBMapperConfig)
     */
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet) {
        return batchLoad(itemsToGet, this.config);
    }

    /**
     * Retrieves multiple items from multiple tables using their primary keys.
     *
     * @param itemsToGet
     *            Key objects, corresponding to the class to fetch, with their
     *            primary key values set.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} and
     *            {@link DynamoDBMapperConfig#getConsistentReads()} are
     *            considered.
     */
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        boolean consistentReads = (config.getConsistentReads() == ConsistentReads.CONSISTENT);

        if ( itemsToGet == null || itemsToGet.isEmpty() ) {
            return new HashMap<String, List<Object>>();
        }

        Map<String, KeysAndAttributes> requestItems = new HashMap<String, KeysAndAttributes>();
        Map<String, Class<?>> classesByTableName = new HashMap<String, Class<?>>();
        Map<String, List<Object>> resultSet = new HashMap<String, List<Object>>();
        int count = 0;

        for ( Object keyObject : itemsToGet ) {
            Class<?> clazz = keyObject.getClass();

            String tableName = getTableName(clazz, config);
            classesByTableName.put(tableName, clazz);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(
                        tableName,
                        new KeysAndAttributes().withConsistentRead(consistentReads).withKeys(
                                new LinkedList<Map<String, AttributeValue>>()));
            }

            requestItems.get(tableName).getKeys().add(getKey(keyObject));

            // Reach the maximum number which can be handled in a single batchGet
            if ( ++count == 100 ) {
                processBatchGetRequest(classesByTableName, requestItems, resultSet, config);
                requestItems.clear();
                count = 0;
            }
        }

        if ( count > 0 ) {
            processBatchGetRequest(classesByTableName, requestItems, resultSet, config);
        }

        return resultSet;
    }

    /**
     * Retrieves the attributes for multiple items from multiple tables using
     * their primary keys.
     * {@link AmazonDynamoDB#batchGetItem(BatchGetItemRequest)} API.
     *
     * @see #batchLoad(List, DynamoDBMapperConfig)
     * @see #batchLoad(Map, DynamoDBMapperConfig)
     */
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet) {
        return batchLoad(itemsToGet, this.config);
    }

    /**
     * Retrieves multiple items from multiple tables using their primary keys.
     * Valid only for tables with a single hash key, or a single hash and range
     * key. For other schemas, use
     * {@link DynamoDBMapper#batchLoad(List, DynamoDBMapperConfig)}
     *
     * @param itemsToGet
     *            Map from class to load to list of primary key attributes.
     * @param config
     *            Only {@link DynamoDBMapperConfig#getTableNameOverride()} and
     *            {@link DynamoDBMapperConfig#getConsistentReads()} are
     *            considered.
     */
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {

        List<Object> keys = new ArrayList<Object>();
        if ( itemsToGet != null ) {
            for ( Class<?> clazz : itemsToGet.keySet() ) {
                if ( itemsToGet.get(clazz) != null ) {
                    for ( KeyPair keyPair : itemsToGet.get(clazz) ) {
                        keys.add(createKeyObject(clazz, keyPair.getHashKey(), keyPair.getRangeKey()));
                    }
                }
            }
        }

        return batchLoad(keys, config);
    }

    private void processBatchGetRequest(
            final Map<String, Class<?>> classesByTableName,
            final Map<String, KeysAndAttributes> requestItems,
            final Map<String, List<Object>> resultSet,
            final DynamoDBMapperConfig config) {
        
        BatchGetItemResult batchGetItemResult = null;
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(requestItems);
        do {
            if ( batchGetItemResult != null ) {
                batchGetItemRequest.setRequestItems(batchGetItemResult.getUnprocessedKeys());
            }

            batchGetItemResult = db.batchGetItem(batchGetItemRequest);
            Map<String, List<Map<String, AttributeValue>>> responses = batchGetItemResult.getResponses();
            for ( String tableName : responses.keySet() ) {
                List<Object> objects = null;
                if ( resultSet.get(tableName) != null ) {
                    objects = resultSet.get(tableName);
                } else {
                    objects = new LinkedList<Object>();
                }

                Class<?> clazz = classesByTableName.get(tableName);

                for ( Map<String, AttributeValue> item : responses.get(tableName) ) {
                    AttributeTransformer.Parameters<?> parameters =
                        toParameters(item, clazz, config);
                    objects.add(marshalIntoObject(parameters));
                }

                resultSet.put(tableName, objects);
            }
            // To see whether there are unprocessed keys.
        } while ( batchGetItemResult.getUnprocessedKeys() != null && batchGetItemResult.getUnprocessedKeys().size() > 0 );

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
     * You can specify the pagination loading strategy for this scan operation.
     * By default, the list returned is lazily loaded when possible.
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
     * @see PaginationLoadingStrategy
     */
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        return new PaginatedScanList<T>(this, clazz, db, scanRequest, scanResult, config.getPaginationLoadingStrategy(), config);
    }

    /**
     * Scans through an Amazon DynamoDB table on logically partitioned segments
     * in parallel and returns the matching results in one unmodifiable list of
     * instantiated objects, using the default configuration.
     *
     * @see DynamoDBMapper#parallelScan(Class, DynamoDBScanExpression,int,
     *      DynamoDBMapperConfig)
     */
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz, DynamoDBScanExpression scanExpression, int totalSegments) {
        return parallelScan(clazz, scanExpression, totalSegments, config);
    }

    /**
     * Scans through an Amazon DynamoDB table on logically partitioned segments
     * in parallel. This method will create a thread pool of the specified size,
     * and each thread will issue scan requests for its assigned segment,
     * following the returned continuation token, until the end of its segment.
     * Callers should be responsible for setting the appropriate number of total
     * segments. More scan segments would result in better performance but more
     * consumed capacity of the table. The results are returned in one
     * unmodifiable list of instantiated objects. The table to scan is
     * determined by looking at the annotations on the specified class, which
     * declares where to store the object data in Amazon DynamoDB, and the scan
     * expression parameter allows the caller to filter results and control how
     * the scan is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     * <p>
     * You can specify the pagination loading strategy for this parallel scan operation.
     * By default, the list returned is lazily loaded when possible.
     *
     * @param <T>
     *            The type of the objects being returned.
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in Amazon DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply
     *            to limit results.
     * @param totalSegments
     *            Number of total parallel scan segments.
     *            <b>Range: </b>1 - 4096
     * @param config
     *            The configuration to use for this scan, which overrides the
     *            default provided at object construction.
     * @return An unmodifiable list of the objects constructed from the results
     *         of the scan operation.
     * @see PaginatedParallelScanList
     * @see PaginationLoadingStrategy
     */
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz, DynamoDBScanExpression scanExpression, int totalSegments, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        // Create hard copies of the original scan request with difference segment number.
        List<ScanRequest> parallelScanRequests = createParallelScanRequestsFromExpression(clazz, scanExpression, totalSegments, config);
        ParallelScanTask parallelScanTask = new ParallelScanTask(this, db, parallelScanRequests);

        return new PaginatedParallelScanList<T>(this, clazz, db, parallelScanTask, config.getPaginationLoadingStrategy(), config);
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
        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(scanResult.getItems(), clazz, config);

        result.setResults(marshalIntoObjects(parameters));
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
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
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
     * When the query is on any local secondary index, callers should be aware that
     * the returned object(s) will only contain item attributes that are projected
     * into the index. All the other unprojected attributes will be saved as type
     * default values.
     * <p>
     * Callers should also be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     * <p>
     * You can specify the pagination loading strategy for this query operation.
     * By default, the list returned is lazily loaded when possible.
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
     * @see PaginationLoadingStrategy
     */
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        return new PaginatedQueryList<T>(this, clazz, db, queryRequest, queryResult, config.getPaginationLoadingStrategy(), config);
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
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
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
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult scanResult = db.query(applyUserAgent(queryRequest));
        QueryResultPage<T> result = new QueryResultPage<T>();
        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(scanResult.getItems(), clazz, config);

        result.setResults(marshalIntoObjects(parameters));
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
        scanRequest.setSelect(Select.COUNT);

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
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
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
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);
        queryRequest.setSelect(Select.COUNT);

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

    private List<ScanRequest> createParallelScanRequestsFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, int totalSegments, DynamoDBMapperConfig config) {
        if (totalSegments < 1)
            throw new IllegalArgumentException("Parallel scan should have at least one scan segment.");
        List<ScanRequest> parallelScanRequests= new LinkedList<ScanRequest>();
        for (int segment = 0; segment < totalSegments; segment++) {
            ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);
            parallelScanRequests.add(scanRequest.withSegment(segment).withTotalSegments(totalSegments));
        }
        return parallelScanRequests;
    }

    private <T> QueryRequest  createQueryRequestFromExpression(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setConsistentRead(queryExpression.isConsistentRead());
        queryRequest.setTableName(getTableName(clazz, config));
        queryRequest.setIndexName(queryExpression.getIndexName());

        Map<String, Condition> keyConditions = getHashKeyEqualsConditions(queryExpression.getHashKeyValues());

        Map<String, Condition> rangeKeyConditions = queryExpression.getRangeKeyConditions();
        if (null != rangeKeyConditions) {
            processRangeKeyConditions(clazz, queryRequest, rangeKeyConditions);
            keyConditions.putAll(rangeKeyConditions);
        }

        queryRequest.setKeyConditions(keyConditions);
        queryRequest.setScanIndexForward(queryExpression.isScanIndexForward());
        queryRequest.setLimit(queryExpression.getLimit());
        queryRequest.setExclusiveStartKey(queryExpression.getExclusiveStartKey());

        return queryRequest;
    }

    /**
     * Utility method for checking the validity of the range key condition, and also it will try to infer the index name if the query is using any index range key.
     */
    private void processRangeKeyConditions(Class<?> clazz, QueryRequest queryRequest, Map<String, Condition> rangeKeyConditions) {
        /**
         * Exception if conditions on multiple range keys are found.
         */
        if (rangeKeyConditions.size() > 1) {
            // The current DynamoDB service only supports queries using hash key equal condition
            // plus ONE range key condition.
            // This range key could be either the primary key or any index key.
            throw new AmazonClientException("Conditions on multiple range keys ("
                    + rangeKeyConditions.keySet().toString()
                    + ") are found in the query. DynamoDB service only accepts up to ONE range key condition.");
        }
        String assignedIndexName = queryRequest.getIndexName();
        for (String rangeKey : rangeKeyConditions.keySet()) {
            /**
             * If it is a primary range key, checks whether the user has specified
             * an unnecessary index name.
             */
            if (rangeKey.equals(reflector.getPrimaryRangeKeyName(clazz))) {
                if ( null != assignedIndexName )
                    throw new AmazonClientException("The range key ("
                            + rangeKey + ") in the query is the primary key of the table, not the range key of index ("
                            + assignedIndexName + ").");
            }
            else {
                List<String> annotatedIndexNames = reflector.getIndexNameByIndexRangeKeyName(clazz, rangeKey);
                /**
                 * If it is an index range key,
                 *         check whether the provided index name matches the @DynamoDBIndexRangeKey annotation,
                 *         or try to infer the index name according to @DynamoDBIndexRangeKey annotation
                 *             if it is not provided in the query.
                 */
                if ( null != annotatedIndexNames) {
                    if (null == assignedIndexName) {
                        // infer the index name if the range key is used only in one index
                        if ( 1 == annotatedIndexNames.size()) {
                            queryRequest.setIndexName(annotatedIndexNames.get(0));
                        } else {
                            throw new AmazonClientException("Please specify which index to be used for this query. "
                                    + "(Choose from " + annotatedIndexNames.toString() + ").");
                        }
                    } else {
                        // check whether the provided index name in the query matches the @DyanmoDBIndexRangeKey annotation
                        if ( !annotatedIndexNames.contains(assignedIndexName)) {
                            throw new AmazonClientException(assignedIndexName
                                    + " is not annotated as an index in the @DynamoDBIndexRangeKey annotation on "
                                    + rangeKey + "(Choose from " + annotatedIndexNames.toString() + ").");
                        }
                    }
                }
                else {
                    throw new AmazonClientException("The range key used in the query (" + rangeKey + ") is not annotated with " +
                            "either @DynamoDBRangeKey or @DynamoDBIndexRangeKey in class (" + clazz.getName() + ").");
                }
            }
        }
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final Class<T> modelClass,
            final DynamoDBMapperConfig mapperConfig) {

        return toParameters(attributeValues, false, modelClass, mapperConfig);
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final boolean partialUpdate,
            final Class<T> modelClass,
            final DynamoDBMapperConfig mapperConfig) {

        return new TransformerParameters(reflector,
                                         attributeValues,
                                         partialUpdate,
                                         modelClass,
                                         mapperConfig);
    }

    final <T> List<AttributeTransformer.Parameters<T>> toParameters(
            final List<Map<String, AttributeValue>> attributeValues,
            final Class<T> modelClass,
            final DynamoDBMapperConfig mapperConfig
    ) {
        List<AttributeTransformer.Parameters<T>> rval =
            new ArrayList<AttributeTransformer.Parameters<T>>(
                attributeValues.size());

        for (Map<String, AttributeValue> item : attributeValues) {
            rval.add(toParameters(item, modelClass, mapperConfig));
        }

        return rval;
    }
 
    /**
     * The one true implementation of AttributeTransformer.Parameters.
     */
    private static class TransformerParameters<T>
            implements AttributeTransformer.Parameters<T> {

        private final DynamoDBReflector reflector;
        private final Map<String, AttributeValue> attributeValues;
        private final boolean partialUpdate;
        private final Class<T> modelClass;
        private final DynamoDBMapperConfig mapperConfig;
        
        private String tableName;
        private String hashKeyName;
        private String rangeKeyName;

        public TransformerParameters(
                final DynamoDBReflector reflector,
                final Map<String, AttributeValue> attributeValues,
                final boolean partialUpdate,
                final Class<T> modelClass,
                final DynamoDBMapperConfig mapperConfig) {

            this.reflector = reflector;
            this.attributeValues =
                Collections.unmodifiableMap(attributeValues);
            this.partialUpdate = partialUpdate;
            this.modelClass = modelClass;
            this.mapperConfig = mapperConfig;
        }
        
        @Override
        public Map<String, AttributeValue> getAttributeValues() {
            return attributeValues;
        }

        @Override
        public boolean isPartialUpdate() {
            return partialUpdate;
        }

        @Override
        public Class<T> getModelClass() {
            return modelClass;
        }

        @Override
        public DynamoDBMapperConfig getMapperConfig() {
            return mapperConfig;
        }

        @Override
        public String getTableName() {
            if (tableName == null) {
                tableName = DynamoDBMapper
                        .getTableName(modelClass, mapperConfig, reflector);
            }
            return tableName;
        }

        @Override
        public String getHashKeyName() {
            if (hashKeyName == null) {
                Method hashKeyGetter = reflector.getHashKeyGetter(modelClass);
                hashKeyName = reflector.getAttributeName(hashKeyGetter);
            }
            return hashKeyName;
        }

        @Override
        public String getRangeKeyName() {
            if (rangeKeyName == null) {
                Method rangeKeyGetter =
                        reflector.getRangeKeyGetter(modelClass);
                if (rangeKeyGetter == null) {
                    rangeKeyName = NO_RANGE_KEY;
                } else {
                    rangeKeyName = reflector.getAttributeName(rangeKeyGetter);
                }
            }
            if (rangeKeyName == NO_RANGE_KEY) {
                return null;
            }
            return rangeKeyName;
        }
    }
    
    private Map<String, AttributeValue> untransformAttributes(
            final AttributeTransformer.Parameters parameters
    ) {
        if (transformer != null) {
            return transformer.untransform(parameters);
        }
        
        return untransformAttributes(
                parameters.getModelClass(),
                parameters.getAttributeValues());
    }
    
    /**
     * By default, just calls {@link #untransformAttributes(String, String, Map)}.
     * 
     * @deprecated in favor of {@link AttributeTransformer}
     */
    @Deprecated
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
     * By default, returns the attributes unchanged.
     *
     * @param hashKey the attribute name of the hash key
     * @param rangeKey the attribute name of the range key (or null if there is none)
     * @param attributeValues
     * @return the decrypted attributes
     * @deprecated in favor of {@link AttributeTransformer}
     */
    @Deprecated
    protected Map<String, AttributeValue> untransformAttributes(String hashKey, String rangeKey,
            Map<String, AttributeValue> attributeValues) {
        return attributeValues;
    }

    private Map<String, AttributeValue> transformAttributes(
            final AttributeTransformer.Parameters parameters) {
        
        if (transformer != null) {
            return transformer.transform(parameters);
        }
        
        return transformAttributes(
                parameters.getModelClass(),
                parameters.getAttributeValues());
    }
    
    /**
     * By default, just calls {@link #transformAttributes(String, String, Map)}.
     * 
     * @param clazz
     * @param attributeValues
     * @return the decrypted attribute values
     * @deprecated in favor of {@link AttributeTransformer}
     */
    @Deprecated
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
     * @deprecated in favor of {@link AttributeTransformer}
     */
    @Deprecated
    protected Map<String, AttributeValue> transformAttributes(String hashKey, String rangeKey,
            Map<String, AttributeValue> attributeValues) {
        return attributeValues;
    }

    private Map<String, AttributeValueUpdate> transformAttributeUpdates(
            final Class<?> clazz,
            final Map<String, AttributeValue> keys,
            final Map<String, AttributeValueUpdate> updateValues,
            final DynamoDBMapperConfig config
    ) {
        Map<String, AttributeValue> item = convertToItem(updateValues);

        HashSet<String> keysAdded = new HashSet<String>();
        for (Map.Entry<String, AttributeValue> e : keys.entrySet()) {
            if (!item.containsKey(e.getKey())) {
                keysAdded.add(e.getKey());
                item.put(e.getKey(), e.getValue());
            }
        }
        
        AttributeTransformer.Parameters<?> parameters =
            toParameters(item, true, clazz, config);
        
        String hashKey = parameters.getHashKeyName();
        if (!item.containsKey(hashKey)) {
            item.put(hashKey, keys.get(hashKey));
        }

        item = transformAttributes(parameters);

        for(Map.Entry<String, AttributeValue> entry: item.entrySet()) {
            if (keysAdded.contains(entry.getKey())) {
                // This was added in for context before calling
                // transformAttributes, but isn't actually being changed.
                continue;
            }

            AttributeValueUpdate update = updateValues.get(entry.getKey());
            if (update != null) {
                update.getValue()
                    .withB( entry.getValue().getB() )
                    .withBS(entry.getValue().getBS())
                    .withN( entry.getValue().getN() )
                    .withNS(entry.getValue().getNS())
                    .withS( entry.getValue().getS() )
                    .withSS(entry.getValue().getSS());
            } else {
                updateValues.put(entry.getKey(),
                                 new AttributeValueUpdate(entry.getValue(),
                                                          "PUT"));
            }
        }

        return updateValues;
    }

    private void pauseExponentially(int retries) {
        if (retries == 0) {
            return;
        }

        Random random = new Random();
        long delay = 0;
        long scaleFactor = 500 + random.nextInt(100);
        delay = (long) (Math.pow(2, retries) * scaleFactor);
        delay = Math.min(delay, MAX_BACKOFF_IN_MILLISECONDS);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    static <X extends AmazonWebServiceRequest> X applyUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }

    /**
     * The return type of batchWrite, batchDelete and batchSave. It contains the information about the unprocessed items
     * and the exception causing the failure.
     *
     */
    public static class FailedBatch {

        private Map<String, java.util.List<WriteRequest>> unprocessedItems;

        private Exception exception;

        public void setUnprocessedItems(Map<String, java.util.List<WriteRequest>> unprocessedItems) {
            this.unprocessedItems = unprocessedItems;
        }

        public Map<String, java.util.List<WriteRequest>> getUnprocessedItems() {
            return unprocessedItems;
        }

        public void setException(Exception excetpion) {
            this.exception = excetpion;
        }

        public Exception getException() {
            return exception;
        }

    }

    /**
     * Returns the underlying {@link S3ClientCache} for accessing S3.
     */
    public S3ClientCache getS3ClientCache() {
        return s3cc;
    }

    /**
     * Creates an S3Link with the specified bucket name and key using the
     * default S3 region.
     * This method requires the mapper to have been initialized with the
     * necessary credentials for accessing S3.
     *
     * @throws IllegalStateException if the mapper has not been constructed
     * with the necessary S3 AWS credentials.
     */
    public S3Link createS3Link(String bucketName, String key) {
        return createS3Link(null, bucketName , key);
    }

    /**
     * Creates an S3Link with the specified region, bucket name and key.
     * This method requires the mapper to have been initialized with the
     * necessary credentials for accessing S3.
     *
     * @throws IllegalStateException if the mapper has not been constructed
     * with the necessary S3 AWS credentials.
     */
    public S3Link createS3Link(Region s3region, String bucketName, String key) {
        if ( s3cc == null ) {
            throw new IllegalStateException("Mapper must be constructed with S3 AWS Credentials to create S3Link");
        }
        return new S3Link(s3cc, s3region, bucketName , key);
    }
}