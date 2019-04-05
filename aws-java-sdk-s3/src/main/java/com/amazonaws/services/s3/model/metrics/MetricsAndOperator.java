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

import java.util.List;

/**
 * A logical AND of predicates, which is used in evaluating a metrics filter.
 * The operator must have at least two predicates.
 *
 * The {@link MetricsAndOperator} can contain at most one {@link MetricsPrefixPredicate} and
 * any number of {@link MetricsTagPredicate}s.
 */
public final class MetricsAndOperator extends MetricsNAryOperator {

    public MetricsAndOperator(List<MetricsFilterPredicate> operands) {
        super(operands);
    }

    @Override
    public void accept(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.visit(this);
    }
}
