/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;

/**
 * A {@link LifecycleFilterPredicate} class to represent the
 * maximum object size (exclusive) to which the {@link Rule} applies.
 */
public final class LifecycleObjectSizeLessThanPredicate extends LifecycleFilterPredicate {

    private final Long objectSizeLessThan;

    public LifecycleObjectSizeLessThanPredicate(Long objectSizeLessThan) {
        this.objectSizeLessThan = objectSizeLessThan;
    }

    /**
     * Returns the maximum object size (exclusive) to which the {@link Rule} applies.
     */
    public Long getObjectSizeLessThan() {
        return objectSizeLessThan;
    }

    @Override
    public void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.visit(this);
    }
}
