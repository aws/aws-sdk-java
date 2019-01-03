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
package com.amazonaws.services.s3.model.replication;

import com.amazonaws.services.s3.model.ReplicationRule;

import java.io.Serializable;

/**
 * The {@link ReplicationFilter} is used to identify objects that a Replication Rule applies to.
 *
 * This predicate in {@link ReplicationFilter} should be one of
 * {@link ReplicationPrefixPredicate}, {@link ReplicationTagPredicate}, or
 * {@link ReplicationAndOperator}.
 */
public class ReplicationFilter implements Serializable {
    private ReplicationFilterPredicate predicate;

    public ReplicationFilter() {}

    public ReplicationFilter(ReplicationFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Returns the {@link ReplicationFilterPredicate} to be applied to {@link ReplicationRule}.
     *
     * The predicate is one of {@link ReplicationPrefixPredicate},
     * {@link ReplicationTagPredicate} or
     * {@link ReplicationAndOperator} type.
     */
    public ReplicationFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the {@link ReplicationFilterPredicate} to be applied to {@link ReplicationRule}.
     *
     * The predicate should be one of {@link ReplicationPrefixPredicate},
     * {@link ReplicationTagPredicate} or
     * {@link ReplicationAndOperator} type.
     *
     * @param predicate An object of type {@link ReplicationFilterPredicate}.
     */
    public void setPredicate(ReplicationFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Sets the {@link ReplicationFilterPredicate} to be applied to {@link ReplicationRule} and returns the object
     * for method chaining.
     *
     * The predicate should be one of {@link ReplicationPrefixPredicate},
     * {@link ReplicationTagPredicate} or
     * {@link ReplicationAndOperator} type.
     *
     * @param predicate An object of type {@link ReplicationFilterPredicate}.
     *
     * @return This object for method chaining.
     */
    public ReplicationFilter withPredicate(ReplicationFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
