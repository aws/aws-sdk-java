/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Immutable configuration object for service call behavior. An instance of this
 * configuration is supplied to every {@link DynamoDBMapper} at construction; if
 * not provided explicitly, {@link DynamoDBMapperConfig#DEFAULT} is used. New
 * instances can be given to the mapper object on individual save, load, and
 * delete operations to override the defaults. For example:
 *
 * <pre class="brush: java">
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * // Force this read to be consistent
 * DomainClass obj = mapper.load(DomainClass.class, key, ConsistentReads.CONSISTENT.config());
 * // Force this save operation to use putItem rather than updateItem
 * mapper.save(obj, SaveBehavior.CLOBBER.config());
 * // Save the object into a different table
 * mapper.save(obj, new TableNameOverride("AnotherTable").config());
 * // Delete the object even if the version field is out of date
 * mapper.delete(obj, SaveBehavior.CLOBBER.config());
 * </pre>
 */
public class DynamoDBMapperConfig {

    /**
     * Default configuration; these defaults are also applied by the mapper
     * when only partial configurations are specified.
     *
     * @see SaveBehavior#UPDATE
     * @see ConsistentReads#EVENTUAL
     * @see PaginationLoadingStrategy#LAZY_LOADING
     * @see DefaultTableNameResolver#INSTANCE
     * @see DefaultBatchWriteRetryStrategy#INSTANCE
     * @see DefaultBatchLoadRetryStrategy#INSTANCE
     * @see DynamoDBTypeConverterFactory#standard
     * @see ConversionSchemas#DEFAULT
     */
    public static final DynamoDBMapperConfig DEFAULT = builder()
        .withSaveBehavior(SaveBehavior.UPDATE)
        .withConsistentReads(ConsistentReads.EVENTUAL)
        .withPaginationLoadingStrategy(PaginationLoadingStrategy.LAZY_LOADING)
        .withTableNameResolver(DefaultTableNameResolver.INSTANCE)
        .withBatchWriteRetryStrategy(DefaultBatchWriteRetryStrategy.INSTANCE)
        .withBatchLoadRetryStrategy(DefaultBatchLoadRetryStrategy.INSTANCE)
        .withTypeConverterFactory(DynamoDBTypeConverterFactory.standard())
        .withConversionSchema(ConversionSchemas.DEFAULT)
        .build();

    /**
     * Creates a new empty builder.
     */
    public static final Builder builder() {
        return new Builder(false);
    }

    /**
     * A fluent builder for DynamoDBMapperConfig objects.
     */
    public static class Builder {

        private SaveBehavior saveBehavior;
        private ConsistentReads consistentReads;
        private TableNameOverride tableNameOverride;
        private TableNameResolver tableNameResolver;
        private ObjectTableNameResolver objectTableNameResolver;
        private PaginationLoadingStrategy paginationLoadingStrategy;
        private RequestMetricCollector requestMetricCollector;
        private ConversionSchema conversionSchema;
        private BatchWriteRetryStrategy batchWriteRetryStrategy;
        private BatchLoadRetryStrategy batchLoadRetryStrategy;
        private DynamoDBTypeConverterFactory typeConverterFactory;

        /**
         * Creates a new builder initialized with the {@link #DEFAULT} values.
         */
        public Builder() {
            this(true);
        }

        /**
         * Creates a new builder, optionally initialized with the defaults.
         */
        private Builder(final boolean defaults) {
            if (defaults == true) {
                saveBehavior = DEFAULT.getSaveBehavior();
                consistentReads = DEFAULT.getConsistentReads();
                paginationLoadingStrategy = DEFAULT.getPaginationLoadingStrategy();
                conversionSchema = DEFAULT.getConversionSchema();
                batchWriteRetryStrategy = DEFAULT.getBatchWriteRetryStrategy();
                batchLoadRetryStrategy = DEFAULT.getBatchLoadRetryStrategy();
            }
        }

        /**
         * Merges any non-null configuration values for the specified overrides.
         */
        private final Builder merge(final DynamoDBMapperConfig o) {
            if (o == null) return this;
            if (o.saveBehavior != null) saveBehavior = o.saveBehavior;
            if (o.consistentReads != null) consistentReads = o.consistentReads;
            if (o.tableNameOverride != null) tableNameOverride = o.tableNameOverride;
            if (o.tableNameResolver != null) tableNameResolver = o.tableNameResolver;
            if (o.objectTableNameResolver != null) objectTableNameResolver = o.objectTableNameResolver;
            if (o.paginationLoadingStrategy != null) paginationLoadingStrategy = o.paginationLoadingStrategy;
            if (o.requestMetricCollector != null) requestMetricCollector = o.requestMetricCollector;
            if (o.conversionSchema != null) conversionSchema = o.conversionSchema;
            if (o.batchWriteRetryStrategy != null) batchWriteRetryStrategy = o.batchWriteRetryStrategy;
            if (o.batchLoadRetryStrategy != null) batchLoadRetryStrategy = o.batchLoadRetryStrategy;
            if (o.typeConverterFactory != null) typeConverterFactory = o.typeConverterFactory;
            return this;
        }

        /**
         * @return the currently-configured save behavior
         */
        public SaveBehavior getSaveBehavior() {
            return saveBehavior;
        }

        /**
         * @param value the new save behavior
         */
        public void setSaveBehavior(SaveBehavior value) {
            saveBehavior = value;
        }

        /**
         * @param value the new save behavior
         * @return this builder
         */
        public Builder withSaveBehavior(SaveBehavior value) {
            setSaveBehavior(value);
            return this;
        }


        /**
         * Returns the consistent read behavior. Currently
         * this value is applied only in load and batch load operations of the
         * DynamoDBMapper.
         * @return the currently-configured consistent read behavior.
         */
        public ConsistentReads getConsistentReads() {
            return consistentReads;
        }

        /**
         * Sets the consistent read behavior. Currently
         * this value is applied only in load and batch load operations of the
         * DynamoDBMapper.
         * @param value the new consistent read behavior.
         */
        public void setConsistentReads(ConsistentReads value) {
            consistentReads = value;
        }

        /**
         * Sets the consistent read behavior. Currently
         * this value is applied only in load and batch load operations of the
         * DynamoDBMapper.
         * @param value the new consistent read behavior
         * @return this builder.
         *
         */
        public Builder withConsistentReads(ConsistentReads value) {
            setConsistentReads(value);
            return this;
        }


        /**
         * @return the current table name override
         */
        public TableNameOverride getTableNameOverride() {
            return tableNameOverride;
        }

        /**
         * @param value the new table name override
         */
        public void setTableNameOverride(TableNameOverride value) {
            tableNameOverride = value;
        }

        /**
         * @param value the new table name override
         * @return this builder
         */
        public Builder withTableNameOverride(TableNameOverride value) {
            setTableNameOverride(value);
            return this;
        }


        /**
         * @return the current table name resolver
         */
        public TableNameResolver getTableNameResolver() {
            return tableNameResolver;
        }

        /**
         * @param value the new table name resolver
         */
        public void setTableNameResolver(TableNameResolver value) {
            tableNameResolver = value;
        }

        /**
         * @param value the new table name resolver
         * @return this builder
         */
        public Builder withTableNameResolver(TableNameResolver value) {
            setTableNameResolver(value);
            return this;
        }


        /**
         * @return the current object table name resolver
         */
        public ObjectTableNameResolver getObjectTableNameResolver() {
            return objectTableNameResolver;
        }

        /**
         * @param value the new object table name resolver
         */
        public void setObjectTableNameResolver(ObjectTableNameResolver value) {
            objectTableNameResolver = value;
        }

        /**
         * @param value the new object table name resolver
         * @return this builder
         */
        public Builder withObjectTableNameResolver(ObjectTableNameResolver value) {
            setObjectTableNameResolver(value);
            return this;
        }

        /**
         * @return the currently-configured pagination loading strategy
         */
        public PaginationLoadingStrategy getPaginationLoadingStrategy() {
            return paginationLoadingStrategy;
        }

        /**
         * @param value the new pagination loading strategy
         */
        public void setPaginationLoadingStrategy(
                PaginationLoadingStrategy value) {

            paginationLoadingStrategy = value;
        }

        /**
         * @param value the new pagination loading strategy
         * @return this builder
         */
        public Builder withPaginationLoadingStrategy(
                PaginationLoadingStrategy value) {

            setPaginationLoadingStrategy(value);
            return this;
        }


        /**
         * @return the currently-configured request metric collector
         */
        public RequestMetricCollector getRequestMetricCollector() {
            return requestMetricCollector;
        }

        /**
         * @param value the new request metric collector
         */
        public void setRequestMetricCollector(RequestMetricCollector value) {
            requestMetricCollector = value;
        }

        /**
         * @param value the new request metric collector
         * @return this builder
         */
        public Builder withRequestMetricCollector(RequestMetricCollector value) {
            setRequestMetricCollector(value);
            return this;
        }


        /**
         * @return the current conversion schema
         */
        public ConversionSchema getConversionSchema() {
            return conversionSchema;
        }

        /**
         * @param value the new conversion schema
         */
        public void setConversionSchema(ConversionSchema value) {
            conversionSchema = value;
        }

        /**
         * @param value the new conversion schema
         * @return this builder
         */
        public Builder withConversionSchema(ConversionSchema value) {
            setConversionSchema(value);
            return this;
        }

        /**
         * @return the current BatchWriteRetryStrategy
         */
        public BatchWriteRetryStrategy getBatchWriteRetryStrategy() {
            return batchWriteRetryStrategy;
        }

        /**
         * @param value the new BatchWriteRetryStrategy
         */
        public void setBatchWriteRetryStrategy(
                BatchWriteRetryStrategy value) {
            this.batchWriteRetryStrategy = value;
        }

        /**
         * @param value the new BatchWriteRetryStrategy
         * @return this builder
         */
        public Builder withBatchWriteRetryStrategy(
                BatchWriteRetryStrategy value) {
            setBatchWriteRetryStrategy(value);
            return this;
        }

        public BatchLoadRetryStrategy getBatchLoadRetryStrategy() {
            return batchLoadRetryStrategy;
        }

        /**
         * @param value the new BatchLoadRetryStrategy
         */
        public void setBatchLoadRetryStrategy(
                BatchLoadRetryStrategy value) {
            this.batchLoadRetryStrategy = value;
        }

        /**
         * @param value the new BatchLoadRetryStrategy
         * @return this builder
         */
        public Builder withBatchLoadRetryStrategy(
                BatchLoadRetryStrategy value) {
            //set the no retry strategy if the user overrides the default with null
            if (value == null) {
                value = NoRetryBatchLoadRetryStrategy.INSTANCE;
            }
            setBatchLoadRetryStrategy(value);
            return this;
        }

        /**
         * @return the current type-converter factory
         */
        public final DynamoDBTypeConverterFactory getTypeConverterFactory() {
            return typeConverterFactory;
        }

        /**
         * @param value the new type-converter factory
         */
        public final void setTypeConverterFactory(DynamoDBTypeConverterFactory value) {
            this.typeConverterFactory = value;
        }

        /**
         * The type-converter factory for scalar conversions.
         * <p>To override standard type-conversions,</p>
         * <pre class="brush: java">
         * DynamoDBMapperConfig config = DynamoDBMapperConfig.builder()
         *     .withTypeConverterFactory(DynamoDBTypeConverterFactory.standard().override()
         *         .with(String.class, MyObject.class, new StringToMyObjectConverter())
         *         .build())
         *     .build();
         * </pre>
         * <p>Then, on the property, specify the attribute binding,</p>
         * <pre class="brush: java">
         * &#064;DynamoDBTyped(DynamoDBAttributeType.S)
         * public MyObject getMyObject()
         * </pre>
         * @param value the new type-converter factory
         * @return this builder
         */
        public final Builder withTypeConverterFactory(DynamoDBTypeConverterFactory value) {
            setTypeConverterFactory(value);
            return this;
        }

        /**
         * Builds a new {@code DynamoDBMapperConfig} object.
         *
         * @return the new, immutable config object
         */
        public DynamoDBMapperConfig build() {
            return new DynamoDBMapperConfig(this);
        }
    }

    /**
     * Enumeration of behaviors for the save operation.
     */
    public static enum SaveBehavior {
        /**
         * UPDATE will not affect unmodeled attributes on a save operation and a
         * null value for the modeled attribute will remove it from that item in
         * DynamoDB.
         * <p>
         * Because of the limitation of updateItem request, the implementation
         * of UPDATE will send a putItem request when a key-only object is being
         * saved, and it will send another updateItem request if the given
         * key(s) already exists in the table.
         * <p>
         * By default, the mapper uses UPDATE.
         */
        UPDATE,

        /**
         * UPDATE_SKIP_NULL_ATTRIBUTES is similar to UPDATE, except that it
         * ignores any null value attribute(s) and will NOT remove them from
         * that item in DynamoDB. It also guarantees to send only one single
         * updateItem request, no matter the object is key-only or not.
         */
        UPDATE_SKIP_NULL_ATTRIBUTES,

        /**
         * CLOBBER will clear and replace all attributes, including unmodeled
         * ones, on save. Versioned field constraints will
         * also be disregarded. If versioning is required use {@link #PUT}.
         */
        CLOBBER,

        /**
         * PUT will clear and replace all attributes, including unmodeled
         * ones, on save.
         */
        PUT,

        /**
         * APPEND_SET treats scalar attributes (String, Number, Binary) the same
         * as UPDATE_SKIP_NULL_ATTRIBUTES does. However, for set attributes, it
         * will append to the existing attribute value, instead of overriding
         * it. Caller needs to make sure that the modeled attribute type matches
         * the existing set type, otherwise it would result in a service
         * exception.
         */
        APPEND_SET;

        private final DynamoDBMapperConfig config = builder().withSaveBehavior(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    };

    /**
     * Enumeration of consistent read behavior.
     * <p>
     * CONSISTENT uses consistent reads, EVENTUAL does not. Consistent reads
     * have implications for performance and billing; see the service
     * documentation for details.
     * <p>
     * By default, the mapper uses eventual consistency.
     */
    public static enum ConsistentReads {
        CONSISTENT,
        EVENTUAL;

        private final DynamoDBMapperConfig config = builder().withConsistentReads(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    };

    /**
     * Enumeration of pagination loading strategy.
     */
    public enum PaginationLoadingStrategy {
        /**
         * Paginated list is lazily loaded when possible, and all loaded results are kept in the memory. Data will
         * only be fetched when accessed so this can be more performant than {@link #EAGER_LOADING} when not all
         * data is used. Calls to methods such as {@link List#size()} will cause all results to be fetched from
         * the service.
         * <p>
         * By default, the mapper uses LAZY_LOADING.
         */
        LAZY_LOADING,

        /**
         * Only supports using iterator to read from the paginated list. All other list operations will return
         * UnsupportedOperationException immediately. During the iteration, the list will clear all the
         * previous results before loading the next page, so that the list will keep at most one page of the loaded results in
         * memory. This also means the list could only be iterated once.
         * <p>
         * Use this configuration to reduce the memory overhead when handling
         * large DynamoDB items. This is the most performant option when you only need to iterate the results
         * of a query.
         */
        ITERATION_ONLY,

        /**
         * Paginated list will eagerly load all the paginated results from DynamoDB as soon as the list is initialized. This may
         * make several service calls when the list is created and is not recommended for large data sets. The benefit of using
         * eager loading is that service call penalties are paid up front and you get predictable latencies when accessing the
         * list afterwards since all contents are in memory.
         */
        EAGER_LOADING;

        private final DynamoDBMapperConfig config = builder().withPaginationLoadingStrategy(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    /**
     * Allows overriding the table name declared on a domain class by the
     * {@link DynamoDBTable} annotation.
     */
    public static final class TableNameOverride {

        private final String tableNameOverride;
        private final String tableNamePrefix;

        /**
         * Returns a new {@link TableNameOverride} object that will prepend the
         * given string to every table name.
         */
        public static TableNameOverride withTableNamePrefix(
                String tableNamePrefix) {

            return new TableNameOverride(null, tableNamePrefix);
        }

        /**
         * Returns a new {@link TableNameOverride} object that will replace
         * every table name in requests with the given string.
         */
        public static TableNameOverride withTableNameReplacement(
                String tableNameReplacement) {

            return new TableNameOverride(tableNameReplacement, null);
        }

        private TableNameOverride(String tableNameOverride, String tableNamePrefix) {
            this.tableNameOverride = tableNameOverride;
            this.tableNamePrefix = tableNamePrefix;
        }

        /**
         * @see TableNameOverride#withTableNameReplacement(String)
         */
        public TableNameOverride(String tableNameOverride) {
            this(tableNameOverride, null);
        }

        /**
         * Returns the table name to use for all requests. Exclusive with
         * {@link TableNameOverride#getTableNamePrefix()}
         *
         * @see DynamoDBMapperConfig#getTableNameOverride()
         */
        public String getTableName() {
            return tableNameOverride;
        }

        /**
         * Returns the table name prefix to prepend the table name for all
         * requests. Exclusive with {@link TableNameOverride#getTableName()}
         *
         * @see DynamoDBMapperConfig#getTableNameOverride()
         */
        public String getTableNamePrefix() {
            return tableNamePrefix;
        }

        private final DynamoDBMapperConfig config = builder().withTableNameOverride(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    /**
     * Interface for a strategy used to determine the table name of an object based on its class.
     * This resolver is used when an object isn't available such as in
     * {@link DynamoDBMapper#query(Class, DynamoDBQueryExpression)}
     *
     * @see ObjectTableNameResolver
     * @author Raniz
     */
    public static interface TableNameResolver {

        /**
         * Get the table name for a class. This method is used when an object is not available
         * such as when creating requests for scan or query operations.
         *
         * @param clazz The class to get the table name for
         * @param config The {@link DynamoDBMapperConfig}
         * @return The table name to use for instances of clazz
         */
        public String getTableName(Class<?> clazz, DynamoDBMapperConfig config);
    }

    /**
     * Interface for a strategy used to determine the table name of an object based on its class.
     * This resolver is used when an object is available such as in
     * {@link DynamoDBMapper#batchSave(Object...)}
     *
     * If no table name resolver for objects is set, {@link DynamoDBMapper} reverts to using the
     * {@link TableNameResolver} on each object's class.
     *
     * @see TableNameResolver
     * @author Raniz
     */
    public static interface ObjectTableNameResolver {

        /**
         * Get the table name for an object.
         *
         * @param object The object to get the table name for
         * @param config The {@link DynamoDBMapperConfig}
         * @return The table name to use for object
         */
        public String getTableName(Object object, DynamoDBMapperConfig config);

    }

    /**
     * Default implementation of {@link TableNameResolver} that mimics the behavior
     * of DynamoDBMapper before the addition of {@link TableNameResolver}.
     *
     * @author Raniz
     */
    public static class DefaultTableNameResolver implements TableNameResolver {
        public static final DefaultTableNameResolver INSTANCE = new DefaultTableNameResolver();

        @Override
        public String getTableName(Class<?> clazz, DynamoDBMapperConfig config) {
            final TableNameOverride override = config.getTableNameOverride();

            if (override != null) {
                final String tableName = override.getTableName();
                if (tableName != null) {
                    return tableName;
                }
            }

            final StandardBeanProperties.Beans<?> beans = StandardBeanProperties.of(clazz);
            if (beans.properties().tableName() == null) {
                throw new DynamoDBMappingException(clazz + " not annotated with @DynamoDBTable");
            }

            final String prefix = override == null ? null : override.getTableNamePrefix();
            return prefix == null ? beans.properties().tableName() : prefix + beans.properties().tableName();
        }

        private final DynamoDBMapperConfig config = builder().withTableNameResolver(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    /**
     * DynamoDBMapper#batchWrite takes arbitrary number of save/delete requests
     * and breaks them into smaller chunks that can be accepted by the service
     * API. Each chunk will be sent to DynamoDB via the BatchWriteItem API, and
     * if it fails because the table's provisioned throughput is exceeded or an
     * internal processing failure occurs, the failed requests are returned in
     * the UnprocessedItems response parameter. This interface allows you to
     * control the retry strategy when such scenario occurs.
     *
     * @see DynamoDBMapper#batchWrite(Iterable, Iterable, DynamoDBMapperConfig)
     * @see <ahref="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html">DynamoDB service API reference -- BatchWriteItem</a>
     */
    public interface BatchWriteRetryStrategy {

        /**
         * Returns the max number of retries to be performed if the service
         * returns UnprocessedItems in the response.
         *
         * @param batchWriteItemInput
         *            the one batch of write requests that is being sent to the
         *            BatchWriteItem API.
         * @return max number of retries to be performed if the service returns
         *         UnprocessedItems in the response, or a negative value if you
         *         want it to keep retrying until all the UnprocessedItems are
         *         fulfilled.
         */
        public int getMaxRetryOnUnprocessedItems(
                Map<String, List<WriteRequest>> batchWriteItemInput);

        /**
         * Returns the delay (in milliseconds) before retrying on
         * UnprocessedItems.
         *
         * @param unprocessedItems
         *            the UnprocessedItems returned by the service in the last
         *            BatchWriteItem call
         * @param retriesAttempted
         *            The number of times we have attempted to resend
         *            UnprocessedItems.
         * @return the delay (in milliseconds) before resending
         *         UnprocessedItems.
         */
        public long getDelayBeforeRetryUnprocessedItems(
                Map<String, List<WriteRequest>> unprocessedItems,
                int retriesAttempted);
    }


    /**
     * {@link DynamoDBMapper#batchLoad(Iterable, DynamoDBMapperConfig)} breaks the requested items in batches of maximum size 100.
     * When calling the Dyanmo Db client, there is a chance that due to throttling, some unprocessed keys will be returned.
     * This interfaces controls whether we need to retry these unprocessed keys and it also controls the strategy as to how retries should be handled
     */
    public interface BatchLoadRetryStrategy {
        /**
         * Checks if the batch load request should be retried.
         * @param batchLoadContext see {@link BatchLoadContext}
         *
         * @return a boolean true or false value.
         */
        public boolean shouldRetry(final BatchLoadContext batchLoadContext);

        /**
         * Returns delay(in milliseconds) before retrying Unprocessed keys
         *
         * @param batchLoadContext see {@link BatchLoadContext}
         * @return delay(in milliseconds) before attempting to read unprocessed keys
         */
        public long getDelayBeforeNextRetry(final BatchLoadContext batchLoadContext);
    }

    /**
     * This strategy, like name suggests will not attempt any retries on Unprocessed keys
     *
     * @author smihir
     *
     */
    public static class NoRetryBatchLoadRetryStrategy implements BatchLoadRetryStrategy {
        public static final NoRetryBatchLoadRetryStrategy INSTANCE = new NoRetryBatchLoadRetryStrategy();

        /* (non-Javadoc)
         * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.BatchLoadRetryStrategy#getMaxRetryOnUnprocessedKeys(java.util.Map, java.util.Map)
         */
        @Override
        public boolean shouldRetry(final BatchLoadContext batchLoadContext) {
            return false;
        }

        /* (non-Javadoc)
         * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.BatchLoadRetryStrategy#getDelayBeforeNextRetry(java.util.Map, int)
         */
        @Override
        public long getDelayBeforeNextRetry(final BatchLoadContext batchLoadContext) {
            return -1;
        }

        private final DynamoDBMapperConfig config = builder().withBatchLoadRetryStrategy(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    /**
     * This is the default strategy.
     * If unprocessed keys is equal to requested keys, the request will retried 5 times with a back off strategy
     * with maximum back off of 3 seconds
     * If few of the keys have been processed, the retries happen without a delay.
     *
     * @author smihir
     *
     */
    public static class DefaultBatchLoadRetryStrategy implements BatchLoadRetryStrategy {
        public static final DefaultBatchLoadRetryStrategy INSTANCE = new DefaultBatchLoadRetryStrategy();

        private static final int MAX_RETRIES = 5;
        private static final long MAX_BACKOFF_IN_MILLISECONDS = 1000 * 3;

        @Override
        public long getDelayBeforeNextRetry(final BatchLoadContext batchLoadContext) {
            Map<String, KeysAndAttributes> requestedKeys = batchLoadContext.getBatchGetItemRequest().getRequestItems();
            Map<String, KeysAndAttributes> unprocessedKeys = batchLoadContext.getBatchGetItemResult()
                    .getUnprocessedKeys();

            long delay = 0;
            //Exponential backoff only when all keys are unprocessed
            if (unprocessedKeys != null && requestedKeys != null && unprocessedKeys.size() == requestedKeys.size()) {
                Random random = new Random();
                long scaleFactor = 500 + random.nextInt(100);
                int retriesAttempted = batchLoadContext.getRetriesAttempted();
                delay = (long) (Math.pow(2, retriesAttempted) * scaleFactor);
                delay = Math.min(delay, MAX_BACKOFF_IN_MILLISECONDS);
            }
            return delay;
        }

        @Override
        public boolean shouldRetry(BatchLoadContext batchLoadContext) {
            Map<String, KeysAndAttributes> unprocessedKeys = batchLoadContext.getBatchGetItemResult().getUnprocessedKeys();
            return (unprocessedKeys != null && unprocessedKeys.size() > 0 && batchLoadContext.getRetriesAttempted() < MAX_RETRIES);
        }

        private final DynamoDBMapperConfig config = builder().withBatchLoadRetryStrategy(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    /**
     * The default BatchWriteRetryStrategy which always retries on
     * UnprocessedItem up to a maximum number of times and use exponential
     * backoff with random scale factor.
     */
    public static class DefaultBatchWriteRetryStrategy implements BatchWriteRetryStrategy {
        public static final DefaultBatchWriteRetryStrategy INSTANCE = new DefaultBatchWriteRetryStrategy();

        private static final long MAX_BACKOFF_IN_MILLISECONDS = 1000 * 3;
        private static final int DEFAULT_MAX_RETRY = -1;

        private final int maxRetry;

        /**
         * Keep retrying until success, with default backoff.
         */
        public DefaultBatchWriteRetryStrategy() {
            this(DEFAULT_MAX_RETRY);
        }

        public DefaultBatchWriteRetryStrategy (int maxRetry) {
            this.maxRetry = maxRetry;
        }

        @Override
        public int getMaxRetryOnUnprocessedItems(
                Map<String, List<WriteRequest>> batchWriteItemInput) {
            return maxRetry;
        }

        @Override
        public long getDelayBeforeRetryUnprocessedItems(
                Map<String, List<WriteRequest>> unprocessedItems,
                int retriesAttempted) {

            if (retriesAttempted < 0) {
                return 0;
            }

            Random random = new Random();
            long scaleFactor = 1000 + random.nextInt(200);
            long delay = (long) (Math.pow(2, retriesAttempted) * scaleFactor);
            return Math.min(delay, MAX_BACKOFF_IN_MILLISECONDS);
        }

        private final DynamoDBMapperConfig config = builder().withBatchWriteRetryStrategy(this).build();
        public final DynamoDBMapperConfig config() {
            return this.config;
        }
    }

    private final SaveBehavior saveBehavior;
    private final ConsistentReads consistentReads;
    private final TableNameOverride tableNameOverride;
    private final TableNameResolver tableNameResolver;
    private final ObjectTableNameResolver objectTableNameResolver;
    private final PaginationLoadingStrategy paginationLoadingStrategy;
    private final RequestMetricCollector requestMetricCollector;
    private final ConversionSchema conversionSchema;
    private final BatchWriteRetryStrategy batchWriteRetryStrategy;
    private final BatchLoadRetryStrategy batchLoadRetryStrategy;
    private final DynamoDBTypeConverterFactory typeConverterFactory;

    /**
     * Internal constructor; builds from the builder.
     */
    private DynamoDBMapperConfig(final DynamoDBMapperConfig.Builder builder) {
        this.saveBehavior = builder.saveBehavior;
        this.consistentReads = builder.consistentReads;
        this.tableNameOverride = builder.tableNameOverride;
        this.tableNameResolver = builder.tableNameResolver;
        this.objectTableNameResolver = builder.objectTableNameResolver;
        this.paginationLoadingStrategy = builder.paginationLoadingStrategy;
        this.requestMetricCollector = builder.requestMetricCollector;
        this.conversionSchema = builder.conversionSchema;
        this.batchWriteRetryStrategy = builder.batchWriteRetryStrategy;
        this.batchLoadRetryStrategy = builder.batchLoadRetryStrategy;
        this.typeConverterFactory = builder.typeConverterFactory;
    }

    /**
     * Merges these configuration values with the specified overrides; may
     * simply return this instance if overrides are the same or null.
     * @param overrides The overrides to merge.
     * @return This if the overrides are same or null, or a new merged config.
     */
    final DynamoDBMapperConfig merge(final DynamoDBMapperConfig overrides) {
        return overrides == null || this == overrides ? this : builder().merge(this).merge(overrides).build();
    }

    /**
     * Legacy constructor, using default PaginationLoadingStrategy
     * @deprecated in favor of the fluent {@link Builder}
     * @see DynamoDBMapperConfig#builder()
     **/
    @Deprecated
    public DynamoDBMapperConfig(
            SaveBehavior saveBehavior,
            ConsistentReads consistentReads,
            TableNameOverride tableNameOverride) {

        this(saveBehavior, consistentReads, tableNameOverride, null, null);
    }

    /**
     * Constructs a new configuration object with the save behavior, consistent
     * read behavior, and table name override given.
     *
     * @param saveBehavior
     *            The {@link SaveBehavior} to use, or null for default.
     * @param consistentReads
     *            The {@link ConsistentReads} to use, or null for default.
     * @param tableNameOverride
     *            An override for the table name, or null for no override.
     * @param paginationLoadingStrategy
     *            The pagination loading strategy, or null for default.
     * @deprecated in favor of the fluent {@link Builder}
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(
            SaveBehavior saveBehavior,
            ConsistentReads consistentReads,
            TableNameOverride tableNameOverride,
            PaginationLoadingStrategy paginationLoadingStrategy) {
        this(saveBehavior, consistentReads, tableNameOverride,
                paginationLoadingStrategy, null);
    }

    /**
     * Constructs a new configuration object with the save behavior, consistent
     * read behavior, and table name override given.
     *
     * @param saveBehavior
     *            The {@link SaveBehavior} to use, or null for default.
     * @param consistentReads
     *            The {@link ConsistentReads} to use, or null for default.
     * @param tableNameOverride
     *            An override for the table name, or null for no override.
     * @param paginationLoadingStrategy
     *            The pagination loading strategy, or null for default.
     * @param requestMetricCollector
     *            optional request metric collector
     * @deprecated in favor of the fluent {@link Builder}
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(
            SaveBehavior saveBehavior,
            ConsistentReads consistentReads,
            TableNameOverride tableNameOverride,
            PaginationLoadingStrategy paginationLoadingStrategy,
            RequestMetricCollector requestMetricCollector) {

        this(saveBehavior,
                consistentReads,
                tableNameOverride,
                null,
                null,
                paginationLoadingStrategy,
                requestMetricCollector,
                DEFAULT.getConversionSchema(),
                DEFAULT.getBatchWriteRetryStrategy(),
                DEFAULT.getBatchLoadRetryStrategy());
    }

    private DynamoDBMapperConfig(
            SaveBehavior saveBehavior,
            ConsistentReads consistentReads,
            TableNameOverride tableNameOverride,
            TableNameResolver tableNameResolver,
            ObjectTableNameResolver objectTableNameResolver,
            PaginationLoadingStrategy paginationLoadingStrategy,
            RequestMetricCollector requestMetricCollector,
            ConversionSchema conversionSchema,
            BatchWriteRetryStrategy batchWriteRetryStrategy,
            BatchLoadRetryStrategy batchLoadRetryStrategy) {

        this.saveBehavior = saveBehavior;
        this.consistentReads = consistentReads;
        this.tableNameOverride = tableNameOverride;
        this.tableNameResolver = tableNameResolver;
        this.objectTableNameResolver = objectTableNameResolver;
        this.paginationLoadingStrategy = paginationLoadingStrategy;
        this.requestMetricCollector = requestMetricCollector;
        this.conversionSchema = conversionSchema;
        this.batchWriteRetryStrategy = batchWriteRetryStrategy;
        this.batchLoadRetryStrategy = batchLoadRetryStrategy;
        this.typeConverterFactory = null;
    }

    /**
     * Constructs a new configuration object with the save behavior given.
     * @see SaveBehavior#config
     */
    @Deprecated
    public DynamoDBMapperConfig(SaveBehavior saveBehavior) {
        this(saveBehavior, null, null, null, null, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the consistent read behavior
     * given.
     * @see ConsistentReads#config
     */
    @Deprecated
    public DynamoDBMapperConfig(ConsistentReads consistentReads) {
        this(null, consistentReads, null, null, null, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the table name override given.
     * @see TableNameOverride#config
     */
    @Deprecated
    public DynamoDBMapperConfig(TableNameOverride tableNameOverride) {
        this(null, null, tableNameOverride, null, null, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the table name resolver strategy given.
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(TableNameResolver tableNameResolver) {
        this(null, null, null, tableNameResolver, null, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the object table name resolver strategy given.
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(ObjectTableNameResolver objectTableNameResolver) {
        this(null, null, null, null, objectTableNameResolver, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the table name resolver strategies given.
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(TableNameResolver tableNameResolver, ObjectTableNameResolver objectTableNameResolver) {
        this(null, null, null, tableNameResolver, objectTableNameResolver, null, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the pagination loading
     * strategy given.
     * @see PaginationLoadingStrategy#config
     */
    @Deprecated
    public DynamoDBMapperConfig(
            PaginationLoadingStrategy paginationLoadingStrategy) {

        this(null, null, null, null, null, paginationLoadingStrategy, null,
                DEFAULT.getConversionSchema(), DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object with the conversion schema given.
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(ConversionSchema conversionSchema) {
        this(null, null, null, null, null, null, null, conversionSchema, DEFAULT.getBatchWriteRetryStrategy(), DEFAULT.getBatchLoadRetryStrategy());
    }

    /**
     * Constructs a new configuration object from two others: a set of defaults
     * and a set of overrides. Any non-null overrides will be applied to the
     * defaults.
     * <p>
     * Used internally to merge the {@link DynamoDBMapperConfig} provided at
     * construction with an overriding object for a particular operation.
     *
     * @param defaults
     *            The default mapper configuration values.
     * @param overrides
     *            The overridden mapper configuration values. Any non-null
     *            config settings will be applied to the returned object.
     * @see DynamoDBMapperConfig#builder()
     */
    @Deprecated
    public DynamoDBMapperConfig(
            DynamoDBMapperConfig defaults,
            DynamoDBMapperConfig overrides) {
        this(builder().merge(defaults).merge(overrides));
    }

    public BatchLoadRetryStrategy getBatchLoadRetryStrategy() {
        return batchLoadRetryStrategy;
    }

    /**
     * Returns the save behavior for this configuration.
     */
    public SaveBehavior getSaveBehavior() {
        return saveBehavior;
    }

    /**
     * Returns the consistent read behavior for this configuration.
     */
    public ConsistentReads getConsistentReads() {
        return consistentReads;
    }

    /**
     * Returns the table name override for this configuration. This value will
     * override the table name specified in a {@link DynamoDBTable} annotation,
     * either by replacing the table name entirely or else by pre-pending a
     * string to each table name. This is useful for partitioning data in
     * multiple tables at runtime.
     *
     * @see TableNameOverride#withTableNamePrefix(String)
     * @see TableNameOverride#withTableNameReplacement(String)
     */
    public TableNameOverride getTableNameOverride() {
        return tableNameOverride;
    }

    /**
     * Returns the table name resolver for this configuration. This value will
     * be used to determine the table name for classes. It can be
     * used for more powerful customization of table name than is possible using
     * only {@link TableNameOverride}.
     *
     * @see TableNameResolver#getTableName(Class, DynamoDBMapperConfig)
     */
    public TableNameResolver getTableNameResolver() {
        return tableNameResolver;
    }

    /**
     * Returns the object table name resolver for this configuration. This value will
     * be used to determine the table name for objects. It can be
     * used for more powerful customization of table name than is possible using
     * only {@link TableNameOverride}.
     *
     * @see ObjectTableNameResolver#getTableName(Object, DynamoDBMapperConfig)
     */
    public ObjectTableNameResolver getObjectTableNameResolver() {
        return objectTableNameResolver;
    }

    /**
     * Returns the pagination loading strategy for this configuration.
     */
    public PaginationLoadingStrategy getPaginationLoadingStrategy() {
        return paginationLoadingStrategy;
    }

    /**
     * Returns the request metric collector or null if not specified.
     */
    public RequestMetricCollector getRequestMetricCollector() {
        return requestMetricCollector;
    }

    /**
     * @return the conversion schema for this config object
     */
    public ConversionSchema getConversionSchema() {
        return conversionSchema;
    }

    /**
     * @return the BatchWriteRetryStrategy for this config object
     */
    public BatchWriteRetryStrategy getBatchWriteRetryStrategy() {
        return batchWriteRetryStrategy;
    }

    /**
     * @return the current type-converter factory
     */
    public final DynamoDBTypeConverterFactory getTypeConverterFactory() {
        return typeConverterFactory;
    }

}
