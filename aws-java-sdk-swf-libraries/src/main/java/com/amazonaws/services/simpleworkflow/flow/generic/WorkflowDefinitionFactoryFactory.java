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
package com.amazonaws.services.simpleworkflow.flow.generic;

import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public abstract class WorkflowDefinitionFactoryFactory {

    public abstract WorkflowDefinitionFactory getWorkflowDefinitionFactory(WorkflowType workflowType);

    /**
     * There is no requirement to return any types. If type is returned
     * {@link #getWorkflowDefinitionFactory(WorkflowType)} should support it.
     * 
     * @return types that should be registered before polling and executing
     *         decision tasks.
     */
    public abstract Iterable<WorkflowType> getWorkflowTypesToRegister();

}
