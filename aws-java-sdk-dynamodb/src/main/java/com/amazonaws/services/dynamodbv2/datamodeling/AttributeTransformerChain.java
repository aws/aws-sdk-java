/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A virtual {@code AttributeTransformer} that transforms and untransforms
 * attributes by running them through a cascading series of child
 * {@code AttributeTransformer} instances.
 */
public class AttributeTransformerChain implements AttributeTransformer {

    private final List<AttributeTransformer> transformers;

    /**
     * Creates a new transformer chain from the given array of transformers.
     * When transforming attributes, these transformers are invoked from first
     * to last; when untransforming they are invoked in the opposite order.
     *
     * @param transformers the chain of transformers.
     */
    public AttributeTransformerChain(
            final AttributeTransformer... transformers) {

        this(Arrays.asList(transformers));
    }

    /**
     * Creates a new transformer chain from the given list of transformers.
     * When transforming attributes, these transformers are invoked from first
     * to last; when untransforming they are invoked in the opposite order.
     *
     * @param transformers the chain of transformers.
     */
    public AttributeTransformerChain(
            final List<AttributeTransformer> transformers) {

        this.transformers = Collections.unmodifiableList(
            new ArrayList<AttributeTransformer>(transformers));
    }

    /**
     * @return the transformers in this chain
     */
    public List<AttributeTransformer> getTransformers() {
        return transformers;
    }

    @Override
    public Map<String, AttributeValue> transform(
            final Parameters<?> parameters) {

        ProxyParameters<?> proxy = new ProxyParameters(parameters);

        for (int i = 0; i < transformers.size(); ++i) {
            proxy.setAttributeValues(transformers.get(i).transform(proxy));
        }

        return proxy.getAttributeValues();
    }

    @Override
    public Map<String, AttributeValue> untransform(
            final Parameters<?> parameters) {

        ProxyParameters<?> proxy = new ProxyParameters(parameters);

        for (int i = transformers.size() - 1; i >= 0; --i) {
            proxy.setAttributeValues(transformers.get(i).untransform(proxy));
        }

        return proxy.getAttributeValues();
    }

    @Override
    public String toString() {
        return transformers.toString();
    }

    /**
     * A {@code Parameters} proxy that intercepts calls to
     * {@code getAttributeValues} and overrides the return value.
     */
    private static class ProxyParameters<T> implements Parameters<T> {

        private final Parameters<T> delegate;
        private Map<String, AttributeValue> values;

        /**
         * Create a new proxy wrapping the given {@code Parameters} object.
         *
         * @param delegate the parameters object to wrap
         */
        public ProxyParameters(final Parameters<T> delegate) {
            this.delegate = delegate;
            this.values = delegate.getAttributeValues();
        }

        @Override
        public Map<String, AttributeValue> getAttributeValues() {
            return values;
        }

        /**
         * Changes the attribute values for this instance.
         *
         * @param values the new values
         */
        public void setAttributeValues(
                final Map<String, AttributeValue> values) {
            this.values = Collections.unmodifiableMap(values);
        }

        @Override
        public boolean isPartialUpdate() {
            return delegate.isPartialUpdate();
        }

        @Override
        public Class<T> getModelClass() {
            return delegate.getModelClass();
        }

        @Override
        public DynamoDBMapperConfig getMapperConfig() {
            return delegate.getMapperConfig();
        }

        @Override
        public String getTableName() {
            return delegate.getTableName();
        }

        @Override
        public String getHashKeyName() {
            return delegate.getHashKeyName();
        }

        @Override
        public String getRangeKeyName() {
            return delegate.getRangeKeyName();
        }
    }
}
