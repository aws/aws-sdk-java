/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.apache.http.annotation.Immutable;

/**
 * AWS HttpClient configuration.
 */
@Immutable
public class HttpClientConfig {
    // This class is not strictly necessary for the existing use cases,
    // but allows future expansion of additional configurations to be made
    // with ease.
    private final String serviceName;

    HttpClientConfig(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override public String toString() {
        return "serviceName: " + serviceName;
    }

     public String getServiceName() {
        return serviceName;
    }
}