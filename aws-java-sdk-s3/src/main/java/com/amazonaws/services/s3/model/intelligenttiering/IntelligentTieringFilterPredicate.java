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
 * Base class to represent the root predicate in {@link IntelligentTieringFilter} class.
 *
 * @see IntelligentTieringPrefixPredicate
 * @see IntelligentTieringTagPredicate
 * @see IntelligentTieringAndOperator
 */
public abstract class IntelligentTieringFilterPredicate implements Serializable {

    /**
     * Use in conjunction with the {@link com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringPredicateVisitor}
     * and call appropriate visit() method.
     */
    public abstract void accept(IntelligentTieringPredicateVisitor intelligentTieringPredicateVisitor);
}
