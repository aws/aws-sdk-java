/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.retry.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Composite retry condition that evaluates to true if any containing condition evaluates to true.
 */
public class OrRetryCondition implements RetryCondition {

    private List<RetryCondition> conditions = new ArrayList<RetryCondition>();

    public OrRetryCondition(RetryCondition... conditions) {
        Collections.addAll(this.conditions, conditions);
    }

    /**
     * @return True if any condition returns true. False otherwise.
     */
    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        for (RetryCondition retryCondition : conditions) {
            if (retryCondition.shouldRetry(context)) {
                return true;
            }
        }
        return false;
    }
}
