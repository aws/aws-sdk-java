/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.metrics;

/**
 * A {@link MetricsFilterPredicate} class to represent the
 * prefix to use when evaluating a metrics filter.
 */
public final class MetricsPrefixPredicate extends MetricsFilterPredicate {

    private final String prefix;

    public MetricsPrefixPredicate(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Returns the prefix to use when evaluating a metrics filter.
     */
    public String getPrefix() {
        return prefix;
    }

    @Override
    public void accept(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.visit(this);
    }
}
