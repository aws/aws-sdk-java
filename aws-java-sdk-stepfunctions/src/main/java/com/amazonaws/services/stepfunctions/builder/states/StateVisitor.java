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

/**
 * Visitor interface for {@link State} inheritance hierarchy. Extend and override to provide your own visitor logic.
 *
 * @param <T> Return type of visit methods (May be {@link Void}).
 */
public abstract class StateVisitor<T> {

    public T visit(ChoiceState choiceState) {
        return null;
    }

    public T visit(FailState failState) {
        return null;
    }

    public T visit(ParallelState parallelState) {
        return null;
    }

    public T visit(PassState passState) {
        return null;
    }

    public T visit(SucceedState succeedState) {
        return null;
    }

    public T visit(TaskState taskState) {
        return null;
    }

    public T visit(WaitState waitState) {
        return null;
    }

}
