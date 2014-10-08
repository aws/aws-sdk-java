/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.worker;

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowExecutionLocal;

/**
 * Holds DecisionContext for currently executing decision task. Do not use this
 * class directly. Instead use {@link DecisionContextProviderImpl}.
 */
public abstract class CurrentDecisionContext {

    private final static WorkflowExecutionLocal<DecisionContext> CURRENT = new WorkflowExecutionLocal<DecisionContext>();

    /**
     * retrieves the current DecisionContext for a particular thread
     * 
     * @return current decider context being used for the decision
     * @throws IllegalStateException
     *             if this method is called outside the scope of workflow
     *             definition.
     */
    public static DecisionContext get() {
        DecisionContext result = CURRENT.get();
        if (result == null) {
            throw new IllegalStateException(
                    "No context found. It means that the method is called outside of the workflow definition code.");
        }
        return result;
    }

    /**
     * @return if context is set which means that code is executed as part of
     *         the decision.
     */
    public static boolean isSet() {
        return CURRENT.get() != null;
    }

    public static void set(DecisionContext context) {
        if (context == null) {
            throw new IllegalArgumentException("null context");
        }
        WorkflowExecutionLocal.before();
        CURRENT.set(context);
    }

    public static void unset() {
        WorkflowExecutionLocal.after();
    }

}
