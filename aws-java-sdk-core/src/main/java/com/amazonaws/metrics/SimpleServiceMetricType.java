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
package com.amazonaws.metrics;

public class SimpleServiceMetricType extends SimpleMetricType implements ServiceMetricType {
    private final String name;
    private final String serviceName;
    public SimpleServiceMetricType(String name, String serviceName) {
        this.name = name;
        this.serviceName = serviceName;
    }
    @Override public String name() { return name; }
    @Override public String getServiceName() { return serviceName; }
}
