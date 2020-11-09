/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.intelligenttiering;

import java.io.Serializable;

/**
 * The filter used to describe a set of object.
 *
 * The S3 Intelligent-Tiering filter contains one of {@link IntelligentTieringPrefixPredicate},
 * {@link IntelligentTieringTagPredicate} or {@link IntelligentTieringAndOperator}.
 * If no filter is provided, all objects will be considered.
 */
public class IntelligentTieringFilter implements Serializable {

    private IntelligentTieringFilterPredicate predicate;

    public IntelligentTieringFilter() { }

    public IntelligentTieringFilter(IntelligentTieringFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Returns the {@link IntelligentTieringFilterPredicate} to be used when evaluating an S3 Intelligent-Tiering filter.
     *
     * The predicate is one of {@link IntelligentTieringPrefixPredicate}, {@link IntelligentTieringTagPredicate}
     * or {@link IntelligentTieringAndOperator}.
     */
    public IntelligentTieringFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the {@link IntelligentTieringFilterPredicate} to be used when evaluating an S3 Intelligent-Tiering filter.
     *
     * The predicate is one of {@link IntelligentTieringPrefixPredicate}, {@link IntelligentTieringTagPredicate}
     * or {@link IntelligentTieringAndOperator}.
     */
    public void setPredicate(IntelligentTieringFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Sets the {@link IntelligentTieringFilterPredicate} to be used when evaluating an S3 Intelligent-Tiering filter
     * and returns the {@link IntelligentTieringFilter} object for method chaining.
     *
     * The predicate is one of {@link IntelligentTieringPrefixPredicate}, {@link IntelligentTieringTagPredicate}
     * or {@link IntelligentTieringAndOperator}.
     */
    public IntelligentTieringFilter withPredicate(IntelligentTieringFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
