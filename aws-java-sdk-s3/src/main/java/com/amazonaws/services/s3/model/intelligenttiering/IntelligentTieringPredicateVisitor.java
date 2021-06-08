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

/**
 * Interface to invoke specific behavior based on the type of {@link IntelligentTieringFilterPredicate} visited.
 *
 * When an implementation of this visitor is passed to an
 * {@link IntelligentTieringFilterPredicate#accept(IntelligentTieringPredicateVisitor)} method,
 * the visit method most applicable to that element is invoked.
 */
public interface IntelligentTieringPredicateVisitor {

    /**
     * Implement this method to add behaviour performed when
     * {@link IntelligentTieringPrefixPredicate} is visited.
     */
    public void visit(IntelligentTieringPrefixPredicate intelligentTieringPrefixPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link IntelligentTieringTagPredicate} is visited.
     */
    public void visit(IntelligentTieringTagPredicate intelligentTieringTagPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link IntelligentTieringAndOperator} is visited.
     */
    public void visit(IntelligentTieringAndOperator intelligentTieringAndOperator);
}
