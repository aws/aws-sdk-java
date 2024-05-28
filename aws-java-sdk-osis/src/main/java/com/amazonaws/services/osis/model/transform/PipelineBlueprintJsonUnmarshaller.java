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
package com.amazonaws.services.osis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.osis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipelineBlueprint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineBlueprintJsonUnmarshaller implements Unmarshaller<PipelineBlueprint, JsonUnmarshallerContext> {

    public PipelineBlueprint unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineBlueprint pipelineBlueprint = new PipelineBlueprint();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BlueprintName", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setBlueprintName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineConfigurationBody", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setPipelineConfigurationBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayDescription", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setDisplayDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Service", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseCase", targetDepth)) {
                    context.nextToken();
                    pipelineBlueprint.setUseCase(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipelineBlueprint;
    }

    private static PipelineBlueprintJsonUnmarshaller instance;

    public static PipelineBlueprintJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineBlueprintJsonUnmarshaller();
        return instance;
    }
}
