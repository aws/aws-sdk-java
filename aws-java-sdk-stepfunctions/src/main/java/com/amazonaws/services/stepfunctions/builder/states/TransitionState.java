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

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Do not directly use this class, it is intended for internal usage only.
 */
@SdkInternalApi
public abstract class TransitionState implements State {

    /**
     * @return The transition that will occur when this state completes successfully.
     */
    public abstract Transition getTransition();

    public final boolean isTerminalState() {
        return getTransition() != null && getTransition().isTerminal();
    }

}
