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

import com.amazonaws.metrics.RequestMetricCollector;

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
 * DomainClass obj = mapper.load(DomainClass.class, key, new DynamoDBMapperConfig(ConsistentReads.CONSISTENT));
 * // Force this save operation to use putItem rather than updateItem
 * mapper.save(obj, new DynamoDBMapperConfig(SaveBehavior.CLOBBER));
 * // Save the object into a different table
 * mapper.save(obj, new DynamoDBMapperConfig(new TableNameOverride("AnotherTable")));
 * // Delete the object even if the version field is out of date
 * mapper.delete(obj, new DynamoDBMapperConfig(SaveBehavior.CLOBBER));
 * </pre>
 */
public class DynamoDBMapperConfig {

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

        /**
         * Creates a new builder initialized with the {@link #DEFAULT} values.
         */
        public Builder() {
            saveBehavior = DEFAULT.getSaveBehavior();
            consistentReads = DEFAULT.getConsistentReads();
            tableNameOverride = DEFAULT.getTableNameOverride();
            tableNameResolver = DEFAULT.getTableNameResolver();
            objectTableNameResolver = DEFAULT.getObjectTableNameResolver();
            paginationLoadingStrategy = DEFAULT.getPaginationLoadingStrategy();
            requestMetricCollector = DEFAULT.getRequestMetricCollector();
            conversionSchema = DEFAULT.getConversionSchema();
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
         * @return the currently-configured consistent read behavior
         */
        public ConsistentReads getConsistentReads() {
            return consistentReads;
        }

        /**
         * @param value the new consistent read behavior
         */
        public void setConsistentReads(ConsistentReads value) {
            consistentReads = value;
        }

        /**
         * @param value the new consistent read behavior
         * @return this builder
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
         * Builds a new {@code DynamoDBMapperConfig} object.
         *
         * @return the new, immutable config object
         */
        public DynamoDBMapperConfig build() {
            return new DynamoDBMapperConfig(
                    saveBehavior,
                    consistentReads,
                    tableNameOverride,
                    tableNameResolver,
                    objectTableNameResolver,
                    paginationLoadingStrategy,
                    requestMetricCollector,
                    conversionSchema);
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
         * CLOBBER will clear and replace all attributes, included unmodeled
         * ones, (delete and recreate) on save. Versioned field constraints will
         * also be disregarded.
         */
        CLOBBER,

        /**
         * APPEND_SET treats scalar attributes (String, Number, Binary) the same
         * as UPDATE_SKIP_NULL_ATTRIBUTES does. However, for set attributes, it
         * will append to the existing attribute value, instead of overriding
         * it. Caller needs to make sure that the modeled attribute type matches
         * the existing set type, otherwise it would result in a service
         * exception.
         */
        APPEND_SET
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
        EVENTUAL
    };

    /**
     * Enumeration of pagination loading strategy.
     */
    public static enum PaginationLoadingStrategy {
        /**
         * Paginated list is lazily loaded when possible, and all loaded results
         * are kept in the memory.
         * <p>
         * By default, the mapper uses LAZY_LOADING.
         */
        LAZY_LOADING,

        /**
         * Only supports using iterator to read from the paginated list. All
         * other list operations will return UnsupportedOperationException
         * immediately. During the iteration, the list will clear all the
         * previous results before loading the next page, so that the list will
         * keep at most one page of the loaded results in memory. This also
         * means the list could only be iterated once.
         * <p>
         * Use this configuration to reduce the memory overhead when handling
         * large DynamoDB items.
         */
        ITERATION_ONLY,

        /**
         * Paginated list will eagerly load all the paginated results from
         * DynamoDB as soon as the list is initialized.
         */
        EAGER_LOADING
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

        private TableNameOverride(
                String tableNameOverride,
                String tableNamePrefix) {

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
    }

    /**
     * Interface for a strategy used to determine the table name of an object based on it's class.
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
     * Interface for a strategy used to determine the table name of an object based on it's class.
     * This resolver is used when an object is available such as in
     * {@link DynamoDBMapper#batchLoad(java.util.List)}.
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
        private final DynamoDBReflector reflector = new DynamoDBReflector();

        @Override
        public String getTableName(Class<?> clazz, DynamoDBMapperConfig config) {
            final TableNameOverride override = config.getTableNameOverride();

            if (override != null) {
                final String tableName = override.getTableName();
                if (tableName != null) {
                    return tableName;
                }
            }

            final String tableName = reflector.getTable(clazz).tableName();
            final String prefix = override == null
                ? null : override.getTableNamePrefix();
            return prefix == null ? tableName : prefix + tableName;
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

    /**
     * Legacy constructor, using default PaginationLoadingStrategy
     * @deprecated in favor of the fluent {@link Builder}
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
     * @deprecated in favor of the fluent {@code Builder}
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
     * @deprecated in favor of the fluent {@code Builder}
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
                ConversionSchemas.DEFAULT);
    }

    private DynamoDBMapperConfig(
            SaveBehavior saveBehavior,
            ConsistentReads consistentReads,
            TableNameOverride tableNameOverride,
            TableNameResolver tableNameResolver,
            ObjectTableNameResolver objectTableNameResolver,
            PaginationLoadingStrategy paginationLoadingStrategy,
            RequestMetricCollector requestMetricCollector,
            ConversionSchema conversionSchema) {

        this.saveBehavior = saveBehavior;
        this.consistentReads = consistentReads;
        this.tableNameOverride = tableNameOverride;
        this.tableNameResolver = tableNameResolver;
        this.objectTableNameResolver = objectTableNameResolver;
        this.paginationLoadingStrategy = paginationLoadingStrategy;
        this.requestMetricCollector = requestMetricCollector;
        this.conversionSchema = conversionSchema;
    }

    /**
     * Constructs a new configuration object with the save behavior given.
     */
    public DynamoDBMapperConfig(SaveBehavior saveBehavior) {
        this(saveBehavior, null, null, null, null, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the consistent read behavior
     * given.
     */
    public DynamoDBMapperConfig(ConsistentReads consistentReads) {
        this(null, consistentReads, null, null, null, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the table name override given.
     */
    public DynamoDBMapperConfig(TableNameOverride tableNameOverride) {
        this(null, null, tableNameOverride, null, null, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the table name resolver strategy given.
     */
    public DynamoDBMapperConfig(TableNameResolver tableNameResolver) {
        this(null, null, null, tableNameResolver, null, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the object table name resolver strategy given.
     */
    public DynamoDBMapperConfig(ObjectTableNameResolver objectTableNameResolver) {
        this(null, null, null, null, objectTableNameResolver, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the table name resolver strategies given.
     */
    public DynamoDBMapperConfig(TableNameResolver tableNameResolver, ObjectTableNameResolver objectTableNameResolver) {
        this(null, null, null, tableNameResolver, objectTableNameResolver, null, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the pagination loading
     * strategy given.
     */
    public DynamoDBMapperConfig(
            PaginationLoadingStrategy paginationLoadingStrategy) {

        this(null, null, null, null, null, paginationLoadingStrategy, null,
                ConversionSchemas.DEFAULT);
    }

    /**
     * Constructs a new configuration object with the conversion schema given.
     */
    public DynamoDBMapperConfig(ConversionSchema conversionSchema) {
        this(null, null, null, null, null, null, null, conversionSchema);
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
     */
    public DynamoDBMapperConfig(
            DynamoDBMapperConfig defaults,
            DynamoDBMapperConfig overrides) {

        if ( overrides == null ) {

            this.saveBehavior = defaults.getSaveBehavior();
            this.consistentReads = defaults.getConsistentReads();
            this.tableNameOverride = defaults.getTableNameOverride();
            this.tableNameResolver = defaults.getTableNameResolver();
            this.objectTableNameResolver = defaults.getObjectTableNameResolver();
            this.paginationLoadingStrategy =
                    defaults.getPaginationLoadingStrategy();
            this.requestMetricCollector = defaults.getRequestMetricCollector();
            this.conversionSchema = defaults.getConversionSchema();

        } else {

            this.saveBehavior = (overrides.getSaveBehavior() == null)
                    ? defaults.getSaveBehavior()
                    : overrides.getSaveBehavior();

            this.consistentReads = (overrides.getConsistentReads() == null)
                    ? defaults.getConsistentReads()
                    : overrides.getConsistentReads();

            this.tableNameOverride = (overrides.getTableNameOverride() == null)
                    ? defaults.getTableNameOverride()
                    : overrides.getTableNameOverride();

            this.tableNameResolver = (overrides.getTableNameResolver() == null)
                    ? defaults.getTableNameResolver()
                    : overrides.getTableNameResolver();

            this.objectTableNameResolver = (overrides.getObjectTableNameResolver() == null)
                    ? defaults.getObjectTableNameResolver()
                    : overrides.getObjectTableNameResolver();

            this.paginationLoadingStrategy =
                    (overrides.getPaginationLoadingStrategy() == null)
                    ? defaults.getPaginationLoadingStrategy()
                    : overrides.getPaginationLoadingStrategy();

            this.requestMetricCollector =
                    (overrides.getRequestMetricCollector() == null)
                    ? defaults.getRequestMetricCollector()
                    : overrides.getRequestMetricCollector();

            this.conversionSchema = (overrides.getConversionSchema() == null)
                    ? defaults.getConversionSchema()
                    : overrides.getConversionSchema();

        }
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
     * Default configuration uses UPDATE behavior for saves and EVENTUALly
     * consistent reads, with no table name override and lazy-loading strategy.
     */
    public static final DynamoDBMapperConfig DEFAULT = new DynamoDBMapperConfig(
            SaveBehavior.UPDATE,
            ConsistentReads.EVENTUAL,
            null,  // TableNameOverride
            null, // TableNameResolver
            null, // ObjectTableNameResolver
            PaginationLoadingStrategy.LAZY_LOADING,
            null,  // RequestMetricCollector
            ConversionSchemas.DEFAULT);
}
