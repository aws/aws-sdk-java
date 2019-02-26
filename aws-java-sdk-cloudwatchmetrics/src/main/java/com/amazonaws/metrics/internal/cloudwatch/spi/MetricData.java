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

import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;

/**
 * Metric Datum related utilities.
 */
public enum MetricData {
    ;
    /**
     * Returns a new metric datum cloned from the given metric datum, but
     * replacing the dimensions with the newly specified ones.
     */
    public static MetricDatum newMetricDatum(MetricDatum from, Dimension ... dimensions) {
        return new MetricDatum()
            .withMetricName(from.getMetricName())
            .withDimensions(dimensions)
            .withUnit(from.getUnit())
            .withValue(from.getValue())
            .withStatisticValues(from.getStatisticValues())
            .withTimestamp(from.getTimestamp())
            ;
    }
}
