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
package com.amazonaws.services.s3.model.lifecycle;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;

import java.io.Serializable;

/**
 * The {@link LifecycleFilter} is used to identify objects that a Lifecycle Rule applies to.
 *
 * This predicate in {@link LifecycleFilter} should be one of
 * {@link LifecyclePrefixPredicate}, {@link LifecycleTagPredicate}, or
 * {@link LifecycleAndOperator}.
 */
public class LifecycleFilter implements Serializable{
    private LifecycleFilterPredicate predicate;

    public LifecycleFilter() {}

    public LifecycleFilter(LifecycleFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Returns the {@link LifecycleFilterPredicate} to be applied to {@link BucketLifecycleConfiguration.Rule}.
     *
     * The predicate is one of {@link LifecyclePrefixPredicate},
     * {@link LifecycleTagPredicate} or
     * {@link LifecycleAndOperator} type.
     */
    public LifecycleFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the {@link LifecycleFilterPredicate} to be applied to {@link BucketLifecycleConfiguration.Rule}.
     *
     * The predicate should be one of {@link LifecyclePrefixPredicate},
     * {@link LifecycleTagPredicate} or
     * {@link LifecycleAndOperator} type.
     *
     * @param predicate An object of type {@link LifecycleFilterPredicate}.
     */
    public void setPredicate(LifecycleFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Sets the {@link LifecycleFilterPredicate} to be applied to {@link BucketLifecycleConfiguration.Rule} and returns the object
     * for method chaining.
     *
     * The predicate should be one of {@link LifecyclePrefixPredicate},
     * {@link LifecycleTagPredicate} or
     * {@link LifecycleAndOperator} type.
     *
     * @param predicate An object of type {@link LifecycleFilterPredicate}.
     *
     * @return This object for method chaining.
     */
    public LifecycleFilter withPredicate(LifecycleFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
