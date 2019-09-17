/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetWorkflowsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetWorkflowsResultJsonUnmarshaller implements Unmarshaller<BatchGetWorkflowsResult, JsonUnmarshallerContext> {

    public BatchGetWorkflowsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetWorkflowsResult batchGetWorkflowsResult = new BatchGetWorkflowsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetWorkflowsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Workflows", targetDepth)) {
                    context.nextToken();
                    batchGetWorkflowsResult.setWorkflows(new ListUnmarshaller<Workflow>(WorkflowJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MissingWorkflows", targetDepth)) {
                    context.nextToken();
                    batchGetWorkflowsResult.setMissingWorkflows(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchGetWorkflowsResult;
    }

    private static BatchGetWorkflowsResultJsonUnmarshaller instance;

    public static BatchGetWorkflowsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetWorkflowsResultJsonUnmarshaller();
        return instance;
    }
}
