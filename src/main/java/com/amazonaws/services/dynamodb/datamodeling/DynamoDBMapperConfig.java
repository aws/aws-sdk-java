/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
     * <p>
     * UPDATE will not affect unmodeled attributes on a save operation. CLOBBER
     * will clear and replace all attributes, included unmodeled ones, (delete
     * and recreate) on save. Versioned field constraints will also be
     * disregarded.
     * <p>
     * By default, the mapper uses UPDATE.
     */
    public static enum SaveBehavior {
        UPDATE, CLOBBER
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
     * Allows overriding the table name declared on a domain class by the
     * {@link DynamoDBTable} annotation.
     */
    public static final class TableNameOverride {

        private final String tableNameOverride;

        public TableNameOverride(String tableNameOverride) {
            this.tableNameOverride = tableNameOverride;
        }

        /**
         * @see DynamoDBMapperConfig#getTableNameOverride()
         */
        public String getTableName() {
            return tableNameOverride;
        }

    }

    private final SaveBehavior saveBehavior;
    private final ConsistentReads consistentReads;
    private final TableNameOverride tableNameOverride;

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
     */
    public DynamoDBMapperConfig(SaveBehavior saveBehavior, ConsistentReads consistentReads,
            TableNameOverride tableNameOverride) {
        this.saveBehavior = saveBehavior;
        this.consistentReads = consistentReads;
        this.tableNameOverride = tableNameOverride;
    }

    /**
     * Constructs a new configuration object with the save behavior given.
     */
    public DynamoDBMapperConfig(SaveBehavior saveBehavior) {
        this(saveBehavior, null, null);
    }

    /**
     * Constructs a new configuration object with the consistent read behavior
     * given.
     */
    public DynamoDBMapperConfig(ConsistentReads consistentReads) {
        this(null, consistentReads, null);
    }

    /**
     * Constructs a new configuration object with the table name override given.
     */
    public DynamoDBMapperConfig(TableNameOverride tableNameOverride) {
        this(null, null, tableNameOverride);
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
        } else {
            this.saveBehavior = overrides.getSaveBehavior() == null ? defaults.getSaveBehavior() : overrides
                    .getSaveBehavior();
            this.consistentReads = overrides.getConsistentReads() == null ? defaults.getConsistentReads() : overrides
                    .getConsistentReads();
            this.tableNameOverride = overrides.getTableNameOverride() == null ? defaults.getTableNameOverride()
                    : overrides.getTableNameOverride();
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
     * override the table name specified in a {@link DynamoDBTable} annotation.
     * This is useful for partitioning data in multiple tables at runtime.
     */
    public TableNameOverride getTableNameOverride() {
        return tableNameOverride;
    }

    /**
     * Default configuration uses UPDATE behavior for saves and EVENTUALly
     * consistent reads, with no table name override.
     */
    public static final DynamoDBMapperConfig DEFAULT = new DynamoDBMapperConfig(SaveBehavior.UPDATE,
            ConsistentReads.EVENTUAL, null);
}
