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
 * CreateIdMappingWorkflowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdMappingWorkflowResultJsonUnmarshaller implements Unmarshaller<CreateIdMappingWorkflowResult, JsonUnmarshallerContext> {

    public CreateIdMappingWorkflowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIdMappingWorkflowResult createIdMappingWorkflowResult = new CreateIdMappingWorkflowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIdMappingWorkflowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("idMappingTechniques", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setIdMappingTechniques(IdMappingTechniquesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputSourceConfig", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setInputSourceConfig(new ListUnmarshaller<IdMappingWorkflowInputSource>(
                            IdMappingWorkflowInputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputSourceConfig", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setOutputSourceConfig(new ListUnmarshaller<IdMappingWorkflowOutputSource>(
                            IdMappingWorkflowOutputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowArn", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setWorkflowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowName", targetDepth)) {
                    context.nextToken();
                    createIdMappingWorkflowResult.setWorkflowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createIdMappingWorkflowResult;
    }

    private static CreateIdMappingWorkflowResultJsonUnmarshaller instance;

    public static CreateIdMappingWorkflowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIdMappingWorkflowResultJsonUnmarshaller();
        return instance;
    }
}
