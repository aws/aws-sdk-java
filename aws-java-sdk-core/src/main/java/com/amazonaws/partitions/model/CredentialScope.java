/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.partitions.model;

/**
 * credential scope associated with an endpoint.
 */
public class CredentialScope {

    /**
     * region string to be used when signing a request for an endpoint.
     */
    private String region;

    /**
     * service name string to be used when signing a request for an endpoint
     */
    private String service;

    /**
     * Returns the region string to be used when signing a request for an
     * endpoint.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region string to be used when signing a request for an
     * endpoint.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Returns the service name string to be used when signing a request for an
     * endpoint.
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the service name string to be used when signing a request for an
     * endpoint.
     */
    public void setService(String service) {
        this.service = service;
    }
}
