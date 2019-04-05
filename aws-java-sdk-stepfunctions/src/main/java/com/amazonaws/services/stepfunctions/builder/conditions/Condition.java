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
package com.amazonaws.services.stepfunctions.builder.conditions;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;

/**
 * Base interface for conditions used in {@link com.amazonaws.services.stepfunctions.builder.states.Choice}s.
 *
 * <p>This interface should not be implemented outside of the SDK.</p>
 */
public interface Condition {

    /**
     * Base builder interface for conditions used in {@link com.amazonaws.services.stepfunctions.builder.states.Choice}s.
     */
    interface Builder extends Buildable<Condition> {
    }

    /**
     * No-op builder that always returns null.
     */
    @SdkInternalApi
    Condition.Builder NULL_BUILDER = new Builder() {
        @Override
        public Condition build() {
            return null;
        }
    };
}
