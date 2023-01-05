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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetResourceEvaluationSummaryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceEvaluationSummaryResultJsonUnmarshaller implements Unmarshaller<GetResourceEvaluationSummaryResult, JsonUnmarshallerContext> {

    public GetResourceEvaluationSummaryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetResourceEvaluationSummaryResult getResourceEvaluationSummaryResult = new GetResourceEvaluationSummaryResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getResourceEvaluationSummaryResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ResourceEvaluationId", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setResourceEvaluationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationMode", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setEvaluationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationStatus", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setEvaluationStatus(EvaluationStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationStartTimestamp", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult
                            .setEvaluationStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Compliance", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setCompliance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationContext", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setEvaluationContext(EvaluationContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceDetails", targetDepth)) {
                    context.nextToken();
                    getResourceEvaluationSummaryResult.setResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getResourceEvaluationSummaryResult;
    }

    private static GetResourceEvaluationSummaryResultJsonUnmarshaller instance;

    public static GetResourceEvaluationSummaryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetResourceEvaluationSummaryResultJsonUnmarshaller();
        return instance;
    }
}
