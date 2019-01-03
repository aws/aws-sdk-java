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
package com.amazonaws.metrics.internal.cloudwatch.spi;

/**
 * Common CloudWatch dimensions defined and used by the request metric
 * transformer providers.
 * Beware that changing the names of these enum literals will affect the
 * metric dimensional names displayed in CloudWatch.
 */
public enum Dimensions {
    /**
     * Type of metric such as HttpRequestTime, ClientExecuteTime, etc.
     */
    MetricType,
    /**
     * Type of request such as PutItemRequest, GetMetricStatisticsRequest,
     * etc.
     */
    RequestType,
    /**
     * Host used for per-host level metrics with a single metric namespace.
     */
    Host,
    /**
     * JVM used for per-JVM level metrics with a single metric namespace.
     */
    JVM,
    ;
}