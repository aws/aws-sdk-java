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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateWorkflowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowResultJsonUnmarshaller implements Unmarshaller<CreateWorkflowResult, JsonUnmarshallerContext> {

    public CreateWorkflowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateWorkflowResult createWorkflowResult = new CreateWorkflowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createWorkflowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateId", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("adsApplicationConfigurationId", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setAdsApplicationConfigurationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowInputs", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setWorkflowInputs(new MapUnmarshaller<String, StepInput>(context.getUnmarshaller(String.class),
                            StepInputJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("stepTargets", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setStepTargets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createWorkflowResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createWorkflowResult;
    }

    private static CreateWorkflowResultJsonUnmarshaller instance;

    public static CreateWorkflowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateWorkflowResultJsonUnmarshaller();
        return instance;
    }
}
