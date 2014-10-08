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

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public abstract class WorkflowDefinitionFactory {

    /**
     * 
     * @return options to use when registering workflow type with the service.
     *         <code>null</code> if registration is not necessary on executor
     *         startup.
     */
    public abstract WorkflowTypeRegistrationOptions getWorkflowRegistrationOptions();

    public abstract WorkflowDefinition getWorkflowDefinition(DecisionContext context) throws Exception;
    
    public abstract void deleteWorkflowDefinition(WorkflowDefinition instance);

    public abstract WorkflowType getWorkflowType();

}
