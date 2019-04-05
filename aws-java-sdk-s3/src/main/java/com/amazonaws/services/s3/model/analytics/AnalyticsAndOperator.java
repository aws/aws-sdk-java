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
package com.amazonaws.services.s3.model.analytics;

import java.util.List;

/**
 * A logical AND of two or more predicates, which are used in evaluating an analytics filter.
 *
 * The {@link AnalyticsAndOperator} can contain at most one {@link AnalyticsPrefixPredicate} and any number of {@link AnalyticsTagPredicate}s.
 * The operator must have at least two predicates.
 */
public class AnalyticsAndOperator extends AnalyticsNAryOperator {

    public AnalyticsAndOperator(List<AnalyticsFilterPredicate> operands) {
        super(operands);
    }

    @Override
    public void accept(AnalyticsPredicateVisitor analyticsPredicateVisitor) {
        analyticsPredicateVisitor.visit(this);
    }
}
