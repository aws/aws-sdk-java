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
package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.ServiceEndpointBuilder;
import com.amazonaws.regions.Region;
import com.amazonaws.util.json.Jackson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;
import java.net.URISyntaxException;


/**
 * Uses region metadata to construct a dualstack endpoint for a specific service
 */
public class DualstackEndpointBuilder extends ServiceEndpointBuilder {

    private final String serviceName;
    private final String protocol;
    private Region region;

    public DualstackEndpointBuilder(String serviceName, String protocol, Region region) {
        this.serviceName = serviceName;
        this.protocol = protocol;
        this.region = region;
    }

    @Override
    public DualstackEndpointBuilder withRegion(Region region) {
        if (region == null) {
            throw new IllegalArgumentException("Region cannot be null");
        }
        this.region = region;
        return this;
    }

    @Override
    public URI getServiceEndpoint() {
        String serviceEndpoint = String.format("%s.%s.%s.%s", serviceName, Constants.S3_DUALSTACK_QUALIFIER, region.getName(), region.getDomain());
        return toURI(stripProtocol(serviceEndpoint));
    }

    private String stripProtocol(final String endpoint) {
        final int protocolIndex = endpoint.indexOf("://");
        return protocolIndex >= 0 ? endpoint.substring(protocolIndex + "://".length()) : endpoint;
    }

    private URI toURI(String endpoint) throws IllegalArgumentException {
        try {
            return new URI(String.format("%s://%s", protocol, endpoint));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Region getRegion() {
        return region;
    }
}
