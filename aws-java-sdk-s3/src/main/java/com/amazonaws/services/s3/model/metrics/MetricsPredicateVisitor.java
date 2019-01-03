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
 * Interface to invoke specific behavior based on the type of {@link MetricsFilterPredicate} visited.
 *
 * When an implementation of this visitor is passed to an
 * {@link MetricsFilterPredicate#accept(MetricsPredicateVisitor)} method,
 * the visit method most applicable to that element is invoked.
 */
public interface MetricsPredicateVisitor {
    /**
     * Implement this method to add behaviour performed when
     * {@link MetricsPrefixPredicate} is visited.
     */
    public void visit(MetricsPrefixPredicate metricsPrefixPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link MetricsTagPredicate} is visited.
     */
    public void visit(MetricsTagPredicate metricsTagPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link MetricsAndOperator} is visited.
     */
    public void visit(MetricsAndOperator metricsAndOperator);
}
