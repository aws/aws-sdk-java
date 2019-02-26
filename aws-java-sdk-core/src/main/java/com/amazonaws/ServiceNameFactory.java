/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/**
 * An internal service name factory.
 */
enum ServiceNameFactory {
    ;

    /**
     * Returns the serviceName config for the specified service client, or null
     * if no explicit config is found.
     */
    static String getServiceName(String httpClientName) {
        InternalConfig config = InternalConfig.Factory.getInternalConfig();
        HttpClientConfig clientConfig = config.getHttpClientConfig(httpClientName);
        return clientConfig == null ? null : clientConfig.getServiceName();
    }

    /**
     * Returns the regionMetadataServiceName config for the specified service
     * client, or null if no explicit config is found.
     */
    static String getServiceNameInRegionMetadata(String httpClientName) {
        InternalConfig config = InternalConfig.Factory.getInternalConfig();
        HttpClientConfig clientConfig = config.getHttpClientConfig(httpClientName);
        return clientConfig == null ? null : clientConfig.getRegionMetadataServiceName();
    }

}
