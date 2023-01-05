/*
 * Copyright 2016-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3.model.metrics;


/**
 * A {@link MetricsFilterPredicate} class to represent the accessPointArn
 * to use when evaluating a metrics filter.
 */
public final class MetricsAccessPointArnPredicate extends MetricsFilterPredicate {

    private final String accessPointArn;

    public MetricsAccessPointArnPredicate(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The access point arn used when evaluating an AND predicate.
     * </p>
     * @return The access point arn used when evaluating an AND predicate.
     */
    public String getAccessPointArn() {
        return accessPointArn;
    }

    @Override
    public void accept(MetricsPredicateVisitor metricsPredicateVisitor) {
        metricsPredicateVisitor.visit(this);
    }
}
