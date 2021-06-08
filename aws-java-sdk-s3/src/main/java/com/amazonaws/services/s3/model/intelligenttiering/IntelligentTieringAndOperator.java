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

import java.util.List;


/**
 * A conjunction (logical AND) of predicates, which is used in evaluating S3 Intelligent-Tiering filters.
 * The operator must have at least two predicates, and an object must match all of the predicates in order
 * for the filter to apply. The {@link IntelligentTieringAndOperator} can contain at most one {@link IntelligentTieringPrefixPredicate}
 * and any number of {@link IntelligentTieringTagPredicate}s.
 */
public class IntelligentTieringAndOperator extends IntelligentTieringNAryOperator {

    public IntelligentTieringAndOperator(List<IntelligentTieringFilterPredicate> operands) {
        super(operands);
    }

    @Override
    public void accept(IntelligentTieringPredicateVisitor intelligentTieringPredicateVisitor) {
        intelligentTieringPredicateVisitor.visit(this);
    }
}
