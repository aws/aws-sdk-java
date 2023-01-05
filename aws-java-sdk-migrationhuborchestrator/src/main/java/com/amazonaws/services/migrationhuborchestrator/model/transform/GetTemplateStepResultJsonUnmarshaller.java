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
 * GetTemplateStepResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateStepResultJsonUnmarshaller implements Unmarshaller<GetTemplateStepResult, JsonUnmarshallerContext> {

    public GetTemplateStepResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTemplateStepResult getTemplateStepResult = new GetTemplateStepResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTemplateStepResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepGroupId", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setStepGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateId", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepActionType", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setStepActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previous", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setPrevious(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("next", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setNext(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setOutputs(new ListUnmarshaller<StepOutput>(StepOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("stepAutomationConfiguration", targetDepth)) {
                    context.nextToken();
                    getTemplateStepResult.setStepAutomationConfiguration(StepAutomationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTemplateStepResult;
    }

    private static GetTemplateStepResultJsonUnmarshaller instance;

    public static GetTemplateStepResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTemplateStepResultJsonUnmarshaller();
        return instance;
    }
}
