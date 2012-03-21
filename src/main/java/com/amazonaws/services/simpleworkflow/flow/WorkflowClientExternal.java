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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.ChildPolicy;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public interface WorkflowClientExternal {
    
    public void requestCancelWorkflowExecution();

    public void terminateWorkflowExecution(String reason, String details, ChildPolicy childPolicy);
    
    public DataConverter getDataConverter();

    public StartWorkflowOptions getSchedulingOptions();
    
    public GenericWorkflowClientExternal getGenericClient();
    
    public WorkflowExecution getWorkflowExecution();
    
}
