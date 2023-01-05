/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWorkflowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowResultJsonUnmarshaller implements Unmarshaller<GetWorkflowResult, JsonUnmarshallerContext> {

    public GetWorkflowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowResult getWorkflowResult = new GetWorkflowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("definition", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("digest", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setDigest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engine", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("main", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setMain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameterTemplate", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setParameterTemplate(new MapUnmarshaller<String, WorkflowParameter>(context.getUnmarshaller(String.class),
                            WorkflowParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageCapacity", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setStorageCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getWorkflowResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWorkflowResult;
    }

    private static GetWorkflowResultJsonUnmarshaller instance;

    public static GetWorkflowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowResultJsonUnmarshaller();
        return instance;
    }
}
