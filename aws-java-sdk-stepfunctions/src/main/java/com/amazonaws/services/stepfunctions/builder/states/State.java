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
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Base interface for all states that can be used in a {@link com.amazonaws.services.stepfunctions.builder.StateMachine}.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 */
public interface State {

    /**
     * Type identifier for a {@link ChoiceState}.
     */
    String CHOICE = "Choice";

    /**
     * Type identifier for a {@link FailState}.
     */
    String FAIL = "Fail";

    /**
     * Type identifier for a {@link ParallelState}.
     */
    String PARALLEL = "Parallel";

    /**
     * Type identifier for a {@link PassState}.
     */
    String PASS = "Pass";

    /**
     * Type identifier for a {@link SucceedState}.
     */
    String SUCCEED = "Succeed";

    /**
     * Type identifier for a {@link TaskState}.
     */
    String TASK = "Task";

    /**
     * Type identifier for a {@link WaitState}.
     */
    String WAIT = "Wait";

    /**
     * @return The type identifier for this state.
     */
    @JsonProperty(PropertyNames.TYPE)
    String getType();

    @JsonIgnore
    boolean isTerminalState();

    <T> T accept(StateVisitor<T> visitor);

    /**
     * Base builder interface for {@link State}s.
     */
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = PropertyNames.TYPE)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = ChoiceState.Builder.class, name = CHOICE),
            @JsonSubTypes.Type(value = FailState.Builder.class, name = FAIL),
            @JsonSubTypes.Type(value = ParallelState.Builder.class, name = PARALLEL),
            @JsonSubTypes.Type(value = PassState.Builder.class, name = PASS),
            @JsonSubTypes.Type(value = SucceedState.Builder.class, name = SUCCEED),
            @JsonSubTypes.Type(value = TaskState.Builder.class, name = TASK),
            @JsonSubTypes.Type(value = WaitState.Builder.class, name = WAIT)
    })
    @JsonIgnoreProperties(value = {PropertyNames.TYPE}, allowGetters = true)
    interface Builder extends Buildable<State> {
    }

}
