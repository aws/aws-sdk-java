/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * {@link DynamoDBMapper} table model factory.
 */
public interface DynamoDBMapperModelFactory {

    /**
     * Gets the table model for the given type and configuration.
     * @param <T> The object type.
     * @param targetType The type.
     * @return The table model.
     */
    public <T> DynamoDBMapperTableModel<T> getTableModel(Class<T> targetType);

    /**
     * {@link DynamoDBMapperModelFactory} factory.
     */
    public static interface Factory {
        /**
         * Gets/creates the mapper's model factory.
         * @param config The DynamoDB mapper config.
         * @return The mapper model factory.
         */
        public DynamoDBMapperModelFactory getModelFactory(DynamoDBMapperConfig config);
    }

    /**
     * The enumeration of standard conversion schema versions.
     */
    public static enum Schema {
        /**
         * The V1 schema mapping, which retains strict backwards compatibility with
         * the original DynamoDB data model. In particular, it marshals Java
         * Booleans as DynamoDB Numbers rather than the newer Boolean type, and does
         * not support marshaling Lists or Maps. It <em>can</em> unmarshal
         * values written in newer formats to ease migration.
         * <p>
         * Use me if you have other code still using an old version of the SDK that
         * does not understand the new List and Map types and want to ensure that
         * you don't accidentally start writing values using these types.
         */
        V1_0(ConversionSchemas.V1),

        /**
         * A V2 conversion schema which retains backwards compatibility with the
         * V1 conversion schema for existing DynamoDB types, but adds the ability
         * to marshall recursive structures using the new List and Map types. This
         * is currently the default conversion schema.
         */
        V1_5(ConversionSchemas.V2_COMPATIBLE),

        /**
         * The native V2 conversion schema. This schema breaks compatibility with
         * older versions of the mapper that only support the V1 schema by
         * storing booleans as native DynamoDB Booleans rather than as a 1 or 0
         * in a DynamoDB Number. Switching to the V2 schema will prevent older
         * versions of the mapper from reading items you write that contain
         * booleans.
         */
        V2_0(ConversionSchemas.V2);

        /**
         * The default schema version.
         */
        public static final Schema DEFAULT = Schema.V1_5;

        /**
         * The conversion schema.
         */
        private final ConversionSchema schema;

        /**
         * Constructs a new schema.
         * @param schema The schema.
         */
        private Schema(final ConversionSchema schema) {
            this.schema = schema;
        }

        /**
         * Returns true if this schema is compatible from the specified schema.
         * @param schema The schema to compare.
         * @return True if compatible, false otherwise.
         */
        public boolean compatible(final Schema schema) {
            return schema != null && schema.ordinal() >= this.ordinal();
        }

        /**
         * Gets the {@link Schema} from the {@link DynamoDBMapperConfig}.
         * @param config The DynamoDB mapper config.
         * @return The schema.
         */
        public static Schema of(final DynamoDBMapperConfig config) {
            for (final Schema schema : Schema.values()) {
                if (schema.schema == config.getConversionSchema()) {
                    return schema;
                }
            }
            return null;
        }
    }

}
