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
 * Workflow Execution Detail JSON Unmarshaller
 */
public class WorkflowExecutionDetailJsonUnmarshaller implements Unmarshaller<WorkflowExecutionDetail, JsonUnmarshallerContext> {

    

    public WorkflowExecutionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowExecutionDetail workflowExecutionDetail = new WorkflowExecutionDetail();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("executionInfo", targetDepth)) {
                    context.nextToken();
                    workflowExecutionDetail.setExecutionInfo(WorkflowExecutionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionConfiguration", targetDepth)) {
                    context.nextToken();
                    workflowExecutionDetail.setExecutionConfiguration(WorkflowExecutionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("openCounts", targetDepth)) {
                    context.nextToken();
                    workflowExecutionDetail.setOpenCounts(WorkflowExecutionOpenCountsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("latestActivityTaskTimestamp", targetDepth)) {
                    context.nextToken();
                    workflowExecutionDetail.setLatestActivityTaskTimestamp(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("latestExecutionContext", targetDepth)) {
                    context.nextToken();
                    workflowExecutionDetail.setLatestExecutionContext(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return workflowExecutionDetail;
    }

    private static WorkflowExecutionDetailJsonUnmarshaller instance;
    public static WorkflowExecutionDetailJsonUnmarshaller getInstance() {
        if (instance == null) instance = new WorkflowExecutionDetailJsonUnmarshaller();
        return instance;
    }
}
    