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
package com.amazonaws.services.stepfunctions.builder.states;

import com.amazonaws.services.stepfunctions.builder.internal.Buildable;

/**
 * Interface for different waiting strategies used by {@link WaitState}.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 */
public interface WaitFor {

    /**
     * Builder interface for {@link WaitState}
     */
    interface Builder extends Buildable<WaitFor> {
    }

    /**
     * No-op builder that always returns null.
     */
    Builder NULL_BUILDER = new Builder() {
        @Override
        public WaitFor build() {
            return null;
        }
    };

}
