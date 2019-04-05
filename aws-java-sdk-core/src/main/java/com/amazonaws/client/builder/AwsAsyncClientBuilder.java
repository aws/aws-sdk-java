/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.client.builder;

import com.amazonaws.ClientConfigurationFactory;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.regions.AwsRegionProvider;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Base class for all service specific async client builders.
 *
 * @param <Subclass> Concrete builder type, used for better fluent methods.
 */
@NotThreadSafe
@SdkProtectedApi
public abstract class AwsAsyncClientBuilder<Subclass extends AwsAsyncClientBuilder, TypeToBuild> extends
                                                                                                 AwsClientBuilder<Subclass, TypeToBuild> {
    private ExecutorFactory executorFactory;

    protected AwsAsyncClientBuilder(ClientConfigurationFactory clientConfigFactory) {
        super(clientConfigFactory);
    }

    @SdkTestInternalApi
    protected AwsAsyncClientBuilder(ClientConfigurationFactory clientConfigFactory,
                                    AwsRegionProvider regionProvider) {
        super(clientConfigFactory, regionProvider);
    }


    /**
     * @return The {@link ExecutorFactory} currently configured by the client.
     */
    public final ExecutorFactory getExecutorFactory() {
        return executorFactory;
    }

    /**
     * Sets a custom executor service factory to use for the async clients. The factory will be
     * called for each async client created through the builder.
     *
     * @param executorFactory Factory supplying new instances of {@link ExecutorService}
     */
    public final void setExecutorFactory(ExecutorFactory executorFactory) {
        this.executorFactory = executorFactory;
    }

    /**
     * Sets a custom executor service factory to use for the async clients. The factory will be
     * called for each async client created through the builder.
     *
     * @param executorFactory Factory supplying new instances of {@link ExecutorService}
     * @return This object for method chaining.
     */
    public final Subclass withExecutorFactory(ExecutorFactory executorFactory) {
        setExecutorFactory(executorFactory);
        return getSubclass();
    }

    @Override
    public final TypeToBuild build() {
        return configureMutableProperties(build(getAsyncClientParams()));
    }

    protected abstract TypeToBuild build(AwsAsyncClientParams asyncClientParams);

    /**
     * @return An instance of AwsAsyncClientParams that has all params to be used in the async
     * client constructor.
     */
    protected final AwsAsyncClientParams getAsyncClientParams() {
        return new AsyncBuilderParams(executorFactory);
    }

    /**
     * Presents a view of the builder to be used in the async client constructor.
     */
    protected class AsyncBuilderParams extends SyncBuilderParams {

        private final ExecutorService _executorService;

        protected AsyncBuilderParams(ExecutorFactory executorFactory) {
            this._executorService =
                    (executorFactory == null) ? defaultExecutor() : executorFactory.newExecutor();
        }

        @Override
        public ExecutorService getExecutor() {
            return this._executorService;
        }

        /**
         * @return Default async Executor to use if none is explicitly provided by user.
         */
        private ExecutorService defaultExecutor() {
            return Executors.newFixedThreadPool(getClientConfiguration().getMaxConnections());
        }
    }

}
