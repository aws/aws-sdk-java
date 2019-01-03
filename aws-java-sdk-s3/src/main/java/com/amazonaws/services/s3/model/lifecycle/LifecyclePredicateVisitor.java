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

/**
 * Interface to invoke specific behavior based on the type of {@link LifecycleFilterPredicate} visited.
 * This follows the visitor design pattern.
 *
 * When an implementation of this visitor is passed to an
 * {@link LifecycleFilterPredicate#accept(LifecyclePredicateVisitor)} method,
 * the visit method most applicable to that element is invoked.
 */
public interface LifecyclePredicateVisitor {

    /**
     * Implement this method to add behaviour performed when
     * {@link LifecyclePrefixPredicate} is visited.
     */
    public void visit(LifecyclePrefixPredicate lifecyclePrefixPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link LifecycleTagPredicate} is visited.
     */
    public void visit(LifecycleTagPredicate lifecycleTagPredicate);

    /**
     * Implement this method to add behaviour performed when
     * {@link LifecycleAndOperator} is visited.
     */
    public void visit(LifecycleAndOperator lifecycleAndOperator);
}
