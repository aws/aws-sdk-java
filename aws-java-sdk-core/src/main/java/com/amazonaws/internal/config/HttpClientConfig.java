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
package com.amazonaws.internal.config;

import com.amazonaws.annotation.Immutable;

/**
 * AWS HttpClient configuration.
 */
@Immutable
public class HttpClientConfig {
    // This class is not strictly necessary for the existing use cases,
    // but allows future expansion of additional configurations to be made
    // with ease.
    private final String serviceName;
    private final String regionMetadataServiceName;

    /**
     * @param serviceName
     *            The service name used for request signing. It's also used as
     *            the service identifier when looking up the region metadata if
     *            regionMetadataServiceName is not set.
     * @param regionMetadataServiceName
     *            Override value for the service name identifier when looking up
     *            the region metadata. This config is normally needed in
     *            scenarios when a common sigv4 service name is shared by
     *            multiple services that have different region metadata (for
     *            example, AmazonDynamoDBClient and AmazonDynamoDBStreamsClient
     *            share the same service name 'dynamodb' but not the same
     *            endpoint prefix).
     */
    HttpClientConfig(String serviceName, String regionMetadataServiceName) {
        this.serviceName = serviceName;
        this.regionMetadataServiceName = regionMetadataServiceName;
    }

    @Override public String toString() {
        return "serviceName: " + serviceName + ", regionMetadataServiceName: "
                + regionMetadataServiceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getRegionMetadataServiceName() {
        return regionMetadataServiceName;
    }

}