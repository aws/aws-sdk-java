/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Workflow Execution Timed Out Event Attributes JSON Unmarshaller
 */
public class WorkflowExecutionTimedOutEventAttributesJsonUnmarshaller implements Unmarshaller<WorkflowExecutionTimedOutEventAttributes, JsonUnmarshallerContext> {

    

    public WorkflowExecutionTimedOutEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes = new WorkflowExecutionTimedOutEventAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return workflowExecutionTimedOutEventAttributes;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("timeoutType", targetDepth)) {
                    context.nextToken();
                    workflowExecutionTimedOutEventAttributes.setTimeoutType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("childPolicy", targetDepth)) {
                    context.nextToken();
                    workflowExecutionTimedOutEventAttributes.setChildPolicy(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return workflowExecutionTimedOutEventAttributes;
                }
            }
            token = context.nextToken();
        }
    }

    private static WorkflowExecutionTimedOutEventAttributesJsonUnmarshaller instance;
    public static WorkflowExecutionTimedOutEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new WorkflowExecutionTimedOutEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    