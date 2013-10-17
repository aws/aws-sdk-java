/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Workflow Execution Configuration JSON Unmarshaller
 */
public class WorkflowExecutionConfigurationJsonUnmarshaller implements Unmarshaller<WorkflowExecutionConfiguration, JsonUnmarshallerContext> {

    

    public WorkflowExecutionConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowExecutionConfiguration workflowExecutionConfiguration = new WorkflowExecutionConfiguration();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    workflowExecutionConfiguration.setTaskStartToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionStartToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    workflowExecutionConfiguration.setExecutionStartToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    workflowExecutionConfiguration.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("childPolicy", targetDepth)) {
                    context.nextToken();
                    workflowExecutionConfiguration.setChildPolicy(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return workflowExecutionConfiguration;
    }

    private static WorkflowExecutionConfigurationJsonUnmarshaller instance;
    public static WorkflowExecutionConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new WorkflowExecutionConfigurationJsonUnmarshaller();
        return instance;
    }
}
    