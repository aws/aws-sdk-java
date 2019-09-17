/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.BatchLoadRetryStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.BatchWriteRetryStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.model.AttributeAction;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionCheck;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.Delete;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.Get;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.ItemResponse;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.Put;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.ReturnValuesOnConditionCheckFailure;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.amazonaws.services.dynamodbv2.model.TransactGetItem;
import com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest;
import com.amazonaws.services.dynamodbv2.model.TransactGetItemsResult;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItem;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest;
import com.amazonaws.services.dynamodbv2.model.Update;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.util.VersionInfoUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import static com.amazonaws.services.dynamodbv2.model.KeyType.HASH;
import static com.amazonaws.services.dynamodbv2.model.KeyType.RANGE;
import static com.amazonaws.services.dynamodbv2.datamodeling.TransactionWriteRequest.TransactionWriteOperation;
import static com.amazonaws.services.dynamodbv2.datamodeling.TransactionWriteRequest.TransactionWriteOperationType;

/**
 * Object mapper for domain-object interaction with DynamoDB.
 * <p>
 * To use, define a domain class that represents an item in a DynamoDB table and
 * annotate it with the annotations found in the
 * com.amazonaws.services.dynamodbv2.datamodeling package. In order to allow the
 * mapper to correctly persist the data, each modeled property in the domain
 * class should be accessible via getter and setter methods, and each property
 * annotation should be either applied to the getter method or the class field.
 * A minimal example using getter annotations:
 *
 * <pre class="brush: java">
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
 * <pre class="brush: java">
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * Long hashKey = 105L;
 * double rangeKey = 1.0d;
 * TestClass obj = mapper.load(TestClass.class, hashKey, rangeKey);
 * obj.getIntegerAttribute().add(42);
 * mapper.save(obj);
 * mapper.delete(obj);
 * </pre>
 * <p>
 * If you don't have your DynamoDB table set up yet, you can use
 * {@link DynamoDBMapper#generateCreateTableRequest(Class)} to construct the
 * {@link CreateTableRequest} for the table represented by your annotated class.
 *
 * <pre class="brush: java">
 * AmazonDynamoDB dynamoDBClient = new AmazonDynamoDBClient();
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * CreateTableRequest req = mapper.generateCreateTableRequest(TestClass.class);
 * // Table provision throughput is still required since it cannot be specified in your POJO
 * req.setProvisionedThroughput(new ProvisionedThroughput(5L, 5L));
 * // Fire off the CreateTableRequest using the low-level client
 * dynamoDBClient.createTable(req);
 * </pre>
 * <p>
 * When using the save, load, and delete methods, {@link DynamoDBMapper} will
 * throw {@link DynamoDBMappingException}s to indicate that domain classes are
 * incorrectly annotated or otherwise incompatible with this class. Service
 * exceptions will always be propagated as {@link SdkClientException}, and
 * DynamoDB-specific subclasses such as {@link ConditionalCheckFailedException}
 * will be used when possible.
 * <p>
 * This class is thread-safe and can be shared between threads.
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
public class DynamoDBMapper extends AbstractDynamoDBMapper {

    private final AmazonDynamoDB db;
    private final DynamoDBMapperModelFactory models;
    private final S3Link.Factory s3Links;

    private final AttributeTransformer transformer;

    /**
     * The max back off time for batch get. The configuration for batch write
     * has been moved to DynamoDBMapperConfig
     */
    static final long MAX_BACKOFF_IN_MILLISECONDS = 1000 * 3;

    /** The max number of items allowed in a BatchWrite request */
    static final int MAX_ITEMS_PER_BATCH = 25;
    /**
     * This retry count is applicable only when every batch get item request
     * results in no data retrieved from server and the un processed keys is
     * same as request items
     */
    static final int BATCH_GET_MAX_RETRY_COUNT_ALL_KEYS = 5;

    /**
     * User agent for requests made using the {@link DynamoDBMapper}.
     */
    private static final String USER_AGENT =
            DynamoDBMapper.class.getName() + "/" + VersionInfoUtils.getVersion();
    private static final String USER_AGENT_BATCH_OPERATION  =
            DynamoDBMapper.class.getName() + "_batch_operation/" + VersionInfoUtils.getVersion();
    private static final String USER_AGENT_TRANSACTION_OPERATION  =
            DynamoDBMapper.class.getName() + "_transaction_operation/" + VersionInfoUtils.getVersion();

    private static final Log log = LogFactory.getLog(DynamoDBMapper.class);

    /**
     * Fail fast when trying to create a subclass of the DynamoDBMapper that
     * attempts to override one of the old {@code transformAttributes} methods.
     */
    private static void failFastOnIncompatibleSubclass(Class<?> clazz) {
        while (clazz != DynamoDBMapper.class) {
            Class<?>[] classOverride = new Class<?>[] {
                    Class.class,
                    Map.class
            };
            Class<?>[] nameOverride = new Class<?>[] {
                    String.class,
                    String.class,
                    Map.class
            };

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getName().equals("transformAttributes")) {
                    Class<?>[] params = method.getParameterTypes();
                    if (Arrays.equals(params, classOverride)
                            || Arrays.equals(params, nameOverride)) {

                        throw new IllegalStateException(
                                "The deprecated transformAttributes method is "
                                + "no longer supported as of 1.9.0. Use an "
                                + "AttributeTransformer to inject custom "
                                + "attribute transformation logic.");
                    }
                }
            }

            clazz = clazz.getSuperclass();
        }
    }



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
        super(config);

        failFastOnIncompatibleSubclass(getClass());

        this.db = dynamoDB;
        this.transformer = transformer;

        this.s3Links = S3Link.Factory.of(s3CredentialsProvider);

        this.models = StandardModelFactories.of(this.s3Links);
    }

    @Override
    public <T extends Object> DynamoDBMapperTableModel<T> getTableModel(Class<T> clazz, DynamoDBMapperConfig config) {
        return this.models.getTableFactory(config).getTable(clazz);
    }

    @Override
    public <T extends Object> T load(T keyObject, DynamoDBMapperConfig config) {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) keyObject.getClass();

        config = mergeConfig(config);
        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, config);

        String tableName = getTableName(clazz, keyObject, config);

        GetItemRequest rq = new GetItemRequest()
            .withRequestMetricCollector(config.getRequestMetricCollector());

        Map<String, AttributeValue> key = model.convertKey(keyObject);

        rq.setKey(key);
        rq.setTableName(tableName);
        rq.setConsistentRead(config.getConsistentReads() == ConsistentReads.CONSISTENT);


        GetItemResult item = db.getItem(applyUserAgent(rq));
        Map<String, AttributeValue> itemAttributes = item.getItem();
        if ( itemAttributes == null ) {
            return null;
        }

        T object = privateMarshallIntoObject(
                toParameters(itemAttributes, clazz, tableName, config));

        return object;
    }

    @Override
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, config);
        T keyObject = model.createKey(hashKey, rangeKey);
        return load(keyObject, config);
    }

    @Override
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        String tableName = getTableName(clazz, config);

        return privateMarshallIntoObject(
                toParameters(itemAttributes, clazz, tableName, config));
    }

    /**
     * The one true implementation of marshallIntoObject.
     */
    private <T> T privateMarshallIntoObject(
            AttributeTransformer.Parameters<T> parameters) {

        Class<T> clazz = parameters.getModelClass();
        Map<String, AttributeValue> values = untransformAttributes(parameters);

        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, parameters.getMapperConfig());
        return model.unconvert(values);
    }

    @Override
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

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
     */
    final <T> List<T> marshallIntoObjects(
            final List<AttributeTransformer.Parameters<T>> parameters
    ) {
        List<T> result = new ArrayList<T>(parameters.size());

        for (AttributeTransformer.Parameters<T> entry : parameters) {
            result.add(privateMarshallIntoObject(entry));
        }

        return result;
    }

    @Override
    public <T extends Object> void save(T object,
                                        DynamoDBSaveExpression saveExpression,
                                        final DynamoDBMapperConfig config) {
        final DynamoDBMapperConfig finalConfig = mergeConfig(config);

        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) object.getClass();
        String tableName = getTableName(clazz, object, finalConfig);

        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, finalConfig);

        /*
         * We use a putItem request instead of updateItem request either when
         * CLOBBER or PUT is configured, or part of the primary key of the object needs
         * to be auto-generated.
         */
        boolean usePut = (finalConfig.getSaveBehavior() == SaveBehavior.CLOBBER
                         || finalConfig.getSaveBehavior() == SaveBehavior.PUT)
                         || anyKeyGeneratable(model, object, finalConfig.getSaveBehavior());

        SaveObjectHandler saveObjectHandler;

        if (usePut) {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig, saveExpression) {

                @Override
                protected void onPrimaryKeyAttributeValue(String attributeName,
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
                protected void executeLowLevelRequest() {
                    /* Send a putItem request */
                    doPutItem();
                }
            };
        } else {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig, saveExpression) {

                @Override
                protected void onPrimaryKeyAttributeValue(String attributeName,
                        AttributeValue keyAttributeValue) {
                    /* Put it in the key collection which is later used in the updateItem request. */
                    getPrimaryKeyAttributeValues().put(attributeName, keyAttributeValue);
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
                protected void executeLowLevelRequest() {
                    UpdateItemResult updateItemResult = doUpdateItem();

                    // The UpdateItem request is specified to return ALL_NEW
                    // attributes of the affected item. So if the returned
                    // UpdateItemResult does not include any ReturnedAttributes,
                    // it indicates the UpdateItem failed silently (e.g. the
                    // key-only-put nightmare -
                    // https://forums.aws.amazon.com/thread.jspa?threadID=86798&tstart=25),
                    // in which case we should re-send a PutItem
                    // request instead.
                    if (updateItemResult.getAttributes() == null
                            || updateItemResult.getAttributes().isEmpty()) {
                        // Before we proceed with PutItem, we need to put all
                        // the key attributes (prepared for the
                        // UpdateItemRequest) into the AttributeValueUpdates
                        // collection.
                        for (String keyAttributeName : getPrimaryKeyAttributeValues().keySet()) {
                            getAttributeValueUpdates().put(keyAttributeName,
                                    new AttributeValueUpdate()
                                            .withValue(getPrimaryKeyAttributeValues().get(keyAttributeName))
                                            .withAction("PUT"));
                        }

                        doPutItem();
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
        private final String tableName;
        private final DynamoDBMapperConfig saveConfig;

        private final Map<String, AttributeValue> primaryKeys;
        private final Map<String, AttributeValueUpdate> updateValues;

        /**
         * Any expected value conditions specified by the implementation of
         * DynamoDBMapper, e.g. value assertions on versioned attributes.
         */
        private final Map<String, ExpectedAttributeValue> internalExpectedValueAssertions;

        /**
         * Additional expected value conditions specified by the user.
         */
        protected final Map<String, ExpectedAttributeValue> userProvidedExpectedValueConditions;

        /**
         * Condition operator on the additional expected value conditions
         * specified by the user.
         */
        protected final String userProvidedConditionOperator;

        private final List<ValueUpdate> inMemoryUpdates;

        /**
         * Constructs a handler for saving the specified model object.
         *
         * @param object            The model object to be saved.
         * @param clazz             The domain class of the object.
         * @param tableName         The table name.
         * @param saveConifg        The mapper configuration used for this save.
         * @param saveExpression    The save expression, including the user-provided conditions and an optional logic operator.
         */
        public SaveObjectHandler(
                Class<?> clazz,
                Object object,
                String tableName,
                DynamoDBMapperConfig saveConfig,
                DynamoDBSaveExpression saveExpression) {

            this.clazz = clazz;
            this.object = object;
            this.tableName = tableName;
            this.saveConfig = saveConfig;

            if (saveExpression != null) {
                userProvidedExpectedValueConditions = saveExpression
                        .getExpected();
                userProvidedConditionOperator = saveExpression
                        .getConditionalOperator();
            } else {
                userProvidedExpectedValueConditions = null;
                userProvidedConditionOperator = null;
            }

            updateValues = new HashMap<String, AttributeValueUpdate>();
            internalExpectedValueAssertions = new HashMap<String, ExpectedAttributeValue>();
            inMemoryUpdates = new LinkedList<ValueUpdate>();
            primaryKeys = new HashMap<String, AttributeValue>();
        }

        /**
         * The general workflow of a save operation.
         */
        public void execute() {
            final DynamoDBMapperTableModel<Object> model = getTableModel((Class<Object>)clazz, saveConfig);
            for ( final DynamoDBMapperFieldModel<Object,Object> field : model.fields() ) {
                if ( canGenerate(model, object, getLocalSaveBehavior(), field) ) {
                    if ( field.keyType() != null || field.indexed() ) {
                        onAutoGenerateAssignableKey(field);
                    } else if ( field.versioned() ) {
                        onVersionAttribute(field);
                    } else {
                        onAutoGenerate(field);
                    }
                } else if ( field.keyType() != null ) {
                    AttributeValue newAttributeValue = field.convert(field.get(object));
                    if ( newAttributeValue == null ) {
                        throw new DynamoDBMappingException(
                            clazz.getSimpleName() + "[" + field.name() + "]; null or empty value for primary key"
                        );
                    }
                    onPrimaryKeyAttributeValue(field.name(), newAttributeValue);
                } else {
                    AttributeValue currentValue = field.convert(field.get(object));
                    if ( currentValue != null ) {
                        onNonKeyAttribute(field.name(), currentValue);
                    } else {
                        onNullNonKeyAttribute(field.name());
                    }
                }
            }

            /*
             * Execute the implementation of the low level request.
             */
            executeLowLevelRequest();

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
         * Implement this method to do the necessary operations when a primary key
         * attribute is set with some value.
         *
         * @param attributeName
         *            The name of the primary key attribute.
         * @param keyAttributeValue
         *            The AttributeValue of the primary key attribute as specified in
         *            the object.
         */
        protected abstract void onPrimaryKeyAttributeValue(String attributeName, AttributeValue keyAttributeValue);

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
         */
        protected abstract void executeLowLevelRequest();

        /** Get the SaveBehavior used locally for this save operation. **/
        protected SaveBehavior getLocalSaveBehavior() {
            return saveConfig.getSaveBehavior();
        }

        /** Get the table name **/
        protected String getTableName() {
            return tableName;
        }

        /** Get the map of all the specified primamry keys of the saved object. **/
        protected Map<String, AttributeValue> getPrimaryKeyAttributeValues() {
            return primaryKeys;
        }

        /** Get the map of AttributeValueUpdate on each modeled attribute. **/
        protected Map<String, AttributeValueUpdate> getAttributeValueUpdates() {
            return updateValues;
        }

        /**
         * Merge and return all the expected value conditions (either
         * user-specified or imposed by the internal implementation of
         * DynamoDBMapper) for this save operation.
         */
        protected Map<String, ExpectedAttributeValue> mergeExpectedAttributeValueConditions() {
            return DynamoDBMapper.mergeExpectedAttributeValueConditions(
                    internalExpectedValueAssertions,
                    userProvidedExpectedValueConditions,
                    userProvidedConditionOperator);
        }

        /** Get the list of all the necessary in-memory update on the object. **/
        protected List<ValueUpdate> getInMemoryUpdates() {
            return inMemoryUpdates;
        }

        /**
         * Save the item using a UpdateItem request. The handler will call this
         * method if
         * <ul>
         * <li>CLOBBER configuration is not being used;
         * <li>AND the item does not contain auto-generated key value;
         * </ul>
         * <p>
         * The ReturnedValues parameter for the UpdateItem request is set as
         * ALL_NEW, which means the service should return all of the attributes
         * of the new version of the item after the update. The handler will use
         * the returned attributes to detect silent failure on the server-side.
         */
        protected UpdateItemResult doUpdateItem() {
            UpdateItemRequest req = new UpdateItemRequest()
                    .withTableName(getTableName())
                    .withKey(getPrimaryKeyAttributeValues())
                    .withAttributeUpdates(
                            transformAttributeUpdates(
                                    this.clazz,
                                    getTableName(),
                                    getPrimaryKeyAttributeValues(),
                                    getAttributeValueUpdates(),
                                    saveConfig))
                    .withExpected(mergeExpectedAttributeValueConditions())
                    .withConditionalOperator(userProvidedConditionOperator)
                    .withReturnValues(ReturnValue.ALL_NEW)
                    .withRequestMetricCollector(saveConfig.getRequestMetricCollector());

            return db.updateItem(applyUserAgent(req));
        }

        /**
         * Save the item using a PutItem request. The handler will call this
         * method if
         * <ul>
         *  <li> CLOBBER configuration is being used;
         *  <li> OR the item contains auto-generated key value;
         *  <li> OR an UpdateItem request has silently failed (200 response with
         *          no affected attribute), which indicates the key-only-put scenario
         *          that we used to handle by the keyOnlyPut(...) hack.
         * </ul>
         */
        protected PutItemResult doPutItem() {
            Map<String, AttributeValue> attributeValues = convertToItem(getAttributeValueUpdates());

            attributeValues = transformAttributes(
                    toParameters(attributeValues,
                                 this.clazz,
                                 getTableName(),
                                 saveConfig));
            PutItemRequest req = new PutItemRequest()
                    .withTableName(getTableName())
                    .withItem(attributeValues)
                    .withExpected(mergeExpectedAttributeValueConditions())
                    .withConditionalOperator(userProvidedConditionOperator)
                    .withRequestMetricCollector(saveConfig.getRequestMetricCollector());

            return db.putItem(applyUserAgent(req));
        }

        /**
         * Auto-generates the attribute value.
         * @param mapping The mapping details.
         */
        private void onAutoGenerate(DynamoDBMapperFieldModel<Object,Object> field) {
            AttributeValue value = field.convert(field.generate(field.get(object)));
            updateValues.put(field.name(),  new AttributeValueUpdate().withAction("PUT").withValue(value));
            inMemoryUpdates.add(new ValueUpdate(field, value, object));
        }

        /**
         * Auto-generates the key.
         */
        private void onAutoGenerateAssignableKey(DynamoDBMapperFieldModel<Object, Object> field) {
            // Generate the new key value first, then ensure it doesn't exist.
            onAutoGenerate(field);

            if (getLocalSaveBehavior() != SaveBehavior.CLOBBER
                && !internalExpectedValueAssertions.containsKey(field.name())
                && field.getGenerateStrategy() != DynamoDBAutoGenerateStrategy.ALWAYS) {
                // Add an expect clause to make sure that the item
                // doesn't already exist, since it's supposed to be new
                internalExpectedValueAssertions.put(field.name(),
                                                    new ExpectedAttributeValue().withExists(false));
            }
        }

        /**
         * Auto-generates the version.
         * @param mapping The mapping details.
         */
        private void onVersionAttribute(DynamoDBMapperFieldModel<Object,Object> field) {
            if ( getLocalSaveBehavior() != SaveBehavior.CLOBBER
                    && !internalExpectedValueAssertions.containsKey(field.name())) {
                // First establish the expected (current) value for the
                // update call
                // For new objects, insist that the value doesn't exist.
                // For existing ones, insist it has the old value.
                final Object current = field.get(object);
                if (current == null) {
                    internalExpectedValueAssertions.put(field.name(),
                        new ExpectedAttributeValue().withExists(false));
                } else {
                    internalExpectedValueAssertions.put(field.name(),
                        new ExpectedAttributeValue().withExists(true).withValue(field.convert(current)));
                }
            }

            // Generate the new version value
            onAutoGenerate(field);
        }

        /**
         * Converts the {@link AttributeValueUpdate} map given to an equivalent
         * {@link AttributeValue} map.
         */
        private Map<String, AttributeValue> convertToItem(Map<String, AttributeValueUpdate> putValues) {
            Map<String, AttributeValue> map = new HashMap<String, AttributeValue>();
            for ( Entry<String, AttributeValueUpdate> entry : putValues.entrySet() ) {
                String attributeName = entry.getKey();
                AttributeValue attributeValue = entry.getValue().getValue();
                String attributeAction = entry.getValue().getAction();

                /*
                 * AttributeValueUpdate allows nulls for its values, since they are
                 * semantically meaningful. AttributeValues never have null values.
                 */
                if ( attributeValue != null
                        && !AttributeAction.DELETE.toString().equals(attributeAction)) {
                    map.put(attributeName, attributeValue);
                }
            }
            return map;
        }

        private Map<String, AttributeValueUpdate> transformAttributeUpdates(
                final Class<?> clazz,
                final String tableName,
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
                toParameters(item, true, clazz, tableName, config);

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
                        .withB(entry.getValue().getB())
                        .withBS(entry.getValue().getBS())
                        .withN(entry.getValue().getN())
                        .withNS(entry.getValue().getNS())
                        .withS(entry.getValue().getS())
                        .withSS(entry.getValue().getSS())
                        .withM(entry.getValue().getM())
                        .withL(entry.getValue().getL())
                        .withNULL(entry.getValue().getNULL())
                        .withBOOL(entry.getValue().getBOOL());
                } else {
                    updateValues.put(entry.getKey(),
                                     new AttributeValueUpdate(entry.getValue(),
                                                              "PUT"));
                }
            }

            return updateValues;
        }
    }

    @Override
    public <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) object.getClass();
        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, config);

        String tableName = getTableName(clazz, object, config);

        Map<String, AttributeValue> key = model.convertKey(object);

        /*
         * If there is a version field, make sure we assert its value. If the
         * version field is null (only should happen in unusual circumstances),
         * pretend it doesn't have a version field after all.
         */
        Map<String, ExpectedAttributeValue> internalAssertions = new HashMap<String, ExpectedAttributeValue>();
        if ( config.getSaveBehavior() != SaveBehavior.CLOBBER && model.versioned() ) {
            for ( final DynamoDBMapperFieldModel<T,Object> field : model.versions() ) {
                final AttributeValue current = field.getAndConvert(object);
                if (current == null) {
                    internalAssertions.put(field.name(), new ExpectedAttributeValue(false));
                } else {
                    internalAssertions.put(field.name(), new ExpectedAttributeValue(true).withValue(current));
                }
                break;
            }
        }

        DeleteItemRequest req = new DeleteItemRequest().withKey(key)
                .withTableName(tableName).withExpected(internalAssertions)
                .withRequestMetricCollector(config.getRequestMetricCollector());

        if (deleteExpression != null) {
            String conditionalExpression = deleteExpression.getConditionExpression();

            if (conditionalExpression != null) {
                if (internalAssertions != null && !internalAssertions.isEmpty()) {
                    throw new SdkClientException(
                            "Condition Expressions cannot be used if a versioned attribute is present");
                }

                req = req
                        .withConditionExpression(conditionalExpression)
                        .withExpressionAttributeNames(
                                deleteExpression.getExpressionAttributeNames())
                        .withExpressionAttributeValues(
                                deleteExpression.getExpressionAttributeValues());
            }

            req = req.withExpected(
                    mergeExpectedAttributeValueConditions(internalAssertions,
                            deleteExpression.getExpected(),
                            deleteExpression.getConditionalOperator()))
                    .withConditionalOperator(
                            deleteExpression.getConditionalOperator());

        }
        db.deleteItem(applyUserAgent(req));
    }

    @Override
    public void transactionWrite(TransactionWriteRequest transactionWriteRequest, DynamoDBMapperConfig config) {
        if (transactionWriteRequest == null || isNullOrEmpty(transactionWriteRequest.getTransactionWriteOperations())) {
            throw new SdkClientException("Input request is null or empty");
        }

        final DynamoDBMapperConfig finalConfig = mergeConfig(config);

        List<TransactionWriteOperation> writeOperations = transactionWriteRequest.getTransactionWriteOperations();
        List<ValueUpdate> inMemoryUpdates = new LinkedList<ValueUpdate>();
        TransactWriteItemsRequest transactWriteItemsRequest = new TransactWriteItemsRequest();
        List<TransactWriteItem> transactWriteItems = new ArrayList<TransactWriteItem>();

        transactWriteItemsRequest.setClientRequestToken(transactionWriteRequest.getIdempotencyToken());

        for (TransactionWriteOperation writeOperation : writeOperations) {
            transactWriteItems.add(generateTransactWriteItem(writeOperation,
                                                             inMemoryUpdates,
                                                             finalConfig));

        }

        transactWriteItemsRequest.setTransactItems(transactWriteItems);

        db.transactWriteItems(applyTransactionOperationUserAgent(transactWriteItemsRequest));

        // Update the inMemory values for autogenerated attributeValues after successful completion of transaction
        for (ValueUpdate update : inMemoryUpdates) {
            update.apply();
        }
    }

    @Override
    public List<Object> transactionLoad(TransactionLoadRequest transactionLoadRequest, DynamoDBMapperConfig config) {

        if (transactionLoadRequest == null || isNullOrEmpty(transactionLoadRequest.getObjectsToLoad())) {
            return new ArrayList<Object>();
        }

        final DynamoDBMapperConfig finalConfig = mergeConfig(config);

        List<Object> objectsToLoad = transactionLoadRequest.getObjectsToLoad();
        List<DynamoDBTransactionLoadExpression> transactionLoadExpressions = transactionLoadRequest.getObjectLoadExpressions();
        List<TransactGetItem> transactGetItems = new ArrayList<TransactGetItem>();
        List<Class<?>> classList = new ArrayList<Class<?>>();
        List<String> tableNameList = new ArrayList<String>();
        for (int i = 0 ; i < objectsToLoad.size() ; i++) {
            Object objectToLoad = objectsToLoad.get(i);
            DynamoDBTransactionLoadExpression expressionForLoad = transactionLoadExpressions.get(i);
            Class<Object> clazz = (Class<Object>)objectToLoad.getClass();

            String tableName = getTableName(clazz, objectToLoad, finalConfig);
            tableNameList.add(tableName);
            classList.add(clazz);
            final DynamoDBMapperTableModel<Object> model = getTableModel(clazz, finalConfig);

            Map<String, AttributeValue> key = model.convertKey(objectToLoad);
            TransactGetItem transactGetItem = new TransactGetItem();
            Get getItem = new Get();
            getItem.setTableName(tableName);
            getItem.setKey(key);
            if (expressionForLoad != null) {
                getItem.setExpressionAttributeNames(expressionForLoad.getExpressionAttributeNames());
                getItem.setProjectionExpression(expressionForLoad.getProjectionExpression());
            }
            transactGetItem.setGet(getItem);
            transactGetItems.add(transactGetItem);
        }

        TransactGetItemsRequest transactGetItemsRequest = new TransactGetItemsRequest();
        transactGetItemsRequest.withTransactItems(transactGetItems);
        TransactGetItemsResult transactGetItemsResult = db.transactGetItems(applyTransactionOperationUserAgent(transactGetItemsRequest));
        List<ItemResponse> responseItems = transactGetItemsResult.getResponses();

        List<Object> resultObjects = new ArrayList<Object>();

        for (int i = 0 ; i < responseItems.size(); i++) {
            if (responseItems.get(i).getItem() == null) {
                resultObjects.add(null);
            } else {
                resultObjects.add(
                        privateMarshallIntoObject(
                                toParameters(responseItems.get(i).getItem(),
                                             classList.get(i),
                                             tableNameList.get(i),
                                             finalConfig)));
            }
        }

        return resultObjects;
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        List<FailedBatch> totalFailedBatches = new LinkedList<FailedBatch>();

        StringListMap<WriteRequest> requestItems = new StringListMap<WriteRequest>();

        List<ValueUpdate> inMemoryUpdates = new LinkedList<ValueUpdate>();
        for ( Object toWrite : objectsToWrite ) {
            Class<Object> clazz = (Class<Object>)toWrite.getClass();
            String tableName = getTableName(clazz, toWrite, config);

            Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();

            // Look at every getter and construct a value object for it
            final DynamoDBMapperTableModel<Object> model = getTableModel(clazz, config);
            for ( final DynamoDBMapperFieldModel<Object,Object> field : model.fields() ) {
                AttributeValue currentValue = null;
                if ( canGenerate(model, toWrite, config.getSaveBehavior(), field) && !field.versioned() ) {
                    currentValue = field.convert(field.generate(field.get(toWrite)));
                    inMemoryUpdates.add(new ValueUpdate(field, currentValue, toWrite));
                } else {
                    currentValue = field.convert(field.get(toWrite));
                }
                if ( currentValue != null ) {
                    attributeValues.put(field.name(), currentValue);
                }
            }

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            AttributeTransformer.Parameters<?> parameters =
                toParameters(attributeValues, clazz, tableName, config);

            requestItems.add(tableName, new WriteRequest(new PutRequest(transformAttributes(parameters))));
        }

        for ( Object toDelete : objectsToDelete ) {
            Class<Object> clazz = (Class<Object>)toDelete.getClass();

            String tableName = getTableName(clazz, toDelete, config);
            final DynamoDBMapperTableModel<Object> model = getTableModel(clazz, config);

            Map<String, AttributeValue> key = model.convertKey(toDelete);

            requestItems.add(tableName, new WriteRequest(new DeleteRequest(key)));
        }

        // Break into chunks of 25 items and make service requests to DynamoDB
        for (final StringListMap<WriteRequest> batch : requestItems.subMaps(MAX_ITEMS_PER_BATCH, true)) {
            List<FailedBatch> failedBatches = writeOneBatch(batch, config.getBatchWriteRetryStrategy());
            if (failedBatches != null) {
                totalFailedBatches.addAll(failedBatches);

                // If contains throttling exception, we do a backoff
                if (containsThrottlingException(failedBatches)) {
                    pause(config.getBatchWriteRetryStrategy().getDelayBeforeRetryUnprocessedItems(
                            Collections.unmodifiableMap(batch), 0));
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
    private List<FailedBatch> writeOneBatch(
            StringListMap<WriteRequest> batch,
            BatchWriteRetryStrategy batchWriteRetryStrategy) {

        List<FailedBatch> failedBatches = new LinkedList<FailedBatch>();
        FailedBatch failedBatch = doBatchWriteItemWithRetry(batch, batchWriteRetryStrategy);

        if (failedBatch != null) {
            // If the exception is request entity too large, we divide the batch
            // into smaller parts.

            if (failedBatch.isRequestEntityTooLarge()) {

                // If only one item left, the item size must beyond 64k, which
                // exceedes the limit.

                if (failedBatch.size() == 1) {
                    failedBatches.add(failedBatch);
                } else {
                    for (final StringListMap<WriteRequest> subBatch : batch.subMaps(2, false)) {
                        failedBatches.addAll(writeOneBatch(subBatch, batchWriteRetryStrategy));
                    }
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
            if (failedBatch.isThrottling()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Continue trying to process the batch and retry on UnproccessedItems as
     * according to the specified BatchWriteRetryStrategy
     */
    private FailedBatch doBatchWriteItemWithRetry(
            Map<String, List<WriteRequest>> batch,
            BatchWriteRetryStrategy batchWriteRetryStrategy) {

        BatchWriteItemResult result = null;
        int retries = 0;
        int maxRetries = batchWriteRetryStrategy
                .getMaxRetryOnUnprocessedItems(Collections
                        .unmodifiableMap(batch));

        FailedBatch failedBatch = null;
        Map<String, List<WriteRequest>> pendingItems = batch;

        while (true) {
            try {
                result = db.batchWriteItem(applyBatchOperationUserAgent(
                        new BatchWriteItemRequest().withRequestItems(pendingItems)));
            } catch (Exception e) {
                failedBatch = new FailedBatch();
                failedBatch.setUnprocessedItems(pendingItems);
                failedBatch.setException(e);
                return failedBatch;
            }
            pendingItems = result.getUnprocessedItems();

            if (pendingItems.size() > 0) {

                // return pendingItems as a FailedBatch if we have exceeded max retry
                if (maxRetries >= 0 && retries >= maxRetries) {
                    failedBatch = new FailedBatch();
                    failedBatch.setUnprocessedItems(pendingItems);
                    failedBatch.setException(null);
                    return failedBatch;
                }

                pause(batchWriteRetryStrategy.getDelayBeforeRetryUnprocessedItems(
                        Collections.unmodifiableMap(pendingItems), retries));
                retries++;
            } else {
                break;
            }
        }
        return failedBatch;
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        boolean consistentReads = (config.getConsistentReads() == ConsistentReads.CONSISTENT);

        if (itemsToGet == null) {
            return new HashMap<String, List<Object>>();
        }

        Map<String, KeysAndAttributes> requestItems = new HashMap<String, KeysAndAttributes>();
        Map<String, Class<?>> classesByTableName = new HashMap<String, Class<?>>();
        Map<String, List<Object>> resultSet = new HashMap<String, List<Object>>();
        int count = 0;

        for ( Object keyObject : itemsToGet ) {
            Class<Object> clazz = (Class<Object>)keyObject.getClass();
            final DynamoDBMapperTableModel model = getTableModel(clazz, config);

            String tableName = getTableName(clazz, keyObject, config);
            classesByTableName.put(tableName, clazz);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(
                        tableName,
                        new KeysAndAttributes().withConsistentRead(consistentReads).withKeys(
                                new LinkedList<Map<String, AttributeValue>>()));
            }

            requestItems.get(tableName).getKeys().add(model.convertKey(keyObject));

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

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        List<Object> keys = new ArrayList<Object>();
        if ( itemsToGet != null ) {
            for ( Class<?> clazz : itemsToGet.keySet() ) {
                if ( itemsToGet.get(clazz) != null ) {
                    final DynamoDBMapperTableModel model = getTableModel(clazz, config);
                    for ( KeyPair keyPair : itemsToGet.get(clazz) ) {
                        keys.add(model.createKey(keyPair.getHashKey(), keyPair.getRangeKey()));
                    }
                }
            }
        }
        return batchLoad(keys, config);
    }

    /**
     * @param config never null
     */
    private void processBatchGetRequest(
            final Map<String, Class<?>> classesByTableName,
            final Map<String, KeysAndAttributes> requestItems,
            final Map<String, List<Object>> resultSet,
            final DynamoDBMapperConfig config) {

        BatchGetItemResult batchGetItemResult = null;
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest()
            .withRequestMetricCollector(config.getRequestMetricCollector());
        batchGetItemRequest.setRequestItems(requestItems);

        BatchLoadRetryStrategy batchLoadStrategy = config.getBatchLoadRetryStrategy();

        BatchLoadContext batchLoadContext = new BatchLoadContext(batchGetItemRequest);

        int retries = 0;

        do {
            if ( batchGetItemResult != null ) {
                retries++;
                batchLoadContext.setRetriesAttempted(retries);
                if (!isNullOrEmpty(batchGetItemResult.getUnprocessedKeys())) {
                    pause(batchLoadStrategy.getDelayBeforeNextRetry(batchLoadContext));
                    batchGetItemRequest.setRequestItems(
                        batchGetItemResult.getUnprocessedKeys());
                }
            }

            batchGetItemResult = db.batchGetItem(
                    applyBatchOperationUserAgent(batchGetItemRequest));

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
                        toParameters(item, clazz, tableName, config);
                    objects.add(privateMarshallIntoObject(parameters));
                }

                resultSet.put(tableName, objects);
            }

            batchLoadContext.setBatchGetItemResult(batchGetItemResult);

            // the number of unprocessed keys and  Batch Load Strategy will drive the number of retries
        } while ( batchLoadStrategy.shouldRetry(batchLoadContext) );

        if (!isNullOrEmpty(batchGetItemResult.getUnprocessedKeys())) {
            throw new BatchGetItemException(
                    "The BatchGetItemResult has unprocessed keys after max retry attempts. Catch the BatchGetItemException to get the list of unprocessed keys.",
                    batchGetItemResult.getUnprocessedKeys(), resultSet);
        }
    }

    private static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    private static <T> boolean isNullOrEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Determnes if any of the primary keys require auto-generation.
     */
    private static <T> boolean anyKeyGeneratable(
        final DynamoDBMapperTableModel<T> model,
        final T object,
        final SaveBehavior saveBehavior
    ) {
        for (final DynamoDBMapperFieldModel<T, Object> field : model.keys()) {
            if (canGenerate(model, object, saveBehavior, field)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if the mapping value can be auto-generated.
     */
    private static <T> boolean canGenerate(
        final DynamoDBMapperTableModel<T> model,
        final T object,
        final SaveBehavior saveBehavior,
        final DynamoDBMapperFieldModel<T,Object> field
    ) {
        if (field.getGenerateStrategy() == null) {
            return false;
        } else if (field.getGenerateStrategy() == DynamoDBAutoGenerateStrategy.ALWAYS) {
            return true;
        } else if (field.get(object) != null) {
            return false;
        } else if (field.keyType() != null || field.indexed()) {
            return true;
        } else if (saveBehavior == SaveBehavior.CLOBBER
                   || saveBehavior == SaveBehavior.UPDATE
                   || saveBehavior == SaveBehavior.PUT) {
            return true;
        } else if (anyKeyGeneratable(model, object, saveBehavior)) {
            return true;
        }
        return false;
    }

    private final class ValueUpdate {
        private final DynamoDBMapperFieldModel<Object,Object> field;
        private final AttributeValue newValue;
        private final Object target;

        public ValueUpdate(
                DynamoDBMapperFieldModel<Object,Object> field,
                AttributeValue newValue,
                Object target) {

            this.field = field;
            this.newValue = newValue;
            this.target = target;
        }

        public void apply() {
            field.set(target, field.unconvert(newValue));
        }
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz,
                                         DynamoDBScanExpression scanExpression,
                                         DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        return new PaginatedScanList<T>(this, clazz, db, scanRequest, scanResult, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments,
                                                         DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        // Create hard copies of the original scan request with difference segment number.
        List<ScanRequest> parallelScanRequests = createParallelScanRequestsFromExpression(clazz, scanExpression, totalSegments, config);
        ParallelScanTask parallelScanTask = new ParallelScanTask(db, parallelScanRequests);

        return new PaginatedParallelScanList<T>(this, clazz, db, parallelScanTask, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz,
                                          DynamoDBScanExpression scanExpression,
                                          DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        ScanResultPage<T> result = new ScanResultPage<T>();
        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(scanResult.getItems(), clazz, scanRequest.getTableName(), config);

        result.setResults(marshallIntoObjects(parameters));
        result.setLastEvaluatedKey(scanResult.getLastEvaluatedKey());
        result.setCount(scanResult.getCount());
        result.setScannedCount(scanResult.getScannedCount());
        result.setConsumedCapacity(scanResult.getConsumedCapacity());

        return result;
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz,
                                           DynamoDBQueryExpression<T> queryExpression,
                                           DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        return new PaginatedQueryList<T>(this, clazz, db, queryRequest, queryResult, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz,
                                            DynamoDBQueryExpression<T> queryExpression,
                                            DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        QueryResultPage<T> result = new QueryResultPage<T>();

        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(queryResult.getItems(), clazz, queryRequest.getTableName(), config);

        result.setResults(marshallIntoObjects(parameters));
        result.setLastEvaluatedKey(queryResult.getLastEvaluatedKey());
        result.setCount(queryResult.getCount());
        result.setScannedCount(queryResult.getScannedCount());
        result.setConsumedCapacity(queryResult.getConsumedCapacity());

        return result;
    }

    @Override
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

    @Override
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
     * @param config never null
     */
    private ScanRequest createScanRequestFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        ScanRequest scanRequest = new ScanRequest();

        scanRequest.setTableName(getTableName(clazz, config));
        scanRequest.setIndexName(scanExpression.getIndexName());
        scanRequest.setScanFilter(scanExpression.getScanFilter());
        scanRequest.setLimit(scanExpression.getLimit());
        scanRequest.setExclusiveStartKey(scanExpression.getExclusiveStartKey());
        scanRequest.setTotalSegments(scanExpression.getTotalSegments());
        scanRequest.setSegment(scanExpression.getSegment());
        scanRequest.setConditionalOperator(scanExpression.getConditionalOperator());
        scanRequest.setFilterExpression(scanExpression.getFilterExpression());
        scanRequest.setExpressionAttributeNames(scanExpression
                .getExpressionAttributeNames());
        scanRequest.setExpressionAttributeValues(scanExpression
                .getExpressionAttributeValues());
        scanRequest.setRequestMetricCollector(config.getRequestMetricCollector());
        scanRequest.setSelect(scanExpression.getSelect());
        scanRequest.setProjectionExpression(scanExpression.getProjectionExpression());
        scanRequest.setReturnConsumedCapacity(scanExpression.getReturnConsumedCapacity());
        scanRequest.setConsistentRead(scanExpression.isConsistentRead());

        return applyUserAgent(scanRequest);
    }

    /**
     * @param config never null
     */
    private List<ScanRequest> createParallelScanRequestsFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, int totalSegments, DynamoDBMapperConfig config) {
        if (totalSegments < 1) {
            throw new IllegalArgumentException("Parallel scan should have at least one scan segment.");
        }
        if (scanExpression.getExclusiveStartKey() != null) {
            log.info("The ExclusiveStartKey parameter specified in the DynamoDBScanExpression is ignored,"
                    + " since the individual parallel scan request on each segment is applied on a separate key scope.");
        }
        if (scanExpression.getSegment() != null || scanExpression.getTotalSegments() != null) {
            log.info("The Segment and TotalSegments parameters specified in the DynamoDBScanExpression are ignored.");
        }

        List<ScanRequest> parallelScanRequests= new LinkedList<ScanRequest>();
        for (int segment = 0; segment < totalSegments; segment++) {
            ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);
            parallelScanRequests.add(scanRequest
                    .withSegment(segment).withTotalSegments(totalSegments)
                    .withExclusiveStartKey(null));
        }
        return parallelScanRequests;
    }

    protected <T> QueryRequest createQueryRequestFromExpression(Class<T> clazz,
            DynamoDBQueryExpression<T> xpress, DynamoDBMapperConfig config) {

        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, config);

        QueryRequest req = new QueryRequest();
        req.setConsistentRead(xpress.isConsistentRead());
        req.setTableName(getTableName(clazz, xpress.getHashKeyValues(), config));
        req.setIndexName(xpress.getIndexName());

        req.setKeyConditionExpression(xpress.getKeyConditionExpression());
        processKeyConditions(req, xpress, model);

        req.withScanIndexForward(xpress.isScanIndexForward())
           .withLimit(xpress.getLimit())
           .withExclusiveStartKey(xpress.getExclusiveStartKey())
           .withQueryFilter(xpress.getQueryFilter())
           .withConditionalOperator(xpress.getConditionalOperator())
           .withSelect(xpress.getSelect())
           .withProjectionExpression(xpress.getProjectionExpression())
           .withFilterExpression(xpress.getFilterExpression())
           .withExpressionAttributeNames(xpress.getExpressionAttributeNames())
           .withExpressionAttributeValues(xpress.getExpressionAttributeValues())
           .withReturnConsumedCapacity(xpress.getReturnConsumedCapacity())
           .withRequestMetricCollector(config.getRequestMetricCollector())
           ;
        return applyUserAgent(req);
    }

    /**
     * Utility method for checking the validity of both hash and range key
     * conditions. It also tries to infer the correct index name from the POJO
     * annotation, if such information is not directly specified by the user.
     *
     * @param clazz
     *            The domain class of the queried items.
     * @param queryRequest
     *            The QueryRequest object to be sent to service.
     * @param hashKeyConditions
     *            All the hash key EQ conditions extracted from the POJO object.
     *            The mapper will choose one of them that could be applied together with
     *            the user-specified (if any) index name and range key conditions. Or it
     *            throws error if more than one conditions are applicable for the query.
     * @param rangeKeyConditions
     *            The range conditions specified by the user. We currently only
     *            allow at most one range key condition.
     */
    private static <T> void processKeyConditions(
        final QueryRequest queryRequest,
        final DynamoDBQueryExpression<T> expression,
        final DynamoDBMapperTableModel<T> model
    ) {
        // Hash key (primary or index) condition
        final Map<String,Condition> hashKeyConditions = new LinkedHashMap<String,Condition>();
        if (expression.getHashKeyValues() != null) {
            for (final DynamoDBMapperFieldModel<T,Object> field : model.fields()) {
                if (field.keyType() == HASH || !field.globalSecondaryIndexNames(HASH).isEmpty()) {
                    final Object value = field.get(expression.getHashKeyValues());
                    if (value != null) {
                        hashKeyConditions.put(field.name(), field.eq(value));
                    }
                }
            }
        }

        // Range key (primary or index) conditions
        final Map<String, Condition> rangeKeyConditions = expression.getRangeKeyConditions();

        // There should be least one hash key condition.
        final String keyCondExpression = queryRequest.getKeyConditionExpression();
        if (keyCondExpression == null) {
            if (isNullOrEmpty(hashKeyConditions)) {
                throw new IllegalArgumentException(
                    "Illegal query expression: No hash key condition is found in the query");
            }
        } else {
            if (!isNullOrEmpty(hashKeyConditions)) {
                throw new IllegalArgumentException(
                    "Illegal query expression: Either the hash key conditions or the key condition expression must be specified but not both.");
            }
            if (!isNullOrEmpty(rangeKeyConditions)) {
                throw new IllegalArgumentException(
                    "Illegal query expression: The range key conditions can only be specified when the key condition expression is not specified.");
            }
            // key condition expression is in use
            return;
        }
        // We don't allow multiple range key conditions.
        if (rangeKeyConditions != null && rangeKeyConditions.size() > 1) {
            throw new IllegalArgumentException(
                    "Illegal query expression: Conditions on multiple range keys ("
                    + rangeKeyConditions.keySet().toString()
                    + ") are found in the query. DynamoDB service only accepts up to ONE range key condition.");
        }
        final boolean hasRangeKeyCondition = (rangeKeyConditions != null)
                                            && (!rangeKeyConditions.isEmpty());
        final String userProvidedIndexName = queryRequest.getIndexName();
        final String primaryHashKeyName = model.hashKey().name();

        // First collect the names of all the global/local secondary indexes that could be applied to this query.
        // If the user explicitly specified an index name, we also need to
        //   1) check the index is applicable for both hash and range key conditions
        //   2) choose one hash key condition if there are more than one of them
        boolean hasPrimaryHashKeyCondition = false;
        final Map<String, Set<String>> annotatedGSIsOnHashKeys = new HashMap<String, Set<String>>();
        String hashKeyNameForThisQuery = null;

        boolean hasPrimaryRangeKeyCondition = false;
        final Set<String> annotatedLSIsOnRangeKey = new HashSet<String>();
        final Set<String> annotatedGSIsOnRangeKey = new HashSet<String>();

        // Range key condition
        String rangeKeyNameForThisQuery = null;
        if (hasRangeKeyCondition) {
            for (String rangeKeyName : rangeKeyConditions.keySet()) {
                rangeKeyNameForThisQuery = rangeKeyName;

                final DynamoDBMapperFieldModel<T,Object> rk = model.field(rangeKeyName);

                if (rk.keyType() == RANGE) {
                    hasPrimaryRangeKeyCondition = true;
                }

                annotatedLSIsOnRangeKey.addAll(rk.localSecondaryIndexNames());
                annotatedGSIsOnRangeKey.addAll(rk.globalSecondaryIndexNames(RANGE));
            }

            if ( !hasPrimaryRangeKeyCondition
                 && annotatedLSIsOnRangeKey.isEmpty()
                 && annotatedGSIsOnRangeKey.isEmpty()) {
                throw new DynamoDBMappingException(
                        "The query contains a condition on a range key (" +
                        rangeKeyNameForThisQuery + ") " +
                        "that is not annotated with either @DynamoDBRangeKey or @DynamoDBIndexRangeKey.");
            }
        }

        final boolean userProvidedLSIWithRangeKeyCondition = (userProvidedIndexName != null)
                                        && (annotatedLSIsOnRangeKey.contains(userProvidedIndexName));
        final boolean hashOnlyLSIQuery = (userProvidedIndexName != null)
                                        && ( !hasRangeKeyCondition )
                                        && model.localSecondaryIndex(userProvidedIndexName) != null;
        final boolean userProvidedLSI = userProvidedLSIWithRangeKeyCondition || hashOnlyLSIQuery;

        final boolean userProvidedGSIWithRangeKeyCondition = (userProvidedIndexName != null)
                                        && (annotatedGSIsOnRangeKey.contains(userProvidedIndexName));
        final boolean hashOnlyGSIQuery = (userProvidedIndexName != null)
                                        && ( !hasRangeKeyCondition )
                                        && model.globalSecondaryIndex(userProvidedIndexName) != null;
        final boolean userProvidedGSI = userProvidedGSIWithRangeKeyCondition || hashOnlyGSIQuery;

        if (userProvidedLSI && userProvidedGSI ) {
            throw new DynamoDBMappingException(
                    "Invalid query: " +
                    "Index \"" + userProvidedIndexName + "\" " +
                    "is annotateded as both a LSI and a GSI for attribute.");
        }

        // Hash key conditions
        for (String hashKeyName : hashKeyConditions.keySet()) {
            if (hashKeyName.equals(primaryHashKeyName)) {
                hasPrimaryHashKeyCondition = true;
            }

            final DynamoDBMapperFieldModel<T,Object> hk = model.field(hashKeyName);

            Collection<String> annotatedGSINames = hk.globalSecondaryIndexNames(HASH);
            annotatedGSIsOnHashKeys.put(hashKeyName,
                    annotatedGSINames == null ? new HashSet<String>() : new HashSet<String>(annotatedGSINames));

            // Additional validation if the user provided an index name.
            if (userProvidedIndexName != null) {
                boolean foundHashKeyConditionValidWithUserProvidedIndex = false;
                if (userProvidedLSI && hashKeyName.equals(primaryHashKeyName)) {
                    // found an applicable hash key condition (primary hash + LSI range)
                    foundHashKeyConditionValidWithUserProvidedIndex = true;
                } else if (userProvidedGSI &&
                        annotatedGSINames != null && annotatedGSINames.contains(userProvidedIndexName)) {
                    // found an applicable hash key condition (GSI hash + range)
                    foundHashKeyConditionValidWithUserProvidedIndex = true;
                }
                if (foundHashKeyConditionValidWithUserProvidedIndex) {
                    if ( hashKeyNameForThisQuery != null ) {
                        throw new IllegalArgumentException(
                                "Ambiguous query expression: More than one hash key EQ conditions (" +
                                hashKeyNameForThisQuery + ", " + hashKeyName +
                                ") are applicable to the specified index ("
                                + userProvidedIndexName + "). " +
                                "Please provide only one of them in the query expression.");
                    } else {
                        // found an applicable hash key condition
                        hashKeyNameForThisQuery = hashKeyName;
                    }
                }
            }
        }

        // Collate all the key conditions
        Map<String, Condition> keyConditions = new HashMap<String, Condition>();

        // With user-provided index name
        if (userProvidedIndexName != null) {
            if (hasRangeKeyCondition
                    && ( !userProvidedLSI )
                    && ( !userProvidedGSI )) {
                throw new IllegalArgumentException(
                        "Illegal query expression: No range key condition is applicable to the specified index ("
                        + userProvidedIndexName + "). ");
            }
            if (hashKeyNameForThisQuery == null) {
                throw new IllegalArgumentException(
                        "Illegal query expression: No hash key condition is applicable to the specified index ("
                        + userProvidedIndexName + "). ");
            }

            keyConditions.put(hashKeyNameForThisQuery, hashKeyConditions.get(hashKeyNameForThisQuery));
            if (hasRangeKeyCondition) {
                keyConditions.putAll(rangeKeyConditions);
            }
        }
        // Infer the index name by finding the index shared by both hash and range key annotations.
        else {
            if (hasRangeKeyCondition) {
                String inferredIndexName = null;
                hashKeyNameForThisQuery = null;
                if (hasPrimaryHashKeyCondition && hasPrimaryRangeKeyCondition) {
                    // Found valid query: primary hash + range key conditions
                    hashKeyNameForThisQuery = primaryHashKeyName;
                } else {
                    // Intersect the set of all the indexes applicable to the range key
                    // with the set of indexes applicable to each hash key condition.
                    for (String hashKeyName : annotatedGSIsOnHashKeys.keySet()) {
                        boolean foundValidQueryExpressionWithInferredIndex = false;
                        String indexNameInferredByThisHashKey = null;
                        if (hashKeyName.equals(primaryHashKeyName)) {
                            if (annotatedLSIsOnRangeKey.size() == 1) {
                                // Found valid query (Primary hash + LSI range conditions)
                                foundValidQueryExpressionWithInferredIndex = true;
                                indexNameInferredByThisHashKey = annotatedLSIsOnRangeKey.iterator().next();
                            }
                        }

                        Set<String> annotatedGSIsOnHashKey = annotatedGSIsOnHashKeys.get(hashKeyName);
                        // We don't need the data in annotatedGSIsOnHashKeys afterwards,
                        // so it's safe to do the intersection in-place.
                        annotatedGSIsOnHashKey.retainAll(annotatedGSIsOnRangeKey);
                        if (annotatedGSIsOnHashKey.size() == 1) {
                            // Found valid query (Hash + range conditions on a GSI)
                            if (foundValidQueryExpressionWithInferredIndex) {
                                hashKeyNameForThisQuery = hashKeyName;
                                inferredIndexName = indexNameInferredByThisHashKey;
                            }

                            foundValidQueryExpressionWithInferredIndex = true;
                            indexNameInferredByThisHashKey = annotatedGSIsOnHashKey.iterator().next();
                        }

                        if (foundValidQueryExpressionWithInferredIndex) {
                            if (hashKeyNameForThisQuery != null) {
                                throw new IllegalArgumentException(
                                        "Ambiguous query expression: Found multiple valid queries: " +
                                        "(Hash: \"" + hashKeyNameForThisQuery + "\", Range: \"" + rangeKeyNameForThisQuery + "\", Index: \"" + inferredIndexName + "\") and " +
                                        "(Hash: \"" + hashKeyName + "\", Range: \"" + rangeKeyNameForThisQuery + "\", Index: \"" + indexNameInferredByThisHashKey + "\").");
                            } else {
                                hashKeyNameForThisQuery = hashKeyName;
                                inferredIndexName = indexNameInferredByThisHashKey;
                            }
                        }
                    }
                }

                if (hashKeyNameForThisQuery != null) {
                    keyConditions.put(hashKeyNameForThisQuery, hashKeyConditions.get(hashKeyNameForThisQuery));
                    keyConditions.putAll(rangeKeyConditions);
                    queryRequest.setIndexName(inferredIndexName);
                } else {
                    throw new IllegalArgumentException(
                            "Illegal query expression: Cannot infer the index name from the query expression.");
                }

            } else {
                // No range key condition is specified.
                if (hashKeyConditions.size() > 1) {
                    if ( hasPrimaryHashKeyCondition ) {
                        keyConditions.put(primaryHashKeyName, hashKeyConditions.get(primaryHashKeyName));
                    } else {
                        throw new IllegalArgumentException(
                                "Ambiguous query expression: More than one index hash key EQ conditions (" +
                                hashKeyConditions.keySet() +
                                ") are applicable to the query. " +
                                "Please provide only one of them in the query expression, or specify the appropriate index name.");
                    }

                } else {
                    // Only one hash key condition
                    String hashKeyName = annotatedGSIsOnHashKeys.keySet().iterator().next();
                    if ( !hasPrimaryHashKeyCondition ) {
                        if (annotatedGSIsOnHashKeys.get(hashKeyName).size() == 1) {
                            // Set the index if the index hash key is only annotated with one GSI.
                            queryRequest.setIndexName(annotatedGSIsOnHashKeys.get(hashKeyName).iterator().next());
                        } else if (annotatedGSIsOnHashKeys.get(hashKeyName).size() > 1) {
                            throw new IllegalArgumentException(
                                    "Ambiguous query expression: More than one GSIs (" +
                                    annotatedGSIsOnHashKeys.get(hashKeyName) +
                                    ") are applicable to the query. " +
                                    "Please specify one of them in your query expression.");
                        } else {
                            throw new IllegalArgumentException(
                                    "Illegal query expression: No GSI is found in the @DynamoDBIndexHashKey annotation for attribute " +
                                    "\"" + hashKeyName + "\".");
                        }
                    }
                    keyConditions.putAll(hashKeyConditions);
                }

            }
        }

        queryRequest.setKeyConditions(keyConditions);
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig) {

        return toParameters(attributeValues, false, modelClass, tableName, mapperConfig);
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final boolean partialUpdate,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig) {

        return new TransformerParameters<T>(
                getTableModel(modelClass, mapperConfig),
                attributeValues,
                partialUpdate,
                modelClass,
                mapperConfig,
                tableName);
    }

    final <T> List<AttributeTransformer.Parameters<T>> toParameters(
            final List<Map<String, AttributeValue>> attributeValues,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig
    ) {
        if(attributeValues == null) {
            return Collections.emptyList();
        }

        List<AttributeTransformer.Parameters<T>> rval = new ArrayList<AttributeTransformer.Parameters<T>>(attributeValues.size());

        for (Map<String, AttributeValue> item : attributeValues) {
            rval.add(toParameters(item, modelClass, tableName, mapperConfig));
        }

        return rval;
    }

    /**
     * The one true implementation of AttributeTransformer.Parameters.
     */
    private static class TransformerParameters<T>
            implements AttributeTransformer.Parameters<T> {

        private final DynamoDBMapperTableModel<T> model;
        private final Map<String, AttributeValue> attributeValues;
        private final boolean partialUpdate;
        private final Class<T> modelClass;
        private final DynamoDBMapperConfig mapperConfig;
        private final String tableName;

        public TransformerParameters(
                final DynamoDBMapperTableModel<T> model,
                final Map<String, AttributeValue> attributeValues,
                final boolean partialUpdate,
                final Class<T> modelClass,
                final DynamoDBMapperConfig mapperConfig,
                final String tableName) {

            this.model = model;
            this.attributeValues =
                Collections.unmodifiableMap(attributeValues);
            this.partialUpdate = partialUpdate;
            this.modelClass = modelClass;
            this.mapperConfig = mapperConfig;
            this.tableName = tableName;
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
            return tableName;
        }

        @Override
        public String getHashKeyName() {
            return model.hashKey().name();
        }

        @Override
        public String getRangeKeyName() {
            return model.rangeKeyIfExists() == null ? null : model.rangeKey().name();
        }
    }

    private Map<String, AttributeValue> untransformAttributes(
            final AttributeTransformer.Parameters<?> parameters
    ) {
        if (transformer != null) {
            return transformer.untransform(parameters);
        } else {
            return parameters.getAttributeValues();
        }
    }

    private Map<String, AttributeValue> transformAttributes(
            final AttributeTransformer.Parameters<?> parameters) {

        if (transformer != null) {
            return transformer.transform(parameters);
        } else {
            return parameters.getAttributeValues();
        }
    }

    /**
     * Returns a new map object that merges the two sets of expected value
     * conditions (user-specified or imposed by the internal implementation of
     * DynamoDBMapper). Internal assertion on an attribute will be overridden by
     * any user-specified condition on the same attribute.
     * <p>
     * Exception is thrown if the two sets of conditions cannot be combined
     * together.
     */
    private static Map<String, ExpectedAttributeValue> mergeExpectedAttributeValueConditions(
            Map<String, ExpectedAttributeValue> internalAssertions,
            Map<String, ExpectedAttributeValue> userProvidedConditions,
            String userProvidedConditionOperator) {
        // If any of the condition map is null, simply return a copy of the other one.
        if ((internalAssertions == null || internalAssertions.isEmpty())
                && (userProvidedConditions == null || userProvidedConditions.isEmpty())) {
            return null;
        } else if (internalAssertions == null) {
            return new HashMap<String, ExpectedAttributeValue>(userProvidedConditions);
        } else if (userProvidedConditions == null) {
            return new HashMap<String, ExpectedAttributeValue>(internalAssertions);
        }

        // Start from a copy of the internal conditions
        Map<String, ExpectedAttributeValue> mergedExpectedValues =
                new HashMap<String, ExpectedAttributeValue>(internalAssertions);

        // Remove internal conditions that are going to be overlaid by user-provided ones.
        for (String attrName : userProvidedConditions.keySet()) {
            mergedExpectedValues.remove(attrName);
        }

        // All the generated internal conditions must be joined by AND.
        // Throw an exception if the user specifies an OR operator, and that the
        // internal conditions are not totally overlaid by the user-provided
        // ones.
        if ( ConditionalOperator.OR.toString().equals(userProvidedConditionOperator)
                && !mergedExpectedValues.isEmpty() ) {
            throw new IllegalArgumentException("Unable to assert the value of the fields "
                    + mergedExpectedValues.keySet() + ", since the expected value conditions cannot be combined "
                    + "with user-specified conditions joined by \"OR\". You can use SaveBehavior.CLOBBER to "
                    + "skip the assertion on these fields.");
        }

        mergedExpectedValues.putAll(userProvidedConditions);

        return mergedExpectedValues;
    }

    static <X extends AmazonWebServiceRequest> X applyUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }

    static <X extends AmazonWebServiceRequest> X applyBatchOperationUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT_BATCH_OPERATION);
        return request;
    }

    static <X extends AmazonWebServiceRequest> X applyTransactionOperationUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT_TRANSACTION_OPERATION);
        return request;
    }

    @Override
    public S3ClientCache getS3ClientCache() {
        return s3Links.getS3ClientCache();
    }

    @Override
    public S3Link createS3Link(Region s3region, String bucketName, String key) {
        return s3Links.createS3Link(s3region, bucketName, key);
    }

    @Override
    public S3Link createS3Link(String s3region, String bucketName, String key) {
        return s3Links.createS3Link(s3region, bucketName, key);
    }

    @Override
    public <T> CreateTableRequest generateCreateTableRequest(Class<T> clazz, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        final DynamoDBMapperTableModel<T> model = getTableModel(clazz, config);

        final CreateTableRequest request = new CreateTableRequest();
        request.setTableName(getTableName(clazz, config));
        request.withKeySchema(new KeySchemaElement(model.hashKey().name(), HASH));
        if (model.rangeKeyIfExists() != null) {
            request.withKeySchema(new KeySchemaElement(model.rangeKey().name(), RANGE));
        }
        request.setGlobalSecondaryIndexes(model.globalSecondaryIndexes());
        request.setLocalSecondaryIndexes(model.localSecondaryIndexes());
        for (final DynamoDBMapperFieldModel<T,Object> field : model.fields()) {
            if (field.keyType() != null || field.indexed()) {
                request.withAttributeDefinitions(new AttributeDefinition()
                    .withAttributeType(ScalarAttributeType.valueOf(field.attributeType().name()))
                    .withAttributeName(field.name())
                );
            }
        }
        return request;
    }

    @Override
    public <T> DeleteTableRequest generateDeleteTableRequest(Class<T> clazz, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        DeleteTableRequest deleteTableRequest = new DeleteTableRequest();
        deleteTableRequest.setTableName(getTableName(clazz, config));
        return deleteTableRequest;
    }

    /**
     * Creates a new table mapper using this mapper to perform operations.
     * @param <T> The object type which this mapper operates.
     * @param <H> The hash key value type.
     * @param <R> The range key value type; use <code>?</code> if no range key.
     * @param clazz The object class.
     * @return The table mapper.
     */
    public <T,H,R> DynamoDBTableMapper<T,H,R> newTableMapper(Class<T> clazz) {
        DynamoDBMapperConfig config = mergeConfig(null);
        return new DynamoDBTableMapper<T,H,R>(this.db, this, config, getTableModel(clazz, config));
    }

    /**
     * The return type of batchWrite, batchDelete and batchSave.
     *
     * It contains the information about the unprocessed items and the
     * exception causing the failure.
     */
    public static class FailedBatch {
        private Map<String, List<WriteRequest>> unprocessedItems;
        private Exception exception;

        public void setUnprocessedItems(Map<String, List<WriteRequest>> unprocessedItems) {
            this.unprocessedItems = unprocessedItems;
        }

        public Map<String, List<WriteRequest>> getUnprocessedItems() {
            return unprocessedItems;
        }

        public void setException(Exception exception) {
            this.exception = exception;
        }

        public Exception getException() {
            return exception;
        }

        private final boolean isRequestEntityTooLarge() {
            return exception instanceof AmazonServiceException &&
                RetryUtils.isRequestEntityTooLargeException((AmazonServiceException)exception);
        }

        private final boolean isThrottling() {
            return exception instanceof AmazonServiceException &&
                RetryUtils.isThrottlingException((AmazonServiceException)exception);
        }

        private final int size() {
            int size = 0;
            for (final List<WriteRequest> values : unprocessedItems.values()) {
                size += values.size();
            }
            return size;
        }
    }

    /**
     * Used for batch operations where request data is grouped by table name.
     */
    static final class StringListMap<T> extends LinkedHashMap<String,List<T>> {
        private static final long serialVersionUID = -1L;

        public List<T> getPutIfNotExists(final String key) {
            List<T> list = get(key);
            if (list == null) {
                put(key, (list = new LinkedList<T>()));
            }
            return list;
        }

        public boolean add(final String key, final T value) {
            return getPutIfNotExists(key).add(value);
        }

        public List<StringListMap<T>> subMaps(final int size, boolean perMap) {
            final LinkedList<StringListMap<T>> maps = new LinkedList<StringListMap<T>>();
            int index = 0, count = 0;
            for (final Entry<String,List<T>> entry : entrySet()) {
                for (final T value : entry.getValue()) {
                    if (index == maps.size()) {
                        maps.add(new StringListMap<T>());
                    }
                    maps.get(index).add(entry.getKey(), value);
                    index = perMap ? (++count / size) : (++index % size);
                }
            }
            return maps;
        }
    }

    /**
     * Batch pause.
     */
    private static void pause(long delay) {
        if (delay <= 0) {
            return;
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new SdkClientException(e.getMessage(), e);
        }
    }

    public static final class BatchGetItemException extends SdkClientException {
        private final Map<String, KeysAndAttributes> unprocessedKeys;
        private final Map<String, List<Object>> responses;

        public BatchGetItemException(String message, Map<String, KeysAndAttributes> unprocessedKeys, Map<String, List<Object>> responses) {
            super(message);
            this.unprocessedKeys = unprocessedKeys;
            this.responses = responses;
        }

        /**
         * Returns a map of tables and their respective keys that were not processed during the operation..
         */
        public Map<String, KeysAndAttributes> getUnprocessedKeys() {
            return unprocessedKeys;
        }

        /**
         * Returns a map of the loaded objects. Each key in the map is the name of a DynamoDB table.
         * Each value in the map is a list of objects that have been loaded from that table. All
         * objects for each table can be cast to the associated user defined type that is
         * annotated as mapping that table.
         */
        public Map<String, List<Object>> getResponses() {
            return responses;
        }
    }

    private TransactWriteItem generateTransactWriteItem(TransactionWriteOperation transactionWriteOperation,
                                                        List<ValueUpdate> inMemoryUpdates,
                                                        DynamoDBMapperConfig config) {
        Object objectToWrite = transactionWriteOperation.getObject();
        DynamoDBTransactionWriteExpression writeExpression = transactionWriteOperation.getDynamoDBTransactionWriteExpression();
        ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure = transactionWriteOperation.getReturnValuesOnConditionCheckFailure();
        TransactionWriteOperationType operationType = transactionWriteOperation.getTransactionWriteOperationType();
        Class<Object> clazz = (Class<Object>)objectToWrite.getClass();
        String tableName = getTableName(clazz, objectToWrite, config);
        Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();

        final DynamoDBMapperTableModel<Object> model = getTableModel(clazz, config);
        for (final DynamoDBMapperFieldModel<Object,Object> field : model.fields()) {
            AttributeValue currentValue = null;
            if (field.versioned()) {
                throw new SdkClientException("Versioned attributes are not supported on TransactionWrite API");
            } else if (canGenerate(model, objectToWrite, SaveBehavior.CLOBBER, field)) {
                currentValue = field.convert(field.generate(field.get(objectToWrite)));
                inMemoryUpdates.add(new ValueUpdate(field, currentValue, objectToWrite));
            } else {
                currentValue = field.convert(field.get(objectToWrite));
            }
            if (currentValue == null && field.keyType() != null) {
                throw new DynamoDBMappingException(clazz.getSimpleName() + "[" + field.name() + "]; null or empty value for primary key");
            } else if (currentValue != null) {
                attributeValues.put(field.name(), currentValue);
            }
        }
        AttributeTransformer.Parameters<?> parameters =
                toParameters(attributeValues, clazz, tableName, config);
        Map<String, AttributeValue> attributeValueMap = transformAttributes(parameters);

        TransactWriteItem transactWriteItem = new TransactWriteItem();

        switch (operationType) {
            case Put:
                transactWriteItem.setPut(generatePut(tableName, attributeValueMap, returnValuesOnConditionCheckFailure, writeExpression));
                break;
            case Update:
                transactWriteItem.setUpdate(
                        generateUpdate(model, tableName, attributeValueMap, returnValuesOnConditionCheckFailure, writeExpression));
                break;
            case ConditionCheck:
                transactWriteItem.setConditionCheck(
                        generateConditionCheck(model, tableName, objectToWrite, returnValuesOnConditionCheckFailure, writeExpression));
                break;
            case Delete:
                transactWriteItem.setDelete(
                        generateDelete(model, tableName, objectToWrite, returnValuesOnConditionCheckFailure, writeExpression));
                break;
            default:
                throw new UnsupportedOperationException("Unsupported operationType: " + operationType + " for object: " +  model.convertKey(objectToWrite) + " of type: " + clazz);
        }
        return transactWriteItem;
    }

    private Put generatePut(String tableName,
                            Map<String, AttributeValue> attributeValueMap,
                            ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure,
                            DynamoDBTransactionWriteExpression writeExpression) {
        Put put = new Put();
        put.setItem(attributeValueMap);
        put.setTableName(tableName);
        if (returnValuesOnConditionCheckFailure != null) {
            put.setReturnValuesOnConditionCheckFailure(
                    returnValuesOnConditionCheckFailure.toString());
        }
        if (writeExpression != null) {
            if (writeExpression.getConditionExpression() != null) {
                put.setConditionExpression(writeExpression.getConditionExpression());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeNames())) {
                put.setExpressionAttributeNames(writeExpression.getExpressionAttributeNames());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeValues())) {
                put.setExpressionAttributeValues(writeExpression.getExpressionAttributeValues());
            }
        }
        return put;
    }

    private Update generateUpdate(DynamoDBMapperTableModel<Object> model,
                                  String tableName,
                                  Map<String, AttributeValue> attributeValueMap,
                                  ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure,
                                  DynamoDBTransactionWriteExpression writeExpression) {
        Update update = new Update();
        Map<String, String> expressionAttributeNamesMap = new HashMap<String, String>();
        Map<String, AttributeValue> expressionsAttributeValuesMap = new HashMap<String, AttributeValue>();
        if (returnValuesOnConditionCheckFailure != null) {
            update.setReturnValuesOnConditionCheckFailure(
                    returnValuesOnConditionCheckFailure.toString());
        }
        if (writeExpression != null) {
            if (writeExpression.getConditionExpression() != null) {
                update.setConditionExpression(writeExpression.getConditionExpression());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeNames())) {
                expressionAttributeNamesMap.putAll(writeExpression.getExpressionAttributeNames());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeValues())) {
                expressionsAttributeValuesMap.putAll(writeExpression.getExpressionAttributeValues());
            }
        }
        Map<String, AttributeValue> keyAttributeValueMap = new HashMap<String, AttributeValue>();
        Map<String, AttributeValue> nonKeyNonNullAttributeValueMap = new HashMap<String, AttributeValue>();
        // These are the non-key attributes that are present in the model and not in the customer object,
        // meaning they're to be removed in this update
        List<String> nullValuedNonKeyAttributeNames = new ArrayList<String>();

        for (final DynamoDBMapperFieldModel<Object,Object> field : model.fields()) {
            if (field.keyType() != null) {
                keyAttributeValueMap.put(field.name(), attributeValueMap.get(field.name()));
            } else if (attributeValueMap.get(field.name()) != null) {
                nonKeyNonNullAttributeValueMap.put(field.name(), attributeValueMap.get(field.name()));
            } else {
                nullValuedNonKeyAttributeNames.add(field.name());
            }
        }

        update.setTableName(tableName);
        update.setUpdateExpression(new UpdateExpressionGenerator()
                                           .generateUpdateExpressionAndUpdateAttributeMaps(expressionAttributeNamesMap,
                                                                                           expressionsAttributeValuesMap,
                                                                                           nonKeyNonNullAttributeValueMap,
                                                                                           nullValuedNonKeyAttributeNames));
        update.setKey(keyAttributeValueMap);
        if (expressionAttributeNamesMap.size() > 0) {
            update.setExpressionAttributeNames(expressionAttributeNamesMap);
        }
        if (expressionsAttributeValuesMap.size() > 0) {
            update.setExpressionAttributeValues(expressionsAttributeValuesMap);
        }
        return update;
    }

    private ConditionCheck generateConditionCheck(DynamoDBMapperTableModel<Object> model,
                                                  String tableName,
                                                  Object objectToConditionCheck,
                                                  ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure,
                                                  DynamoDBTransactionWriteExpression writeExpression) {
        ConditionCheck conditionCheck = new ConditionCheck();
        conditionCheck.setKey(model.convertKey(objectToConditionCheck));
        conditionCheck.setTableName(tableName);
        if (returnValuesOnConditionCheckFailure != null) {
            conditionCheck.setReturnValuesOnConditionCheckFailure(
                    returnValuesOnConditionCheckFailure.toString());
        }
        if (writeExpression != null) {
            conditionCheck.setConditionExpression(writeExpression.getConditionExpression());
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeNames())) {
                conditionCheck.setExpressionAttributeNames(writeExpression.getExpressionAttributeNames());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeValues())) {
                conditionCheck.setExpressionAttributeValues(writeExpression.getExpressionAttributeValues());
            }
        }
        return conditionCheck;
    }

    private Delete generateDelete(DynamoDBMapperTableModel<Object> model,
                                  String tableName,
                                  Object objectToDelete,
                                  ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure,
                                  DynamoDBTransactionWriteExpression writeExpression) {


        Delete delete = new Delete();
        delete.setKey(model.convertKey(objectToDelete));
        delete.setTableName(tableName);
        if (returnValuesOnConditionCheckFailure != null) {
            delete.setReturnValuesOnConditionCheckFailure(
                    returnValuesOnConditionCheckFailure.toString());
        }
        if (writeExpression != null) {
            if (writeExpression.getConditionExpression() != null) {
                delete.setConditionExpression(writeExpression.getConditionExpression());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeNames())) {
                delete.setExpressionAttributeNames(writeExpression.getExpressionAttributeNames());
            }
            if (!isNullOrEmpty(writeExpression.getExpressionAttributeValues())) {
                delete.setExpressionAttributeValues(writeExpression.getExpressionAttributeValues());
            }
        }
        return delete;
    }

}
