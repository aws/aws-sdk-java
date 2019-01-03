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

/**
 * A {@link ReplicationFilterPredicate} class to represent the
 * prefix identifying one or more objects to which the
 * {@link com.amazonaws.services.s3.model.ReplicationRule} applies.
 */
public final class ReplicationPrefixPredicate extends ReplicationFilterPredicate {

    private final String prefix;

    public ReplicationPrefixPredicate(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Returns the key prefix for which the
     * {@link com.amazonaws.services.s3.model.ReplicationRule} will apply.
     */
    public String getPrefix() {
        return prefix;
    }

    @Override
    public void accept(ReplicationPredicateVisitor replicationPredicateVisitor) {
        replicationPredicateVisitor.visit(this);
    }
}
