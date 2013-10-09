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

/**
 * Immutable configuration object for service call behavior. An instance of this
 * configuration is supplied to every {@link DynamoDBMapper} at construction; if
 * not provided explicitly, {@link DynamoDBMapperConfig#DEFAULT} is used. New
 * instances can be given to the mapper object on individual save, load, and
 * delete operations to override the defaults. For example:
 * 
 * <pre>
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
        CONSISTENT, EVENTUAL
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
        public static TableNameOverride withTableNamePrefix(String tableNamePrefix) {
            return new TableNameOverride(null, tableNamePrefix);
        }

        /**
         * Returns a new {@link TableNameOverride} object that will replace
         * every table name in requests with the given string.
         */
        public static TableNameOverride withTableNameReplacement(String tableNameReplacement) {
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
    }

    private final SaveBehavior saveBehavior;
    private final ConsistentReads consistentReads;
    private final TableNameOverride tableNameOverride;
    private final PaginationLoadingStrategy paginationLoadingStrategy;

    /** Legacy constructor, using default PaginationLoadingStrategy **/
    public DynamoDBMapperConfig(SaveBehavior saveBehavior, ConsistentReads consistentReads,
            TableNameOverride tableNameOverride) {
        this(saveBehavior, consistentReads, tableNameOverride, null);
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
     */
    public DynamoDBMapperConfig(SaveBehavior saveBehavior, ConsistentReads consistentReads,
            TableNameOverride tableNameOverride, PaginationLoadingStrategy paginationLoadingStrategy) {
        this.saveBehavior = saveBehavior;
        this.consistentReads = consistentReads;
        this.tableNameOverride = tableNameOverride;
        this.paginationLoadingStrategy = paginationLoadingStrategy;
    }

    /**
     * Constructs a new configuration object with the save behavior given.
     */
    public DynamoDBMapperConfig(SaveBehavior saveBehavior) {
        this(saveBehavior, null, null, null);
    }

    /**
     * Constructs a new configuration object with the consistent read behavior
     * given.
     */
    public DynamoDBMapperConfig(ConsistentReads consistentReads) {
        this(null, consistentReads, null, null);
    }

    /**
     * Constructs a new configuration object with the table name override given.
     */
    public DynamoDBMapperConfig(TableNameOverride tableNameOverride) {
        this(null, null, tableNameOverride, null);
    }
    
    /**
     * Constructs a new configuration object with the pagination loading strategy given.
     */
    public DynamoDBMapperConfig(PaginationLoadingStrategy paginationLoadingStrategy) {
        this(null, null, null, paginationLoadingStrategy);
    }

    /**
     * Constructs a new configuration object from two others: a set of defaults
     * and a set of overrides. Any non-null overrides will be applied to the
     * defaults.
     * <p>
     * Used internally to merge the {@link DynamoDBMapperConfig} provided at
     * construction with an overriding object for a particular operation.
     */
    DynamoDBMapperConfig(DynamoDBMapperConfig defaults, DynamoDBMapperConfig overrides) {
        if ( overrides == null ) {
            this.saveBehavior = defaults.getSaveBehavior();
            this.consistentReads = defaults.getConsistentReads();
            this.tableNameOverride = defaults.getTableNameOverride();
            this.paginationLoadingStrategy = defaults.getPaginationLoadingStrategy();
        } else {
            this.saveBehavior = overrides.getSaveBehavior() == null ? defaults.getSaveBehavior() : overrides
                    .getSaveBehavior();
            this.consistentReads = overrides.getConsistentReads() == null ? defaults.getConsistentReads() : overrides
                    .getConsistentReads();
            this.tableNameOverride = overrides.getTableNameOverride() == null ? defaults.getTableNameOverride()
                    : overrides.getTableNameOverride();
            this.paginationLoadingStrategy = overrides.getPaginationLoadingStrategy() == null ? defaults.getPaginationLoadingStrategy()
                    : overrides.getPaginationLoadingStrategy();
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
     * Returns the pagination loading strategy for this configuration.
     */
    public PaginationLoadingStrategy getPaginationLoadingStrategy() {
        return paginationLoadingStrategy;
    }

    /**
     * Default configuration uses UPDATE behavior for saves and EVENTUALly
     * consistent reads, with no table name override and lazy-loading strategy.
     */
    public static final DynamoDBMapperConfig DEFAULT = new DynamoDBMapperConfig(SaveBehavior.UPDATE,
            ConsistentReads.EVENTUAL, null, PaginationLoadingStrategy.LAZY_LOADING);
}
