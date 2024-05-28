/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateMatchingWorkflowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMatchingWorkflowResultJsonUnmarshaller implements Unmarshaller<CreateMatchingWorkflowResult, JsonUnmarshallerContext> {

    public CreateMatchingWorkflowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateMatchingWorkflowResult createMatchingWorkflowResult = new CreateMatchingWorkflowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createMatchingWorkflowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("incrementalRunConfig", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setIncrementalRunConfig(IncrementalRunConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputSourceConfig", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setInputSourceConfig(new ListUnmarshaller<InputSource>(InputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputSourceConfig", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setOutputSourceConfig(new ListUnmarshaller<OutputSource>(OutputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resolutionTechniques", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setResolutionTechniques(ResolutionTechniquesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowArn", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setWorkflowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowName", targetDepth)) {
                    context.nextToken();
                    createMatchingWorkflowResult.setWorkflowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createMatchingWorkflowResult;
    }

    private static CreateMatchingWorkflowResultJsonUnmarshaller instance;

    public static CreateMatchingWorkflowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateMatchingWorkflowResultJsonUnmarshaller();
        return instance;
    }
}
