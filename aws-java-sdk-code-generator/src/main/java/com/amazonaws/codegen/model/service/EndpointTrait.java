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

package com.amazonaws.codegen.model.service;

/**
 * This trait can be used to resolve the endpoint of an API using the original endpoint
 * derived from client or set by customer.
 *
 * This trait allows using modeled members in the input shape to modify the endpoint. This is for SDK internal use.
 *
 * See `API Operation Endpoint Trait` SEP
 */
public final class EndpointTrait {
    /**
     * Expression that must be expanded by the client before invoking the API call.
     * The expanded expression is added as a prefix to the original endpoint host derived on the client.
     */
    private String hostPrefix;

    public String getHostPrefix() {
        return hostPrefix;
    }

    public void setHostPrefix(String hostPrefix) {
        this.hostPrefix = hostPrefix;
    }
}
