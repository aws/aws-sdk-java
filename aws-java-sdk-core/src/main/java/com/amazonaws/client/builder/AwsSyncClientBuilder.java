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
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.regions.AwsRegionProvider;

/**
 * Base class for all service specific sync client builders.
 *
 * @param <Subclass>    Concrete builder type, used for better fluent methods.
 * @param <TypeToBuild> Client interface this builder can build.
 */
@NotThreadSafe
@SdkProtectedApi
public abstract class AwsSyncClientBuilder<Subclass extends AwsSyncClientBuilder, TypeToBuild> extends
                                                                                               AwsClientBuilder<Subclass, TypeToBuild> {
    protected AwsSyncClientBuilder(ClientConfigurationFactory clientConfigFactory) {
        super(clientConfigFactory);
    }

    @SdkTestInternalApi
    protected AwsSyncClientBuilder(ClientConfigurationFactory clientConfigFactory,
                                   AwsRegionProvider regionProvider) {
        super(clientConfigFactory, regionProvider);
    }

    @Override
    public final TypeToBuild build() {
        return configureMutableProperties(build(getSyncClientParams()));
    }

    /**
     * Overriden by subclasses to call the client constructor.
     *
     * @param clientParams Client Params to create client with
     * @return Built client.
     */
    protected abstract TypeToBuild build(AwsSyncClientParams clientParams);

}
