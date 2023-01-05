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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GenerationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerationSummaryJsonUnmarshaller implements Unmarshaller<GenerationSummary, JsonUnmarshallerContext> {

    public GenerationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        GenerationSummary generationSummary = new GenerationSummary();

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
                if (context.testExpression("RecommendationId", targetDepth)) {
                    context.nextToken();
                    generationSummary.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationStatus", targetDepth)) {
                    context.nextToken();
                    generationSummary.setGenerationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationStartedTime", targetDepth)) {
                    context.nextToken();
                    generationSummary.setGenerationStartedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationCompletionTime", targetDepth)) {
                    context.nextToken();
                    generationSummary.setGenerationCompletionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedCompletionTime", targetDepth)) {
                    context.nextToken();
                    generationSummary.setEstimatedCompletionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return generationSummary;
    }

    private static GenerationSummaryJsonUnmarshaller instance;

    public static GenerationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GenerationSummaryJsonUnmarshaller();
        return instance;
    }
}
