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

/**
 * An internal class used to build {@link HttpClientConfig} after this
 * class per se has been unmarshalled from JSON. This class allows us to make
 * use of Jackson without the need to write any special parser or json
 * marshaller/unmarshaller.
 */
class HttpClientConfigJsonHelper implements Builder<HttpClientConfig> {
    private String serviceName;

    HttpClientConfigJsonHelper(String serviceName) {
        this.serviceName = serviceName;
    }

    HttpClientConfigJsonHelper() {}

    @Override public String toString() {
        return "serviceName: " + serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override public HttpClientConfig build() {
        return new HttpClientConfig(serviceName);
    }
}