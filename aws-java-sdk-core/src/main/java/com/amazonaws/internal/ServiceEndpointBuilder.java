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
package com.amazonaws.internal;

import java.net.URI;

import com.amazonaws.regions.Region;

/**
 * Construct a service endpoint based on metadata like service name and region
 */
public abstract class ServiceEndpointBuilder {

    /**
     * Get the URI of the service endpoint
     * 
     * @return URI of endpoint
     */
    public abstract URI getServiceEndpoint();

    public abstract Region getRegion();

    /**
     * Changes the region of the endpoint builder
     * 
     * @param region
     *            New region to use in endpoint determination
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public abstract ServiceEndpointBuilder withRegion(Region region);
}