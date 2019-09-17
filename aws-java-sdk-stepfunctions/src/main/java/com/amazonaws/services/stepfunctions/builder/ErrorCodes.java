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
package com.amazonaws.services.stepfunctions.builder;

/**
 * Predefined error codes thrown by a StateMachine. See <a href="https://states-language.net/spec.html#appendix-a">Predefined
 * Error Codes</a>. Useful for constructing {@link com.amazonaws.services.stepfunctions.builder.states.Retrier}s or {@link
 * com.amazonaws.services.stepfunctions.builder.states.Catcher}s.
 *
 * @see <a href="https://states-language.net/spec.html#appendix-a">https://states-language.net/spec.html#appendix-a</a>
 */
public final class ErrorCodes {

    private ErrorCodes() {
    }

    /**
     * A wild-card which matches any Error Name.
     */
    public static final String ALL = "States.ALL";

    /**
     * A Task State either ran longer than the “TimeoutSeconds” value, or failed to heartbeat for a time longer than the
     * “HeartbeatSeconds” value.
     */
    public static final String TIMEOUT = "States.Timeout";

    /**
     * A Task State failed during the execution.
     */
    public static final String TASK_FAILED = "States.TaskFailed";

    /**
     * A Task State failed because it had insufficient privileges to execute the specified code.
     */
    public static final String PERMISSIONS = "States.Permissions";

    /**
     * A Task State’s “ResultPath” field cannot be applied to the input the state received.
     */
    public static final String RESULT_PATH_MATCH_FAILURE = "States.ResultPathMatchFailure";

    /**
     * A branch of a Parallel state failed.
     */
    public static final String BRANCH_FAILED = "States.BranchFailed";

    /**
     * A Choice state failed to find a match for the condition field extracted from its input.
     */
    public static final String NO_CHOICE_MATCHED = "States.NoChoiceMatched";
}
