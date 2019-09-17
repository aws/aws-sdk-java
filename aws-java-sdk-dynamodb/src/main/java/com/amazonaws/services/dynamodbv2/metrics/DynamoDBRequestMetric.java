/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.metrics;

import com.amazonaws.metrics.RequestMetricType;

/**
 * DynamoDB specific request metric type.
 */
public enum DynamoDBRequestMetric implements RequestMetricType {
    /** Number of capacity units consumed. */
    DynamoDBConsumedCapacity,
    ;
}
