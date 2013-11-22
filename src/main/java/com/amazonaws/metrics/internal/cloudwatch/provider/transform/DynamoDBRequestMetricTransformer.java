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

package com.amazonaws.metrics.internal.cloudwatch.provider.transform;

import java.util.List;

import org.apache.http.annotation.ThreadSafe;

import com.amazonaws.Request;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.internal.cloudwatch.spi.AWSMetricTransformerFactory;
import com.amazonaws.metrics.internal.cloudwatch.spi.RequestMetricTransformer;
import com.amazonaws.services.cloudwatch.model.MetricDatum;

/**
 * An internal service provider implementation for an DyanmoDB specific request
 * metric transformer.
 * 
 * This class is loaded only if there are Amazon DyanmoDB specific predefined
 * metrics to be processed.
 * 
 * @see AWSMetricTransformerFactory
 */
@ThreadSafe
public class DynamoDBRequestMetricTransformer implements RequestMetricTransformer {
    @Override
    public List<MetricDatum> toMetricData(MetricType metricType, Request<?> request, Object response) {
        return null;    // TBD
    }
}
