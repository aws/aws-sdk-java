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

import java.io.Serializable;

/**
 * Base class to represent the root predicate in
 * {@link ReplicationFilter} class.
 *
 * @see ReplicationPrefixPredicate
 * @see ReplicationTagPredicate
 * @see ReplicationAndOperator
 */
public abstract class ReplicationFilterPredicate implements Serializable {

    /**
     * Helper method that accepts an implemenation of {@link ReplicationPredicateVisitor}
     * and invokes the most applicable visit method in the visitor.
     */
    public abstract void accept(ReplicationPredicateVisitor replicationPredicateVisitor);
}
