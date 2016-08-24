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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Bean;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardBeanProperties.Beans;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardConverterRules.Rule;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardConverterRules.RuleFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Pre-defined strategies for mapping between Java types and DynamoDB types.
 */
@SdkInternalApi
final class StandardModelFactories {

    /**
     * Creats a new standard {@link DynamoDBMapperModelFactory} factory.
     */
    static final DynamoDBMapperModelFactory.Factory newFactory(final S3ClientCache s3cc) {
        return new ConversionSchemaFactory(s3cc);
    }

    /**
     * {@link DynamoDBMapperModelFactory} mapped by {@link ConversionSchema}.
     */
    private static final class ConversionSchemaFactory implements DynamoDBMapperModelFactory.Factory {
        private final ConcurrentMap<ConversionSchema,DynamoDBMapperModelFactory> cache;
        private final S3ClientCache s3cc;

        private ConversionSchemaFactory(final S3ClientCache s3cc) {
            this.cache = new ConcurrentHashMap<ConversionSchema,DynamoDBMapperModelFactory>();
            this.s3cc = s3cc;
        }

        @Override
        public DynamoDBMapperModelFactory getModelFactory(final DynamoDBMapperConfig config) {
            final ConversionSchema schema = config.getConversionSchema();
            if (!cache.containsKey(schema)) {
                RuleFactory rules = StandardConverterRules.of(config, this, s3cc);
                rules = new ConversionSchemas.ItemConverterRuleFactory(config, s3cc, rules);
                cache.putIfAbsent(schema, new StandardModelFactory(rules));
            }
            return cache.get(schema);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} factory with {@link ItemConverter}.
     */
    private static final class StandardModelFactory implements DynamoDBMapperModelFactory {
        private final ConcurrentMap<Class<?>,DynamoDBMapperTableModel<?>> cache;
        private final RuleFactory rules;

        private StandardModelFactory(final RuleFactory rules) {
            this.cache = new ConcurrentHashMap<Class<?>,DynamoDBMapperTableModel<?>>();
            this.rules = rules;
        }

        @Override
        public <T> DynamoDBMapperTableModel<T> getTableModel(final Class<T> targetType) {
            if (!this.cache.containsKey(targetType)) {
                final Beans<T> beans = StandardBeanProperties.of(targetType);
                this.cache.putIfAbsent(targetType, new TableModelBuilder(beans, rules).build());
            }
            return (DynamoDBMapperTableModel<T>)this.cache.get(targetType);
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    private static final class TableModelBuilder<T> extends DynamoDBMapperTableModel.Builder<T> {
        private TableModelBuilder(final Beans<T> beans, final RuleFactory rules) {
            super(beans);
            for (final Bean<T,Object> bean : beans.map().values()) {
                with(new FieldModelBuilder(bean, rules.getRule(bean)).build());
            }
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} builder.
     */
    private static final class FieldModelBuilder<T,V> extends DynamoDBMapperFieldModel.Builder<T,V> {
        private FieldModelBuilder(final Bean<T,V> bean, final Rule<V> rule) {
            super(bean);
            with(rule.getDynamoDBAttributeType());
            with(rule.newConverter(bean.type()));
            with(bean.reflect());
        }
    }

}
