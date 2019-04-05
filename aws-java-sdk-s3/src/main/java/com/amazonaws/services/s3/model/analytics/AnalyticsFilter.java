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

import java.io.Serializable;

/**
 * The filter used to describe a set of objects for analysis.
 *
 * The analytics filter contains one of {@link AnalyticsPrefixPredicate}, {@link AnalyticsTagPredicate}
 * or {@link AnalyticsAndOperator}. If no filter is provided, all objects will be considered
 * for analysis.
 */
public class AnalyticsFilter implements Serializable {

    private AnalyticsFilterPredicate predicate;

    public AnalyticsFilter() { }

    public AnalyticsFilter(AnalyticsFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Returns the {@link AnalyticsFilterPredicate} to be used when evaluating an analytics filter.
     *
     * The predicate is one of {@link AnalyticsPrefixPredicate}, {@link AnalyticsTagPredicate}
     * or {@link AnalyticsAndOperator}.
     */
    public AnalyticsFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the {@link AnalyticsFilterPredicate} to be used when evaluating an analytics filter.
     *
     * The predicate should be one of {@link AnalyticsPrefixPredicate}, {@link AnalyticsTagPredicate}
     * or {@link AnalyticsAndOperator}.
     */
    public void setPredicate(AnalyticsFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Sets the {@link AnalyticsFilterPredicate} to be used when evaluating an analytics filter
     * and returns the {@link AnalyticsFilter} object for method chaining.
     *
     * The predicate should be one of {@link AnalyticsPrefixPredicate}, {@link AnalyticsTagPredicate}
     * or {@link AnalyticsAndOperator}.
     */
    public AnalyticsFilter withPredicate(AnalyticsFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
